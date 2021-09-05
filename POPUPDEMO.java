package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class POPUPDEMO extends AppCompatActivity implements View.OnClickListener {
    PopupMenu p;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popupdemo);
        ed = findViewById(R.id.editText2);
        ed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        p = new PopupMenu(this, ed, android.R.layout.simple_list_item_1);
        p.getMenuInflater().inflate(R.menu.optionmenudemo,p.getMenu());
        p.show();
        p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                ed.setText(item.getTitle().toString());
                Toast.makeText(POPUPDEMO.this, " "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }}


