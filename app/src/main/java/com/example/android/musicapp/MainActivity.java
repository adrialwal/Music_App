package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize AdMob
        // Production ID: ca-app-pub-6708725186535149/8485555336
        // Test ID: ca-app-pub-3940256099942544/1033173712
        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544/1033173712");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
                public void onAdClosed(){
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(R.id.search);


        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                // When the view is clicked the ad will load
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG","The interstitial wasn't loaded yet.");
                }

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the discover category
        TextView discover = (TextView) findViewById(R.id.discover);


        // Set a click listener on that View
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the discover category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link DiscoverActivity}
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);
                // When the view is clicked the ad will load
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG","The interstitial wasn't loaded yet.");
                }

                // Start the new activity
                startActivity(discoverIntent);
            }
        });

        // Find the View that shows the podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);


        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link PodcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                // When the view is clicked the ad will load
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG","The interstitial wasn't loaded yet.");
                }

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });

        // Find the View that shows the store category
        TextView store = (TextView) findViewById(R.id.store);


        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the store category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link StoreActivity}
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                // When the view is clicked the ad will load
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG","The interstitial wasn't loaded yet.");
                }

                // Start the new activity
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView playing = (TextView) findViewById(R.id.playing);


        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open {@link NowPlayingActivity}
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // When the view is clicked the ad will load
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG","The interstitial wasn't loaded yet.");
                }

                // Start the new activity
                startActivity(playingIntent);
            }
        });

    }
}
