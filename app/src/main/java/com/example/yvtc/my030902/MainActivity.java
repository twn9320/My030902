package com.example.yvtc.my030902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb,pb2;
    SeekBar sb;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar)findViewById(R.id.progressBar);
        pb2 = (ProgressBar)findViewById(R.id.progressBar2);
        sb=(SeekBar)findViewById(R.id.seekBar);
        rb=(RatingBar)findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Log.d("RB",""+rating*2);
            }
        });
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("SB",""+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }
    public void click1(View v){
        pb.setVisibility(View.VISIBLE);
    }
    public void click2(View v){
        pb.setVisibility(View.INVISIBLE);
    }
    public void click3(View v){

        if(pb2.getProgress()==100){
            pb2.setProgress(0);
        }else{
            pb2.setProgress(pb2.getProgress()+10);
        }
    }
}
