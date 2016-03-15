package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button warStoryButton;
    private Button greetingsStoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        warStoryButton = (Button) findViewById(R.id.warStoryButton);
        warStoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InputWarStory.class);
                startActivity(intent);
            }
        });

        greetingsStoryButton = (Button) findViewById(R.id.greetingsStoryButton);
        greetingsStoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InputGreetingsStory.class);
                startActivity(intent);
            }
        });
    }
}
