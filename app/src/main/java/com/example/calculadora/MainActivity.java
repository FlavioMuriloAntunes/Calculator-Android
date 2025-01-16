package com.example.calculadora;

import static com.example.calculadora.R.id.editOpera;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textResult; // integração com o resultado
    private EditText editNumero1; // integração para edição do número 1
    private EditText editNumero2; // integração para edição do número 2

    private EditText editOpera; // integrando operação

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // Define o layout principal

        textResult = findViewById(R.id.textResult);
        editNumero1 = findViewById(R.id.editNumero1);
        editNumero2 = findViewById(R.id.editNumero2);
        editOpera = findViewById(R.id.editOpera);
    }

    public void Calcular(View view) {
        double number1 = Double.parseDouble(editNumero1.getText().toString());
        double number2 = Double.parseDouble(editNumero2.getText().toString());

        String opera = editOpera.getText().toString();
        double resultado = 0;

        switch (opera) {
            case "+":
            resultado = number1 + number2;
                break;
        }






        textResult.setText(String.valueOf(resultado));
    }
}
