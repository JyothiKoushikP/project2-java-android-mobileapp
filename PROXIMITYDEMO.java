package com.example.koushik.myapps_escanor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PROXIMITYDEMO extends AppCompatActivity {
    SensorManager sm;
    Sensor s;
    ImageView iv;
    SensorEventListener sel = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float x = event.values[0];
            if(s.getMaximumRange()>x)

            {
            iv.setImageResource(R.drawable.uryu1);
            }
            else
            {
                iv.setImageResource(R.drawable.uryu2);
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximitydemo);
        iv = findViewById(R.id.imageView);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sm.registerListener(sel,s,SensorManager.SENSOR_DELAY_NORMAL);
    }
}
