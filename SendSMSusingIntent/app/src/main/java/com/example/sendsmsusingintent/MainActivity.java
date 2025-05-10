package com.example.sendsmsusingintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText phoneNumber = findViewById(R.id.phoneNumber);
        EditText messageText = findViewById(R.id.messageText);
        Button sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phoneNumber.getText().toString().trim();
                String message = messageText.getText().toString().trim();

                if (phone.isEmpty() || message.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Intent.ACTION_SENDTO);  // Use ACTION_SENDTO for SMS
                    intent.setData(Uri.parse("smsto:" + phone));  // Ensure proper URI scheme
                    intent.putExtra("sms_body", message);

                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "SMS sending failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
