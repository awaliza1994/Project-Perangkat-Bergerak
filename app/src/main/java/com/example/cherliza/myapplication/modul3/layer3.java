package com.example.cherliza.myapplication.modul3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.cherliza.myapplication.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class layer3  extends AppCompatActivity{

    EditText e1,e2,e3,e4,e5;
    Button bt,date;
    Spinner s;
    SimpleDateFormat dateFormatter;

    String[]dept_array={"Semen Gresik","Semen Indonesia","Gudang Garam","Malboro"};
    String name, reg, dept, city, hobby, tglLahir;

    public void tampilCalender(){
        Calendar newCalender = Calendar.getInstance ();
        DatePickerDialog datePickerDialog = new DatePickerDialog ( this, new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance ();
                newDate.set ( year, month, dayOfMonth );

                e3.setText ( dateFormatter.format ( newDate.getTime () ) );
            }
        }, newCalender.get ( Calendar.YEAR ), newCalender.get ( Calendar.MONTH ), newCalender.get ( Calendar.DAY_OF_MONTH ));
        datePickerDialog.show ();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer3);

        e1=(EditText)findViewById ( R.id.edtText1 );
        e2=(EditText)findViewById ( R.id.edtText2 );
        e3=(EditText ) findViewById ( R.id.edtText3 );
        e4=(EditText )findViewById ( R.id.edtText4 );
        e5=(EditText )findViewById ( R.id.edtText5 );
        bt=(Button)findViewById ( R.id.tombolSubmit );
        s=(Spinner)findViewById ( R.id.spinner );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        e3=(EditText )findViewById ( R.id.edtText3 );
        date=(Button )findViewById ( R.id.dtCalender );

        ArrayAdapter adapter=new ArrayAdapter ( layer3.this, android.R.layout.simple_spinner_item,dept_array );
        s.setAdapter ( adapter );

        bt.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                name=e1.getText ().toString ();
                reg=e2.getText ().toString ();
                tglLahir=e3.getText ().toString ();
                city=e4.getText ().toString ();
                hobby=e5.getText ().toString ();
                dept=s.getSelectedItem ().toString ();

                Intent i=new Intent ( layer3.this, layer3_second.class );

                i.putExtra ( "name_key", name );
                i.putExtra ( "reg_key", reg );
                i.putExtra ( "dept_key", dept );
                i.putExtra ( "tgl_key", tglLahir );
                i.putExtra ( "city_key", city );
                i.putExtra ( "hobby_key", hobby );

                startActivity ( i );

            }
        } );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        e3=(EditText )findViewById ( R.id.edtText3 );
        date=(Button )findViewById ( R.id.dtCalender );
        date.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                tampilCalender ();
            }
        } );

        }
    }
