package com.example.hubert.fle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayAlphabetActivity(View view) {
        Intent intent = new Intent(this, DisplayAlphabetActivity.class);
        startActivity(intent);
    }

    public void displayIpaForPairsOfLettersActivity(View view) {
        Intent intent = new Intent(this, DisplayIpaForPairsOfLettersActivity.class);
        startActivity(intent);
    }

    public void display20To60Activity(View view) {
        Intent intent = new Intent(this, Display20To60Activity.class);
        startActivity(intent);
    }
}
