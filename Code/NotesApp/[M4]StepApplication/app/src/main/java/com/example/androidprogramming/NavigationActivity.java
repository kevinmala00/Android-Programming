package com.example.androidprogramming;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This class represent the navigation page for the app in module 4.
 */
public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        RelativeLayout rlHome = findViewById(R.id.rl_home);
        RelativeLayout rlGitHubRepo = findViewById(R.id.rl_git_hub_repo);

        rlHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        rlGitHubRepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlGitHubRepo = getApplication().getString(R.string.url_github_repo);
                openWebPage(urlGitHubRepo);

            }
        });
    }
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}