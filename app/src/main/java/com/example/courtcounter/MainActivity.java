package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using java to creat a text view

         /*TextView textview=new TextView(this);
        textview.setText("hey beautiful");
        textview.setTextSize(30);
        textview.setTextColor(getResources().getColor( android.R.color.holo_red_dark));
        setContentView(textview);*/
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    int TeamAscore=0;
    public void Inc3(View view)
    {
        TeamAscore+=3;
        displayForTeamA(TeamAscore);

    }
     public void Inc2(View view)
    {
        TeamAscore+=2;
        displayForTeamA(TeamAscore);

    }
     public void FreeThrow(View view)
    {
        TeamAscore+=1;
        displayForTeamA(TeamAscore);

    }
    int TeamBscore=0;
    public void Inc3B(View view)
    {
        TeamBscore+=3;
        displayForTeamB(TeamBscore);

    }
     public void Inc2B(View view)
    {
        TeamBscore+=2;
        displayForTeamB(TeamBscore);

    }
     public void FreeThrowB(View view)
    {
        TeamBscore+=1;
        displayForTeamB(TeamBscore);

    }
    public void Reset(View view)
    {
        TeamAscore=0;
        TeamBscore=0;
        displayForTeamA(TeamAscore);
        displayForTeamB(TeamBscore);
    }

}
