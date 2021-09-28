package com.example.mario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mario3 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mario3);

        button =(Button) findViewById((R.id.button5));
        button.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                openmario3();
            }
        });
    }
    public void openmario3(){
        Intent intent = new Intent(mario3.this,newreq.class);
        startActivity(intent);
    }
    }
