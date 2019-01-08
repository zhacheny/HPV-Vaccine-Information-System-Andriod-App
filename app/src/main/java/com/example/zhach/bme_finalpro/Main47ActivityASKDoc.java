package com.example.zhach.bme_finalpro;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

//this activity only idsplay this user's info
public class Main47ActivityASKDoc extends Activity {
    Button button;
    EditText editText;
    ListView listView; // listview element
    ArrayList<String> messageArray; // all message from the users
    ArrayAdapter arrayAdapter; // link messageArray to the listView
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main43);

        button = findViewById(R.id.button90);
        editText = findViewById(R.id.editText99);


        listView = findViewById(R.id.listview);
        messageArray = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,messageArray);

//        Intent intent = getIntent();
        final String username = ParseUser.getCurrentUser().getUsername().toString();

        ParseQuery<ParseObject> query = new
                ParseQuery<ParseObject>("BMEFinalASK");

        query.whereEqualTo("username",username);
        query.orderByDescending("createdAt");

        ParseQuery<ParseObject> query1 = new
                ParseQuery<ParseObject>("BMEFinalASK");

        query1.whereEqualTo("username","Doctor");
        query1.orderByDescending("createdAt");

//        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("BMEFinalASK");
//        query.orderByDescending("createAT");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    messageArray.clear();
                    for (ParseObject object:objects){
                        messageArray.add(object.get("BMEFinalASK").toString());

                    }

                }
            }
        });
        query1.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){

                    for (ParseObject object:objects){
                        if (object.get("BMEFinalASK").toString().contains(username)){
                            messageArray.add(object.get("BMEFinalASK").toString());
                        }

                    }

                }
            }
        });
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                String username = ParseUser.getCurrentUser().getUsername();
                final String message = input + " by " + username;
                ParseObject object = new ParseObject("BMEFinalASK");
                object.put("BMEFinalASK",message);
                object.put("username",username);
                object.saveInBackground();
                editText.setText("");
                ParseQuery<ParseObject> query = new
                        ParseQuery<ParseObject>("BMEFinalASK");

                query.whereEqualTo("username",username);
                query.orderByDescending("createdAt");
                query.findInBackground(new FindCallback<ParseObject>() {
                    @Override
                    public void done(List<ParseObject> objects, ParseException e) {
                        if (e == null){
                            messageArray.clear();
                            for (ParseObject object:objects){
                                messageArray.add(object.get("BMEFinalASK").toString());
                            }
                            listView.setAdapter(arrayAdapter);
                        }
                    }
                });
            }
        });
    }
}
