package com.example.storykids;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_story);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.giraffella);
        String title=getIntent().getStringExtra("title");
        String story=getIntent().getStringExtra("story");
        int pic=getIntent().getIntExtra("pic",0);
        TextView textView=findViewById(R.id.text_title);
        TextView textView2=findViewById(R.id.text_story);
        ImageView imageView=findViewById(R.id.image_text);
        textView.setText(title);
        textView.setTypeface(typeface);
        textView2.setText(story);
        imageView.setImageResource(pic);
        textView2.setMovementMethod(new ScrollingMovementMethod());


            }
        }


