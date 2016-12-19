package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteText extends AppCompatActivity {
    MultiAutoCompleteTextView mactv;
    AutoCompleteTextView actv1;
    String Country[] = {"India","Iraq","UK","US","Nepal","Iran"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        mactv = (MultiAutoCompleteTextView) findViewById(R.id.mactv);
        actv1 = (AutoCompleteTextView)findViewById(R.id.actv12);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Country);
        actv1.setAdapter(adapter);
        mactv.setAdapter(adapter);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }}


