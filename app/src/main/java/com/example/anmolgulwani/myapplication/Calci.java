package com.example.anmolgulwani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calci extends AppCompatActivity implements View.OnClickListener {

    EditText fn1,sn1;
    Button add;
    TextView ans;
    Double a,b,sum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
        fn1=(EditText)findViewById(R.id.fn);
        sn1=(EditText)findViewById(R.id.sn);
        add=(Button)findViewById(R.id.add1);
        ans=(TextView)findViewById(R.id.ans);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
try{
         a = Double.parseDouble(fn1.getText().toString());
         b = Double.parseDouble(sn1.getText().toString());
   {
           Double sum1 = a + b ;
            ans.setText((Double.toString(sum1)));
        }
    }
catch (Exception e)
{ans.setText("enter number first");
}
    }
}
