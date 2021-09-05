package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FILEDEMO extends AppCompatActivity implements View.OnClickListener{
    EditText ed,ed1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filetest2);
        ed = findViewById(R.id.e4);
        ed1 = findViewById(R.id.e5);
        b1 = findViewById(R.id.af);
        b2 = findViewById(R.id.sf);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String fname = ed.getText().toString();
        switch (v.getId())
        {
            case R.id.af:
                String fdata = ed1.getText().toString();
                try
                {
                    FileOutputStream fos = openFileOutput(fname,MODE_APPEND);
                    fos.write(fdata.getBytes());
                    Toast.makeText(this, "DATA ADDED", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.sf:
                try
                {
                    FileInputStream fis = openFileInput(fname);
                    String data=" ";
                    int i;
                    while((i=fis.read())>-1)
                    {
                        data = data+(char)i;
                    }
                    ed1.setText(data);
                    Toast.makeText(this, ""+data, Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
            {
                Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "YOU HAVE SELECTED"+item.getTitle(), Toast.LENGTH_SHORT).show();
        if(item.getTitle().toString().equals("SETTING"))
        {
            Intent intent = new Intent(this,PREFERENCEFROMXML.class);
            startActivity(intent);
        }
        return false;


    }
}
