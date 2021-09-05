package com.example.koushik.myapps_escanor;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NOTIFICATIONXY extends AppCompatActivity implements View.OnClickListener{
    Notification n;
    NotificationManager nm;
    Notification.Builder nb;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        b1 = findViewById(R.id.button10);
        b2 = findViewById(R.id.button11);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    public void sdownlaod(View view) {
        nb = new Notification.Builder(this);
        nb.setContentText("DOWNLOADING");
        nb.setSmallIcon(android.R.drawable.stat_sys_download);
        new Thread()
        {
            public void run()
            {
                try
                {
                    nb.setProgress(100, 0, false);
                    nb.setContentText("DOWNLOADING STARTED");
                    for (int i = 0; i <= 100; i++)
                    {
                        nb.setContentText("DOWNLOADING");
                        nb.setProgress(100, i, false);
                        n = nb.build();
                        nm.notify(100, n);
                        sleep(200);
                    }

                }
                catch (Exception e)
                {

                }
            }
            }.start();
        nb.setSmallIcon(android.R.drawable.stat_sys_download_done);
        n=nb.build();
        nm.notify(100,n);
        }


    public void notificationxq(View view)
    {
        nb = new Notification.Builder(this);
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+8106753515"));
        nb.setContentTitle("MISSED CALL");
        nb.setContentText("YOU HAVE A MISSED CALL FROM +918106753515");
        nb.setSmallIcon(android.R.drawable.sym_call_missed);
        PendingIntent p1 = PendingIntent.getActivity(this,1000,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        nb.setAutoCancel(false);
        //Notification.DEFAULT_ALL;
        nb.setContentIntent(p1);
        n=nb.build();
        nm.notify(1000,n);

    }

    @Override
    public void onClick(View v)
    {

    }
}
