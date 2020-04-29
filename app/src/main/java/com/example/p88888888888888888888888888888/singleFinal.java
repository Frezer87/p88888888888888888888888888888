package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class singleFinal extends AppCompatActivity {

    EditText score1;
    EditText score2;
    Button winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_final);

         score1 = findViewById(R.id.scoPlayer1);
         score2 = findViewById(R.id.scoPlayer2);

        Intent intent = getIntent();
        String namePlayer1 = intent.getStringExtra("player1");
        String namePlayer2 = intent.getStringExtra("player2");


        TextView printing1 = findViewById(R.id.player1);
        TextView printing2 = findViewById(R.id.player2);


        printing1.setText( namePlayer1);
        printing2.setText( namePlayer2);

        final String pl = namePlayer1;
        final String p2 = namePlayer2;


        winner = findViewById(R.id.goToWinner);




        winner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String intValue1 = score1.getText().toString();
                String intValue2 = score2.getText().toString();
                int result1=0;
                int result2=0;
                if (!"".equals(intValue1) ){
                    result1 = Integer.parseInt(intValue1);
                    result2 = Integer.parseInt(intValue2);
                }

                if (!"".equals(intValue2)){
                    result2 = Integer.parseInt(intValue2);
                  }
                if (result1 == result2) {
                    TextView printing5 = findViewById(R.id.result);
                    printing5.setText("Enter again " + pl + " vs " + p2 + " is much");
                }

                if (result1 > result2){
                    TextView printing3 = findViewById(R.id.result);
                    printing3.setText( pl + " is the winner");
                }
                if (result1 < result2) {
                    TextView printing4 = findViewById(R.id.result);
                    printing4.setText(p2 + " is the winner");
                }


            }
        });


    }
}
