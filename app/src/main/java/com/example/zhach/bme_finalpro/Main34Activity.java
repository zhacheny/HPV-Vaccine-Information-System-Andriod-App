package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Main34Activity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    Button home, visit, contact, more, resource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);
        button1=(Button)findViewById(R.id.button47);
        button2=(Button)findViewById(R.id.button48);
        button3=(Button)findViewById(R.id.button49);
        button4=(Button)findViewById(R.id.button50);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main34Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main34Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main34Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main34Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main34Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });
    }
}
