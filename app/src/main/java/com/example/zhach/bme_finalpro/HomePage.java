package com.example.zhach.bme_finalpro;
import android.content.Intent;
import android.icu.text.TimeZoneFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.ParseObject;
import com.parse.ParseUser;

public class HomePage extends AppCompatActivity {

    TextView text1, text2,text3, text4, text5, text6;
//    ImageButton button1, button2, button3, button4, button5, button6;
    Button visit, contact, more, resource, home;
    CardView aboutHPV,videos, Activities, FAQ, askDoc, diss,todoL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

//        text1=(TextView)findViewById(R.id.textView20)000
//        text2=(TextView)findViewById(R.id.textView21);
//        text3=(TextView)findViewById(R.id.textView22);
//        text4=(TextView)findViewById(R.id.textView23);
//        text5=(TextView)findViewById(R.id.textView24);
//        text6=(TextView)findViewById(R.id.textView25);

//
//        button1=(ImageButton)findViewById(R.id.imageButton4);
//        button2=(ImageButton)findViewById(R.id.imageButton5);
//        button3=(ImageButton)findViewById(R.id.imageButton9);
//        button4=(ImageButton)findViewById(R.id.imageButton10);
//        button5=(ImageButton)findViewById(R.id.imageButton11);
//        button6=(ImageButton)findViewById(R.id.imageButton12);

        aboutHPV = findViewById(R.id.aboutHPV);
        videos = findViewById(R.id.videos);
        Activities = findViewById(R.id.Activities);
        FAQ = findViewById(R.id.FAQ);
        askDoc= findViewById(R.id.askdoc);
        diss = findViewById(R.id.diss);
        todoL = findViewById(R.id.todoL);

        home=findViewById(R.id.home);
        visit=findViewById(R.id.schedule);
        contact=findViewById(R.id.contact);
        more=findViewById(R.id.more);
        resource=findViewById(R.id.resource);



        aboutHPV .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomePage.this,Main3Activity.class);
                startActivity(k);
            }
        });

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(HomePage.this,Main5Activity.class);
                startActivity(k2);
            }
        });

        Activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(HomePage.this,Main6Activity.class);
                startActivity(k3);
            }
        });

        FAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main12Activity.class);
                startActivity(k4);
            }
        });

        askDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main47ActivityASKDoc.class);
                startActivity(k4);
            }
        });

        diss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k5 = new Intent(HomePage.this,Main15Activity.class);
                startActivity(k5);
            }
        });

        todoL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k6 = new Intent(HomePage.this,Main31Activity.class);
                startActivity(k6);
            }
        });
        //home bar
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main17Activity.class);
                startActivity(k4);
            }
        });


        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main19Activity.class);
                startActivity(k4);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main24Activity.class);
                startActivity(k4);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(HomePage.this,Main25Activity.class);
                startActivity(k4);
            }
        });

//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });




    }
}



