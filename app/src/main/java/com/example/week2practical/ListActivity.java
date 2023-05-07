package com.example.week2practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imgButton = findViewById(R.id.img1);
        imgButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ListActivity.this)
                        .setTitle("Profile")
                        .setMessage("Message")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){

                            }
                        })
                        .show();

            };
        });
    }
}