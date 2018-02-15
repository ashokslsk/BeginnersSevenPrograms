package com.androidabcd.nmitdaytwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }


    // Excercise-
    // Create a method for Count down and display in textview
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        //This value is integer
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, mCount+"", duration);
        toast.show();

        if(mCount == 20){
            Intent SecondScreen = new Intent(MainActivity.this, SecondActivity.class);
            SecondScreen.putExtra("count", mCount);
            startActivity(SecondScreen);
        }
    }
}
