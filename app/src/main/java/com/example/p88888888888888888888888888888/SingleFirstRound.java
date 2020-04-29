package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SingleFirstRound extends AppCompatActivity {
    EditText score1,score2,score3,score4;
    EditText score5,score6,score7,score8;
    EditText score9,score10,score11,score12;
    EditText score13,score14,score15,score16;
    Button firstWinner;
    Button final_16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_first_round);

        score1 = findViewById(R.id.scoPlayer16_1);
        score2 = findViewById(R.id.scoPlayer16_2);
        score3 = findViewById(R.id.scoPlayer16_3);
        score4 = findViewById(R.id.scoPlayer16_4);
        score5 = findViewById(R.id.scoPlayer16_5);
        score6 = findViewById(R.id.scoPlayer16_6);
        score7 = findViewById(R.id.scoPlayer16_7);
        score8 = findViewById(R.id.scoPlayer16_8);
        score9 = findViewById(R.id.scoPlayer16_9);
        score10 = findViewById(R.id.scoPlayer16_10);
        score11= findViewById(R.id.scoPlayer16_11);
        score12= findViewById(R.id.scoPlayer16_12);
        score13 = findViewById(R.id.scoPlayer16_13);
        score14 = findViewById(R.id.scoPlayer16_14);
        score15 = findViewById(R.id.scoPlayer16_15);
        score16 = findViewById(R.id.scoPlayer16_16);



        final Intent intent = getIntent();
        String namePlayer1 = intent.getStringExtra("player1");
        String namePlayer2 = intent.getStringExtra("player2");
        String namePlayer3 = intent.getStringExtra("player3");
        String namePlayer4 = intent.getStringExtra("player4");
        String namePlayer5 = intent.getStringExtra("player5");
        String namePlayer6 = intent.getStringExtra("player6");
        String namePlayer7 = intent.getStringExtra("player7");
        String namePlayer8 = intent.getStringExtra("player8");
        String namePlayer9 = intent.getStringExtra("player9");
        String namePlayer10 = intent.getStringExtra("player10");
        String namePlayer11 = intent.getStringExtra("player11");
        String namePlayer12 = intent.getStringExtra("player12");
        String namePlayer13 = intent.getStringExtra("player13");
        String namePlayer14 = intent.getStringExtra("player14");
        String namePlayer15 = intent.getStringExtra("player15");
        String namePlayer16 = intent.getStringExtra("player16");

        TextView printing1 = findViewById(R.id.player16_1);
        TextView printing2 = findViewById(R.id.player16_2);
        TextView printing3 = findViewById(R.id.player16_3);
        TextView printing4 = findViewById(R.id.player16_4);
        TextView printing5 = findViewById(R.id.player16_5);
        TextView printing6 = findViewById(R.id.player16_6);
        TextView printing7 = findViewById(R.id.player16_7);
        TextView printing8 = findViewById(R.id.player16_8);
        TextView printing9 = findViewById(R.id.player16_9);
        TextView printing10 = findViewById(R.id.player16_10);
        TextView printing11 = findViewById(R.id.player16_11);
        TextView printing12 = findViewById(R.id.player16_12);
        TextView printing13 = findViewById(R.id.player16_13);
        TextView printing14 = findViewById(R.id.player16_14);
        TextView printing15 = findViewById(R.id.player16_15);
        TextView printing16 = findViewById(R.id.player16_16);


        printing1.setText( namePlayer1);
        printing2.setText( namePlayer2);
        printing3.setText( namePlayer3);
        printing4.setText( namePlayer4);
        printing5.setText( namePlayer5);
        printing6.setText( namePlayer6);
        printing7.setText( namePlayer7);
        printing8.setText( namePlayer8);
        printing9.setText( namePlayer9);
        printing10.setText( namePlayer10);
        printing11.setText( namePlayer11);
        printing12.setText( namePlayer12);
        printing13.setText( namePlayer13);
        printing14.setText( namePlayer14);
        printing15.setText( namePlayer15);
        printing16.setText( namePlayer16);

        final String pl = namePlayer1;
        final String p2 = namePlayer2;
        final String p3 = namePlayer3;
        final String p4 = namePlayer4;
        final String p5 = namePlayer5;
        final String p6 = namePlayer6;
        final String p7 = namePlayer7;
        final String p8 = namePlayer8;
        final String p9 = namePlayer9;
        final String p10 = namePlayer10;
        final String p11 = namePlayer11;
        final String p12 = namePlayer12;
        final String p13 = namePlayer13;
        final String p14 = namePlayer14;
        final String p15 = namePlayer15;
        final String p16 = namePlayer16;


        firstWinner = findViewById(R.id.goToFirstWinner);
        firstWinner.setOnClickListener(new View.OnClickListener() {
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
                String intValue9 = score9.getText().toString();
                String intValue10 = score10.getText().toString();
                String intValue11 = score11.getText().toString();
                String intValue12 = score12.getText().toString();
                String intValue13 = score13.getText().toString();
                String intValue14 = score14.getText().toString();
                String intValue15 = score15.getText().toString();
                String intValue16 = score16.getText().toString();

                int result1 = 0;
                int result2 = 0;
                int result3 = 0;
                int result4 = 0;
                int result5 = 0;
                int result6 = 0;
                int result7 = 0;
                int result8 = 0;
                int result9 = 0;
                int result10 = 0;
                int result11 = 0;
                int result12 = 0;
                int result13 = 0;
                int result14 = 0;
                int result15 = 0;
                int result16 = 0;


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
                if (!"".equals(intValue4)) {
                    result5 = Integer.parseInt(intValue5);
                }
                if (!"".equals(intValue4)) {
                    result6 = Integer.parseInt(intValue6);
                }
                if (!"".equals(intValue4)) {
                    result7 = Integer.parseInt(intValue7);
                }
                if (!"".equals(intValue4)) {
                    result8 = Integer.parseInt(intValue8);
                }

                if (!"".equals(intValue9)) {
                    result9 = Integer.parseInt(intValue9);
                }
                if (!"".equals(intValue10)) {
                    result10 = Integer.parseInt(intValue10);
                }
                if (!"".equals(intValue11)) {
                    result11 = Integer.parseInt(intValue11);
                }
                if (!"".equals(intValue12)) {
                    result12 = Integer.parseInt(intValue12);
                }
                if (!"".equals(intValue13)) {
                    result13 = Integer.parseInt(intValue13);
                }
                if (!"".equals(intValue14)) {
                    result14 = Integer.parseInt(intValue14);
                }
                if (!"".equals(intValue15)) {
                    result15 = Integer.parseInt(intValue15);
                }
                if (!"".equals(intValue16)) {
                    result16 = Integer.parseInt(intValue16);
                }


                //Check the winners

                if (result1 == result2) {
                    TextView printing3 = findViewById(R.id.notifi_16_1);
                    printing3.setText("Enter again " + pl + " and " + p2 );
                }
                if (result1 > result2) {
                    TextView printing3 = findViewById(R.id.notifi_16_1);
                    printing3.setText(pl + " win!!");
                }
                if (result1 < result2) {
                    TextView printing3 = findViewById(R.id.notifi_16_1);
                    printing3.setText(p2 + " win!!");
                }



                if (result3 == result4) {
                    TextView printing3 = findViewById(R.id.notifi_16_2);
                    printing3.setText("Enter again " + p3 + " and " + p4 );
                }
                if (result3 > result4) {
                    TextView printing3 = findViewById(R.id.notifi_16_2);
                    printing3.setText(p3 + " win!!");
                }
                if (result3 < result4) {
                    TextView printing3 = findViewById(R.id.notifi_16_2);
                    printing3.setText(p4 + " win!!");
                }



                if (result5 == result6) {
                    TextView printing3 = findViewById(R.id.notifi_16_3);
                    printing3.setText("win!! " + p5 + " and " + p6 );
                }
                if (result5 > result6) {
                    TextView printing3 = findViewById(R.id.notifi_16_3);
                    printing3.setText(p5 + " win!!");
                }
                if (result5 < result6) {
                    TextView printing3 = findViewById(R.id.notifi_16_3);
                    printing3.setText(p6 + " win!!");
                }




                if (result7 == result8) {
                    TextView printing3 = findViewById(R.id.notifi_16_4);
                    printing3.setText("Enter again " + p7 + " and " + p8 );
                }
                if (result7 > result8) {
                    TextView printing3 = findViewById(R.id.notifi_16_4);
                    printing3.setText(p7 + " win!!");
                }
                if (result7 < result8) {
                    TextView printing3 = findViewById(R.id.notifi_16_4);
                    printing3.setText(p8 + " win!!");
                }



                if (result9 == result10) {
                    TextView printing3 = findViewById(R.id.notifi_16_5);
                    printing3.setText("Enter again " + p9 + " and " + p10 );
                }
                if (result9 > result10) {
                    TextView printing3 = findViewById(R.id.notifi_16_5);
                    printing3.setText(p9 + " win!!");
                }

                if (result9 < result10) {
                    TextView printing3 = findViewById(R.id.notifi_16_5);
                    printing3.setText(p10 + " win!!");
                }


                if (result11 == result12) {
                    TextView printing3 = findViewById(R.id.notifi_16_6);
                    printing3.setText("Enter again " + p11 + " and " + p12 );
                }
                if (result11 > result12) {
                    TextView printing3 = findViewById(R.id.notifi_16_6);
                    printing3.setText(p11 + " win!!");
                }
                if (result11 < result12) {
                    TextView printing3 = findViewById(R.id.notifi_16_6);
                    printing3.setText(p12 + " win!!");
                }



                if (result13 == result14) {
                    TextView printing3 = findViewById(R.id.notifi_16_7);
                    printing3.setText("Enter again " + p13 + " and " + p14 );
                }
                if (result13 > result14) {
                    TextView printing3 = findViewById(R.id.notifi_16_7);
                    printing3.setText(p13 + " win!!");
                }
                if (result13 < result14) {
                    TextView printing3 = findViewById(R.id.notifi_16_7);
                    printing3.setText(p14 + " win!!");
                }


                if (result15 == result16) {
                    TextView printing3 = findViewById(R.id.notifi_16_8);
                    printing3.setText( " Enter again "+p15 + " and " + p16 );
                }
                if (result15 > result16) {
                    TextView printing3 = findViewById(R.id.notifi_16_8);
                    printing3.setText(p15 + " win!!");
                }
                if (result15 < result16) {
                    TextView printing3 = findViewById(R.id.notifi_16_8);
                    printing3.setText(p16 + " win!!");
                }


            }
        });

        final_16 = findViewById(R.id.goToFinal_16);
        final_16.setOnClickListener(new View.OnClickListener() {
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
                String intValue9 = score9.getText().toString();
                String intValue10 = score10.getText().toString();
                String intValue11 = score11.getText().toString();
                String intValue12 = score12.getText().toString();
                String intValue13 = score13.getText().toString();
                String intValue14 = score14.getText().toString();
                String intValue15 = score15.getText().toString();
                String intValue16 = score16.getText().toString();

                int result1 = 0;
                int result2 = 0;
                int result3 = 0;
                int result4 = 0;
                int result5 = 0;
                int result6 = 0;
                int result7 = 0;
                int result8 = 0;
                int result9 = 0;
                int result10 = 0;
                int result11 = 0;
                int result12 = 0;
                int result13 = 0;
                int result14 = 0;
                int result15 = 0;
                int result16 = 0;


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
                if (!"".equals(intValue4)) {
                    result5 = Integer.parseInt(intValue5);
                }
                if (!"".equals(intValue4)) {
                    result6 = Integer.parseInt(intValue6);
                }
                if (!"".equals(intValue4)) {
                    result7 = Integer.parseInt(intValue7);
                }
                if (!"".equals(intValue4)) {
                    result8 = Integer.parseInt(intValue8);
                }

                if (!"".equals(intValue9)) {
                    result9 = Integer.parseInt(intValue9);
                }
                if (!"".equals(intValue10)) {
                    result10 = Integer.parseInt(intValue10);
                }
                if (!"".equals(intValue11)) {
                    result11 = Integer.parseInt(intValue11);
                }
                if (!"".equals(intValue12)) {
                    result12 = Integer.parseInt(intValue12);
                }
                if (!"".equals(intValue13)) {
                    result13 = Integer.parseInt(intValue13);
                }
                if (!"".equals(intValue14)) {
                    result14 = Integer.parseInt(intValue14);
                }
                if (!"".equals(intValue15)) {
                    result15 = Integer.parseInt(intValue15);
                }
                if (!"".equals(intValue16)) {
                    result16 = Integer.parseInt(intValue16);
                }


                Intent i = new Intent(SingleFirstRound.this, SingleQuerterFinal.class);


                if (result1 > result2) {
                    i.putExtra("player1", pl);
                }
                else if (result1 < result2) {
                    i.putExtra("player1", p2);
                }

                if (result3 > result4) {
                    i.putExtra("player2", p3);
                }
               else  if (result3 < result4) {
                    i.putExtra("player2", p4);
                }



                if (result5 > result6) {
                    i.putExtra("player3", p5);
                }
               else if (result5 < result6) {
                    i.putExtra("player3", p6);
                }


                if (result7 > result8) {
                    i.putExtra("player4", p7);
                }
               else if (result7 < result8) {
                    i.putExtra("player4", p8);
                }



                if (result9 > result10) {
                    i.putExtra("player5", p9);
                }

                else if (result9 < result10) {
                    i.putExtra("player5", p10);
                }



                if (result11 > result12) {
                    i.putExtra("player6", p11);
                }
                else if (result11 < result12) {
                    i.putExtra("player6", p12);;
                }




                if (result13 > result14) {
                    i.putExtra("player7", p13);
                }
                else if (result13 < result14) {
                    i.putExtra("player7", p14);
                }



                if (result15 > result16) {
                    i.putExtra("player8", p15);
                }
               else if (result15 < result16) {
                    i.putExtra("player8", p16);
                }

                startActivity(i);

            }
        });



    }
}
