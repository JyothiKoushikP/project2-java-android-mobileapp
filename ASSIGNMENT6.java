package com.example.koushik.myapps_escanor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ASSIGNMENT6 extends AppCompatActivity implements View.OnClickListener{
    RelativeLayout rl1;
    TextView tv;
    Button b1,b2;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4,r5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment6);
        tv = findViewById(R.id.textView14);
        b1 = findViewById(R.id.set);
        b2 = findViewById(R.id.reset);
        r1 = findViewById(R.id.radioButton5);
        r2 = findViewById(R.id.radioButton6);
        r3 = findViewById(R.id.radioButton7);
        r4 = findViewById(R.id.radioButton8);
        r5 = findViewById(R.id.radioButton10);
        rg = findViewById(R.id.rg1);
        rl1 = findViewById(R.id.rl);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        b1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.radioButton5:
                    RadioButton r1 = (RadioButton) v;

                    break;
                case R.id.radioButton6:
                    RadioButton r2 = (RadioButton) v;

                    break;
                case R.id.radioButton7:
                    RadioButton r3 = (RadioButton) v;

                    break;
                case R.id.radioButton8:
                    RadioButton r4 = (RadioButton) v;

                    break;
                case R.id.radioButton10:
                    RadioButton r5 = (RadioButton) v;

                    break;


            }
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(r1.isChecked())
                    {
                     rl1.setBackgroundColor(Color.BLUE);
                    }
                    else if(r2.isChecked())
                    {
                        rl1.setBackgroundColor(Color.GREEN);
                    }
                    else if(r3.isChecked())
                    {
                        rl1.setBackgroundColor(Color.YELLOW);
                    }
                    else if(r4.isChecked())
                    {
                        rl1.setBackgroundColor(Color.GRAY);
                    }
                    else if(r5.isChecked())
                    {
                        rl1.setBackgroundColor(Color.RED);
                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rg.clearCheck();
                    rl1.setBackgroundColor(Color.WHITE);
                }
            });
    }
}
