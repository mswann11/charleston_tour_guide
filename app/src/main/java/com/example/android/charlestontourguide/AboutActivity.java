package com.example.android.charlestontourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    /**
     * Inflate the menu.
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    /**
     * Set intent for each option in the menu.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.weather:
                Intent weatherIntent = new Intent(AboutActivity.this, WeatherActivity.class);
                startActivity(weatherIntent);
                return true;

            case R.id.explore:
                Intent exploreIntent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(exploreIntent);
                return true;

            case R.id.about:
                Intent aboutIntent = new Intent(AboutActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
