package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class Counter extends AppCompatActivity implements View.OnClickListener {
Button i,d,r;
    TextView tex;

static int count =0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        i=(Button) findViewById( R.id.add);
        d=(Button)findViewById(R.id.sub);
        r=(Button)findViewById(R.id.res);
        tex=(TextView)findViewById(R.id.tex);
        i.setOnClickListener(this);
        d.setOnClickListener(this);
        r.setOnClickListener(this);



    }


    @Override

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.add:
                count++;
                tex.setText("Count :"+count);
                break;
            case R.id.sub:
                count--;
                tex.setText("Count :"+count);
                break;
            case R.id.res:
                count=0;
                tex.setText("Count :"+count);
                break;

        }
    }



}
