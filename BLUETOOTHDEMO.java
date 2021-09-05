package com.example.koushik.myapps_escanor;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class BLUETOOTHDEMO extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener {
    BluetoothAdapter ba;
    ListView lv;
    ArrayList ad=new ArrayList();
    BroadcastReceiver br;
    Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetoothdemo);
        ba=BluetoothAdapter.getDefaultAdapter();
        s=findViewById(R.id.switch2);
        lv=findViewById(R.id.lv6);
        s.setOnCheckedChangeListener(this);
        if(ba.isEnabled())
        {
            s.setText("BLUETOOTH ON");
        }
        else
        {
            s.setText("BLUETOOTH OFF");
        }
        getPairedDevice();
        br=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action=intent.getAction();
                if(action.equals(BluetoothDevice.ACTION_FOUND))
                {
                    BluetoothDevice b11=intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    Toast.makeText(context, ""+b11.getName(), Toast.LENGTH_SHORT).show();
                }

            }
        };
        IntentFilter ifr=new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(br,ifr);
        ba.startDiscovery();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked)
        {
            if(!ba.isEnabled())
            {

                Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivity(intent);
                s.setText("BLUETOOTH ON");
                Toast.makeText(this, "BLUETOOTH TURNING ON", Toast.LENGTH_SHORT).show();
                getPairedDevice();
            }
            ba.startDiscovery();
        }
        else
        {
            if(ba.isEnabled())
            {
                ba.disable();
                s.setText("BLUETOOTH OFF");
            }
        }

    }
    void getPairedDevice()
    {
        Set<BluetoothDevice> s=ba.getBondedDevices();
        for(BluetoothDevice b1:s)
        {
            ad.add(b1.getName()+"||"+b1.getAddress());
        }
        ArrayAdapter ad1=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,ad);
        lv.setAdapter(ad1);
    }
}
