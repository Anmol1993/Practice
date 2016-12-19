package com.example.anmolgulwani.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextTest extends AppCompatActivity {
String name[]={"Ashish","Anmol","Abh","Dhruv","Anki","Arindam","Ravi","Rohit"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_test);
        lv=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
            }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select Option");
        menu.add(0, v.getId(), 0, "call");
        menu.add(1, v.getId(), 1, "SMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(ContextTest.this, item.getTitle(), Toast.LENGTH_SHORT).show();
    return true;
    }
}


