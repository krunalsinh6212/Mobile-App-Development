package com.example.applicationformenu;



import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = findViewById(R.id.displayText);
    }

//    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                displayText.setText("Home selected");
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_settings:
                displayText.setText("Settings selected");
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_about:
                displayText.setText("About selected");
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
