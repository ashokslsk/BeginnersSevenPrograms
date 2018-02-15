package com.androidabcd.nmitdaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = (TextView) findViewById(R.id.show_count);
        int count = getIntent().getExtras().getInt("count");
        mShowCount.setText(count+"");
    }
}
