package com.example.anmolgulwani.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity {
String menu[]={"testdisco","MapsActivity","testWifi","testdisco","Test02Sensor","TestSensorall","TestSensor","testcamera","Testfilehandling","testmusic","TestAlert","Buyapp","Login_test","ContextTest","Popuptest","Optiontest","SwitchTest","SpinnerfromJava","SpinnerTest","AutoCompleteText","RadioButtonTest","SeekBarTest","Progress_Bar","Calci","MainActivity","Counter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,menu);
    setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v,int position,long id ){
        super.onListItemClick(l,v,position,id);
        try{
            String s = "com.example.anmolgulwani.myapplication."+menu[position];
            Class c = Class.forName(s);
            Intent i = new Intent(this,c);
            startActivity(i);

        }
        catch (Exception e)
        {}

    }

}
