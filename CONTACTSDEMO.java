package com.example.koushik.myapps_escanor;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CONTACTSDEMO extends AppCompatActivity {
    ListView lv;
    List<String> l = new ArrayList<String>();
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactsdemo);
        tv = findViewById(R.id.textView15);
        lv = findViewById(R.id.lf);
        Cursor c = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, ContactsContract.Contacts.DISPLAY_NAME);
        while (c.moveToNext()) {
            int i = c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
            if (c.getString(i) != null) {
                l.add(c.getString(i));
            }
        }
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, l);
        lv.setAdapter(adapter);
    }
}
