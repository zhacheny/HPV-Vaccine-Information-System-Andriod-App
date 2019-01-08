package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main29Activity extends AppCompatActivity {
    Button button,button1,button2,button3,button4;
    Button home, visit, contact, more, resource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);
        button=(Button)findViewById(R.id.button42);
        button1=(Button)findViewById(R.id.button37);
        button2=(Button)findViewById(R.id.button43);
        button3=(Button)findViewById(R.id.button41);
        button4=(Button)findViewById(R.id.button40);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,Main35Activity.class);
                startActivity(k);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(Main29Activity.this,Main36Activity.class);
                startActivity(k2);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(Main29Activity.this,Main37Activity.class);
                startActivity(k3);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main29Activity.this,Main38Activity.class);
                startActivity(k4);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k4 = new Intent(Main29Activity.this,Main39Activity.class);
                startActivity(k4);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main29Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}
