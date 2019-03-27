package com.example.android.justmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class nowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the main menu category
        Button main = (Button) findViewById(R.id.main);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(nowPlayingActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        // Find the View that shows the artists category
        Button artists2 = (Button) findViewById(R.id.artists2);

        // Set a click listener on that View
        artists2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artists2Intent = new Intent(nowPlayingActivity.this, ArtistsActivity.class);
                startActivity(artists2Intent);
            }
        });

        // Find the View that shows the albums category
        Button albums2 = (Button) findViewById(R.id.albums2);

        // Set a click listener on that View
        albums2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albums2Intent = new Intent(nowPlayingActivity.this, AlbumsActivity.class);
                startActivity(albums2Intent);
            }
        });

        // Find the View that shows the payment category
        Button payment = (Button) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the payment View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(nowPlayingActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}