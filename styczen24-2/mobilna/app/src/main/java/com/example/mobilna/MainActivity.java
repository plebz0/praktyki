package com.example.mobilna;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ListView listView = findViewById(R.id.listView);
            TextView ageTextView = findViewById(R.id.ageTextView);
            SeekBar seekBar = findViewById(R.id.ageSeekBar);
            ArrayList<String> animals = new ArrayList<>();
            animals.add("Kot");
            animals.add("Pies");
            animals.add("Świnka morka");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    animals
            );
            listView.setAdapter(adapter);
            AtomicReference<String> animalType = new AtomicReference<>("");
            listView.setOnItemClickListener((parent, view, position, id) -> {
                String animal = (String) parent.getItemAtPosition(position);
                if(animal.equals("Kot")) {
                    seekBar.setMax(20);
                    animalType.set("Kot");
                }
                else if (animal.equals("Pies")) {
                    seekBar.setMax(18);
                    animalType.set("Pies");
                }
                else if (animal.equals("Świnka morka")){
                    seekBar.setMax(9);
                    animalType.set("Świnka morka");
                }
            });
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    ageTextView.setText("Ile masz lat? " + progress);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
            EditText nameText = findViewById(R.id.nameTextBox);
            EditText goalText = findViewById(R.id.goalEditText);
            EditText timeText = findViewById(R.id.editTextTime);
            Button button = findViewById(R.id.button);
            button.setOnClickListener(view -> {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Zapisana wizyta").setMessage(nameText.getText().toString() + " " + animalType.get() + " " + seekBar.getProgress() + " " + ageTextView.getText().toString() + " " + goalText.getText().toString() + " " + timeText.getText().toString()).show();
            });
            return insets;
        });

    }
}