package com.sfsoft.mihuerta;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Runnable{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    private void load() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goToSecondActivity();
        finish();
    }

    private void goToSecondActivity()   {
        startActivity(new Intent(getApplicationContext(), SecondActivity.class));
    }
}