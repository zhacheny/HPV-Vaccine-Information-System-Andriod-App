package com.example.zhach.bme_finalpro;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;
public class Main49ViewPatientASKData extends Activity {
    Button button;
    String message;
    EditText editText;
    ListView listView;
    ArrayList<String> messageArray;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49_view_patient_askdata); button = findViewById(R.id.button4);
        button = findViewById(R.id.button90);
        editText = findViewById(R.id.editText99);
        Intent intent = getIntent();
        final String Patientusername = intent.getStringExtra("username");



        ParseQuery<ParseObject> query = new
                ParseQuery<ParseObject>("BMEFinalASK");
        ParseQuery<ParseObject> query1 = new
                ParseQuery<ParseObject>("BMEFinalASK");
        query.whereEqualTo("username",Patientusername);
        query1.whereEqualTo("username","Doctor");
        query.orderByDescending("createdAt");
        query1.orderByDescending("createdAt");

        listView = findViewById(R.id.listview);
        messageArray = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,messageArray);

        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    messageArray.clear();
                    for (ParseObject object:objects){
                        messageArray.add(object.get("BMEFinalASK").toString());
                    }
//                    listView.setAdapter(arrayAdapter);
                }
            }
        });
        query1.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        if (object.get("BMEFinalASK").toString().contains(Patientusername)){
                            messageArray.add(object.get("BMEFinalASK").toString());
                        }

                    }
//                    listView.setAdapter(arrayAdapter);
                }
            }
        });
        listView.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                String username = ParseUser.getCurrentUser().getUsername();
                final String message = "To\t"+ Patientusername+ "\t"+input + "\t answered "  + " by " + username;
                ParseObject object = new ParseObject("BMEFinalASK");
                object.put("BMEFinalASK",message);
                object.put("username",username);
                object.saveInBackground();
                editText.setText("");
                ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("BMEFinalASK");
                ParseQuery<ParseObject> query1 = new ParseQuery<ParseObject>("BMEFinalASK");
                query.whereEqualTo("username",username);
                query1.whereEqualTo("username","Doctor");
                query.findInBackground(new FindCallback<ParseObject>() {
                    @Override
                    public void done(List<ParseObject> objects, ParseException e) {
                        if (e == null){
                            messageArray.clear();
                            for (ParseObject object:objects){
                                messageArray.add(object.get("BMEFinalASK").toString());
                            }
//                            listView.setAdapter(arrayAdapter);
                        }
                    }
                });
                query1.findInBackground(new FindCallback<ParseObject>() {
                    @Override
                    public void done(List<ParseObject> objects, ParseException e) {
                        if (e == null){
//                            messageArray.clear();
                            for (ParseObject object:objects){
//                                messageArray.add(object.get("BMEFinalASK").toString());
                                if (object.get("BMEFinalASK").toString().contains(Patientusername)){
                                    messageArray.add(object.get("BMEFinalASK").toString());
                                }
                            }
//                            listView.setAdapter(arrayAdapter);
                        }
                    }
                });
                listView.setAdapter(arrayAdapter);
            }
        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText( ViewPatientData.this, data.toString(), Toast.LENGTH_SHORT).show();
////                        test = object.get("HearingLoss").toString();
//
//            }
//        });
    }
}

