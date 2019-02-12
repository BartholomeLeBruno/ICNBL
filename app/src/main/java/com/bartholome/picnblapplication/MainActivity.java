package com.bartholome.picnblapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageView iv_button, iv_arrow;
    TextView tv_points;
    ProgressBar progressBar;

    Handler handler;
    Runnable runnable;

    Random r;

    private final static int STATE_BLUE = 1;
    private final static int STATE_RED = 2;
    private final static int STATE_YELLOW = 3;
    private final static int STATE_GREEN = 4;

    int buttonState = STATE_BLUE;
    int arrowState = STATE_BLUE;

    int currentTime = 4000;
    int startTime = 4000;

    int currentPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_button = findViewById(R.id.button);
        iv_arrow = findViewById(R.id.arrow);
        tv_points = findViewById(R.id.points);
        progressBar = findViewById(R.id.progressBar);

        progressBar.setMax(startTime);
        progressBar.setProgress(startTime);

        tv_points.setText("Points: " + currentPoints);

        r = new Random();
        arrowState = r.nextInt(4) + 1;
        setArrowImage(arrowState);

        iv_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setArrowImage(int state)
    {
        switch (state){
            case STATE_BLUE:
                iv_arrow.setImageResource(R.drawable.blue);
                arrowState = STATE_BLUE;
                break;
            case STATE_RED:
                iv_arrow.setImageResource(R.drawable.red);
                arrowState = STATE_RED;
                break;
            case STATE_YELLOW:
                iv_arrow.setImageResource(R.drawable.yellow);
                arrowState = STATE_YELLOW;
                break;
            case STATE_GREEN:
                iv_arrow.setImageResource(R.drawable.green);
                arrowState = STATE_GREEN;
                break;
        }
    }

    private void setRotation(final ImageView image, final int drawable ){
        RotateAnimation rotateAnimation = new RotateAnimation(0, 90, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
    }
}
