package com.epicodus.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WarStory extends AppCompatActivity {
    private TextView warStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_story);

        warStory = (TextView) findViewById(R.id.warStory);

        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String noun2 = intent.getStringExtra("noun2");
        Resources storyRes = getResources();

        String warStoryStr = String.format(storyRes.getString(R.string.ml_war), noun1, noun2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        warStory.setText(warStoryStr);
    }
}
