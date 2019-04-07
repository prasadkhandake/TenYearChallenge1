package com.example.tenyearchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lab_assistant extends AppCompatActivity
{
    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_assistant);
        imageView3=findViewById(R.id.labimage);
    }
    protected  void change(View view)
    {
        imageView3.setImageResource(R.drawable.hagrid2);
        Toast.makeText(getApplicationContext(),"After 10 Years",Toast.LENGTH_SHORT).show();
    }
}
