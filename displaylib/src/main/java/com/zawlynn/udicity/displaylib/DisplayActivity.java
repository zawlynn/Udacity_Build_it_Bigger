package com.zawlynn.udicity.displaylib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    public static final String DATA = "joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        TextView tvJoke =findViewById(R.id.tvJoke);

        Intent intent = getIntent();
        if (intent.hasExtra(DATA)){
            String jokeToDisplay = intent.getStringExtra(DATA);
            tvJoke.setText(jokeToDisplay);
        }
    }

}
