package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));


//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        for (int i = 0; i < words.size(); i++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            rootView.addView(wordView);
//        }

//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
    }
}
