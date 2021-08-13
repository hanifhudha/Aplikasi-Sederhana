package com.hanifhudha.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hanifhudha.aplikasisederhana.R;

public class KalkulatorActivity extends AppCompatActivity {

    private EditText edtAngka1, edtAngka2;
    private TextView txtHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        setTitle("Kalkulator");

        edtAngka1 = findViewById(R.id.editAngka1);
        edtAngka2 = findViewById(R.id.editAngka2);
        txtHasil = findViewById(R.id.txtHasilKalku);
    }

    public void actionPlus(View view) {
        if (edtAngka1.getText().toString().isEmpty() || edtAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukkan Angka Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
            txtHasil.setText("0.0");
        } else {
            double angka1 = Double.parseDouble(edtAngka1.getText().toString());
            double angka2 = Double.parseDouble(edtAngka2.getText().toString());
            double hasil = angka1 + angka2;
            txtHasil.setText(String.valueOf(hasil));
        }
    }

    public void actionMinus(View view) {
        if (edtAngka1.getText().toString().isEmpty() || edtAngka2.getText().toString().isEmpty()) {
            txtHasil.setText("0.0");
            Toast.makeText(this, "Masukkan Angka Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
        } else {
            double angka1 = Double.parseDouble(edtAngka1.getText().toString());
            double angka2 = Double.parseDouble(edtAngka2.getText().toString());
            double hasil = angka1 - angka2;
            txtHasil.setText(String.valueOf(hasil));
        }
    }

    public void actionBagi(View view) {
        if (edtAngka1.getText().toString().isEmpty() || edtAngka2.getText().toString().isEmpty()) {
            txtHasil.setText("0.0");
            Toast.makeText(this, "Masukkan Angka Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
        } else {
            double angka1 = Double.parseDouble(edtAngka1.getText().toString());
            double angka2 = Double.parseDouble(edtAngka2.getText().toString());
            double hasil = angka1 / angka2;
            txtHasil.setText(String.valueOf(hasil));
        }
    }

    public void actionKali(View view) {
        if (edtAngka1.getText().toString().isEmpty() || edtAngka2.getText().toString().isEmpty()) {
            txtHasil.setText("0.0");
            Toast.makeText(this, "Masukkan Angka Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
        } else {
            double angka1 = Double.parseDouble(edtAngka1.getText().toString());
            double angka2 = Double.parseDouble(edtAngka2.getText().toString());
            double hasil = angka1 * angka2;
            txtHasil.setText(String.valueOf(hasil));
        }
    }

    public void actionBersihkan(View view) {
        edtAngka1.setText("");
        edtAngka2.setText("");
        txtHasil.setText("0.0");
    }
}