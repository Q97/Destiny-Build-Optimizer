package com.example.destinybuildoptimizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTabsActivity(View v){
        startActivity(new Intent(MainActivity.this, TabScreensActivity.class));
    }


}
