package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main48ActivityDocAns extends Activity {
    ListView listView;
    ArrayList<String> usernameArray;
    ArrayAdapter<String> arrayAdapter;
    HashSet<String> test = new HashSet<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main48_doc_ans);

        listView = findViewById(R.id.listView);
        usernameArray = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,usernameArray);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent
                        (getApplicationContext(),Main49ViewPatientASKData.class);
                if (usernameArray.get(i).contains("Your All Replies")){
                    intent.putExtra("username","Doctor");
                }else{
                    intent.putExtra("username",usernameArray.get(i));
                }
                startActivity(intent);
            }
        });

//        ParseQuery<ParseUser> query = ParseUser.getQuery();
////        ParseQuery<ParseUser> query = new ParseQuery<ParseUser>("BMEFinalASK");
//        query.whereNotEqualTo("username",ParseUser.getCurrentUser().getUsername());
//        query.findInBackground(new FindCallback<ParseUser>() {
//            @Override
//            public void done(List<ParseUser> objects, ParseException e) {
//
//                if (e == null){
//                    for (ParseUser user:objects){
//                        usernameArray.add(user.getUsername());
//                    }
//                    listView.setAdapter(arrayAdapter);
//                }
//            }
//        });

        ParseQuery<ParseObject> query = new
                ParseQuery<ParseObject>("BMEFinalASK");

//        query.whereEqualTo("username",username);
        query.orderByDescending("createdAt");


//        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("BMEFinalASK");
//        query.orderByDescending("createAT");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {

                if (e == null){
//                    usernameArray.clear();
                    for (ParseObject object:objects){


                        if (test.add(object.get("username").toString())){
                            if (object.get("username").toString().contains("Doctor")){
                                usernameArray.add("Your All Replies");
                            } else{
                                usernameArray.add(object.get("username").toString());
                            }

                        }


                    }
                    listView.setAdapter(arrayAdapter);
                }
            }
        });


    }
}
