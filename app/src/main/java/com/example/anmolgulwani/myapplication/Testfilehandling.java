package com.example.anmolgulwani.myapplication;

import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.Manifest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Testfilehandling extends AppCompatActivity {
    Button add, search, create;
    File f;
    FileInputStream fis;
    FileOutputStream fos;
    EditText fname, fdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfilehandling);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        != PackageManager.PERMISSION_GRANTED){
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1002);


                }
            }






        fname = (EditText) findViewById(R.id.editText);
        fdata = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button7);
        create = (Button) findViewById(R.id.button6);
        search = (Button) findViewById(R.id.button8);


        File f1 = Environment.getExternalStorageDirectory();

        f = new File(f1, "stpdelhi1");
        if (!f.exists()) {
            f.mkdir();
            Toast.makeText(Testfilehandling.this, "folder created", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(Testfilehandling.this, "Folder already exist", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        switch (requestCode){
            case 1002:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){}
                else{}
                return;
        }
    }

    public void screate(View v) {
        String f2 = fname.getText().toString().trim();
        try {
            File f3 = new File(f, f2 + ".txt");
            if (!f3.exists()) {
                f3.createNewFile();
                Toast.makeText(Testfilehandling.this, "file created", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Testfilehandling.this, "file already exists", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast.makeText(Testfilehandling.this, "error123", Toast.LENGTH_SHORT).show();}


    }

    public void sadd(View v) {
        try {
            String f2 = fname.getText().toString().trim();
            fos = new FileOutputStream(f.getAbsolutePath() + File.separator + f2 + ".txt", true);
            fos.write(fdata.getText().toString().getBytes());
        } catch (Exception e) {
            Toast.makeText(Testfilehandling.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }



    public void ssearch(View v) {
        try {
            String name = fname.getText().toString().trim();
            fdata.setText("");
            fis=new FileInputStream(f.getAbsolutePath()+File.separator+name+".txt");
            String data= "";
            int i;
            while((i=fis.read())>-1){
                 data+=(char)i;
            }fdata.setText(data);

        } catch (Exception e) {
        }
    }


}