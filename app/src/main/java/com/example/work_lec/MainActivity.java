package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.transition.Hold;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,GridView1.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}