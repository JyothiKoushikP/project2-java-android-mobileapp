package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SHOWMYNAME extends AppCompatActivity implements View.OnClickListener {
    int i;
    Button dis;
    EditText ed;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmyname);
        t1=findViewById(R.id.textView5);
        ed=findViewById(R.id.editText);
        dis = findViewById(R.id.button5);
        dis.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(i==0)
        {
        String msg=ed.getText().toString();
        t1.setText("THE LORD NAME IS "+msg);
        }


    }
}
