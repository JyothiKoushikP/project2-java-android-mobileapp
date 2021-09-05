package com.example.koushik.myapps_escanor;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityX extends ListActivity {
    String ac[] = {"PLAYTICTACTOE","ASSIGNMENT2","ASSIGNMENT3","ASSIGNMENT6","WIFIDEMO","CONTACTSDEMO","CAMERADEMO","SPINNEREASY","DBTEST","MapsActivity","BLUETOOTHDEMO","FILEDEMO","NOTIFICATIONXY","PREFERENCEFROMXML","PROXIMITYDEMO","ACTIVITYRESULT","ACTIVITYDEMO","SENSORLIST","SENSORDEMO","TRIGGER","FILETEST2","SPINNERX","PREFERENCEFROMJAVA","MAGIC_MESSAGE","CONTEXTMENUDEMO","OPTIONMENUDEMO","POPUPDEMO","SWITCHDEMO","CUSTOMDIALOGDEMO","PROGRESSBARDEMO" ,"INC_DEC", "SEEKBARDEMO","AUTOCOMPLETEDEMO","SHOWMYNAME", "RADIO_BUTTONX"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_x);
        adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, ac) ;
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        try {
            String str = "com.example.koushik.myapps_escanor." + ac[position];
            Class c = Class.forName(str);
            Intent i = new Intent(this, c);
            startActivity(i);
        }
        catch(Exception e)
        {
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sp = getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor se = sp.edit();
        se.putString("data"," ");
        se.commit();
    }
}