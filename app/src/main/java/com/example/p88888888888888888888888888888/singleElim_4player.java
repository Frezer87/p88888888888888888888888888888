package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class singleElim_4player extends AppCompatActivity {
    EditText name1, name2, name3, name4;
    Button nextV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_elim_4player);


        nextV= findViewById(R.id.goToSemiFinal);

        name1 = findViewById(R.id.name4_1);
        name2 = findViewById(R.id.name4_2);
        name3 = findViewById(R.id.name4_3);
        name4 = findViewById(R.id.name4_4);

        nextV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerName1 = name1.getText().toString();
                String playerName2 = name2.getText().toString();
                String playerName3 = name3.getText().toString();
                String playerName4 = name4.getText().toString();

                if (playerName1.equals("") || playerName2.equals("") ||
                        playerName3.equals("") || playerName4.equals("")) {

                    TextView printing1 = findViewById(R.id.notifi);
                    printing1.setText(" There is an empty name try again!! ");
                } else {
                    Intent in4 = new Intent(singleElim_4player.this, SingleSemiFinal.class);
                    in4.putExtra("player1",playerName1);
                    in4.putExtra("player2",playerName2);
                    in4.putExtra("player3",playerName3);
                    in4.putExtra("player4",playerName4);
                    startActivity(in4);
                }

            }
        });


    }
}
