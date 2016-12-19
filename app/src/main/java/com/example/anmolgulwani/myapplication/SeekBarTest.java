package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarTest extends AppCompatActivity {

    SeekBar sb;
    ProgressBar pb2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_test);

pb2=(ProgressBar)findViewById(R.id.pb2);
    sb= (SeekBar)findViewById(R.id.sb);
        tv=(TextView)findViewById(R.id.sbd);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
try {
    tv.setText("Progress " + progress);
    pb2.setProgress(Integer.parseInt(""+progress));
}
            catch (Exception e){
                tv.setText("Error123");
            }}

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
