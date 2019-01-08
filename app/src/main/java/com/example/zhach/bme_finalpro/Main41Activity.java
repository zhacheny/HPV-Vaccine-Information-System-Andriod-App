package com.example.zhach.bme_finalpro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main41Activity extends AppCompatActivity {

    TextView textView;
    Button home, visit, contact, more, resource;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
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
            String str = "Good JOB, YOU HVAE EARNED "+ Main40Activity.score1 + " POINTS";
            textView.setText(str);
        }else{
            String str = "I BET YOU WILL GET CORRECT NEXT TIME";
            textView.setText(str);

            AlertDialog.Builder builder=new AlertDialog.Builder(Main41Activity.this);
            builder.setTitle("Review");
            builder.setMessage("HPV is spread through any kind of genital contact. That means vaginal sex, oral sex, anal sex, or genital-on-genital touching. HPV also can be spread through opposite-sex or same-sex partners.\n" +
                    "\n" +
                    "In rare cases, a pregnant woman with HPV can spread the virus to her newborn during delivery. It can cause warts in the newborn's throat called recurrent respiratory papillomatosis or RRP.");
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
                Intent k = new Intent(Main41Activity.this,Main8Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main41Activity.this,HomePage.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main41Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main41Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main41Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main41Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });
    }
}
