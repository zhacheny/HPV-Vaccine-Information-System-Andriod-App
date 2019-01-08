package com.example.zhach.bme_finalpro;

import android.annotation.SuppressLint;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class Main4Activity extends AppCompatActivity {


    EditText text1, text2, text3, text4,text5, text6;
    ImageButton button1, button2;
    MediaPlayer mp1, mp2;

    Button home, visit, contact, more, resource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        text1=(EditText)findViewById(R.id.editText4);
        text2=(EditText)findViewById(R.id.editText5);
        text3=(EditText)findViewById(R.id.editText6);
        text4=(EditText)findViewById(R.id.editText7);
        text5=(EditText)findViewById(R.id.editText8);
        text6=(EditText)findViewById(R.id.editText9);
        button1=(ImageButton)findViewById(R.id.imageButton2);
        button2=(ImageButton)findViewById(R.id.imageButton3);

        mp1=MediaPlayer.create(this,R.raw.a);
        mp2=MediaPlayer.create(this,R.raw.b);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);

        final SpannableStringBuilder style = new SpannableStringBuilder();
        style.append("HPV vaccine is cancer prevention.");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Main4Activity.this);
                builder.setTitle("HPV Definition");
                builder.setMessage("The Human papillomavirus (HPV) is a virus that can infect the skin or mucous membranes " +
                        "(like the genitals, or inside the mouth) of humans. They cause warts." +
                        "Some of them may cause cancer. There are over 100 different virus types in this group. " +
                        "About 40 virus types can be transmitted sexually. About 12-15 can cause cancer.");
                builder.setPositiveButton("OK!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        };
        style.setSpan(clickableSpan, 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0000FF"));
        style.setSpan(foregroundColorSpan, 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        text1.setMovementMethod(LinkMovementMethod.getInstance());
        text1.setText(style);
        text1.setKeyListener(null);


        final SpannableStringBuilder style2 = new SpannableStringBuilder();
        style2.append("of cervix, vulva, vagina in woman.");

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(Main4Activity.this);
                builder2.setTitle("cervix Definition");
                builder2.setMessage("The cervix is the part of the uterus which protrudes into the vaginal canal." +
                        " Its function is like that of a gate to the uterus, or womb, where the fetus develops during a pregnancy." +
                        " It also allows menstrual blood to escape the uterus during the normal reproductive cycle of the female, " +
                        "and allows sperm to access the uterus to fertilize an ovum, or egg."
                );
                builder2.setPositiveButton("OK!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog2 = builder2.create();
                dialog2.show();

            }
        };

        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main4Activity.this);
                builder.setTitle("vulva Definition");
                builder.setMessage("Vulvar cancer is a type of cancer that occurs on the outer surface area of the female" +
                        " genitalia. The vulva is the area of skin that surrounds the urethra and vagina, " +
                        "including the clitoris and labia."
                );
                builder.setPositiveButton("OK!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        };

        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(Main4Activity.this);
                builder2.setTitle("vagina Definition");
                builder2.setMessage("The vagina is an elastic, muscular canal with a soft, flexible lining " +
                        "that provides lubrication and sensation. The vagina connects the uterus to the outside world. " +
                        "The vulva and labia form the entrance, and the cervix of the uterus protrudes into the vagina," +
                        " forming the interior end."
                );
                builder2.setPositiveButton("OK!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog2 = builder2.create();
                dialog2.show();

            }
        };

        style2.setSpan(clickableSpan2, 3, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style2.setSpan(clickableSpan3, 11, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style2.setSpan(clickableSpan4, 18, 25, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Color.parseColor("#0000FF"));
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(Color.parseColor("#0000FF"));
        ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(Color.parseColor("#0000FF"));

        style2.setSpan(foregroundColorSpan2, 3, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style2.setSpan(foregroundColorSpan3, 11, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style2.setSpan(foregroundColorSpan4, 18, 25, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        text4.setMovementMethod(LinkMovementMethod.getInstance());
        text4.setText(style2);
        text4.setKeyListener(null);


        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                mp1.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                mp2.start();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,HomePage.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}

