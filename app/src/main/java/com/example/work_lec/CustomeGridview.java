package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class CustomeGridview extends AppCompatActivity {

    GridView gv;
    int img[] = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_gridview);
        gv = findViewById(R.id.grid1);
    }
}