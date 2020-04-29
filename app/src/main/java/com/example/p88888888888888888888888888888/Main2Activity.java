package com.example.p88888888888888888888888888888;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity  {
    EditText name1, name2;
    Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        result = findViewById(R.id.goToFinal);

        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String playerName1 = name1.getText().toString();
                String playerName2 = name2.getText().toString();

                if (playerName1.equals("") || playerName2.equals("")) {
                    TextView printing1 = findViewById(R.id.notification1);
                    printing1.setText(" There is an empty name try again!! ");
                } else {
                    Intent intent1 = new Intent(Main2Activity.this, singleFinal.class);
                    intent1.putExtra("player1",playerName1);
                    intent1.putExtra("player2",playerName2);
                    startActivity(intent1);
                }


            }
        });

    }
 }

