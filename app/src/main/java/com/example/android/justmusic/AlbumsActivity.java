package com.example.android.justmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        // Find the View that shows the artists category
        Button artists2 = (Button) findViewById(R.id.artists2);

        // Set a click listener on that View
        artists2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artists2Intent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artists2Intent);
            }
        });

        // Find the View that shows the menu category
        Button main = (Button) findViewById(R.id.main);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });


        // Find the View that shows the now playing category
        Button playing = (Button) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumsActivity.this, nowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        // Find the View that shows the payment category
        Button payment = (Button) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(AlbumsActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}