package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    tv=(TextView)findViewById(R.id.textView2);
        Bundle b = getIntent().getExtras();
        tv.setText("WElcome"+b.getString("uid"));
    }
}
