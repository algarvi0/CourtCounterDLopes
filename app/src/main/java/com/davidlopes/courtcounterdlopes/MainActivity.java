package com.davidlopes.courtcounterdlopes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Set static for Restore and Save values
    static final String SCORE_TEAM_A_VALUE = "scoreA";
    static final String FAULT_TEAM_A_VALUE = "faultA";
    static final String REBOUNDS_TEAM_A_VALUE = "reboundsA";
    static final String STEALS_TEAM_A_VALUE = "stealsA";
    // Set static for Restore and Save values
    static final String SCORE_TEAM_B_VALUE = "scoreB";
    static final String FAULT_TEAM_B_VALUE = "faultB";
    static final String REBOUNDS_TEAM_B_VALUE = "reboundsB";
    static final String STEALS_TEAM_B_VALUE = "stealsB";
    // Set "Shots" values
    int ONE_POINT = 1;
    int TWO_POINTS = 2;
    int TREE_POINTS = 3;

    // TEAM A - Initialize Team A scores and Details variables.
    int scoreTeamA = 0;
    int faultTeamA = 0;
    int reboundsTeamA = 0;
    int stealsTeamA = 0;
    // TEAM B - Initialize Team B scores and Details variables.
    int scoreTeamB = 0;
    int faultTeamB = 0;
    int reboundsTeamB = 0;
    int stealsTeamB = 0;
    //Views
    // Team A
    TextView ScoreForTeamAView;
    TextView displayFaultTeamAView;
    TextView displayReboundsTeamAView;
    TextView displayStealsTeamAView;
    // Team B
    TextView ScoreForTeamBView;
    TextView displayFaultTeamBView;
    TextView displayReboundsTeamBView;
    TextView displayStealsTeamBView;

    // Stores scores and details before rotation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Team A
        ScoreForTeamAView = (TextView) findViewById(R.id.team_a_score);
        displayFaultTeamAView = (TextView) findViewById(R.id.faultsTeamA_value);
        displayReboundsTeamAView = (TextView) findViewById(R.id.reboundsTeamA_value);
        displayStealsTeamAView = (TextView) findViewById(R.id.stealsTeamA_value);
        //Team B
        ScoreForTeamBView = (TextView) findViewById(R.id.team_b_score);
        displayFaultTeamBView = (TextView) findViewById(R.id.faultsTeamB_value);
        displayReboundsTeamBView = (TextView) findViewById(R.id.reboundsTeamB_value);
        displayStealsTeamBView = (TextView) findViewById(R.id.stealsTeamB_value);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save Team A values into the bundle
        savedInstanceState.putInt(SCORE_TEAM_A_VALUE, scoreTeamA);
        savedInstanceState.putInt(FAULT_TEAM_A_VALUE, faultTeamA);
        savedInstanceState.putInt(REBOUNDS_TEAM_A_VALUE, reboundsTeamA);
        savedInstanceState.putInt(STEALS_TEAM_A_VALUE, stealsTeamA);
        // Save Team B values into the bundle
        savedInstanceState.putInt(SCORE_TEAM_B_VALUE, scoreTeamB);
        savedInstanceState.putInt(FAULT_TEAM_B_VALUE, faultTeamB);
        savedInstanceState.putInt(REBOUNDS_TEAM_B_VALUE, reboundsTeamB);
        savedInstanceState.putInt(STEALS_TEAM_B_VALUE, stealsTeamB);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    // Restore scores and details after rotation
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore Team A details from saved instance
        scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A_VALUE);
        displayScoreForTeamA(scoreTeamA);
        faultTeamA = savedInstanceState.getInt(FAULT_TEAM_A_VALUE);
        displayFaultTeamA(faultTeamA);
        reboundsTeamA = savedInstanceState.getInt(REBOUNDS_TEAM_A_VALUE);
        displayReboundsTeamA(reboundsTeamA);
        stealsTeamA = savedInstanceState.getInt(STEALS_TEAM_A_VALUE);
        displayStealsTeamA(stealsTeamA);
        // Restore Team B details from saved instance
        scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B_VALUE);
        displayScoreForTeamB(scoreTeamB);
        faultTeamB = savedInstanceState.getInt(FAULT_TEAM_B_VALUE);
        displayFaultTeamB(faultTeamB);
        reboundsTeamB = savedInstanceState.getInt(REBOUNDS_TEAM_B_VALUE);
        displayReboundsTeamB(reboundsTeamB);
        stealsTeamB = savedInstanceState.getInt(STEALS_TEAM_B_VALUE);
        displayStealsTeamB(stealsTeamB);
    }
    // TEAM A
    // Sets 3 points for Team A.
    public void set3Points_teamA(View view) {
        scoreTeamA = scoreTeamA + TREE_POINTS;
        displayScoreForTeamA(scoreTeamA);
    }
    // Sets 2 points for Team A
    public void set2Points_teamA(View view) {
        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayScoreForTeamA(scoreTeamA);
    }
    // Sets FreeThrow - 1 points for Team A
    public void setFreeThrow_teamA(View view) {
        scoreTeamA = scoreTeamA + ONE_POINT;
        displayScoreForTeamA(scoreTeamA);
    }
    // Displays the given score for Team A.
    public void displayScoreForTeamA(int score) {
        ScoreForTeamAView.setText(String.valueOf(score));
    }
    // Faults
    // Sets Fault - 1
    public void setFaults_teamA(View view) {
        faultTeamA = faultTeamA + ONE_POINT;
        displayFaultTeamA(faultTeamA);
    }
    // Displays fault for Team A.
    public void displayFaultTeamA(int score) {
        displayFaultTeamAView.setText(String.valueOf(score));
    }
    // Rebounds
    // Sets Rebounds +  1
    public void setRebounds_teamA(View view) {
        reboundsTeamA = reboundsTeamA + ONE_POINT;
        displayReboundsTeamA(reboundsTeamA);
    }
    // Displays fault for Team A.
    public void displayReboundsTeamA(int score) {
        displayReboundsTeamAView.setText(String.valueOf(score));
    }
    // Sets Steals +  1
    public void setSteals_teamA(View view) {
        stealsTeamA = stealsTeamA + ONE_POINT;
        displayStealsTeamA(stealsTeamA);
    }
    // Displays Steals for Team A.
    public void displayStealsTeamA(int score) {
        displayStealsTeamAView.setText(String.valueOf(score));
    }

    // TEAM B
    // Sets 3 points for Team B.
    public void set3Points_teamB(View view) {
        scoreTeamB = scoreTeamB + TREE_POINTS;
        displayScoreForTeamB(scoreTeamB);
    }
    // Sets 2 points for Team B
    public void set2Points_teamB(View view) {
        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayScoreForTeamB(scoreTeamB);
    }
    // Sets FreeThrow - 1 points for Team B
    public void setFreeThrow_teamB(View view) {
        scoreTeamB = scoreTeamB + ONE_POINT;
        displayScoreForTeamB(scoreTeamB);
    }
    // Displays the given score for Team B.
    public void displayScoreForTeamB(int score) {
        ScoreForTeamBView.setText(String.valueOf(score));
    }
    // Faults
    // Sets Fault - 1
    public void setFaults_teamB(View view) {
        faultTeamB = faultTeamB + ONE_POINT;
        displayFaultTeamB(faultTeamB);
    }

    // Displays fault for Team B.
    public void displayFaultTeamB(int score) {
        displayFaultTeamBView.setText(String.valueOf(score));
    }
    // Rebounds
    // Sets Rebounds +  1
    public void setRebounds_teamB(View view) {
        reboundsTeamB = reboundsTeamB + ONE_POINT;
        displayReboundsTeamB(reboundsTeamB);
    }

    // Displays fault for Team B.
    public void displayReboundsTeamB(int score) {
        displayReboundsTeamBView.setText(String.valueOf(score));
    }
    // Sets Steals +  1
    public void setSteals_teamB(View view) {
        stealsTeamB = stealsTeamB + ONE_POINT;
        displayStealsTeamB(stealsTeamB);
    }

    // Displays Steals for Team B.
    public void displayStealsTeamB(int score) {
        displayStealsTeamBView.setText(String.valueOf(score));
    }

    // Reset Teams Counter
    public void resetScores(View view) {
        // Team A reset
        scoreTeamA = 0;
        displayScoreForTeamA(scoreTeamA);
        faultTeamA = 0;
        displayFaultTeamA(faultTeamA);
        reboundsTeamA = 0;
        displayReboundsTeamA(reboundsTeamA);
        stealsTeamA = 0;
        displayStealsTeamA(stealsTeamA);
        // Team B reset
        scoreTeamB = 0;
        displayScoreForTeamB(scoreTeamB);
        faultTeamB = 0;
        displayFaultTeamB(faultTeamB);
        reboundsTeamB = 0;
        displayReboundsTeamB(reboundsTeamB);
        stealsTeamB = 0;
        displayStealsTeamB(stealsTeamB);
    }
}