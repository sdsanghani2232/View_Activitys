package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridView1 extends AppCompatActivity {

    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gv= findViewById(R.id.grid1);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i= 1; i<=50;i++)
        {
            al.add(i);
        }
        ArrayAdapter<Integer> av = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,al);
        gv.setAdapter(av);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int a = al.get(position);
                Toast.makeText(GridView1.this, ""+(a*a), Toast.LENGTH_SHORT).show();
            }
        });
    }
}