package com.example.gusser;

import static java.lang.Integer.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String SGusser,SFirstPlayer,SSecondPlayer,SThirdPlayer;
    Button Submit,done;
    EditText Gusser,FirstPlayer,SecondPlayer,ThirdPlayer;
    TextView tvhint;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit = findViewById(R.id.Submit);
        Gusser = findViewById(R.id.Gusser);
        FirstPlayer = findViewById(R.id.FirstPlayer);
        SecondPlayer = findViewById(R.id.SecondPlayer);
        ThirdPlayer = findViewById(R.id.ThirdPlayer);
        tvhint = findViewById(R.id.tvhint);
        done = findViewById(R.id.done);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SGusser = Gusser.getText().toString();
                SFirstPlayer = FirstPlayer.getText().toString();
                SSecondPlayer = SecondPlayer.getText().toString();
                SThirdPlayer = ThirdPlayer.getText().toString();

                if (Gusser.getText().toString().isEmpty() || FirstPlayer.getText().toString().isEmpty() || SecondPlayer.getText().toString().isEmpty() || ThirdPlayer.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Please Fill Details", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, Guess_result.class);
                    intent.putExtra("SGusser", SGusser);
                    intent.putExtra("SFirstPlayer", SFirstPlayer);
                    intent.putExtra("SSecondPlayer", SSecondPlayer);
                    intent.putExtra("SThirdPlayer", SThirdPlayer);
                    startActivity(intent);
                }

             if (SGusser.isEmpty())
            {


            }
             else {
                 int i= getInteger(SGusser);
                 if (i%2==0) {
                  tvhint.setText("Number is Prime");
                 }
                 else {
                     tvhint.setText("Number is Not Prime");
                 }
             }


            }
        });




    }











    }





