package com.epicodus.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class GreetingsStory extends AppCompatActivity {
    private TextView greetingsStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings_story);

        greetingsStory = (TextView) findViewById(R.id.greetingsStory);

        Intent intent = getIntent();
        ArrayList<String> greetingsStoryInputs = intent.getStringArrayListExtra("greetingsStoryInput");
        Resources storyRes = getResources();

        String greetingsStr = String.format(storyRes.getString(R.string.ml_greetings), greetingsStoryInputs.get(0), greetingsStoryInputs.get(1), greetingsStoryInputs.get(2), greetingsStoryInputs.get(3), greetingsStoryInputs.get(4), greetingsStoryInputs.get(5));
        greetingsStory.setText(greetingsStr);
    }
}
