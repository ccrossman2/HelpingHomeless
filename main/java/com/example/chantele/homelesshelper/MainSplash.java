package com.example.chantele.homelesshelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);
        if (getSupportActionBar() != null)
        {   //display action bar icon
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.mipmap.ic_launcher);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }
        TimerTask task = new TimerTask( ) {

            @Override
            public void run() {
                finish();
                startActivity(new Intent(MainSplash.this, MainActivity.class));
            }
        };
        Timer splashing = new Timer();
        splashing.schedule(task,2000);
    }
}
