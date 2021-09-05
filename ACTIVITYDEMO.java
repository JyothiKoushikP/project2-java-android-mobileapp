package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ACTIVITYDEMO extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydemo);
        tv = findViewById(R.id.demo);
        b = findViewById(R.id.button8);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ACTIVITYRESULT.class);
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle b = data.getExtras();
        if(requestCode==100 && resultCode ==200)
        {
            tv.setText(b.getString("msg"));
        }
    }
}
