package com.example.hospital;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Setting environment in java XML

        final Button button=(Button) findViewById(R.id.button);
        final Button button1=(Button) findViewById(R.id.button1);

        final EditText username=(EditText)findViewById(R.id.editText);
        final EditText password=(EditText)findViewById(R.id.editText1);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "AMBULANCE FOUND", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(MainActivity.this,Ambulance.class);
                     //startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "INVALID LOGIN", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"LOGIN NORMAL EMERGENCY DETECTED",Toast.LENGTH_SHORT).show();
                 //Intent intent1=new Intent(MainActivity.this,Hello.class);
                //startActivity(intent1);
            }
        });









    }



}
