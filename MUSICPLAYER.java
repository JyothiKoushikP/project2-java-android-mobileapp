package com.example.koushik.myapps_escanor;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MUSICPLAYER extends AppCompatActivity implements View.OnClickListener,SeekBar.OnSeekBarChangeListener {
    ImageButton play;
    TextView cdu,rdu,songname;
    SeekBar sb;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicplayer);
        play = findViewById(R.id.run);
        cdu = findViewById(R.id.cdu);
        rdu = findViewById(R.id.rdu);
        songname = findViewById(R.id.sname);
        sb = findViewById(R.id.seekBar14);
        Bundle b = getIntent().getExtras();
        songname.setText(b.getString("songname"));
        String song = b.getString("songdata");
        mp = MediaPlayer.create(this, Uri.parse(song));
        sb.setMax(mp.getDuration());
        rdu.setText(getDuration(mp.getDuration()));
        new Thread()
        {
            public void run()
            {
                while(mp.getCurrentPosition()!=mp.getDuration())
                {
                    sb.setProgress(mp.getCurrentPosition());
                }
            }
        }.start();
        play.setOnClickListener(this);
        sb.setOnSeekBarChangeListener(this);


    }

    String getDuration(long dur)
    {
        String d=" ";
        dur=dur/1000;
        d=d+(dur/60)+"."+(dur%60);
        return d;
    }

    @Override
    public void onClick(View v) {
        if(!mp.isPlaying())
        {
            mp.start();
            play.setBackgroundResource(android.R.drawable.ic_media_pause);
        }
        else
        {
            mp.pause();
            play.setBackgroundResource(android.R.drawable.ic_media_play);

        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(fromUser)
        {
            mp.seekTo(progress);
        }
        rdu.setText(getDuration(mp.getDuration()-mp.getCurrentPosition()));
        cdu.setText(getDuration(mp.getCurrentPosition()));


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
