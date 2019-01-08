package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


//To do list
public class Main31Activity extends AppCompatActivity {
    EditText edit1,edit2,edit3,edit4;
    TextView textview;
    Button home, visit, contact, more, resource, next, save,nextP;
//    ListView listView;
    ArrayList<String> messageArray;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);

        textview=(TextView)findViewById(R.id.textView5);

        home=findViewById(R.id.buttonBook);
        visit=findViewById(R.id.buttonVisit);
        contact=findViewById(R.id.buttonContact);
        more=findViewById(R.id.buttonMore);
        resource=findViewById(R.id.buttonResource);
        save = findViewById(R.id.save);
        nextP = findViewById(R.id.nextP);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);

//        listView=findViewById(R.id.list);
//        messageArray = new ArrayList<>();
//        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,messageArray);


        ParseQuery<ParseObject> query = new
                ParseQuery<ParseObject>("BMEFinaltodoLedit1");

        query.whereEqualTo("username",MainActivity.userName);
        query.orderByDescending("createdAt");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        edit1.setText(object.get("BMEFinaltodoLedit1").toString());

                    }
                }
            }
        });

        ParseQuery<ParseObject> query2 = new
                ParseQuery<ParseObject>("BMEFinaltodoLedit2");

        query2.whereEqualTo("username",MainActivity.userName);
        query2.orderByDescending("createdAt");
        query2.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        edit1.setText(object.get("BMEFinaltodoLedit2").toString());

                    }
                }
            }
        });

        ParseQuery<ParseObject> query3 = new
                ParseQuery<ParseObject>("BMEFinaltodoLedit3");

        query3.whereEqualTo("username",MainActivity.userName);
        query3.orderByDescending("createdAt");
        query3.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        edit3.setText(object.get("BMEFinaltodoLedit3").toString());

                    }
                }
            }
        });

        ParseQuery<ParseObject> query4 = new
                ParseQuery<ParseObject>("BMEFinaltodoLedit4");

        query4.whereEqualTo("username",MainActivity.userName);
        query4.orderByDescending("createdAt");
        query4.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        edit4.setText(object.get("BMEFinaltodoLedit4").toString());

                    }
                }
            }
        });


        nextP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Main31Activity.this,Main32Activity.class);
                startActivity(k);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edit1.getText().toString();
                String username = ParseUser.getCurrentUser().getUsername();
                final String message = "" + input;
                ParseObject object = new ParseObject("BMEFinaltodoLedit1");
                object.put("BMEFinaltodoLedit1",message);
                object.put("username",username);
                object.saveInBackground();
                edit1.setText(message);


                String input2 = edit2.getText().toString();
                final String message2 = "" + input2;
                ParseObject object2 = new ParseObject("BMEFinaltodoLedit2");
                object2.put("BMEFinaltodoLedit2",message);
                object2.put("username",username);
                object2.saveInBackground();
                edit2.setText(message2);


                String input3 = edit3.getText().toString();
                final String message3 = "" + input3;
                ParseObject object3 = new ParseObject("BMEFinaltodoLedit3");
                object3.put("BMEFinaltodoLedit3",message3);
                object3.put("username",username);
                object3.saveInBackground();
                edit3.setText(message3);


                String input4 = edit4.getText().toString();
                final String message4 = "" + input4;
                ParseObject object4 = new ParseObject("BMEFinaltodoLedit4");
                object4.put("BMEFinaltodoLedit4",message4);
                object4.put("username",username);
                object4.saveInBackground();
                edit4.setText(message3);

                Toast.makeText(getApplicationContext(),
                        "Your info has been successfully saved!",Toast.LENGTH_LONG).show();
            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main31Activity.this,HomePage.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main31Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main31Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main31Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main31Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });
    }
}

