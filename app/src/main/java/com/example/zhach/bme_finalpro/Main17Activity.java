package com.example.zhach.bme_finalpro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



public class Main17Activity extends AppCompatActivity {

     TextView textview, textview2,textview4;
     ImageView image1, image2, image3;
     EditText edittext;
     Button button1, button2;
     Button home, visit, contact, more, resource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        textview=(TextView)findViewById(R.id.textView2);
        textview2=(TextView)findViewById(R.id.textView6);

        textview4=(TextView)findViewById(R.id.textView9);
        image1=(ImageView)findViewById(R.id.imageView5);
        image2=(ImageView)findViewById(R.id.imageView20);
        image3=(ImageView)findViewById(R.id.imageView21);
        edittext=(EditText)findViewById(R.id.editText10);
        button2=(Button)findViewById(R.id.button41);
        button1=(Button)findViewById(R.id.button40);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main18Activity.class);
                startActivity(k);
            }
        });


        final SpannableStringBuilder style = new SpannableStringBuilder();
        style.append(textview2.getText().toString());
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent k = new Intent(Main17Activity.this,Main23Activity.class);
                startActivity(k);

            }
        };
        style.setSpan(clickableSpan, 0, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0000FF"));
        style.setSpan(foregroundColorSpan, 0, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textview2.setMovementMethod(LinkMovementMethod.getInstance());
        textview2.setText(style);
        textview2.setKeyListener(null);


        final SpannableStringBuilder style2 = new SpannableStringBuilder();
        style2.append(edittext.getText().toString());
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent k = new Intent(Main17Activity.this,Main23Activity.class);
                startActivity(k);

            }
        };
        style2.setSpan(clickableSpan2, 0, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Color.parseColor("#0000FF"));
        style2.setSpan(foregroundColorSpan2, 0, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        edittext.setMovementMethod(LinkMovementMethod.getInstance());
        edittext.setText(style2);
        edittext.setKeyListener(null);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,HomePage.class);
                startActivity(k);
            }
        });



        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });


    }
}
