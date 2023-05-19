package com.example.pz8_makarow_pr22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
Button onMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        onMap = (Button) findViewById(R.id.button);
        onMap.setOnClickListener(this);
    }
            @Override
            public void onClick(View view) {
               startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 55.03348867, 82.91666678")));
            }
}