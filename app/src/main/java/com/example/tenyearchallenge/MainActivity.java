package com.example.tenyearchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText user,passwd;
    String userName,password,spChoice;
    Spinner spinner;
    String[] sp={"Student", "Faculty","Lab Assistant"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.edituser);
        passwd=findViewById(R.id.editpasswd);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, sp);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(a);

    }
    public void login(View v)
    {
        Intent i1=new Intent(this,faculty.class);
        Intent i2=new Intent(this,student.class);
        Intent i3=new Intent(this,lab_assistant.class);
        userName=user.getText().toString();
        password=passwd.getText().toString();
        if(userName.isEmpty()|| password.isEmpty()||spinner.getSelectedItem()==null)
        {

            user.setError("Enter Username");
            passwd.setError("Enter Password");
        }
        else
        {

            if(userName.equals(password) && spinner.getSelectedItem().toString().equals("Faculty"))
            {

                startActivity(i1);
                Toast.makeText(getApplicationContext(),"Login Successful to Faculty",Toast.LENGTH_SHORT).show();
            }
            else if (userName.equals(password) && spinner.getSelectedItem().toString().equals("Student"))
            {

                startActivity(i2);

                Toast.makeText(getApplicationContext(),"Login Successful to Student",Toast.LENGTH_SHORT).show();
            }
            else if (userName.equals(password) && spinner.getSelectedItem().toString().equals("Lab Assistant"))
            {

                startActivity(i3);
                Toast.makeText(getApplicationContext(),"Login Successful to Lab Assistant",Toast.LENGTH_SHORT).show();
            }
            else
            {
                user.setError("Invalid details.");
                passwd.setError("Invalid details.");
            }
        }

    }
    public void ClearText(View v)
    {
        user.setText(getString(R.string.empty));
        passwd.setText(getString(R.string.empty));
    }
}
