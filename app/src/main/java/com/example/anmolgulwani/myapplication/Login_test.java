package com.example.anmolgulwani.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_test extends AppCompatActivity {
Button submit;
    TextView tv;
    EditText uid,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_test);
    submit=(Button)findViewById(R.id.button2);
       uid=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        tv=(TextView)findViewById(R.id.textView);
    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String u=uid.getText().toString();
            String p=pass.getText().toString();
            if (u.isEmpty()||p.isEmpty())
            {
                tv.setText("Please enter input");
            tv.setTextColor(Color.BLUE);
            }
            else if (u.equals(p)){
                Intent i=new Intent(Login_test.this,Welcome.class);
                i.putExtra("uid",u);
                startActivity(i);
            }
            else {
                tv.setText("Login failed");
            }

            }
        });
    }
    }
