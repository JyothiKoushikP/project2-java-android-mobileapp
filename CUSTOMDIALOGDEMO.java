package com.example.koushik.myapps_escanor;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CUSTOMDIALOGDEMO extends AppCompatActivity implements View.OnClickListener{
    Button b,reg;
    Dialog d;
    EditText t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customdialogdemo);
        b = findViewById(R.id.button6);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        d = new Dialog(this);
        d.setContentView(R.layout.custom1);
        d.show();
        reg =d.findViewById(R.id.ereg);
        t1 = d.findViewById(R.id.ename);
        t2 = d.findViewById(R.id.eemail);
        t3 = d.findViewById(R.id.epass);
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CUSTOMDIALOGDEMO.this, "REGISTARTION SUCCESSFUL", Toast.LENGTH_SHORT).show();
                d.dismiss();
            }
        };
        reg.setOnClickListener(l);

    }
}

