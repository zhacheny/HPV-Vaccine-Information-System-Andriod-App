package com.example.zhach.bme_finalpro;
import android.content.Intent;
import android.icu.text.TimeZoneFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.ParseObject;
import com.parse.ParseUser;

public class Main2Activity extends AppCompatActivity {

    TextView text1, text2,text3, text4, text5, text6;
    ImageButton button1, button2, button3, button4, button5, button6;
    ImageButton visit, contact, more, resource, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1=(TextView)findViewById(R.id.textView20);
        text2=(TextView)findViewById(R.id.textView21);
        text3=(TextView)findViewById(R.id.textView22);
        text4=(TextView)findViewById(R.id.textView23);
        text5=(TextView)findViewById(R.id.textView24);
        text6=(TextView)findViewById(R.id.textView25);


        button1=(ImageButton)findViewById(R.id.imageButton4);
        button2=(ImageButton)findViewById(R.id.imageButton5);
        button3=(ImageButton)findViewById(R.id.imageButton9);
        button4=(ImageButton)findViewById(R.id.imageButton10);
        button5=(ImageButton)findViewById(R.id.imageButton11);
        button6=(ImageButton)findViewById(R.id.imageButton12);

        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(k);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(k2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(k3);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main15Activity.class);
                startActivity(k4);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main12Activity.class);
                startActivity(k4);
            }
        });
        //ask a doctor
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k5 = new Intent(Main2Activity.this,Main47ActivityASKDoc.class);
                startActivity(k5);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main17Activity.class);
                startActivity(k4);
            }
        });

        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main19Activity.class);
                startActivity(k4);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main24Activity.class);
                startActivity(k4);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main2Activity.this,Main25Activity.class);
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



