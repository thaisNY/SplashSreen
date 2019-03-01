package com.example.hassansardar.animsplash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        iv= findViewById(R.id.image);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.translate);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(animation);
        iv.startAnimation(animation2);



    }
}
