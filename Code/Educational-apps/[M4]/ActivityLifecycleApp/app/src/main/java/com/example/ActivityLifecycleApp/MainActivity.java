package com.example.ActivityLifecycleApp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onCreate() execution");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onStart() execution");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onStop() execution");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onDestroy() execution");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onPause() execution");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onResume() execution");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onRestart() execution");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "onSaveInstanceState() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onSaveInstanceState() execution");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "onRestoreInstanceState() execution", Toast.LENGTH_SHORT).show();
        Log.v("STEP", "onRestoreInstanceState() execution");
    }
}