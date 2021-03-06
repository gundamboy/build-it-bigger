package com.charlesrowland.ragingclaw.jesterfactory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokesActivity extends AppCompatActivity {

    private String result = null;
    public static final String JOKE = "why_did_the_chicken_cross_the_road";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_jokes);

        TextView punchline = (TextView) findViewById(R.id.punchline);

        Intent intent = getIntent();
        result = intent.getStringExtra(getString(R.string.jokeEnvelope));

        if (result != null) {
            // set the textview to the string
            punchline.setText(result);
        } else {
            punchline.setText(R.string.get_off_my_lawn);
        }

    }
}
