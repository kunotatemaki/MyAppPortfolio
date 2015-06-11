package com.rukiasoft.androidapps.udacity.nanodegree.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.rukiasoft.androidapps.udacity.nanodegree.myappportfolio.tools.MyAppPortfolioTools;


public class MainActivity extends AppCompatActivity {
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        findViewById(R.id.spotify_button);
        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        final String launch = getResources().getString(R.string.will_launch) + " ";
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.spotify_button)));
            }
        });
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.scores_button)));
            }
        });
        Button libraryButton = (Button) findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.library_button)));
            }
        });
        Button buildItButton = (Button) findViewById(R.id.build_it_button);
        buildItButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.build_it_button)));
            }
        });
        Button readerButton = (Button) findViewById(R.id.reader_button);
        readerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.reader_button)));
            }
        });
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyAppPortfolioTools.showToast(activity, launch.concat(getResources().getString(R.string.capstone_button)));
            }
        });
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
            MyAppPortfolioTools.showToast(activity, getResources().getString(R.string.comming_soon));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
