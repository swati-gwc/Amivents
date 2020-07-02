package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Picview extends AppCompatActivity {


    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picview);

        imageView=findViewById(R.id.img_view);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");

        Intent i=getIntent();

        int position =i.getExtras().getInt("id");

        ImageAdapter imageAdapter= new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[position]);
    }
}
