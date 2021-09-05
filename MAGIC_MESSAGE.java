package com.example.koushik.myapps_escanor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MAGIC_MESSAGE extends Activity implements View.OnClickListener{
    int i=0;
    Button b;
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        b= findViewById(R.id.button);
        tv=findViewById(R.id.textView);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(i==0)
        {

            tv.setVisibility(View.VISIBLE);
            i=1;
        }

        else
        {
            tv.setVisibility(View.INVISIBLE);
            i=0;
        }

    }
}
