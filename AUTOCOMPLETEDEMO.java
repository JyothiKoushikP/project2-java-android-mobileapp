package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AUTOCOMPLETEDEMO extends AppCompatActivity {

    MultiAutoCompleteTextView mctv;
    AutoCompleteTextView actv;
    ArrayAdapter<String> adapter;
    String country[]={"INDIA","AFGHANISTAN","BERMUDA","CANADA","EGYPT","FLORIDA","VENICE","GHANA","ARIZONA","AUSTRALIA","SOUTH AFRICA","ENGLAND","PAKISTAN"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_demo);
        actv=findViewById(R.id.autoCompleteTextView);
        mctv=findViewById(R.id.multiAutoCompleteTextView2);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,country);
        actv.setAdapter(adapter);
        mctv.setAdapter(adapter);
        actv.setThreshold(1);
        mctv.setThreshold(1);
        mctv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
