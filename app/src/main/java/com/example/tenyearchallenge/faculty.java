package com.example.tenyearchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class faculty extends AppCompatActivity
{
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        imageView2=findViewById(R.id.facultyimage);
    }
    protected  void change(View view)
    {
        imageView2.setImageResource(R.drawable.dumbledore_2);
        Toast.makeText(getApplicationContext(),"After 10 Years",Toast.LENGTH_SHORT).show();
    }
}
