package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ACTIVITYRESULT extends AppCompatActivity implements View.OnClickListener{
    EditText ed;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityresult);
        ed = findViewById(R.id.ed4);
        b1 = findViewById(R.id.button9);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = ed.getText().toString();
        Intent i = new Intent();
        i.putExtra("msg",str);
        setResult(200,i);
        finish();



    }
}
