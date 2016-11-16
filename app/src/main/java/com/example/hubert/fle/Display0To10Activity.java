package com.example.hubert.fle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Display0To10Activity extends AppCompatActivity {

    String[] numbers_0_to_10 = new String[]{
            "0 zéro"
            , "1 un"
            , "2 deux"
            , "3 trois"
            , "4 quatre"
            , "5 cinq"
            , "6 six"
            , "7 sept"
            , "8 huit"
            , "9 neuf"
            , "10 dix"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_0_to_10);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, numbers_0_to_10);
        ListView listView = (ListView) findViewById(R.id.activity_display_0_to_10_list_view);
        listView.setAdapter(adapter);
    }
}
