package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class
ASSIGNMENT2 extends AppCompatActivity implements View.OnClickListener{

    Integer i,j,k;
    TextView tv, tv1, tv2;
    EditText ed1, ed2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);
        tv = findViewById(R.id.res);
        tv1 = findViewById(R.id.q1);
        tv2 = findViewById(R.id.q2);
        ed1 = findViewById(R.id.fn);
        ed2 = findViewById(R.id.sn);
        b1 = findViewById(R.id.addi);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.pro);
        b4 = findViewById(R.id.div);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        i = Integer.parseInt(ed1.getText().toString());
        j = Integer.parseInt(ed2.getText().toString());

        k = i + j;
        tv.setText(Integer.toString(k));

        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if (i < j) {
                                          tv.setText("ERROR-CANNOT PROCEED");
                                      } else {
                                          k = i - j;
                                          tv.setText(Integer.toString(k));
                                      }

                                  }

                              });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    k = i * j;
                    tv.setText(Integer.toString(k));
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(j==0)
                    {
                        tv.setText("DIVISION NOT POSSIBLE");
                    }
                    else
                    {
                        k = i / j;
                        tv.setText(Integer.toString(k));
                    }
                }
                });

    }

}
