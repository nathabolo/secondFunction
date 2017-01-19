package com.example.android.function2;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //A code for back button which apears on the action bar. Clicking this button takes you back to the home activity

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_new_screen);

       TextView nameTextview = (TextView)findViewById(R.id.welcome);

        nameTextview.setText(getIntent().getStringExtra("Welcome"));


        //A code for the close button to close the entire application

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //A code to show the finish method of the close button
                finish();
                System.exit(0);
            }
        });
    }

    //Get action bar into an activity

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:

                int id = menuItem.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_name) {
                    return false;
                }
                return super.onOptionsItemSelected(menuItem);
        }


    }

        }






