package com.example.koushik.myapps_escanor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CAMERADEMO extends AppCompatActivity implements View.OnClickListener{
    Button b;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camerademo);
        b = findViewById(R.id.button17);
        iv = findViewById(R.id.imageView2);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,1000);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle b = data.getExtras();
        if(b!=null)
        {
            if(requestCode==1000 && resultCode == RESULT_OK)
            {
                Bitmap bitmap = (Bitmap) b.get("data");
                iv.setImageBitmap(bitmap);
            }
        }
    }
}
