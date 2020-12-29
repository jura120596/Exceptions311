package com.example.exceptions311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView some  = findViewById(R.id.gone); // some = null
        try {
            some.setText("Some text");
        } catch (NullPointerException e) {
            Toast.makeText(this,e.toString(), Toast.LENGTH_LONG).show();
        }
        TextView some2  = findViewById(R.id.gone); // some = null
        if (some2 == null) {
            Toast.makeText(this, "Поймал null без кэтча с условием", Toast.LENGTH_SHORT).show();
        } else {
            some2.setText("Some2 text");
        }
    }
}
