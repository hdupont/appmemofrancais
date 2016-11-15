package com.example.hubert.fle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayIpaForPairsOfLettersActivity extends AppCompatActivity {

    String[] ipa_for_pairs_of_letters = new String[]{
            "[ɔ̃] : on"
            , "[o] : au = o = eau"
            , "[u] : ou"
            , "[ua] : oi"
            , "[ɑ̃] : en = an"
            , "[f] : ph = f"
            , "[k] : qu = k = c + (a, o, u)"
            , "[ɲ] : gn"
            , "[ɛ] : ai = ei = è"
            , "[ʃ] : sh = sch"
            , "[e] : é"
            , "[œ] : eu"
            , "[g] : gu = g"
            , "[t] : th"
            , "[œ̃] : un = ein = in = ym"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ipa_for_pairs_of_letters);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ipa_for_pairs_of_letters);
        ListView listView = (ListView) findViewById(R.id.ipa_pairs_list_view);
        listView.setAdapter(adapter);
    }
}
