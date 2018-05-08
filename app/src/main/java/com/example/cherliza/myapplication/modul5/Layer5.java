package com.example.cherliza.myapplication.modul5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.cherliza.myapplication.R;
import com.example.cherliza.myapplication.modul5.DrawingActivity;
import com.example.cherliza.myapplication.modul5.FragmentOne;
import com.example.cherliza.myapplication.modul5.FragmentTwo;

public class Layer5 extends AppCompatActivity {

    FragmentOne fragmentOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fragmentOne = new FragmentOne ();
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_layer5 );
    }

    public void onButtonClick ( View v ) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager ().findFragmentById ( R.id.fragment_two);

        switch ( v. getId ()) {
            case R. id . btn_one_create_new :
                if ( fragmentTwo == null ) {

                    Intent i = new Intent ( this , DrawingActivity. class );
                    startActivity ( i );
                } else {

                    Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                }
                break ;
            case R. id . btn_one_open_existing :
                Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                break ;
            default :
        }
    }
}

