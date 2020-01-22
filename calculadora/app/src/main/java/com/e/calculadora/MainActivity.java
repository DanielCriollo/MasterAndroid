package com.e.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2;
    TextView resultado;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.val1);
        valor2 = findViewById(R.id.val2);
        resultado = findViewById(R.id.viewResultado);

    }

    public void onClick(View view) {

        num1 = Integer.parseInt(valor1.getText().toString());

        num2 = Integer.parseInt(valor2.getText().toString());

        switch (view.getId()) {
            case R.id.btnSuma:
                suma();
                break;
            case R.id.btnResta:
                resta();
                break;
            case R.id.btnMultiplicacion:
                multiplicacion();
                break;
            case R.id.btnDivision:
                division();
                break;

        }
    }

    public void suma() {
        int suma = num1 + num2;
        resultado.setText("Resultado suma :" + suma);
    }

    public void resta() {
        int resta = num1 - num2;
        resultado.setText("Resultado resta: " + resta);
    }

    public void multiplicacion() {
        int multiplicacion = num1 * num2;
        resultado.setText("Resultado multiplicacion: " + multiplicacion);
    }

    public void division() {

        //hay que tener en cuenta que no se puede dividir entre 0

        if (num2 <= 0) {
            resultado.setText("No se puede dividir entre 0");
        } else {

            // double para decimales
            double division = num1 / num2;
            resultado.setText("Resultado division: " + division);
        }

    }
}
