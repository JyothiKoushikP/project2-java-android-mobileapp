package com.example.koushik.myapps_escanor;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PREFERENCEFROMXML extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencexml);
       // setContentView(R.layout.activity_preferencefromxml);
    }
}
