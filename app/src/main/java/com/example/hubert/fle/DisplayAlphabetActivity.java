package com.example.hubert.fle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayAlphabetActivity extends AppCompatActivity {

    String[] ipa_alphabet = new String[]{
            "a [a]"
            , "b [be]"
            , "c [se]"
            , "d [de]"
            , "e [ə]"
            , "f [ɛf]"
            , "g [ʒe]"
            , "h [aʃ]"
            , "i [i]"
            , "j [ʒi]"
            , "k [ka]"
            , "l [ɛl]"
            , "m [ɛm]"
            , "n [ɛn]"
            , "o [o]"
            , "p [pe]"
            , "q [ky]"
            , "r [ɛr]"
            , "s [ɛs]"
            , "t [te]"
            , "u [y]"
            , "v [ve]"
            , "w [dubləve]"
            , "x [iks]"
            , "y [igrɛk]"
            , "z [zɛd]"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_alphabet);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ipa_alphabet);
        ListView listView = (ListView) findViewById(R.id.alphabet_list_view);
        listView.setAdapter(adapter);
    }
}
