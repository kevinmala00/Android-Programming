package com.example.androidprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Introduction activity, this activity could be used to display initial logo of application.
 * It start another activity after <delay> seconds and then finish, rather it is destroyed by SO.
 *
 * @author kevinmala00
 */
public class MainActivity extends AppCompatActivity {
    private final long delay = 3 * 1000;    // numbers of millisecods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint_layout);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                finish();
                startActivity(intent);
            }
        }, delay);
    }
}