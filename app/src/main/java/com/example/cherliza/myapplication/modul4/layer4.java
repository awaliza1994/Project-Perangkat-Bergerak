package com.example.cherliza.myapplication.modul4;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.SimpleCursorAdapter;

import com.example.cherliza.myapplication.R;


public class layer4 extends ListActivity{




    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer4);

        cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        startManagingCursor(cursor);

        String[]from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};
        int [] to = {android.R.id.text1, android.R.id.text2};
        SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor, from, to);

        setListAdapter(listAdapter);
    }
}
