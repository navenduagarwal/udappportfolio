package com.sparshik.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonAppOne, buttonAppTwo, buttonAppThree, buttonAppFour, buttonAppFive, buttonAppSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeScreen();

        buttonAppOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        getString(R.string.format_toast, getResources().getString(R.string.app_one_name)), Toast.LENGTH_SHORT).show();
            }
        });

        buttonAppTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.format_toast, getResources().getString(R.string.app_two_name)), Toast.LENGTH_SHORT).show();
            }
        });

        buttonAppThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.format_toast, getResources().getString(R.string.app_three_name)), Toast.LENGTH_SHORT).show();
            }
        });

        buttonAppFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.format_toast, getResources().getString(R.string.app_four_name)), Toast.LENGTH_SHORT).show();
            }
        });

        buttonAppFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.format_toast, getResources().getString(R.string.app_five_name)), Toast.LENGTH_SHORT).show();
            }
        });

        buttonAppSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.format_toast, getResources().getString(R.string.app_six_name)), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void initializeScreen() {
        buttonAppOne = (Button) findViewById(R.id.app_one);
        buttonAppTwo = (Button) findViewById(R.id.app_two);
        buttonAppThree = (Button) findViewById(R.id.app_three);
        buttonAppFour = (Button) findViewById(R.id.app_four);
        buttonAppFive = (Button) findViewById(R.id.app_five);
        buttonAppSix = (Button) findViewById(R.id.app_six);
    }

}
