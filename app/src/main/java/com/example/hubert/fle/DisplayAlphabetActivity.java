package com.example.hubert.fle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayAlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_alphabet);

        String[] ipa_alphabet = new String[]{
                "a"
                , "b"
                , "c"
                , "d"
                , "e"
                , "f"
                , "g"
                , "h"
                , "i"
                , "j"
                , "k"
                , "l"
                , "m"
                , "n"
                , "o"
                , "p"
                , "q"
                , "r"
                , "s"
                , "t"
                , "u"
                , "v"
                , "w"
                , "x"
                , "y"
                , "z"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ipa_alphabet);
        ListView listView = (ListView) findViewById(R.id.alphabet_list_view);
        listView.setAdapter(adapter);
    }


}
