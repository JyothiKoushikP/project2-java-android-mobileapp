package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Toast;

public class OPTIONMENUDEMO extends AppCompatActivity {
    ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionmenudemo);
        c = findViewById(R.id.cl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenudemo,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast.makeText(this, "YOU HAVE SELECTED " + item.getTitle(), Toast.LENGTH_SHORT).show();
        if(item.getTitle().toString().equals("SETTINGS"))
        {
            Intent intent = new Intent(this,PREFERENCEFROMXML.class);
            startActivity(intent);
        }
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String sname = sp.getString("dname", "REDMI");
        int colour = Integer.parseInt(sp.getString("dcolor", "0"));
        Toast.makeText(this, "" + sname, Toast.LENGTH_SHORT).show();
        switch (colour) {
            case 0:
                c.setBackgroundColor(Color.WHITE);
                break;
            case 1:
                c.setBackgroundColor(Color.RED);
                break;
            case 2:
                c.setBackgroundColor(Color.GREEN);
                break;
            case 3:
                c.setBackgroundColor(Color.BLUE);
                break;
            case 4:
                c.setBackgroundColor(Color.YELLOW);
                break;

        }
    }



}

