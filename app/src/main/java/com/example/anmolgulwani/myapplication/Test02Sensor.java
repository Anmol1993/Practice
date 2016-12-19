package com.example.anmolgulwani.myapplication;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Test02Sensor extends AppCompatActivity {
ImageView iv;
    SensorManager sm;
    Sensor s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02_sensor);
    iv=(ImageView)findViewById(R.id.imageView3);
        sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        SensorEventListener sel= new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float x = event.values[0];
                if (x==0){
                    iv.setImageResource(R.drawable.abcd);
                }
                else{
                    iv.setImageResource(R.drawable.xyz);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
        sm.registerListener(sel,s,SensorManager.SENSOR_DELAY_NORMAL);
    }
}
