package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class InputGreetingsStory extends AppCompatActivity {
    private Button goMadButton;
    private EditText nounPlural;
    private EditText occupation;
    private EditText animalPlural;
    private EditText place;
    private EditText verb;
    private EditText noun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_greetings_story);

        goMadButton = (Button) findViewById(R.id.goMadButton);
        nounPlural = (EditText) findViewById(R.id.nounPlural);
        occupation = (EditText) findViewById(R.id.occupation);
        animalPlural = (EditText) findViewById(R.id.animalPlural);
        place = (EditText) findViewById(R.id.place);
        verb = (EditText) findViewById(R.id.verb);
        noun = (EditText) findViewById(R.id.noun);

        goMadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nounPluralStr = nounPlural.getText().toString();
                String occupationStr = occupation.getText().toString();
                String animalPluralStr = animalPlural.getText().toString();
                String placeStr = place.getText().toString();
                String verbStr = verb.getText().toString();
                String nounStr = noun.getText().toString();

                ArrayList<String> greetingsStoryInput = new ArrayList<String>();
                greetingsStoryInput.add(nounPluralStr);
                greetingsStoryInput.add(occupationStr);
                greetingsStoryInput.add(animalPluralStr);
                greetingsStoryInput.add(placeStr);
                greetingsStoryInput.add(verbStr);
                greetingsStoryInput.add(nounStr);

                String[] wheel = new String[greetingsStoryInput.size()];
                greetingsStoryInput.toArray(wheel);


                Intent intent = new Intent(InputGreetingsStory.this, GreetingsStory.class);
                intent.putExtra("greetingsStoryInput", wheel);

                startActivity(intent);
            }
        });
    }
}
