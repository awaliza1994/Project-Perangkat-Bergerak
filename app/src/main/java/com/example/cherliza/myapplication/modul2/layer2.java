package com.example.cherliza.myapplication.modul2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cherliza.myapplication.R;


public class layer2 extends AppCompatActivity {

    int ch=1;
    float font=30;
    int text=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer2);
        final TextView t= (TextView) findViewById(R.id.tv1);
        Button b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(font);
                font=font+5;
                if (font==50)
                    font=30;
            }
        });

        Button b2 = (Button) findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch){
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch==7)
                    ch=1;
            }
        });

        Button b3 = (Button) findViewById(R.id.bt3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (text){
                    case 1:
                        t.setText("Sate Madura");
                        break;
                    case 2:
                        t.setText("Kikil Jombang");
                        break;
                    case 3:
                        t.setText("Ayam bakar");
                        break;
                    case 4:
                        t.setText("Ayam geprek");
                        break;
                    case 5:
                        t.setText("Gulai Kepala Ikan");
                        break;
                    case 6:
                        t.setText("Pecel Tumpang");
                        break;
                }
                text++;
                if (text==7)
                    text=1;

        }
        });
    }

}
