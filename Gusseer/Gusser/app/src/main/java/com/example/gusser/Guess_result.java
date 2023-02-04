package com.example.gusser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Guess_result extends AppCompatActivity {
    String SGusser,SFirstPlayer,SSecondPlayer,SThirdPlayer;
    TextView tvGusser,tvFirstPlayer,tvSecondPlayer,tvThirdPlayer,tvUmpire;
    Button homebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_result);
        Intent intent = getIntent();
        SGusser = intent.getStringExtra("SGusser");
        SFirstPlayer = intent.getStringExtra("SFirstPlayer");
        SSecondPlayer = intent.getStringExtra("SSecondPlayer");
        SThirdPlayer = intent.getStringExtra("SThirdPlayer");


        tvGusser = findViewById(R.id.tvGusser);
        tvFirstPlayer = findViewById(R.id.tvFirstPlayer);
        tvSecondPlayer = findViewById(R.id.tvSecondPlayer);
        tvThirdPlayer = findViewById(R.id.tvThirdPlayer);
        tvUmpire = findViewById(R.id.tvUmpire);
       homebtn = findViewById(R.id.homebtn);

        tvGusser.setText("Gusser Guess :- " + SGusser);
        tvFirstPlayer.setText("First Player Guess :- " + SFirstPlayer);
        tvSecondPlayer.setText("Second Player Guess :- " + SSecondPlayer);
        tvThirdPlayer.setText("Third Player Guess :- " + SThirdPlayer);



        if (SGusser.equals(SFirstPlayer)&&SGusser.equals(SSecondPlayer)&&SGusser.equals(SThirdPlayer) ) {
            tvUmpire.setText("Everyone Is Winner");
        }

       else if (SGusser.equals(SFirstPlayer)&&SGusser.equals(SSecondPlayer) ) {
            tvUmpire.setText("First Player and Second Player Is *WINNER*");
        }

        else if (SGusser.equals(SThirdPlayer)&&SGusser.equals(SSecondPlayer) ) {
            tvUmpire.setText("Second Player and Third Player Is *WINNER*");
        }

       else if (SGusser.equals(SThirdPlayer)&&SGusser.equals(SFirstPlayer) ) {
            tvUmpire.setText("First Player and Third Player Is *WINNER*");
        }
        else if (SGusser.equals(SFirstPlayer) ) {
            tvUmpire.setText("First Player Is *WINNER*");
        }
        else if (SGusser.equals(SSecondPlayer) ) {
            tvUmpire.setText("Second Player Is *WINNER*");
        }
        else if (SGusser.equals(SThirdPlayer) ) {
            tvUmpire.setText("Third Player Is *WINNER*");
        }



        else {
            tvUmpire.setText("You Lost The Game");
        }

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Guess_result.this, MainActivity.class);
            }
        });
    }
}