package com.example.koushik.myapps_escanor;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PREFERENCEFROMJAVA extends AppCompatActivity implements View.OnClickListener{
    EditText ed;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencefromjav);
        ed=findViewById(R.id.editText3);
        sp =getSharedPreferences("mypref",MODE_PRIVATE);
        ed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor se = sp.edit();
        String d = ed.getText().toString();
        se.putString("data",d);
        se.commit();
    }
}
