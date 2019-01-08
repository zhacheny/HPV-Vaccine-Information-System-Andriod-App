package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.RequestPasswordResetCallback;

import java.util.List;

public class Main14Activity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        editText = findViewById(R.id.editText26);

        button = findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseUser.requestPasswordResetInBackground(editText.getText().toString(),
                        new RequestPasswordResetCallback() {
                            public void done(ParseException e) {
                                if (e == null) {
                                    Toast.makeText(Main14Activity.this, "send email successfully", Toast.LENGTH_SHORT).show();

//                                    String email = editText.getText().toString();
//                                    ParseObject object = new ParseObject("FinalBMEforgotpassword");
//                                    object.put("FinalBMEforgotpassword",input.toString());
//                                    object.put("username", ParseUser.getCurrentUser().getUsername());
//                                    object.saveInBackground();


                                    // An email was successfully sent with reset instructions.
                                } else {
                                    Toast.makeText(Main14Activity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                                    // Something went wrong. Look at the ParseException to see what's up.
                                }
                            }
                        });

                Intent k = new Intent(Main14Activity.this,MainActivity.class);
                startActivity(k);
            }
        });
    }
}
