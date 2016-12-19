package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonTest extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    RadioGroup rg;
    Button cl1;
    TextView op1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_test);
    r1=(RadioButton)findViewById(R.id.rd1);
        r2=(RadioButton)findViewById(R.id.rd2);
        r3= (RadioButton)findViewById(R.id.rd3);
        r4=(RadioButton)findViewById(R.id.rd4);
        rg=(RadioGroup)findViewById(R.id.rg);
        cl1=(Button)findViewById(R.id.cl1);


        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg.clearCheck();
                op1.setText("");

            }});
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

            r1.setOnClickListener(listener);
            r2.setOnClickListener(listener);
            r3.setOnClickListener(listener);
            r4.setOnClickListener(listener);
        if(r1.isChecked()){op1.setText("Microsoft");}
        else if (r2.isChecked()){op1.setText("Android");}
        else if (r3.isChecked()){op1.setText("Blackberry");}
        else if (r4.isChecked()){op1.setText(("ios"));}
        else { op1.setText("");        }
        }



        }
