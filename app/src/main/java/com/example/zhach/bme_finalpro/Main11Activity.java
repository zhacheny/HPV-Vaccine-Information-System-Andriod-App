package com.example.zhach.bme_finalpro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.parse.ParseObject;
import com.parse.ParseUser;

public class Main11Activity extends AppCompatActivity {

    Button home, visit, contact, more, resource;
    Button send;
    EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);
        send = findViewById(R.id.button10);
        editText4 = findViewById(R.id.editText4);
        //send users' answer to the server
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseObject object = new ParseObject("BME_Final_UsersAns");
                object.put("BME_Final_UsersAns",editText4.getText().toString());
                object.put("username", ParseUser.getCurrentUser().getUsername());
                object.saveInBackground();
                AlertDialog.Builder builder=new AlertDialog.Builder(Main11Activity.this);
                builder.setTitle("Review");
                builder.setMessage("Your answer have benn sent.\n");
                builder.setPositiveButton("OK!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
//                Intent k = new Intent(Main11Activity.this,Main6Activity.class);
//                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main11Activity.this,HomePage.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main11Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main11Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main11Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main11Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}
