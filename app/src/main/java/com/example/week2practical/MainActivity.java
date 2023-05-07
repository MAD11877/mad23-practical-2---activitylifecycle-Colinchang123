package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User User1 = new User("John", "Person", 12, false);
        String Name = User1.getName();
        String Description = User1.getDescription();

        Button followButton = findViewById(R.id.button);
        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(User1.followed == true){
                    User1.followed = false;
                    followButton.setText("Follow");

                }
                else if(User1.followed == false){
                    User1.followed = true;
                    followButton.setText("Unfollow");

                }

            }
        });
    }
}