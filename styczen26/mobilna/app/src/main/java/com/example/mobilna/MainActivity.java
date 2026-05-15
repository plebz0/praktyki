package com.example.mobilna;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void setImage(ImageView imageView, int value) {
        if(value == 1)imageView.setImageResource(R.drawable.kosc1);
        if(value == 2)imageView.setImageResource(R.drawable.kosc2);
        if(value == 3)imageView.setImageResource(R.drawable.kosc3);
        if(value == 4)imageView.setImageResource(R.drawable.kosc4);
        if(value == 5)imageView.setImageResource(R.drawable.kosc5);
        if(value == 6)imageView.setImageResource(R.drawable.kosc6);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Button button = findViewById(R.id.button);
            TextView textView = findViewById(R.id.textView);
            ImageView kosc1 = findViewById(R.id.kosc1);
            ImageView kosc2 = findViewById(R.id.kosc2);
            ImageView kosc3 = findViewById(R.id.kosc3);
            ImageView kosc4 = findViewById(R.id.kosc4);
            ImageView kosc5 = findViewById(R.id.kosc5);
            kosc5.setImageResource(R.drawable.kosc0);
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            Dice dice3 = new Dice();
            Dice dice4 = new Dice();
            Dice dice5 = new Dice();
            button.setOnClickListener(v1 -> {
                dice1.RollDice();
                setImage(kosc1, dice1.valueOfDice);
                dice2.RollDice();
                setImage(kosc2, dice2.valueOfDice);
                dice3.RollDice();
                setImage(kosc3, dice3.valueOfDice);
                dice4.RollDice();
                setImage(kosc4, dice4.valueOfDice);
                dice5.RollDice();
                setImage(kosc5, dice5.valueOfDice);
                textView.setText(String.valueOf(dice1.valueOfDice + dice2.valueOfDice + dice3.valueOfDice + dice4.valueOfDice + dice5.valueOfDice));
            });

            kosc1.setOnClickListener(v1 -> {
                dice1.blockDice();
                kosc1.setAlpha(0.5f);
            });
            kosc2.setOnClickListener(v1 -> {
                dice2.blockDice();
                kosc2.setAlpha(0.5f);
            });
            kosc3.setOnClickListener(v1 -> {
                dice3.blockDice();
                kosc3.setAlpha(0.5f);
            });
            kosc4.setOnClickListener(v1 -> {
                dice4.blockDice();
                kosc4.setAlpha(0.5f);
            });
            kosc5.setOnClickListener(v1 -> {
                dice5.blockDice();
                kosc5.setAlpha(0.5f);
            });

            return insets;
        });
    }
}