package com.example.countuptimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;
/*
chronometer is the class used to build countup timer or stopwatch. you should first add the chronometer in xml
file and then do operations thereafter
 */
public class MainActivity extends AppCompatActivity {

    TextView tview ;
    Button button,button2,button3;
    Chronometer cmeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tview=findViewById(R.id.tv);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        cmeter=findViewById(R.id.cmeter);

//        cmeter.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
//            @Override
//            public void onChronometerTick(Chronometer chronometer) {
//                cmeter=chronometer;
//            }
//        });

//
//        cmeter.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener(){
//            @Override
//            public void onChronometerTick(Chronometer chronometer) {
//                long time = SystemClock.elapsedRealtime() - chronometer.getBase();
//                int h   = (int)(time /3600000);
//                int m = (int)(time - h*3600000)/60000;
//                int s= (int)(time - h*3600000- m*60000)/1000 ;
//                String t = (h < 10 ? "0"+h: h)+":"+(m < 10 ? "0"+m: m)+":"+ (s < 10 ? "0"+s: s);
//                cmeter.setText(t);
//            }
//        });
//        cmeter.setBase(SystemClock.elapsedRealtime());
//        cmeter.setText("00:00:00");
//        cmeter.setFormat("%s%s:%s%s:%s%s");
//
//
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cmeter.setBase(SystemClock.elapsedRealtime());
                cmeter.start();
                Toast.makeText(MainActivity.this, "timer started", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cmeter.stop();
                Toast.makeText(MainActivity.this, "timer stopped", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cmeter.setBase(SystemClock.elapsedRealtime());
                cmeter.stop();
                Toast.makeText(MainActivity.this, "timer reset", Toast.LENGTH_SHORT).show();
            }
        });
    }


}