package com.example.zhach.bme_finalpro;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class MainActivity extends AppCompatActivity {

    Button signUp,login,forgetPassword,savecondig,learnmore;
    EditText username,password,email;
    static String userName;
    static String usernamepass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp = (Button)findViewById(R.id.button2);
        login = (Button)findViewById(R.id.button);
        learnmore = findViewById(R.id.learnmore);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
//        email = (EditText)findViewById(R.id.editText24);
        forgetPassword=(Button)findViewById(R.id.button3);
        final SharedPreferences sharedPreferences = this.getSharedPreferences
                (getPackageName(), Context.MODE_PRIVATE);


//        Parse.enableLocalDatastore(this);
//        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
////                .applicationId( "da61db0697d4310087bcdeedffe1f7914de056bb")
////                .clientKey("a986f237bdc8b1ca32c9a805e1e2d293913e8eb8")
////                .server("http://18.220.193.165:80/parse/")
////                .build()
//                        .applicationId( "3c87e8634e9e27612fed0261a76a324a61a7b5bc")
//                        .clientKey("596f6d15f8c7ed65aaa3b6d77c28cacc32d5ac49")
//                        .server("http://3.16.42.58:80/parse/")
//                        .build()
//        );

        // website: http://34.213.248.214
        // password: avzgrTOECme0
        ParseAnalytics.trackAppOpenedInBackground(getIntent());
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);


        learnmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        intro.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser.logInInBackground(username.getText().toString(), password.getText().toString(), new LogInCallback() {
                    @SuppressLint("CommitPrefEdits")
                    @Override
                    public void done(ParseUser user, ParseException e) {

                        if (user != null && user.getUsername().equals("Doctor")){
                            // this is for doctor
                            Intent intent = new Intent(MainActivity.this,
                                    Main48ActivityDocAns.class);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(),
                                    "Login as a Doctor is successful!",Toast.LENGTH_LONG).show();
                        }

                        if (user != null && !user.getUsername().equals("Doctor")){
                            // this is for patient
                            usernamepass = username.getText().toString();
                            userName = username.getText().toString();
                            Toast.makeText(getApplicationContext(),
                                    "Login is successful!",Toast.LENGTH_LONG).show();

                            Intent k = new Intent(MainActivity.this,HomePage.class);
                            startActivity(k);

                        }

                        if (user == null){
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }


//                        if(user!=null){
//                            usernamepass = username.getText().toString();
//                            Toast.makeText(getApplicationContext(),
//                                    "Login is successful!",Toast.LENGTH_LONG).show();
//
//                            Intent k = new Intent(MainActivity.this,Main2Activity.class);
//                            startActivity(k);
//
//
//                        }
                    }
                });
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser user = new ParseUser();
                user.setUsername(username.getText().toString());
                user.setPassword(password.getText().toString());
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {

                        if (e == null){
                            Toast.makeText(MainActivity.this, "signed up completed", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });


        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "you need to login your email to find the password",Toast.LENGTH_SHORT).show();
                Intent k = new Intent(MainActivity.this,Main14Activity.class);
                startActivity(k);

            }
        });











    }
}
