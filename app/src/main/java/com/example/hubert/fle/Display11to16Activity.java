package com.example.hubert.fle;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Display11to16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_11_to_16);

        Resources res = getResources();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res.getStringArray(R.array.fi) );

        ListView listView = (ListView) findViewById(R.id.activity_display_0_to_10_list_view);
        listView.setAdapter(adapter);
    }
}
