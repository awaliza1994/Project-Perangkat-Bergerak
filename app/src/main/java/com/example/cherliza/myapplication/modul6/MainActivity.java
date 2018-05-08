package com.example.cherliza.myapplication.modul6;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cherliza.myapplication.R;


public class MainActivity extends Activity implements MyDialogFragment.UserNameListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer6);
        Button btn= (Button)findViewById(R.id.showCustomFragment);
        btn.setOnClickListener ( this );
        Button btn1= (Button)findViewById(R.id.showAlertDialogFragment);
        btn1.setOnClickListener ( this );
    }

    @Override
    public void onFinishUserDialog(String user) {
        Toast.makeText(this, "Hi, " + user, Toast.LENGTH_SHORT).show();     }

    public void onClick(View view) {
        // close existing dialog fragments
        FragmentManager manager = getFragmentManager();
        Fragment frag = manager.findFragmentByTag("fragment_edit_name");
        if (frag != null) {
            manager.beginTransaction().remove(frag).commit();
        }
        switch (view.getId()) {
            case R.id.showCustomFragment:
                MyDialogFragment editNameDialog = new MyDialogFragment();
                editNameDialog.show(manager, "fragment_edit_name");
                break;
            case R.id.showAlertDialogFragment:
                AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
                alertDialogFragment.show(manager, "fragment_edit_name");
                break;
        }
    }
}