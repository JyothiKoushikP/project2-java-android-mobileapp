package com.example.koushik.myapps_escanor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CONTEXTMENUDEMO extends AppCompatActivity  {
    ListView lv1;
    String name[]={"ICHIGO","KUROSAKI","KOUSHIK","KARTHIK","LAXUS","ESCANOR","MERLIN","ALOK"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextmenudemo);
        lv1 = findViewById(R.id.lv);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        lv1.setAdapter(adapter);
        registerForContextMenu(lv1);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("SELECT YOUR OPTION");
        menu.add(0, v.getId(), 0, "CALL");
        menu.add(0, v.getId(), 0, "SMS");
        menu.add(0, v.getId(), 0, "MMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        AdapterView.AdapterContextMenuInfo  ad =(AdapterView.AdapterContextMenuInfo)
                                                item.getMenuInfo();
        Toast.makeText(this, " "+item.getTitle()+ "TO" + name[ad.position], Toast.LENGTH_SHORT).show();
        return false;
    }
}


