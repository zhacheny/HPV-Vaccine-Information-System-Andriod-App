package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Main12Activity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    Button home, visit, contact, more, resource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

//        home=(ImageButton)findViewById(R.id.buttonBook);
//        visit=(ImageButton)findViewById(R.id.buttonVisit);
//        contact=(ImageButton)findViewById(R.id.buttonContact);
//        more=(ImageButton)findViewById(R.id.buttonMore);
//        resource=(ImageButton)findViewById(R.id.buttonResource);


        button1=(Button)findViewById(R.id.button26);
        button2=(Button)findViewById(R.id.button27);
        button3=(Button)findViewById(R.id.button28);
        button4=(Button)findViewById(R.id.button29);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main13Activity.class);
                startActivity(k);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main42Activity.class);
                startActivity(k);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main13Activity.class);
                startActivity(k);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main13Activity.class);
                startActivity(k);
            }
        });






        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}
