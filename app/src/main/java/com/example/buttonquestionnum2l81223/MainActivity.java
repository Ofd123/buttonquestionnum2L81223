package com.example.buttonquestionnum2l81223;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        btn = findViewById(R.id.button); // replace with the actual ID of your button
    }

    public void go(View view) {
        num = num + 1;
        btn.setText("this is click number:" + num);
    }
}
