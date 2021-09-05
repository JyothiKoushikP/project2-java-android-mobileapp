package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TRIGGER extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    Cursor c;
    ArrayList<String>songname = new ArrayList<String>();
    ArrayList<String>songdata = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigger);
        lv = findViewById(R.id.lv1);
        c = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,null,null,null, MediaStore.Audio.Media.DISPLAY_NAME);

        while(c.moveToNext())
        {
            int i = c.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME);
            int j = c.getColumnIndex(MediaStore.Audio.Media.DATA);
            int k = c.getColumnIndex(MediaStore.Audio.Media.DURATION);
            if(Integer.parseInt(c.getString(k))>15000)
            {
                songdata.add(c.getString(j));
                songname.add(c.getString(i));
            }
            }
            adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,songname);
            lv.setAdapter(adapter);
            lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,MUSICPLAYER.class);
        intent.putExtra("songdata",songdata.get(position));
        intent.putExtra("songname",songname.get(position));
        startActivity(intent);
    }
}
