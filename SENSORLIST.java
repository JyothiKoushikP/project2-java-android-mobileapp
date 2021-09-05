package com.example.koushik.myapps_escanor;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class SENSORLIST extends AppCompatActivity {
    SensorManager sm;
    List<Sensor> list;
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensorlist);
        tv = findViewById(R.id.textView8);
        tv1 = findViewById(R.id.textView9);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        list = sm.getSensorList(Sensor .TYPE_ALL);
        for(Sensor s:list)
        {
            tv.append(s.getName()+"||"+s.getType()+"||"+s.getVendor()+"\n");
        }

    }
}
