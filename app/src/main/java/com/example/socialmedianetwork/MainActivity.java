package com.example.socialmedianetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private Button postButton;
    private Button storyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.searchButton);
        postButton = findViewById(R.id.postButton);
        storyButton = findViewById(R.id.storyButton);


        searchButton.setOnClickListener(view -> {openSearchActivity();});
        postButton.setOnClickListener(view -> {openPostActivity();});
        storyButton.setOnClickListener(view -> {openStoryActivity();});
    }

    private void openSearchActivity() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
    private void openPostActivity() {
        Intent intent = new Intent(this, PostActivity.class);
        startActivity(intent);
    }
    private void openStoryActivity() {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}