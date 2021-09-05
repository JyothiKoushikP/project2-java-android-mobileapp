package com.example.koushik.myapps_escanor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class SPINNERX extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String color[]={"DEFAULT","RED","GREEN","BLUE","GREY","YELLOW"};
    ArrayAdapter<String> adapter;
    Spinner sc;
    RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerx);
        sc=findViewById(R.id.spinner);
        r1=findViewById(R.id.rx);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,color);
        sc.setAdapter(adapter);
        sc.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (sc.getSelectedItem().toString()) {
            case "DEFAULT":
                r1.setBackgroundColor(Color.WHITE);
                break;
            case "RED":
                r1.setBackgroundColor(Color.RED);
                break;
            case "GREEN":
                r1.setBackgroundColor(Color.GREEN);
                break;
            case "BLUE":
                r1.setBackgroundColor(Color.BLUE);
                break;
            case "GREY":
                r1.setBackgroundColor(Color.GRAY);
                break;
            case "YELLOW":
                r1.setBackgroundColor(Color.YELLOW);
                break;

        }



        }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

