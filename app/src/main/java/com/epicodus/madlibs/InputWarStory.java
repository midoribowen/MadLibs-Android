package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InputWarStory extends AppCompatActivity {
    private Button goMadButton;
    private EditText noun1;
    private EditText noun2;
    private EditText noun3;
    private EditText occupation;
    private EditText verb;
    private EditText place;
    private EditText pastVerb;
    private EditText noun4;
    private EditText gerund;
    private EditText nounPlural;
    private EditText noun5;
    private EditText emotion;
//    List<String> inputs = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_war_story);

        goMadButton = (Button) findViewById(R.id.goMadButton);
        noun1 = (EditText) findViewById(R.id.noun1);
        noun2 = (EditText) findViewById(R.id.noun2);
        noun3 = (EditText) findViewById(R.id.noun3);
        occupation = (EditText) findViewById(R.id.occupation);
        verb = (EditText) findViewById(R.id.verb);
        place = (EditText) findViewById(R.id.place);
        pastVerb = (EditText) findViewById(R.id.pastVerb);
        noun4 = (EditText) findViewById(R.id.noun4);
        gerund = (EditText) findViewById(R.id.gerund);
        nounPlural = (EditText) findViewById(R.id.nounPlural);
        noun5 = (EditText) findViewById(R.id.noun5);
        emotion = (EditText) findViewById(R.id.emotion);
        goMadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun1Str = noun1.getText().toString();
                String noun2Str = noun2.getText().toString();
                String noun3Str = noun3.getText().toString();
                String occupationStr = occupation.getText().toString();
                String verbStr = verb.getText().toString();
                String placeStr = place.getText().toString();
                String pastVerbStr = pastVerb.getText().toString();
                String noun4Str = noun4.getText().toString();
                String gerundStr = gerund.getText().toString();
                String nounPluralStr = nounPlural.getText().toString();
                String noun5Str = noun5.getText().toString();
                String emotionStr = emotion.getText().toString();
//                inputs.add(noun1.getText().toString());
                Intent intent = new Intent(InputWarStory.this, WarStory.class);
                intent.putExtra("noun1", noun1Str);
                intent.putExtra("noun2", noun2Str);
                intent.putExtra("noun3", noun3Str);
                intent.putExtra("occupation", occupationStr);
                intent.putExtra("verb", verbStr);
                intent.putExtra("place", placeStr);
                intent.putExtra("pastVerb", pastVerbStr);
                intent.putExtra("noun4", noun4Str);
                intent.putExtra("gerund", gerundStr);
                intent.putExtra("nounPlural", nounPluralStr);
                intent.putExtra("noun5", noun5Str);
                intent.putExtra("emotion", emotionStr);
                startActivity(intent);
            }
        });
    }
}
