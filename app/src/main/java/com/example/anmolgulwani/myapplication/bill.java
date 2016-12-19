package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bill extends AppCompatActivity {
TextView tv,ap,or,ba;
    int a,b1,c,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
    Bundle b = getIntent().getExtras();
        a=Integer.parseInt(b.getString("et1").trim());
        b1=Integer.parseInt(b.getString("et2").trim());
        c=Integer.parseInt(b.getString("et3").trim());
        sum=a+b1+c;
        tv=(TextView)findViewById(R.id.textView3);
        ap=(TextView)findViewById(R.id.bill1);
        or=(TextView)findViewById(R.id.bill2);
        ba=(TextView)findViewById(R.id.bill3);
        ap.setText(""+a);
        or.setText(""+b1);
        ba.setText(""+c);

        String ans = String.valueOf(sum);
        tv.setText("Total weight"+ans);


    }
}
