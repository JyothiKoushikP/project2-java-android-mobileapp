package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PROGRESSBARDEMO extends AppCompatActivity implements View.OnClickListener {
    int i = 0;
    Button st;
    ProgressBar pb;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbardemo);
        st = findViewById(R.id.button7);
        pb = findViewById(R.id.progressBar);
        tv1 = findViewById(R.id.textView6);
        st.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Thread t = new Thread() {
            public void run() {
                try {
                    for ( i = 0; i <= 100; i++) {
                        pb.setProgress(i);
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                }

            }

        };
        t.start();
    }
}