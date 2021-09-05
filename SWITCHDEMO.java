package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class SWITCHDEMO extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch sw;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switchdemo);
        tv1 = findViewById(R.id.textView3);
        sw = findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            tv1.setVisibility(View.VISIBLE);
            sw.setText("HIDE MESSAGE");
        } else {
            tv1.setVisibility(View.INVISIBLE);
            sw.setText("SHOW MESSAGE");
        }
    }

}
