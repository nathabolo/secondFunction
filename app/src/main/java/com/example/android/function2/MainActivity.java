package com.example.android.function2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.PasswordAuthentication;
import java.text.BreakIterator;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.android.function2.R.string.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        Button btnNextpage = (Button) findViewById(R.id.nextPage);
        btnNextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText = (EditText) findViewById(R.id.nameTextViewe);
                String name = editText.getText().toString();
                Intent myIntent = new Intent(view.getContext(), NewScreen.class);
                myIntent.putExtra("Welcome", name);
                startActivity(myIntent);

                if (name==null){

                    //Display an error message if a use did not enter their name

                    Toast.makeText(MainActivity.this, "Please enter a valid name", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    }





