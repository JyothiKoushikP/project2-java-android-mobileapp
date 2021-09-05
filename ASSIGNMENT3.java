package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ASSIGNMENT3 extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);
        b1 = findViewById(R.id.bu12);
        b2 = findViewById(R.id.button13);
        b3 = findViewById(R.id.button14);
        b4 = findViewById(R.id.button15);
        b5 = findViewById(R.id.button16);
        Toast.makeText(this, "ACTIVITY CREATED", Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ACTIVITY DESTROYED", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this, "ACTIVITY STARTED", Toast.LENGTH_SHORT).show();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ASSIGNMENT3.this, "ACTIVITY PAUSED", Toast.LENGTH_SHORT).show();

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ASSIGNMENT3.this, "ACTIVITY RESUMED", Toast.LENGTH_SHORT).show();

                        b4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ASSIGNMENT3.this, "ACTIVITY STOPPED", Toast.LENGTH_SHORT).show();

                                b5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(ASSIGNMENT3.this, "ACTIVITY RESTARTED", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        });
                    }


                });
            }

        });
}

}
