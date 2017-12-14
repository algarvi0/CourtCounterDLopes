package com.davidlopes.courtcounterdlopes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int ONE_POINT = 1;
    int TWO_POINTS = 2;
    int TREE_POINTS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TEAM A
    // Sets 3 points for Team A.
    public void set3Points_teamA(View view) {
        scoreTeamA = scoreTeamA + TREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    // Sets 2 points for Team A
    public void set2Points_teamA(View view) {
        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    // Sets FreeThrow - 1 points for Team A
    public void setFreeThrow_teamA(View view) {
        scoreTeamA = scoreTeamA + ONE_POINT;
        displayForTeamA(scoreTeamA);
    }

    // Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // TEAM B
    // Sets 3 points for Team B.
    public void set3Points_teamB(View view) {
        scoreTeamB = scoreTeamB + TREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    // Sets 2 points for Team B
    public void set2Points_teamB(View view) {
        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    // Sets FreeThrow - 1 points for Team B
    public void setFreeThrow_teamB(View view) {
        scoreTeamB = scoreTeamB + ONE_POINT;
        displayForTeamB(scoreTeamB);
    }

    // Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Reset TeamS Counter
    public void resetScores(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
