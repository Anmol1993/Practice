package com.example.anmolgulwani.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class SpinnerTest extends AppCompatActivity {

Spinner spinner;
    RelativeLayout r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_test);
spinner=(Spinner)findViewById(R.id.spinner);
        r1=(RelativeLayout)findViewById(R.id.relativelayout);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner.getSelectedItem().toString().equals("Select Color"))
                {

                }
                else if (spinner.getSelectedItem().toString().equals("Red"))
                {
                    r1.setBackgroundColor(Color.RED);
                }
                else if (spinner.getSelectedItem().toString().equals("Blue"))
                {
                    r1.setBackgroundColor(Color.BLUE);
                }
                    else if (spinner.getSelectedItem().toString().equals("Green"))
                {
                    r1.setBackgroundColor(Color.GREEN);
                }
                else if  (spinner.getSelectedItem().toString().equals("Yellow"))
                {
                    r1.setBackgroundColor(Color.YELLOW);
                }
                 else if (spinner.getSelectedItem().toString().equals("Magenta"))
                {r1.setBackgroundColor(Color.MAGENTA);}
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
