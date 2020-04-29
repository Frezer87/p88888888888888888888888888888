package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SingleQuerterFinal extends AppCompatActivity {
    EditText score1;
    EditText score2;
    EditText score3;
    EditText score4;
    EditText score5;
    EditText score6;
    EditText score7;
    EditText score8;
    Button querterWinner;
    Button final_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_querter_final);

        score1 = findViewById(R.id.scoPlayer8_1);
        score2 = findViewById(R.id.scoPlayer8_2);
        score3 = findViewById(R.id.scoPlayer8_3);
        score4 = findViewById(R.id.scoPlayer8_4);
        score5 = findViewById(R.id.scoPlayer8_5);
        score6 = findViewById(R.id.scoPlayer8_6);
        score7 = findViewById(R.id.scoPlayer8_7);
        score8 = findViewById(R.id.scoPlayer8_8);

        final Intent intent = getIntent();
        String namePlayer1 = intent.getStringExtra("player1");
        String namePlayer2 = intent.getStringExtra("player2");
        String namePlayer3 = intent.getStringExtra("player3");
        String namePlayer4 = intent.getStringExtra("player4");
        String namePlayer5 = intent.getStringExtra("player5");
        String namePlayer6 = intent.getStringExtra("player6");
        String namePlayer7 = intent.getStringExtra("player7");
        String namePlayer8 = intent.getStringExtra("player8");


        TextView printing1 = findViewById(R.id.player8_1);
        TextView printing2 = findViewById(R.id.player8_2);
        TextView printing3 = findViewById(R.id.player8_3);
        TextView printing4 = findViewById(R.id.player8_4);
        TextView printing5 = findViewById(R.id.player8_5);
        TextView printing6 = findViewById(R.id.player8_6);
        TextView printing7 = findViewById(R.id.player8_7);
        TextView printing8 = findViewById(R.id.player8_8);

        printing1.setText( namePlayer1);
        printing2.setText( namePlayer2);
        printing3.setText( namePlayer3);
        printing4.setText( namePlayer4);
        printing5.setText( namePlayer5);
        printing6.setText( namePlayer6);
        printing7.setText( namePlayer7);
        printing8.setText( namePlayer8);

        final String pl = namePlayer1;
        final String p2 = namePlayer2;
        final String p3 = namePlayer3;
        final String p4 = namePlayer4;
        final String p5 = namePlayer5;
        final String p6 = namePlayer6;
        final String p7 = namePlayer7;
        final String p8 = namePlayer8;

        querterWinner = findViewById(R.id.goToQuarterWinner);
        querterWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String intValue1 = score1.getText().toString();
                String intValue2 = score2.getText().toString();
                String intValue3 = score3.getText().toString();
                String intValue4 = score4.getText().toString();
                String intValue5 = score5.getText().toString();
                String intValue6 = score6.getText().toString();
                String intValue7 = score7.getText().toString();
                String intValue8 = score8.getText().toString();

                int result1 = 0;
                int result2 = 0;
                int result3 = 0;
                int result4 = 0;
                int result5 = 0;
                int result6 = 0;
                int result7 = 0;
                int result8 = 0;

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
                if (!"".equals(intValue5)) {
                    result5 = Integer.parseInt(intValue5);
                }
                if (!"".equals(intValue6)) {
                    result6 = Integer.parseInt(intValue6);
                }
                if (!"".equals(intValue7)) {
                    result7 = Integer.parseInt(intValue7);
                }
                if (!"".equals(intValue8)) {
                    result8 = Integer.parseInt(intValue8);
                }


                //Check the winners

                if (result1 == result2) {
                    TextView printing3 = findViewById(R.id.info81);
                    printing3.setText("Enter again " + pl + " and " + p2 );
                }
                if (result1 > result2) {
                    TextView printing3 = findViewById(R.id.info81);
                    printing3.setText(pl + " win!!");
                }
                if (result1 < result2) {
                    TextView printing3 = findViewById(R.id.info81);
                    printing3.setText(p2 + " win!!");
                }



                if (result3 == result4) {
                    TextView printing3 = findViewById(R.id.info82);
                    printing3.setText("Enter again " + p3 + " and " + p4 );
                }
                if (result3 > result4) {
                    TextView printing3 = findViewById(R.id.info82);
                    printing3.setText(p3 + " win!!");
                }
                if (result3 < result4) {
                    TextView printing3 = findViewById(R.id.info82);
                    printing3.setText(p4 + " win!!");
                }



                if (result5 == result6) {
                    TextView printing3 = findViewById(R.id.info_83);
                    printing3.setText("win!! " + p5 + " and " + p6 );
                }
                if (result5 > result6) {
                    TextView printing3 = findViewById(R.id.info_83);
                    printing3.setText(p5 + " win!!");
                }
                if (result5 < result6) {
                    TextView printing3 = findViewById(R.id.info_83);
                    printing3.setText(p6 + " win!!");
                }




                if (result7 == result8) {
                    TextView printing3 = findViewById(R.id.info_84);
                    printing3.setText("Enter again " + p7 + " and " + p8 );
                }
                if (result7 > result8) {
                    TextView printing3 = findViewById(R.id.info_84);
                    printing3.setText(p7 + " win!!");
                }
                if (result7 < result8) {
                    TextView printing3 = findViewById(R.id.info_84);
                    printing3.setText(p8 + " win!!");
                }

            }

        });


            final_8 = findViewById(R.id.goToFinal_8);
            final_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String intValue1 = score1.getText().toString();
                String intValue2 = score2.getText().toString();
                String intValue3 = score3.getText().toString();
                String intValue4 = score4.getText().toString();
                String intValue5 = score5.getText().toString();
                String intValue6 = score6.getText().toString();
                String intValue7 = score7.getText().toString();
                String intValue8 = score8.getText().toString();

                int result1=0;
                int result2=0;
                int result3=0;
                int result4=0;
                int result5=0;
                int result6=0;
                int result7=0;
                int result8=0;

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
                if (!"".equals(intValue4)){
                    result5 = Integer.parseInt(intValue5);
                }
                if (!"".equals(intValue4)){
                    result6 = Integer.parseInt(intValue6);
                }
                if (!"".equals(intValue4)){
                    result7 = Integer.parseInt(intValue7);
                }
                if (!"".equals(intValue4)){
                    result8 = Integer.parseInt(intValue8);
                }


                Intent intent = new Intent(SingleQuerterFinal.this, SingleSemiFinal.class);


                if (result1 > result2) {
                    intent.putExtra("player1", pl);
                }

                if (result1 < result2) {
                    intent.putExtra("player1", p2);
                }



                if (result3 > result4) {
                    intent.putExtra("player2", p3);
                }
                if (result3 < result4) {
                    intent.putExtra("player2", p4);
                }



                if (result5 > result6) {
                    intent.putExtra("player3", p5);
                }
                if (result5 < result6) {
                    intent.putExtra("player3", p6);
                }

                if (result7 > result8) {
                    intent.putExtra("player4", p7);
                }
                if (result1 < result2) {
                    intent.putExtra("player4", p8);
                }

                startActivity(intent);

            }
        });


    }
}
