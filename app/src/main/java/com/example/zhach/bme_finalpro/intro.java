package com.example.zhach.bme_finalpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro extends AppCompatActivity {
    Button back,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        back=findViewById(R.id.Back);
        signup=findViewById(R.id.button2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(intro.this,MainActivity.class);
                startActivity(k);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(intro.this,MainActivity.class);
                startActivity(k);
            }
        });
    }
}
