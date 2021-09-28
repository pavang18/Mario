package com.example.mario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById((R.id.button));
        button.setOnClickListener(v -> openmario2());
    }
    public void openmario2(){
        Intent intent = new Intent(MainActivity.this,mario2.class);
        startActivity(intent);
    }
}