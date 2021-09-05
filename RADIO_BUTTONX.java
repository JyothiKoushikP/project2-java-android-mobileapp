package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RADIO_BUTTONX extends AppCompatActivity implements View.OnClickListener {
    TextView t1,t2,t3,t4,t5,t6;
    RadioButton r1,r2,r3,r4;
    RadioGroup tv;
    int i=0,j=0,k=0,l=0,m=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio__buttonx);
        t1=findViewById(R.id.dp);
        t2=findViewById(R.id.dp2);
        t3=findViewById(R.id.s1);
        t4=findViewById(R.id.s2);
        t5=findViewById(R.id.s3);
        t6=findViewById(R.id.s4);
        tv=findViewById(R.id.am);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        r4=findViewById(R.id.radioButton4);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.radioButton:
                RadioButton r1 =(RadioButton)v;
                tv.clearCheck();
                m++;
                t2.setText("NO OF VOTES "+m);
                i++;
                t3.setText("EXCELLENT VOTES: "+i);
                break;
            case R.id.radioButton2:
                RadioButton r2 =(RadioButton)v;
                tv.clearCheck();
                m++;
                t2.setText("NO OF VOTES "+m);
                j++;
                t4.setText("VERY GOOD VOTES: "+j);
                break;
            case R.id.radioButton3:
                RadioButton r3 =(RadioButton)v;
                tv.clearCheck();
                m++;
                t2.setText("NO OF VOTES "+m);
                k++;
                t5.setText("GOOD VOTES: "+k);
                break;
            case R.id.radioButton4:
                RadioButton r4 =(RadioButton)v;
                tv.clearCheck();
                m++;
                t2.setText("NO OF VOTES "+m);
                l++;
                t6.setText("OTHER VOTES: "+l);
                break;


        }


    }
}
