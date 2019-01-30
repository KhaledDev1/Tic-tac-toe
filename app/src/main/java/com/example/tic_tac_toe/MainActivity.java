package com.example.tic_tac_toe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;
    int Winner=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

     // This method is called when the +1 points is clicked for team 1.
    public void addOneForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    //Displays the given score for Team 1.
    public void displayForTeam1(int score) {
        TextView scoreView = findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }


    // This method is called when the +1 points is clicked for team 2.
    public void addOneForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    //Displays the given score for Team 2.
    public void displayForTeam2(int score) {
        TextView scoreView = findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    //Resets the score for both teams back to 0.
    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    //new line
    public void BuClick(View view) {
        Button buSelected= (Button) view;
        int CellID=0;
        switch ((buSelected.getId())){

            case R.id.bu1:
                CellID=1;
                break;

            case R.id.bu2:
                CellID=2;
                break;

            case R.id.bu3:
                CellID=3;
                break;

            case R.id.bu4:
                CellID=4;
                break;

            case R.id.bu5:
                CellID=5;
                break;

            case R.id.bu6:
                CellID=6;
                break;

            case R.id.bu7:
                CellID=7;
                break;

            case R.id.bu8:
                CellID=8;
                break;

            case R.id.bu9:
                CellID=9;
                break;
        }
        PlayGame(CellID, buSelected);
    }

    int ActivePlayer=1; // 1- for first , 2 for second
    ArrayList<Integer> Player1= new ArrayList<Integer>();// hold player 1 data
    ArrayList<Integer> Player2= new ArrayList<Integer>();// hold player 2 data
    void PlayGame(int CellID,Button buSelected){

        Log.d("Player:",String.valueOf(CellID));

        if (ActivePlayer==1){
            buSelected.setText("X");
            Player1.add(CellID);
            ActivePlayer=2;
        }
        else if (ActivePlayer==2){
            buSelected.setText("O");
            Player2.add(CellID);
            ActivePlayer=1;
        }

        buSelected.setEnabled(false);
        CheckWinner();
    }

    void CheckWinner(){
        //row 1
        if (Player1.contains(1) && Player1.contains(2)  && Player1.contains(3))  {
            Winner=1 ;
        }
        if (Player2.contains(1) && Player2.contains(2)  && Player2.contains(3))  {
            Winner=2 ;
        }

        //row 2
        if (Player1.contains(4) && Player1.contains(5)  && Player1.contains(6))  {
            Winner=1 ;
        }
        if (Player2.contains(4) && Player2.contains(5)  && Player2.contains(6))  {
            Winner=2 ;
        }

        //row 3
        if (Player1.contains(7) && Player1.contains(8)  && Player1.contains(9))  {
            Winner=1 ;
        }
        if (Player2.contains(7) && Player2.contains(8)  && Player2.contains(9))  {
            Winner=2 ;
        }


        //col 1
        if (Player1.contains(1) && Player1.contains(4)  && Player1.contains(7))  {
            Winner=1 ;
        }
        if (Player2.contains(1) && Player2.contains(4)  && Player2.contains(7))  {
            Winner=2 ;
        }

        //col 2
        if (Player1.contains(2) && Player1.contains(5)  && Player1.contains(8))  {
            Winner=1 ;
        }
        if (Player2.contains(2) && Player2.contains(5)  && Player2.contains(8))  {
            Winner=2 ;
        }


        //col 3
        if (Player1.contains(3) && Player1.contains(6)  && Player1.contains(9))  {
            Winner=1 ;
        }
        if (Player2.contains(3) && Player2.contains(6)  && Player2.contains(9))  {
            Winner=2 ;
        }


        if ( Winner !=-1){
            // We have winner

            if (Winner==1){
                Toast.makeText(this,"Player 1 is winner",Toast.LENGTH_LONG).show();
                Winner =-1;
                Button bu1 = findViewById(R.id.bu1);
                bu1.setText("");
                bu1.setEnabled(true);
                Button bu2 = findViewById(R.id.bu2);
                bu2.setText("");
                bu2.setEnabled(true);
                Button bu3 = findViewById(R.id.bu3);
                bu3.setText("");
                bu3.setEnabled(true);
                Button bu4 = findViewById(R.id.bu4);
                bu4.setText("");
                bu4.setEnabled(true);
                Button bu5 = findViewById(R.id.bu5);
                bu5.setText("");
                bu5.setEnabled(true);
                Button bu6 = findViewById(R.id.bu6);
                bu6.setText("");
                bu6.setEnabled(true);
                Button bu7 = findViewById(R.id.bu7);
                bu7.setText("");
                bu7.setEnabled(true);
                Button bu8 = findViewById(R.id.bu8);
                bu8.setText("");
                bu8.setEnabled(true);
                Button bu9 = findViewById(R.id.bu9);
                bu9.setText("");
                bu9.setVisibility(View.VISIBLE);
                bu9.setEnabled(true);
            }

            if (Winner==2){
                Toast.makeText(this,"Player 2 is winner",Toast.LENGTH_LONG).show();
                Winner=-1;
                Button bu1 = findViewById(R.id.bu1);
                bu1.setText("");
                bu1.setEnabled(true);
                Button bu2 = findViewById(R.id.bu2);
                bu2.setText("");
                bu2.setEnabled(true);
                Button bu3 = findViewById(R.id.bu3);
                bu3.setText("");
                bu3.setEnabled(true);
                Button bu4 = findViewById(R.id.bu4);
                bu4.setText("");
                bu4.setEnabled(true);
                Button bu5 = findViewById(R.id.bu5);
                bu5.setText("");
                bu5.setEnabled(true);
                Button bu6 = findViewById(R.id.bu6);
                bu6.setText("");
                bu6.setEnabled(true);
                Button bu7 = findViewById(R.id.bu7);
                bu7.setText("");
                bu7.setEnabled(true);
                Button bu8 = findViewById(R.id.bu8);
                bu8.setText("");
                bu8.setEnabled(true);
                Button bu9 = findViewById(R.id.bu9);
                bu9.setText("");
                bu9.setVisibility(View.VISIBLE);
                bu9.setEnabled(true);
            }
        }
    }
}
