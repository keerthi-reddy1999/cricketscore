package com.example.sony99.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button single,doubles,four,six,wide,noball,total;
private TextView nosingles,noofdoubles,nooffours,noofsixes,noofwides,noofnoballs,score;
private int single_score=0,double_score=0,four_score=0,six_score=0,wide_score=0,nb=0,current_score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        single=findViewById(R.id.singles);
        doubles=findViewById(R.id.doubles);
        four=findViewById(R.id.fours);
        six=findViewById(R.id.sixes);
        wide=findViewById(R.id.wides);
        noball=findViewById(R.id.noballs);
        total=findViewById(R.id.total);
        nosingles=findViewById(R.id.nosingles);
        noofdoubles=findViewById(R.id.nodoubles);
        nooffours=findViewById(R.id.nofours);
        noofsixes=findViewById(R.id.nosixes);
        noofwides=findViewById(R.id.nowides);
        noofnoballs=findViewById(R.id.nonoballs);
        score=findViewById(R.id.curscore);
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                single_score+=1;
                nosingles.setText("no of singles:"+single_score);
            }
        });
        doubles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double_score+=1;
                noofdoubles.setText("no of doubles :"+double_score);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four_score+=1;
                nooffours.setText("no of fours :"+four_score);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six_score+=1;
                noofsixes.setText("no of sixes:"+six_score);
            }
        });
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wide_score+=1;
                noofwides.setText("no of wides :"+wide_score);
            }
        });

        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nb+=1;
                noofnoballs.setText("no of no balls :"+nb);
            }
        });
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_score=(single_score*1)+(double_score*2)+(four_score*4)+(six_score*6)+(wide_score*1)+(nb*1);
                score.setText("total score is :"+current_score);
            }
        });
    }
}
