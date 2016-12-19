package com.example.anmolgulwani.myapplication;

import android.media.Image;
import android.media.MediaPlayer;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class testmusic extends AppCompatActivity implements View.OnClickListener,SeekBar.OnSeekBarChangeListener {
    MediaPlayer mp;
    ImageButton play,forward,next,previous,rewind;
    SeekBar sb;
    ImageView im;
    TextView tv,left;


Thread progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmusic);
        sb = (SeekBar) findViewById(R.id.seekBar);
        play = (ImageButton) findViewById(R.id.imageButton2);
        im = (ImageView) findViewById(R.id.imageView);
        tv = (TextView) findViewById(R.id.textView4);
        left=(TextView)findViewById(R.id.textView9);
        mp = MediaPlayer.create(this, R.raw.abm);
        forward=(ImageButton)findViewById(R.id.imageButton4);
        next=(ImageButton)findViewById(R.id.imageButton3);
        previous=(ImageButton)findViewById(R.id.imageButton5);
        rewind=(ImageButton)findViewById(R.id.imageButton6);

play.setOnClickListener(this);
    sb.setMax(mp.getDuration());

        sb.setOnSeekBarChangeListener(this);
        progress=new Thread() {
            public void run() {
                while (mp.getDuration() != mp.getCurrentPosition()) {
                    sb.setProgress(mp.getCurrentPosition());

                }

            }


        };
        progress.start();

    forward.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.seekTo(100000);
        }
    });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.setNextMediaPlayer(mp);
            }
        });
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(-100000);
            }
        });
    }
    String convertoduration (long l){
        String duration ="";
        long l1=l/1000;
        duration+=l1/60+":"+l1%60;
        return  duration;

    }
    String timeleft (){
        String timeleft= String.valueOf(mp.getCurrentPosition());
    left.setText("timeleft");
    return  timeleft;
    }

    @Override
    public void onClick(View v) {
        if (!mp.isPlaying())
        {
            mp.start();
        play.setImageResource(android.R.drawable.ic_media_pause);

        }

        else{
            mp.pause();
            play.setImageResource(android.R.drawable.ic_media_play);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
if(fromUser){
    mp.seekTo(progress);


}
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void OnCompletionListener(MediaPlayer mp){
        mp.reset();
        mp=MediaPlayer.create(this,R.raw.abm);
    }
}
