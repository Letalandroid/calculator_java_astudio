package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_calcular;
    EditText txtNum1;
    EditText txtNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        btn_calcular = findViewById(R.id.button);

        btn_calcular.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),
                    setResult(),
                    Toast.LENGTH_LONG).show();
        });
    }

    private int calcular() {

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());

        return num1 * num2;
    }

    private String setResult() {
        return "El producto es: " + calcular();
    }
}