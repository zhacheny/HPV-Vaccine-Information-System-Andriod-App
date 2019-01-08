package com.example.zhach.bme_finalpro;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main10Activity extends AppCompatActivity {
    TextView textView;
    Button home, visit, contact, more, resource;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        button = findViewById(R.id.button9);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);
        textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        Boolean state = intent.getBooleanExtra("key",true);
        if(state){
            String str = "Good JOB, YOU HVAE EARNED "+ Main9Activity.score2 + " POINTS";
            textView.setText(str);
        }else{
            String str = "I BET YOU WILL GET CORRECT NEXT TIME";
            textView.setText(str);

            AlertDialog.Builder builder=new AlertDialog.Builder(Main10Activity.this);
            builder.setTitle("Review");
            builder.setMessage("The human papillomavirus (HPV) is the most common sexually transmitted infection in the United States. About 20 million Americans are infected with HPV, and approximately 6 million become infected each year. There are more than 100 types of HPV. More than 40 of them can be passed on through sexual contact.");
            builder.setPositiveButton("OK!",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();


        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Main10Activity.this,Main40Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main10Activity.this,HomePage.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main10Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main10Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main10Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main10Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });


    }
}
