package com.example.calulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView clacInputText;
    EditText calcInput;
    Button calcInputButton;
    Begregner begregner = new Begregner();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clacInputText = (TextView) findViewById(R.id.clacText);
        calcInput = (EditText) findViewById(R.id.clacinput);
        calcInputButton = (Button) findViewById(R.id.facit);

        calcInputButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                begregner.getFacit();
                Log.d(TAG, "getfacit: "+begregner.getFacit());
            }
        });

    }
}
