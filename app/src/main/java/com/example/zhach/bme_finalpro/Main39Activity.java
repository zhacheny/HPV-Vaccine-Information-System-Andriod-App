package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class Main39Activity extends AppCompatActivity {

    TextView textview;
    Button button1, button2;
    Button home, visit, contact, more, resource;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main39);

        textview=(TextView)findViewById(R.id.textView19);
        button1=(Button)findViewById(R.id.button55);
        button2=(Button)findViewById(R.id.button56);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Calendar.class);
                startActivity(k);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Main29Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main39Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });


    }
}
