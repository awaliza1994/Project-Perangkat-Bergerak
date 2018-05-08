package com.example.cherliza.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cherliza.myapplication.modul2.layer2;
import com.example.cherliza.myapplication.modul3.layer3;
import com.example.cherliza.myapplication.modul4.layer4;
import com.example.cherliza.myapplication.modul5.Layer5;

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

        Button bt4= ( Button ) findViewById (R.id.btn4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modul4= new Intent(getApplicationContext(),layer4.class);
                startActivity(modul4);
            }
        });

        Button bt5= ( Button ) findViewById (R.id.btn5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modul5= new Intent(getApplicationContext(), Layer5.class);
                startActivity(modul5);
            }
        });

        Button bt6= ( Button ) findViewById (R.id.btn6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modul6= new Intent(getApplicationContext(), com.example.cherliza.myapplication.modul6.MainActivity.class);
                startActivity(modul6);
            }
        });

    }
}

