package com.example.pz8_makarow_pr22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {
Button sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sw = (Button) findViewById(R.id.button);
        View.OnClickListener oCL = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent();
            }
        };
    }
}