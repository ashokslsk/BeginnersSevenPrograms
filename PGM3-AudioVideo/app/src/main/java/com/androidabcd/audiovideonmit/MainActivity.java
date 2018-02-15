package com.androidabcd.audiovideonmit;

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


    public void onAudio(View v) {
        startActivity(new Intent(this, AudioActivity.class));
    }

    public void onVideo(View v) {
        startActivity(new Intent(this, VideoActivity.class));
    }
}
