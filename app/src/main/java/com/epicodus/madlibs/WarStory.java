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
        String noun3 = intent.getStringExtra("noun3");
        String occupation = intent.getStringExtra("occupation");
        String verb = intent.getStringExtra("verb");
        String place = intent.getStringExtra("place");
        String pastVerb = intent.getStringExtra("pastVerb");
        String noun4 = intent.getStringExtra("noun4");
        String gerund = intent.getStringExtra("gerund");
        String nounPlural = intent.getStringExtra("nounPlural");
        String noun5 = intent.getStringExtra("noun5");
        String emotion = intent.getStringExtra("emotion");

        Resources storyRes = getResources();

        String warStoryStr = String.format(storyRes.getString(R.string.ml_war), noun1, noun2, noun3, occupation, verb, place, pastVerb, noun4, gerund, nounPlural, noun5, emotion);
        warStory.setText(warStoryStr);
    }
}
