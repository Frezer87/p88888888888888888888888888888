package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Double16Elm8Los8Win extends AppCompatActivity {
    EditText name1, name2, name3, name4;
    EditText name5, name6, name7, name8;
    EditText name9, name10, name11, name12;
    EditText name13, name14, name15, name16;
    Button next16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double16_elm8_los8_win);

        next16= findViewById(R.id.goToEightLoseAndWin);

        name1 = findViewById(R.id.name16_1);
        name2 = findViewById(R.id.name16_2);
        name3 = findViewById(R.id.name16_3);
        name4 = findViewById(R.id.name16_4);
        name5 = findViewById(R.id.name16_5);
        name6 = findViewById(R.id.name16_6);
        name7 = findViewById(R.id.name16_7);
        name8 = findViewById(R.id.name16_8);
        name9 = findViewById(R.id.name16_9);
        name10 = findViewById(R.id.name16_10);
        name11= findViewById(R.id.name16_11);
        name12= findViewById(R.id.name16_12);
        name13= findViewById(R.id.name16_13);
        name14= findViewById(R.id.name16_14);
        name15= findViewById(R.id.name16_15);
        name16 = findViewById(R.id.name16_16);

        next16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerName1 = name1.getText().toString();
                String playerName2 = name2.getText().toString();
                String playerName3 = name3.getText().toString();
                String playerName4 = name4.getText().toString();
                String playerName5 = name5.getText().toString();
                String playerName6 = name6.getText().toString();
                String playerName7 = name7.getText().toString();
                String playerName8 = name8.getText().toString();
                String playerName9 = name9.getText().toString();
                String playerName10 = name10.getText().toString();
                String playerName11= name11.getText().toString();
                String playerName12 = name12.getText().toString();
                String playerName13= name13.getText().toString();
                String playerName14 = name14.getText().toString();
                String playerName15 = name15.getText().toString();
                String playerName16 = name16.getText().toString();

                if (playerName1.equals("") || playerName2.equals("") ||
                        playerName3.equals("") || playerName4.equals("") ||
                        playerName5.equals("") || playerName6.equals("") ||
                        playerName7.equals("") || playerName8.equals("")||
                        playerName9.equals("") || playerName10.equals("") ||
                        playerName11.equals("") || playerName12.equals("") ||
                        playerName13.equals("") || playerName14.equals("") ||
                        playerName15.equals("") || playerName16.equals("")) {

                    TextView printing1 = findViewById(R.id.notifi_16_name);
                    printing1.setText(" There is an empty name try again!! ");
                } else {
                    Intent in4 = new Intent(Double16Elm8Los8Win.this, Double16Comput8Lose8Win.class);
                    in4.putExtra("player1",playerName1);
                    in4.putExtra("player2",playerName2);
                    in4.putExtra("player3",playerName3);
                    in4.putExtra("player4",playerName4);
                    in4.putExtra("player5",playerName5);
                    in4.putExtra("player6",playerName6);
                    in4.putExtra("player7",playerName7);
                    in4.putExtra("player8",playerName8);
                    in4.putExtra("player9",playerName9);
                    in4.putExtra("player10",playerName10);
                    in4.putExtra("player11",playerName11);
                    in4.putExtra("player12",playerName12);
                    in4.putExtra("player13",playerName13);
                    in4.putExtra("player14",playerName14);
                    in4.putExtra("player15",playerName15);
                    in4.putExtra("player16",playerName16);
                    startActivity(in4);
                }
            }
        });

    }


}
