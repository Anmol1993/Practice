package com.example.anmolgulwani.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class testcamera extends AppCompatActivity {
Button click;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testcamera);
    iv=(ImageView)findViewById(R.id.imageView2);
        click=(Button)findViewById(R.id.button9);

    click.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
            startActivityForResult(intent,10);
        }
    });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    Bundle bundle=data.getExtras();
        if (requestCode==10&&resultCode==RESULT_OK){
            Bitmap bmp=(Bitmap)bundle.get("data");
            iv.setImageBitmap(bmp);
        }
    }
}
