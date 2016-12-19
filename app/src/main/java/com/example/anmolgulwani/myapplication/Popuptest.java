package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Popuptest extends AppCompatActivity {
PopupMenu pm;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popuptest);

        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               pm=new PopupMenu(Popuptest.this,b1);
                pm.getMenuInflater().inflate(R.menu.menu,pm.getMenu());
                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(Popuptest.this, "you have selected "+item.getTitle(), Toast.LENGTH_SHORT).show();
                    return false;
                    }
                });
                pm.show();
            }
        });

    }


    }


