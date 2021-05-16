package com.example.romaniatravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Paltinis(View view) {
        Toast.makeText(this, "You have clicked Paltinis", Toast.LENGTH_LONG).show();
    }

    public void Ranca(View view) {
        Toast.makeText(this, "You have clicked Ranca", Toast.LENGTH_LONG).show();
    }

    public void Sinaia(View view) {
        Toast.makeText(this, "You have clicked Sinaia", Toast.LENGTH_LONG).show();
    }

    public void Straja(View view) {
        Intent showDetailActivityStraja = new Intent(getApplicationContext(), DetailActivityStraja.class);
        startActivity(showDetailActivityStraja);
    }

    public void Sureanu(View view) {
        Toast.makeText(this, "You have clicked Sureanu", Toast.LENGTH_LONG).show();
    }

    public void Vartop(View view) {
        Toast.makeText(this, "You have clicked Vartop", Toast.LENGTH_LONG).show();
    }
}