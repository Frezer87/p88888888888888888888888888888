package com.example.p88888888888888888888888888888;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button singleElim;
    Button doubleElim;
    EditText num1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        singleElim = findViewById(R.id.goToEnterSingleElim);
        doubleElim = findViewById(R.id.goToEnterDoubleElim);
        num1 = findViewById(R.id.numPlay);



            singleElim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String intValue = num1.getText().toString();
                    int number=0;
                    if (!"".equals(intValue)){
                        number = Integer.parseInt(intValue);
                    }
                    if (number == 2) {
                        setContentView(R.layout.activity_main2);
                        Intent i = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);
                    }else if (number == 4) {
                        setContentView(R.layout.activity_main2);
                        Intent i = new Intent(MainActivity.this,singleElim_4player.class);
                        startActivity(i);
                    }else if (number == 8) {
                        setContentView(R.layout.activity_main2);
                        Intent i = new Intent(MainActivity.this,Single_8players.class);
                        startActivity(i);
                    }else if (number == 16) {
                        setContentView(R.layout.activity_main2);
                        Intent i = new Intent(MainActivity.this,DoubleElim16ply.class);
                        startActivity(i);

                    }else if (number % 2 != 0) {
                        TextView printing1 = findViewById(R.id.message1);
                        printing1.setText(number +" is an odd number! Enter Even number:");
                    }else{
                        TextView printing1 = findViewById(R.id.message1);
                        printing1.setText("wrong or empty input Enter 2 , 4, 8,or 16:");
                    }
                }
            });


        doubleElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String intValue = num1.getText().toString();
                int number=0;
                if (!"".equals(intValue)){
                    number = Integer.parseInt(intValue);
                }
                if (number == 2) {
                    setContentView(R.layout.activity_main2);
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }else if (number == 4) {
                    setContentView(R.layout.activity_main2);
                    Intent i = new Intent(MainActivity.this,singleElim_4player.class);
                    startActivity(i);
                }else if (number == 8) {
                    setContentView(R.layout.activity_main2);
                    Intent i = new Intent(MainActivity.this,Single_8players.class);
                    startActivity(i);
                }else if (number == 16) {
                    setContentView(R.layout.activity_main2);
                    Intent i = new Intent(MainActivity.this,Single_16players.class);
                    startActivity(i);

                }else if (number % 2 != 0) {
                    TextView printing1 = findViewById(R.id.message1);
                    printing1.setText(number +" is an odd number! Enter Even number:");
                }else{
                    TextView printing1 = findViewById(R.id.message1);
                    printing1.setText("wrong or empty input Enter 2 , 4, 8,or 16:");
                }
            }
        });


    }


}