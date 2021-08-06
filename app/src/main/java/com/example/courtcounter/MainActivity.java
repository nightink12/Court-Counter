package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int THREE_PT_SHOT = 3;
    final int TWO_PT_SHOT = 2;
    final int FREE_THROW_SHOT = 1;

    int scoreA = 0;
    int scoreB = 0;

    //this method occurs right after the app starts up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }

    public void resetScore(View v) {
        scoreA = scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    // Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeA(View v) {
        displayForTeamA(scoreA += THREE_PT_SHOT);
    }

    public void addTwoA(View v) {
        displayForTeamA(scoreA += TWO_PT_SHOT);
    }

    public void addOneA(View v) {
        displayForTeamA(scoreA += FREE_THROW_SHOT);
    }

    public void addThreeB(View v) {
        displayForTeamB(scoreB += THREE_PT_SHOT);
    }

    public void addTwoB(View v) {
        displayForTeamB(scoreB += TWO_PT_SHOT);
    }

    public void addOneB(View v) {
        displayForTeamB(scoreB += FREE_THROW_SHOT);
    }
}