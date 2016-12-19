package com.example.anmolgulwani.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class testdisco extends AppCompatActivity {

    RelativeLayout ir;
    Switch start;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testdisco);
        start = (Switch) findViewById(R.id.switch2);
        ir = (RelativeLayout) findViewById(R.id.anmol);


            start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (start.isChecked()) {

                    Random rnd = new Random();
                    int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                    ir.setBackgroundColor(color);
                }
                else {
                    tv.setText("Welcome to Disco Light");
                }


            }});}



    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuInflater mInflater = new MenuInflater(this.getApplicationContext());
        mInflater.inflate(R.menu.menu2, menu);
    }
}







