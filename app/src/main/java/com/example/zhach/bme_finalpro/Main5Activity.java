package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;



public class Main5Activity extends AppCompatActivity {

      SeekBar bar1, bar2;
      VideoView video1, video2;
      Button button1, button2;

      boolean status1, status2;
      float x0, x1;

      Button visit, contact, more, resource, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bar1=(SeekBar)findViewById(R.id.seekBar);
        bar2=(SeekBar)findViewById(R.id.seekBar2);
        video1=(VideoView)findViewById(R.id.videoView);
        video2=(VideoView)findViewById(R.id.videoView2);
        button1=(Button)findViewById(R.id.button24);
        button2=(Button)findViewById(R.id.button25);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

        video1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.c);
        video2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.d);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int currentP = video1.getCurrentPosition();
                int currentP2=video2.getCurrentPosition();
                bar1.setProgress(currentP);
                bar2.setProgress(currentP2);
            }
        },0,100);

        video1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == 0){
                    x0 = event.getRawX();
                }

                x1 = event.getRawX() - x0;

                if (action == 2){
                    int currentP = video1.getCurrentPosition();
                    int nextP = currentP + (int) x1*3;
                    video1.seekTo(nextP);
                }
                return true;
            }
        });

        video2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == 0){
                    x0 = event.getRawX();
                }

                x1 = event.getRawX() - x0;

                if (action == 2){
                    int currentP = video2.getCurrentPosition();
                    int nextP = currentP + (int) x1*3;
                    video2.seekTo(nextP);
                }
                return true;
            }
        });

        bar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    video1.seekTo(seekBar.getProgress());
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        bar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    video2.seekTo(seekBar.getProgress());
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        status1 = false; status2=false;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status1 == false){
                    video1.start();
                    bar1.setMax(video1.getDuration());
                    button1.setText("Pause");
                    status1 = true;
                } else{
                    video1.pause();
                    button1.setText("Play");
                    status1 = false;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status2 == false){
                    video2.start();
                    bar2.setMax(video2.getDuration());
                    button2.setText("Pause");
                    status2 = true;
                } else{
                    video2.pause();
                    button2.setText("Play");
                    status2 = false;
                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main5Activity.this,HomePage.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main5Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main5Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main5Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main5Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}