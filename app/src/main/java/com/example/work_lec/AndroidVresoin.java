package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AndroidVresoin extends AppCompatActivity {

    ListView list;
    ArrayList<String> av = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_vresoin);
        list = findViewById(R.id.android_list);
        av.add("Petit Four 2009");
        av.add("Cupcake 2009");
        av.add("Donut 2009");
        av.add("Eclair 2009");
        av.add("Froyo 2010");
        av.add("Gingerbread 2011");
        av.add("Honeycomb 2011");
        av.add("Jelly Bean 2012");
        av.add("Key Lime Pie 2013");
        av.add("lemon Meringue Pie 2014");
        av.add("Macadamia Nut Cookie 2015");
        av.add("New York Cheesecake 2016");
        av.add("Oatmeal Cookie 2017");
        av.add("Pistachio ice Cream 2018");
        av.add("Quince Tart 2019");
        av.add("Red Velvet Cake 2020");
        av.add("Snow Cone 2021");
        av.add("Tiramisu 2022");
        av.add("Upside Down Cake 2023");
        av.add("Vanilla Ice Cream 2024");

        ArrayAdapter<String> ap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,av);
        list.setAdapter(ap);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int a = position;
                Log.d("Position", av.get(a));
                Toast.makeText(AndroidVresoin.this, av.get(a), Toast.LENGTH_SHORT).show();
            }
        });
    }
}