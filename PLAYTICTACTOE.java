package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PLAYTICTACTOE extends AppCompatActivity implements View.OnClickListener {
    ImageView iv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playtictactoe);
        iv = findViewById(R.id.i3);
        b = findViewById(R.id.b12);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        playgame();
    }

    void playgame()
    {
        Intent intent = new Intent(this,TICTACTOE1.class);
        startActivity(intent);
    }
}
