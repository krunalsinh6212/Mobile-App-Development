package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import com.example.radiobutton.R;

public class MainActivity extends AppCompatActivity {  // <-- Correct class inheritance
    RadioGroup radioGroup;
    Button clear, submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This is a standard call available in AppCompatActivity
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        clear = findViewById(R.id.clear);
        submit = findViewById(R.id.submit);
        radioGroup.clearCheck();

        submit.setOnClickListener(v -> {
            int selectId = radioGroup.getCheckedRadioButtonId();
            if (selectId != -1) {
                RadioButton radioButton = findViewById(selectId);
                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No option selected", Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener(v -> radioGroup.clearCheck());
    }

}
