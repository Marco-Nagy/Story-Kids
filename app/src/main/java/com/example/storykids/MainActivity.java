package com.example.storykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare variables
        final TextView textView;
        ImageView imageView;
        // find text and image id
        imageView=findViewById(R.id.logo_splash);
        textView= findViewById(R.id.text_splash);
        // setting type face font
        Typeface typeface= ResourcesCompat.getFont(this,R.font.austie);
        textView.setTypeface(typeface);
        // setting animation
        Animation sideAnim;
        sideAnim= AnimationUtils.loadAnimation(this,R.anim.side_anim);
        imageView.setAnimation(sideAnim);
        textView.setAnimation(sideAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,StoryList.class);
                startActivity(intent);


            }
        }, 3000);


    }
}