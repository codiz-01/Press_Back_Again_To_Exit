package com.example.pressbackagaintoexit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPressed ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed() {
        if (backPressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();

    }
}