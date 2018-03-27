package com.example.cherliza.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class layer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer);

        Button bt1 = ( Button ) findViewById ( R.id.btn1 );
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btgree = new Intent(getApplicationContext(),layer1.class);
                Toast.makeText(layer.this, "Hallo Mohammad Awaliza Nim kamu 140411100004", Toast.LENGTH_SHORT).show();
                startActivity(btgree);
            }
        });
    }
}
