package com.example.diego.objective;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        tvTime = (TextView)findViewById(R.id.tvTimee);

        //count down
        countDownTimer = new CountDownTimer(120*10000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                tvTime.setText("" + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                tvTime.setText("Done!");
            }
        };

        countDownTimer.start();


    }

    public void start()
    {

    }
}
