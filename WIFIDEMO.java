package com.example.koushik.myapps_escanor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class WIFIDEMO extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    WifiManager wm;
    Switch s;
    WifiInfo wi;
    List<ScanResult> list;
    BroadcastReceiver br;
    IntentFilter ifr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifidemo);
            wm = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
            s = findViewById(R.id.switch3);
            s.setOnCheckedChangeListener(this);
            if (wm.isWifiEnabled()) {
                s.setText("WIFI ON");
                s.setChecked(true);
            } else {
                s.setText("WIFI OFF");
                s.setChecked(false);
            }
            br = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    String action = intent.getAction();
                    if (action.equals(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)) {
                        list = wm.getScanResults();
                        for (ScanResult s : list) {
                            Toast.makeText(context, "" + s.SSID + "||" + s.BSSID, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            };
            ifr = new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION);
            registerReceiver(br, ifr);
            wm.startScan();
        }




    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked) {
            if (!wm.isWifiEnabled()) {
                wm.setWifiEnabled(true);
                s.setText("WIFI ON");
            }
            wm.startScan();
        } else {
            if (wm.isWifiEnabled()) {
                wm.setWifiEnabled(false);
                s.setText("WIFI OFF");
            }
        }
    }
}

