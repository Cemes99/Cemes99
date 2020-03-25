package com.example.game2048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonPlay, buttonHow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectView();
        listenButton();
    }

    private void connectView(){
        buttonPlay = findViewById(R.id.buttonPlay);
        buttonHow = findViewById(R.id.buttonHow);
    }

    private void listenButton(){
        buttonPlay.setOnClickListener(this);
        buttonHow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonPlay){
//            Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, GamePlay.class);
            startActivity(intent);
        }
    }
}
