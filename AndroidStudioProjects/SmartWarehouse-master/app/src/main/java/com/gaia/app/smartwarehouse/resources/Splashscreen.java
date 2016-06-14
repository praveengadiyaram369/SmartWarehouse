package com.gaia.app.smartwarehouse.resources;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.gaia.app.smartwarehouse.MainActivity;
import com.gaia.app.smartwarehouse.R;

public class Splashscreen extends AppCompatActivity {

    TextView textView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
         textView=(TextView)findViewById(R.id.textView16);
        progressBar.setProgress(0);
        progress();

    }
    public void progress()
    {

        Thread thread =new Thread()
        {
            public void run()
            {
                try {
                   int i;
                    String ch1="Loading123...",ch=null;
                    for(i=0;i<100;i+=2) {
                       progressBar.setProgress(i);
                        //textView.setText(ch1);
                        sleep(100);
                    }
                    if(i==100) {
                        Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                        startActivity(intent);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }

        };
        thread.start();
    }
}
