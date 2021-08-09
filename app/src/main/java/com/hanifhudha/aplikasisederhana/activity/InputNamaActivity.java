package com.hanifhudha.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hanifhudha.aplikasisederhana.R;

public class InputNamaActivity extends AppCompatActivity {

    private EditText edtName;
    private Button btnTampil;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        setTitle("Tampil Nama");

        edtName = findViewById(R.id.editInputNama);
        btnTampil = findViewById(R.id.btnTampil);
        txtOutput = findViewById(R.id.txtOutput);
    }

    public void actionTampil(View view) {
        if (edtName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Nama Kosong!", Toast.LENGTH_SHORT).show();
        } else {
            txtOutput.setText(edtName.getText().toString());
        }
    }
}