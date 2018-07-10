package edu.cpp.cs499.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(0);
        displayScoreB(0);
    }
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;


    public void add3A(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreA(scoreTeamA);

    }

    public void add2A(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreA(scoreTeamA);

    }

    public void add1A(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);

    }

    private void displayScoreA(int score){
        TextView textView = (TextView) findViewById(R.id.scoreViewA);
        textView.setText(Integer.toString(score));
    }

    public void add3B(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreB(scoreTeamB);

    }

    public void add2B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreB(scoreTeamB);

    }

    public void add1B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);

    }

    private void displayScoreB(int score){
        TextView textView = (TextView) findViewById(R.id.scoreViewB);
        textView.setText(Integer.toString(score));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}
