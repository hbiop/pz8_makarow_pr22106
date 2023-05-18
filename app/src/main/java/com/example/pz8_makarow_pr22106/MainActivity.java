package com.example.pz8_makarow_pr22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Button) findViewById(R.id.button2);
        View.OnClickListener OCL = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(sw);
    }
}