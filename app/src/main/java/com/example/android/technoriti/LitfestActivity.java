package com.example.android.technoriti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class LitfestActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView images=(ImageView)findViewById(R.id.images);
        ImageView and=(ImageView)findViewById(R.id.and);

        images.animate().alpha(0f).setDuration(2000);

        and.animate().alpha(1f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litfest);

    }
}