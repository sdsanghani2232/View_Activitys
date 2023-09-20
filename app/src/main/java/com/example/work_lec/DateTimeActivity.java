package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateTimeActivity extends AppCompatActivity {

    Button date,time;
    int year,month,day,min,hours;
    TextView tv_date,tv_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        date = findViewById(R.id.date_btn);
        time = findViewById(R.id.time_btn);
        tv_date = findViewById(R.id.date_view);
        tv_time = findViewById(R.id.time_view);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(calendar.YEAR);
        month = calendar.get(calendar.MONTH);
        day = calendar.get(calendar.DATE);
        min = calendar.get(calendar.MINUTE);
        hours = calendar.get(calendar.HOUR);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePicker = new DatePickerDialog(DateTimeActivity.this,new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        tv_date.setText(day + "/" + month + " / " + year);
                    }
                },year,month,day);
                datePicker.show();
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(DateTimeActivity.this , new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hours, int min) {
                        tv_time.setText(hours +" : " + min);
                    }
                },hours,min,true);
                timePickerDialog.show();
            }
        });
    }
}