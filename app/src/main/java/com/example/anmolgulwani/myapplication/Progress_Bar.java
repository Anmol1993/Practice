package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Progress_Bar extends AppCompatActivity {

    ProgressBar pb;
    Button start;
    Thread th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress__bar);
    pb=(ProgressBar)findViewById(R.id.pb);
        start=(Button)findViewById(R.id.pbb);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                th = new Thread(){
                    public void run(){
                        try {
                            for(int i =0;i<=25;i++){
                                pb.setProgress(i*4);

                                sleep(500);

                            }

                        }
                        catch (Exception e){

                        }
                    }
                };
                th.start();
            }
        });


    }
}
