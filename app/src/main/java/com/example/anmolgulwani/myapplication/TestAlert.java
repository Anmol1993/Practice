package com.example.anmolgulwani.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestAlert extends AppCompatActivity {
    AlertDialog.Builder adb;
AlertDialog a;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert);
    b1=(Button)findViewById(R.id.button4);
    }
    
    public void alert(View v){
        adb = new AlertDialog.Builder(this);
        adb.setMessage("Are you sure");
        adb.setTitle("Exit");
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestAlert.this, "You have selected to exit app", Toast.LENGTH_SHORT).show();
            }
        });
        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TestAlert.this, "you opted no", Toast.LENGTH_SHORT).show();
            }
        });
    a=adb.create();
        a.show();
    }
}
