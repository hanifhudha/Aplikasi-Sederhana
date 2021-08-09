package com.hanifhudha.aplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.hanifhudha.aplikasisederhana.activity.InputNamaActivity;
import com.hanifhudha.aplikasisederhana.activity.KalkulatorActivity;
import com.hanifhudha.aplikasisederhana.activity.ListViewNegaraActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgInputNama, imgKalkulator, imgLvNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

        imgInputNama = findViewById(R.id.imgInputNama);
        imgKalkulator = findViewById(R.id.imgKalkulator);
        imgLvNegara = findViewById(R.id.imgLvNegara);

        imgInputNama.setOnClickListener(this);
        imgKalkulator.setOnClickListener(this);
        imgLvNegara.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.imgInputNama:
                Intent i = new Intent(this, InputNamaActivity.class);
                startActivity(i);
                break;
            case R.id.imgKalkulator:
                startActivity(new Intent(this, KalkulatorActivity.class));
                break;
            case R.id.imgLvNegara:
                startActivity(new Intent(this, ListViewNegaraActivity.class));
                break;
        }

    }
}