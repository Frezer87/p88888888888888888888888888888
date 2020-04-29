package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SingleSemiFinal extends AppCompatActivity {



    EditText score1;
    EditText score2;
    EditText score3;
    EditText score4;
    Button semiWinner;
    Button final_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_semi_final);

        score1 = findViewById(R.id.scoPlayer4_1);
        score2 = findViewById(R.id.scoPlayer4_2);
        score3 = findViewById(R.id.scoPlayer4_3);
        score4 = findViewById(R.id.scoPlayer4_4);

        Intent intent = getIntent();
        String namePlayer1 = intent.getStringExtra("player1");
        String namePlayer2 = intent.getStringExtra("player2");
        String namePlayer3 = intent.getStringExtra("player3");
        String namePlayer4 = intent.getStringExtra("player4");

        TextView printing1 = findViewById(R.id.player4_1);
        TextView printing2 = findViewById(R.id.player4_2);
        TextView printing3 = findViewById(R.id.player4_3);
        TextView printing4 = findViewById(R.id.player4_4);

        printing1.setText( namePlayer1);
        printing2.setText( namePlayer2);
        printing3.setText( namePlayer3);
        printing4.setText( namePlayer4);

        final String pl = namePlayer1;
        final String p2 = namePlayer2;
        final String p3 = namePlayer3;
        final String p4 = namePlayer4;

        semiWinner = findViewById(R.id.goToSemiWinner);

        semiWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String intValue1 = score1.getText().toString();
                String intValue2 = score2.getText().toString();
                String intValue3 = score3.getText().toString();
                String intValue4 = score4.getText().toString();

                int result1=0;
                int result2=0;
                int result3=0;
                int result4=0;
                if (!"".equals(intValue1)  ){
                    result1 = Integer.parseInt(intValue1);
                }
                if (!"".equals(intValue2)){
                    result2 = Integer.parseInt(intValue2);
                }
                if (!"".equals(intValue3)){
                    result3 = Integer.parseInt(intValue3);
                }
                if (!"".equals(intValue4)){
                    result4 = Integer.parseInt(intValue4);
                }

                if (result1 == result2) {
                    TextView printing3 = findViewById(R.id.info_41);
                    printing3.setText("Enter again " + pl + " and " + p2 );
                }
                if (result1 > result2) {
                    TextView printing3 = findViewById(R.id.info_41);
                    printing3.setText(pl + " win!!");
                }
                if (result1 < result2) {
                    TextView printing3 = findViewById(R.id.info_41);
                    printing3.setText(p2 + " win!!");
                }



                if (result3 == result4) {
                    TextView printing3 = findViewById(R.id.info_42);
                    printing3.setText("Enter again " + p3 + " and " + p4 );
                }
                if (result3 > result4) {
                    TextView printing3 = findViewById(R.id.info_42);
                    printing3.setText(p3 + " win!!");
                }
                if (result3 < result4) {
                    TextView printing3 = findViewById(R.id.info_42);
                    printing3.setText(p4 + " win!!");
                }


            }
        });



        final_4 = findViewById(R.id.goToFinal_4);

        final_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String intValue1 = score1.getText().toString();
                String intValue2 = score2.getText().toString();
                String intValue3 = score3.getText().toString();
                String intValue4 = score4.getText().toString();

                int result1 = 0;
                int result2 = 0;
                int result3 = 0;
                int result4 = 0;
                if (!"".equals(intValue1)) {
                    result1 = Integer.parseInt(intValue1);
                }
                if (!"".equals(intValue2)) {
                    result2 = Integer.parseInt(intValue2);
                }
                if (!"".equals(intValue3)) {
                    result3 = Integer.parseInt(intValue3);
                }
                if (!"".equals(intValue4)) {
                    result4 = Integer.parseInt(intValue4);
                }


                Intent in4 = new Intent(SingleSemiFinal.this, singleFinal.class);

                if (result1 > result2){
                    in4.putExtra("player1", pl);
                }
                if (result1 < result2) {
                    in4.putExtra("player1", p2);
                }


                if (result3 > result4){
                    in4.putExtra("player2", p3);
                }
                if (result3 < result4) {
                    in4.putExtra("player2", p4);
                }

                startActivity(in4);


            }
        });



    }
}
