package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Inicializacion de variables
    Button btn_calcular;
    EditText txtNum1;
    EditText txtNum2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Creacion de la activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Llamada al diseño del activity

        // Asignacion de valores de las variables antes llamadas
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResult = findViewById(R.id.txtResult);
        btn_calcular = findViewById(R.id.button);
        txtResult.setText(""); // Iniciar el campo del resultado en vacio

        btn_calcular.setOnClickListener(v -> { // Funcion a realizar al momento que el usuario hace click
            txtResult.setText(setResult()); // Recoje el valor obtenido en setResult() y lo muestra en txtResult
            Toast.makeText(v.getContext(),
                    setResult(),
                    Toast.LENGTH_LONG).show(); // Muestra un pequeño Toast con el resultado de setResult
        });
    }

    private float calcular() { // Funcion donde se realiza el proceso de calculo

        // Obtener los valores de los EditText y convertirlos en flotante, reales o decimales
        float num1 = Float.parseFloat(txtNum1.getText().toString());
        float num2 = Float.parseFloat(txtNum2.getText().toString());

        return num1 * num2; // Operacion a devolver, una multiplicacion
    }

    private String setResult() {
        return "El producto es: " + calcular(); // Mensaje a mostrar al terminar el proceso de calculo
    }
}