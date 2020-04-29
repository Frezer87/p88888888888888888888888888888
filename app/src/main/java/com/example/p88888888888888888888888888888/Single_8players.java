package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Single_8players extends AppCompatActivity {
    EditText name1, name2, name3, name4;
    EditText name5, name6, name7, name8;
    Button next8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_8players);

        next8= findViewById(R.id.goToQuarterFinal);

        name1 = findViewById(R.id.name8_1);
        name2 = findViewById(R.id.name8_2);
        name3 = findViewById(R.id.name8_3);
        name4 = findViewById(R.id.name8_4);
        name5 = findViewById(R.id.name8_5);
        name6 = findViewById(R.id.name8_6);
        name7 = findViewById(R.id.name8_7);
        name8 = findViewById(R.id.name8_8);

        next8.setOnClickListener(new View.OnClickListener() {
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

                if (playerName1.equals("") || playerName2.equals("") ||
                        playerName3.equals("") || playerName4.equals("") ||
                        playerName5.equals("") || playerName6.equals("") ||
                        playerName7.equals("") || playerName8.equals("")) {

                    TextView printing1 = findViewById(R.id.notifi_8_name);
                    printing1.setText(" There is an empty name try again!! ");
                } else {
                    Intent in4 = new Intent(Single_8players.this, SingleQuerterFinal.class);
                    in4.putExtra("player1",playerName1);
                    in4.putExtra("player2",playerName2);
                    in4.putExtra("player3",playerName3);
                    in4.putExtra("player4",playerName4);
                    in4.putExtra("player5",playerName5);
                    in4.putExtra("player6",playerName6);
                    in4.putExtra("player7",playerName7);
                    in4.putExtra("player8",playerName8);
                    startActivity(in4);
                }
            }
        });
    }


}
