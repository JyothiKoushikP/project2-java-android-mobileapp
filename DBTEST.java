package com.example.koushik.myapps_escanor;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DBTEST extends AppCompatActivity {
    EditText id,name,add,branch;
    SQLiteDatabase sd;
    Cursor c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbtest);
        id = findViewById(R.id.sid);
        name = findViewById(R.id.sname);
        add =findViewById(R.id.saddress);
        branch = findViewById(R.id.sbranch);
        sd = openOrCreateDatabase("hyddb",MODE_PRIVATE,null);
        sd.execSQL("create table if not exists student" +

                "(" +
                "sid int primary key," +
                "sname varchar not null," +
                "sadd varchar not null, " +
                "branch varchar not null" +
                    " )");
        c = sd.rawQuery("select * from student",null);
    }

    public void addrecord(View view) {
        int sid = Integer.parseInt(id.getText().toString());
        String sname = name.getText().toString();
        String sadd = add.getText().toString();
        String sbranch = branch.getText().toString();
        ContentValues ctx = new ContentValues();
        ctx.put("sid",sid);
        ctx.put("sname",sname);
        ctx.put("branch",sbranch);
        ctx.put("sadd",sadd);
        long i = sd.insert("student",null,ctx);
        if(i>0)
        {
            Toast.makeText(this, "DATA INSERTED", Toast.LENGTH_SHORT).show();
            c = sd.rawQuery("select * from student",null);
        }
        else
        {
            Toast.makeText(this, "DATA NOT INSERTED", Toast.LENGTH_SHORT).show();
        }
    }

    public void prevrecord(View view) {
        if(c.moveToPrevious())
        {
            id.setText(""+c.getInt(0));
            name.setText(""+c.getString(1));
            add.setText(""+c.getString(2));
            branch.setText(""+c.getString(3));

        }
        else
        {
            Toast.makeText(this, "THIS IS THE FIRST RECORD", Toast.LENGTH_SHORT).show();
        }
    }

    public void nextrecord(View view) {
        if(c.moveToNext())
        {
            id.setText(""+c.getInt(0));
            name.setText(""+c.getString(1));
            add.setText(""+c.getString(2));
            branch.setText(""+c.getString(3));

        }
        else
        {
            Toast.makeText(this, "THIS IS THE LAST RECORD", Toast.LENGTH_SHORT).show();
        }
    }


    public void lastrecord(View view) {
        if(c.moveToLast())
        {
            id.setText(""+c.getInt(0));
            name.setText(""+c.getString(1));
            add.setText(""+c.getString(2));
            branch.setText(""+c.getString(3));

        }
        else
        {
            Toast.makeText(this, " END OF RECORDS", Toast.LENGTH_SHORT).show();
        }
    }

    public void firstrecord(View view) {
        if(c.moveToFirst())
        {
            id.setText(""+c.getInt(0));
            name.setText(""+c.getString(1));
            add.setText(""+c.getString(2));
            branch.setText(""+c.getString(3));

        }
        else
        {
            Toast.makeText(this, "BEGINNING OF RECORDS", Toast.LENGTH_SHORT).show();
        }
    }
}
