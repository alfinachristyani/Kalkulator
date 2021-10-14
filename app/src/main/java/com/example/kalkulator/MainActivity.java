package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.angka1);
        num2 = (EditText) findViewById(R.id.angka2);
        hasilnya = (TextView) findViewById(R.id.hasilHitung);
    }

    public void hitung(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        Integer hasil = n1+n2;
        hasilnya.setText(hasil.toString());
    }

    public void kurang(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        Integer hasil = n1-n2;
        hasilnya.setText(hasil.toString());
    }

    public void kali(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        Integer hasil = n1*n2;
        hasilnya.setText(hasil.toString());
    }

    public void bagi(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        Integer hasil = n1/n2;
        hasilnya.setText(hasil.toString());
    }
}