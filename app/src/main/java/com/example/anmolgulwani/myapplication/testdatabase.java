package com.example.anmolgulwani.myapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class testdatabase extends AppCompatActivity {
EditText sname,saddress,sage,sid;
    Button submit;
    SQLiteDatabase sd;
    Cursor c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testdatabase);

        sd=openOrCreateDatabase("DelhiDB",MODE_PRIVATE,null);

        sd.execSQL("Create table if not exist student(sid int primary key,sname varchar not null,sage int not null,saddress varchar not null)");
        c=sd.rawQuery("select * from student",null);


    }

    public void first(View v){
        if ((c.moveToFirst())){
            sid.setText(""+c.getInt(0));
            sname.setText(c.getString(1));
            sage.setText(c.getInt(2));
            saddress.setText(c.getInt(3));
        }

    }


    public void last(View v){
        if ((c.moveToLast())){
            sid.setText(""+c.getInt(0));
            sname.setText(c.getString(1));
            sage.setText(c.getInt(2));
            saddress.setText(c.getInt(3));
        }

    }

    public void next(View v){
        if ((c.moveToNext())){
            sid.setText(""+c.getInt(0));
            sname.setText(c.getString(1));
            sage.setText(c.getInt(2));
            saddress.setText(c.getInt(3));
        }

    }
    public void previous(View v){
        if ((c.moveToPrevious())){
            sid.setText(""+c.getInt(0));
            sname.setText(c.getString(1));
            sage.setText(c.getInt(2));
            saddress.setText(c.getInt(3));
        }

    }

   public void add(View v){
       try{
           int id=Integer.parseInt(sid.getText().toString());
           int age=Integer.parseInt(sid.getText().toString());
           String name=sname.getText().toString();
           String address=saddress.getText().toString();
           sd.execSQL("inset into student values"+id+","+name+","+age+","+address+",");
           Toast.makeText(testdatabase.this, "Data added", Toast.LENGTH_SHORT).show();
       }
       catch (Exception e)
       {
           Toast.makeText(testdatabase.this, "data not added", Toast.LENGTH_SHORT).show();
       }

   }
public void delete(View v){
    int id = Integer.parseInt(sid.getText().toString());
    try {
sd.execSQL("delete from student where sid = "+id,null);
    }
    catch (Exception e){
    }
}





}
