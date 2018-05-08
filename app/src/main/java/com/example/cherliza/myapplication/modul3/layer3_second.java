package com.example.cherliza.myapplication.modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cherliza.myapplication.R;


public class layer3_second extends AppCompatActivity {

    TextView t1,t2,t3, t4,t5, t6;
    String name, reg, dept,tglLahir, city, hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer3_second);

        t1=(TextView) findViewById ( R.id.Tview1 );
        t2=(TextView) findViewById ( R.id.Tview2);
        t3=(TextView) findViewById ( R.id.Tview3);
        t4=(TextView) findViewById ( R.id.Tview4 );
        t5=(TextView) findViewById ( R.id.Tview5);
        t6=(TextView) findViewById ( R.id.Tview6);
        Intent i= getIntent ();

        name=i.getStringExtra ( "name_key" );
        reg=i.getStringExtra ( "reg_key" );
        dept=i.getStringExtra ( "dept_key" );
        tglLahir=i.getStringExtra ( "tgl_key" );
        city=i.getStringExtra ( "city_key" );
        hobby=i.getStringExtra ( "hobby_key" );

        t1.setText ( name );
        t2.setText ( reg );
        t3.setText ( dept );
        t4.setText ( tglLahir );
        t5.setText ( city );
        t6.setText ( hobby );

    }
}
