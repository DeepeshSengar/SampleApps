package com.usernamepassword.ics.imagefader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsViewed = true;

    public void fade(View view){

        Log.i("Hello! ", "ImageView Tapper");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        if(bartIsViewed) {

            bartIsViewed=false;

            bartImageView.animate().alpha(0).setDuration(2000);

            homerImageView.animate().alpha(1).setDuration(2000);

        }

        else{

            bartIsViewed=true;

            bartImageView.animate().alpha(1).setDuration(2000);

            homerImageView.animate().alpha(0).setDuration(2000);

        }






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
