package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TICTACTOE1 extends AppCompatActivity implements View.OnClickListener {
    TextView t,tf;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe1);
        t = findViewById(R.id.textView16);
        tf = findViewById(R.id.textView);
        b = findViewById(R.id.button12);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,TICTACTOE.class);
        startActivity(intent);

    }
}
