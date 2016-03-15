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
//    List<String> inputs = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_war_story);

        goMadButton = (Button) findViewById(R.id.goMadButton);
        noun1 = (EditText) findViewById(R.id.noun1);
        noun2 = (EditText) findViewById(R.id.noun2);
        goMadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun1Str = noun1.getText().toString();
                String noun2Str = noun2.getText().toString();
//                inputs.add(noun1.getText().toString());
                Intent intent = new Intent(InputWarStory.this, WarStory.class);
                intent.putExtra("noun1", noun1Str);
                intent.putExtra("noun2", noun2Str);
                startActivity(intent);
            }
        });
    }
}
