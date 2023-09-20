package com.example.work_lec;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class AutoCompleteText extends AppCompatActivity {

    AutoCompleteTextView au;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);
        au = findViewById(R.id.auto);
        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("USA");
        arrayList.add("UK");
        arrayList.add("Canada");
        arrayList.add("Itali");
//        arrayList.add("India");
//        arrayList.add("Australia");
//        arrayList.add("USA");
//        arrayList.add("UK");
//        arrayList.add("Canada");
//        arrayList.add("Itali");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList){
          @Override
          public View getDropDownView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {

              return null;
          }
        };
        au.setAdapter(arrayAdapter);
    }
}