package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class INC_DEC extends AppCompatActivity implements View.OnClickListener{
    int i=0;
    TextView tf;
    Button inc;
    Button dec;
    Button res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inc__dec);
        tf =findViewById(R.id.textView2);
        inc =findViewById(R.id.button2);
        dec = findViewById(R.id.button3);
        res = findViewById(R.id.button4);
        inc.setOnClickListener(this);
        dec.setOnClickListener(this);
        res.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button2:
                i++;
                tf.setText("VALUE IS " +i);
                break;

            case R.id.button3:
                i--;
                tf.setText("VALUE IS " +i);
                break;

            case R.id.button4:
                i=0;
                tf.setText("VALUE IS " +i);
                break;
        }
    }
}
