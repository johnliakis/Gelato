package com.example.android.gelato;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ena extends AppCompatActivity {
    //private String User="User";
    //private String Pws = "test";
    //private EditText username = (EditText) findViewById(R.id.username);
   // private EditText password = (EditText) findViewById(R.id.password);
   public Button but1;
    public void init () {
        but1= (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if (User.equals(username.toString()) && Pws.equals(password.toString())) {
                    Intent toy = new Intent(ena.this,duo.class);
                //test

//                }else
//                {
//                    new Exception("Wrong Password");
//                }
            }
        });
    }

    public Button but2;
    public void init1 () {
        but2= (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(ena.this,tria.class);
                startActivity(toy);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ena);
        init();
        init1();

    }
}