package com.example.koushik.myapps_escanor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SENSORDEMO extends AppCompatActivity {
    SensorManager sm;
    TextView tv,tv1,tv2,tv3;
    Sensor s;
    SensorEventListener sel = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];
            tv.setText(String.format("AZIMUTH = %s\n",x));
            tv2.setText(String.format("PITCH = %s \n",y));
                    tv3.setText(String.format("ROLL = %s \n",z));

        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensordemo);
        tv = findViewById(R.id.textView10);
        tv1 = findViewById(R.id.textView11);
        tv2 = findViewById(R.id.textView12);
        tv3 = findViewById(R.id.textView13);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(sel,s,SensorManager.SENSOR_DELAY_NORMAL);
    }
}
