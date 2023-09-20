package com.example.work_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView v =findViewById(R.id.vi1);
//        String vpath = "android.resource://"+getPackageName()+"/raw/video1";
//        Uri uri = Uri.parse(vpath);
//        v.setVideoPath(uri);
//        v.setVideoURI(uri);

        String onlinevideo = "https://static.videezy.com/system/resources/previews/000/000/168/original/Record.mp4";
        Uri uri = Uri.parse(onlinevideo);
        v.setVideoURI(uri);
        MediaController mc = new MediaController(this);
        v.setMediaController(mc);
        v.start();
    }
}