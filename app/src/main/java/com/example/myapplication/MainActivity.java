package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_calcular;
    EditText txtNum1;
    EditText txtNum2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResult = findViewById(R.id.txtResult);
        btn_calcular = findViewById(R.id.button);
        txtResult.setText("");

        btn_calcular.setOnClickListener(v -> {
            txtResult.setText(setResult());
            Toast.makeText(v.getContext(),
                    setResult(),
                    Toast.LENGTH_LONG).show();
        });
    }

    private float calcular() {

        float num1 = Float.parseFloat(txtNum1.getText().toString());
        float num2 = Float.parseFloat(txtNum2.getText().toString());

        return num1 * num2;
    }

    private String setResult() {
        return "El producto es: " + calcular();
    }
}