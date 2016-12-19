package com.example.anmolgulwani.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Buyapp extends AppCompatActivity {
    Button submit;
    TextView tv1,tv2,tv3;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyapp);
    submit=(Button)findViewById(R.id.button3);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById((R.id.tv2));
        tv3=(TextView)findViewById(R.id.tv3);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String apple = et1.getText().toString();
            String orange= et2.getText().toString();
            String banana= et3.getText().toString();

            /*if (apple.isEmpty()&&orange.isEmpty()&&banana.isEmpty()){
                Toast.makeText(Buyapp.this, "Please select atleast one item", Toast.LENGTH_SHORT).show();
            }
            else{*/
                Intent i = new Intent(Buyapp.this,bill.class);
                i.putExtra("et1",apple);
                i.putExtra("et2",orange);
                i.putExtra("et3",banana);
                startActivity(i);

        }
    });

    }
        }



