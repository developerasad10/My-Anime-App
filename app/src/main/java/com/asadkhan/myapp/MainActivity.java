package com.asadkhan.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button  button1,button2,button3;
    ImageView imgView;
    Animation myAnime,zoomIn,upDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        imgView=findViewById(R.id.img1);
        myAnime = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);
        zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        upDown = AnimationUtils.loadAnimation(MainActivity.this, R.anim.up_down_cont);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.startAnimation(myAnime);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.startAnimation(zoomIn);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.startAnimation(upDown);

            }
        });
    }
}