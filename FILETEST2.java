package com.example.koushik.myapps_escanor;


import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FILETEST2 extends AppCompatActivity implements View.OnClickListener {
    EditText ed1, ed2;
    Button b1, b2;
    File f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filetest2);
        ed1 = findViewById(R.id.e4);
        ed2 = findViewById(R.id.e5);
        b1 = findViewById(R.id.af);
        b2 = findViewById(R.id.sf);
        f1 = Environment.getExternalStorageDirectory();
        f2 = new File(f1, "myhyd");
        if (!f2.exists()) {
            f2.mkdir();
            Toast.makeText(this, "FOLDER CREATED", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "FOLDER ALREADY EXISTS", Toast.LENGTH_SHORT).show();
        }
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = ed1.getText().toString();

        switch (v.getId()) {
            case R.id.af:
                try {
                    FileOutputStream fos = new FileOutputStream(f2.getAbsolutePath() + File.separator + name, true);
                    String data = ed2.getText().toString();
                    fos.write(data.getBytes());
                    Toast.makeText(this, "DATA ADDED", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.sf:
                try {
                    FileInputStream fis = new FileInputStream(f2.getAbsolutePath() + File.separator + name);
                    String data = " ";
                    int i;
                    while ((i = fis.read()) > -1) {
                        data = data + (char) i;

                    }
                    ed1.setText(data);
                }
                catch (Exception e)
                {
                    Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;
        }


    }

}



