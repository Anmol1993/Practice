package com.example.anmolgulwani.myapplication;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TestContentProvider extends AppCompatActivity {
List<String>l=new ArrayList<String>();
    ListView lv;
    Cursor c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_content_provider);
    lv=(ListView)findViewById(R.id.listView2);
c=getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,null,null,null,ContactsContract.PhoneLookup.DISPLAY_NAME);
        while (c.moveToNext()){
            int j = c.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);

                    l.add(c.getString(j)+"||"+c.getString(j));

            }
       // ArrayAdapter<String>adapter= new ArrayAdapter<String>();
        }
    }

