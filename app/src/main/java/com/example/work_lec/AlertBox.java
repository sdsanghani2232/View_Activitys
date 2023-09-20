package com.example.work_lec;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AlertBox extends AppCompatActivity {

    ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box);
//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//        alertDialog.setTitle("Delete");
//        alertDialog.setMessage("are you sure ?");
//        alertDialog.setIcon(R.drawable.baseline_delete_24);
//        alertDialog.setButton(-1, "yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(AlertBox.this, "Delete", Toast.LENGTH_SHORT).show();
//            }
//        });
//        alertDialog.show();
//
        ib = findViewById(R.id.delete);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder bulider = new AlertDialog.Builder(getApplicationContext());
                bulider.setTitle("Delete");
                bulider.setMessage("are you sure ?");
                bulider.setIcon(R.drawable.baseline_delete_24);
                bulider.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertBox.this, "Delete file", Toast.LENGTH_SHORT).show();
                    }
                });
                bulider.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertBox.this, "........", Toast.LENGTH_SHORT).show();
                    }
                });
                bulider.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertBox.this, "Cancle", Toast.LENGTH_SHORT).show();
                    }
                });
                bulider.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder bulider = new AlertDialog.Builder(this);
        bulider.setTitle("Exit");
        bulider.setMessage("are you sure to exit ?");
        bulider.setIcon(R.drawable.baseline_exit_to_app_24);
        bulider.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertBox.super.onBackPressed();
            }
        });
        bulider.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertBox.this, "........", Toast.LENGTH_SHORT).show();
            }
        });
        bulider.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertBox.this, "Cancle", Toast.LENGTH_SHORT).show();
            }
        });
        bulider.show();
    }
}