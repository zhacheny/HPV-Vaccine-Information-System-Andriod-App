package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;


public class Main16Activity extends AppCompatActivity {
     static String like;
     TextView textview2, textview3;
     ImageView image, image2;
     Button button;
     Button home, visit, contact, more, resource;
     int num = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        like = "Liked";
        textview2=(TextView)findViewById(R.id.textView10);
        textview3=(TextView)findViewById(R.id.textView11);
        image=(ImageView)findViewById(R.id.imageView3);
        image2=(ImageView)findViewById(R.id.imageView4);
        button=(Button)findViewById(R.id.button35);


        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);



        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num +=1 ;
                if (num %2 == 0) {
                    image.setColorFilter(Color.RED);
                    textview2.setText("like");
                    like = "Liked";
                }
                if (num %2 == 1) {
                    image.setColorFilter(Color.WHITE);
                    textview2.setText("unlike");
                    like = "Disliked";
                }

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main16Activity.this,Main43Activity.class);
                startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main16Activity.this,Main43Activity.class);
                startActivity(intent);
            }
        });




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main16Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main16Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main16Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main16Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main16Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });


    }
}
