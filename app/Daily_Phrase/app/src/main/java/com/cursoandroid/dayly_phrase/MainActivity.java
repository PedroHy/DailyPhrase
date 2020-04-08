package com.cursoandroid.dayly_phrase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewPhrase(View view){
        //Phrases
        String phrases[] = {
                "When you fell like giving up, remember why you held on for so long in the first place.",
                "The most courageous act is still to think for yourself.",
                "Thinking Different.",
                "The crisis go, the legacy still.",
                "Take 5 minutes and pay attention in your breath.",
                "The people will remember us whereby we do for them.",
                "The oportunite is always where the people complain.",
                "If lack of time would a reason to don´t make success, only the unoccupied would have success."
        };

        //generating a random number
        int pos = new Random().nextInt(Array.getLength(phrases));

        //Changing the phrase
        TextView txt = findViewById(R.id.phrase);
        txt.setText(phrases[pos]);
    }
}
