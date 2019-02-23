package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.charlesrowland.ragingclaw.javajester.Jester;
import com.charlesrowland.ragingclaw.jesterfactory.ShowJokesActivity;


public class MainActivity extends AppCompatActivity implements JesterTaskListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
//        Jester jester = new Jester();
//
//        // intent to launch the jesterfactory
//        Intent intent = new Intent(this, ShowJokesActivity.class);
//        intent.putExtra(getString(R.string.jokeEnvelope), jester.entertainMeJester());
//        startActivity(intent);
        new EndpointAsyncTask().execute(this);
    }


    @Override
    public void onComplete(String result) {
        Intent intent = new Intent(this, ShowJokesActivity.class);
        intent.putExtra(getString(R.string.jokeEnvelope), result);
        this.startActivity(intent);
    }
}
