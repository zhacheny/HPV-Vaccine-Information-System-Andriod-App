package com.example.zhach.bme_finalpro;

import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import org.w3c.dom.Text;

import java.util.List;

public class Calendar extends Activity {
    CalendarView calendarView;
    TextView myDate,savedDate;
    Button savedate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = findViewById(R.id.calendarview);
        myDate = findViewById(R.id.myDate);
        savedate = findViewById(R.id.savedate);
        savedDate = findViewById(R.id.savedDate);
        ParseQuery<ParseObject> query = new
                ParseQuery<ParseObject>("BMEFinalCalendar");

        query.whereEqualTo("username", MainActivity.userName);
//        ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("BMEFinalASK");
//        query.orderByDescending("createAT");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null){
                    for (ParseObject object:objects){
                        savedDate.setText(object.get("BMEFinalCalendar").toString());

                    }

                }
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1+1) + "/" + i2 + "/" + i;
                myDate.setText(date);
            }
        });

        savedate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseObject object = new ParseObject("BMEFinalCalendar");
                if (myDate.getText().toString().equals(savedDate.getText().toString())){
                    Toast.makeText(getApplicationContext(),
                            "No change on your schedule date!",Toast.LENGTH_LONG).show();
                    return;
                }else {
                    ParseQuery<ParseObject> query = ParseQuery.getQuery("BMEFinalCalendar");
                    object.put("BMEFinalCalendar",myDate.getText().toString());
                    object.put("username",MainActivity.userName);
                    object.saveInBackground();
                    Toast.makeText(getApplicationContext(),
                            "Your Schedule has been saved!",Toast.LENGTH_LONG).show();
                    savedDate.setText(myDate.getText().toString());
                }

            }
        });
    }

}
