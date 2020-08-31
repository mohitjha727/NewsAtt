package com.webovix.NewZapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=(ImageView)findViewById(R.id.imagenews);

        Thread td= new Thread()
        {
            public void run(){
                try {
                    sleep(2000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();

                }

            }
        };
        td.start();
        getSupportActionBar().hide();

    }

}

