package com.example.cherliza.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = ( Button ) findViewById ( R.id.btn1 );
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent modul1 = new Intent(getApplicationContext(),layer.class);
                startActivity(modul1);
            }
        });

        Button bt2= ( Button ) findViewById (R.id.btn2);
       bt2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent modul2 = new Intent(getApplicationContext(),layer2.class);
               startActivity(modul2);
           }
       });

        Button bt3= ( Button ) findViewById (R.id.btn3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modul3 = new Intent(getApplicationContext(),layer3.class);
                startActivity(modul3);
            }
        });
    }
}

