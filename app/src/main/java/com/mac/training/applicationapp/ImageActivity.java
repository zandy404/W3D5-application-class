package com.mac.training.applicationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView image2 = ((ImageView) this.findViewById(R.id.a_image_img));
        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(image2);
    }
}
