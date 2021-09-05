package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SEEKBARDEMO extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    TextView tk1,tk2;
    SeekBar sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbardemo);
        sb =findViewById(R.id.seekBar2);
        tk1=findViewById(R.id.tj);
        tk2=findViewById(R.id.pk);
        sb.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tk1.setText("PROGRESS = "+progress);

        if(progress==0)
        {
            tk2.setText("OH SHIT!");
        }
        else if(progress==50)
        {
            tk2.setText("JUST PASSED!");
        }
        else if(progress==100)
        {
            tk2.setText("WONDERFUL");
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
