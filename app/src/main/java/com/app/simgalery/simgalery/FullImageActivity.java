package com.app.simgalery.simgalery;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    ImageView myFullImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        myFullImg =(ImageView)findViewById(R.id.fullImage);
        String data = getIntent().getExtras().getString("img");
        myFullImg.setImageURI(Uri.parse(data));
    }
}
