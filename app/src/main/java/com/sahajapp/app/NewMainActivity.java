package com.sahajapp.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
        final TextInputLayout weightWrapper = (TextInputLayout) findViewById(R.id.wEntryLay);
        final TextInputLayout heightFtWrapper = (TextInputLayout) findViewById(R.id.hEntryLayFt);
        final TextInputLayout heightIncWrapper = (TextInputLayout) findViewById(R.id.hEntryLayIn);
        weightWrapper.setHint("lbs.");
        heightFtWrapper.setHint("ft.");
        heightIncWrapper.setHint("in.");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


       /* EditText wEdit = (EditText)findViewById(R.id.wEntry);
        wEdit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                ((EditText)view).setText("");
            }
        });*/

      /*  EditText hEdit = (EditText)findViewById(R.id.hEntry);
        hEdit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                System.out.println("ON CLICK 2nd");
                ((EditText)view).setText("");
            }
        });*/


    }

}
