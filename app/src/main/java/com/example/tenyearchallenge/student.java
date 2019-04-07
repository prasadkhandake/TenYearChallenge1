package com.example.tenyearchallenge;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class student extends AppCompatActivity
{
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        imageView=findViewById(R.id.studentimage);
    }
    protected  void change(View view)
    {

        imageView.setImageResource(R.drawable.harry2);
        Toast.makeText(getApplicationContext(),"After 10 Years",Toast.LENGTH_SHORT).show();
    }

}
