package com.example.togglebuttondec2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = " ";
                if(toggleButton != null && toggleButton.isChecked()) {
                    str1 = "Toggle checked";
                } else {
                    str1 = "Toggle not checked";
                }
                Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_LONG).show();
            }
        });
    }
}