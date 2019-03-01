package com.example.hassansardar.animsplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView tv = findViewById(R.id.text);
        ImageView iv = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        tv.startAnimation(animation);
        iv.startAnimation(animation2);

        final Intent intent = new Intent(this, com.example.hassansardar.animsplash.MainActivity.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);

//                        int waited = 0;
//                        // Splash screen pause time
//                        while (waited < 3500) {
//                            sleep(100);
//                            waited += 100;

                } catch (InterruptedException e) {
                    // e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }

        };


        timer.start();

    }
}
