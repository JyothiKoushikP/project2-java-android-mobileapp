package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SPINNEREASY extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinnereasy);
        sc=findViewById(R.id.spinner2);
        sc.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(!sc.getSelectedItem().toString().equals("DEFAULT"))
        {
            Toast.makeText(this, "ITEM SELECTED IS "+sc.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
