package com.example.anmolgulwani.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestSensor extends AppCompatActivity {
    SensorManager sm;
    Sensor s;
    TextView tv;
    SensorEventListener sel = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];
            tv.setText("Azimuth= " + x + "pitch= " + y + "roll= " + z);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_test_sensor);
            sm = (SensorManager) getSystemService(SENSOR_SERVICE);
            s=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            tv = (TextView) findViewById(R.id.textView10);
            sm.registerListener(sel, s, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

