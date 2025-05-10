package com.example.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText ageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText nameEditText = findViewById(R.id.edit1);
        ageEditText = findViewById(R.id.edit2);
    }
    protected void onResume(){
        super.onResume();
        SharedPreferences sharedPreferences = getResources("UserPreferences", MODE_PRIVATE);
        String saveNames = sharedPreferences.getString("user_name","");
        int saveAge = sharedPreferences.getInt("user_age",0);
    }
}