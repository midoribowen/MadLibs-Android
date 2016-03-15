package com.epicodus.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingsStory extends AppCompatActivity {
    private TextView greetingsStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings_story);

        greetingsStory = (TextView) findViewById(R.id.greetingsStory);

        Intent intent = getIntent();
        String[] greetingsStoryInputs = intent.getStringArrayExtra("greetingsStoryInput");
        Resources storyRes = getResources();

        String greetingsStr = String.format(storyRes.getString(R.string.ml_greetings), greetingsStoryInputs[0], greetingsStoryInputs[1], greetingsStoryInputs[2], greetingsStoryInputs[3], greetingsStoryInputs[4], greetingsStoryInputs[5]);
        greetingsStory.setText(greetingsStr);
    }
}
