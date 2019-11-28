package com.example.calculadoraexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual;
    TextView textview;
    double numero1, numero2;
    boolean Suma;
    boolean punto;
    boolean Restar;
    boolean Dividir;
    boolean Multiplicar;
    boolean finalizar;
    boolean firstime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.Boton0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.butonsumar);
        buttonSub = (Button) findViewById(R.id.buttonrestar);
        buttonMul = (Button) findViewById(R.id.buttonmultiply);
        buttonDivision = (Button) findViewById(R.id.buttondividir);
        buttonC = (Button) findViewById(R.id.buttonc);
        buttonEqual = (Button) findViewById(R.id.buttonigual);
        textview = (TextView) findViewById(R.id.editext);
        numero1=0.0;
        numero2=0.0;
        Suma=false;
        Restar=false;
        Dividir=false;
        Multiplicar=false;
        punto=false;
        finalizar=false;
        firstime=true;
        textview.setText("");





    }


    public void number1(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "1");
    }

    private void comprobarfinalizar() {
        if (finalizar==true)
            textview.setText("");
            finalizar=false;
    }

    public void number2(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "2");
    }
    public void number3(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "3");
    }
    public void number4(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "4");
    }
    public void number5(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "5" );
    }
    public void number6(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "6");
    }
    public void number7(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "7");
    }
    public void number8(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "8");
    }
    public void number9(View view) {
        comprobarfinalizar();
        textview.setText(textview.getText() + "9");
    }
    public void number0(View view) {
        textview.setText(textview.getText() + "0");
    }
    public void numberpoint(View view) {

        if (punto == false) {
            textview.setText(textview.getText() + ".");
            punto = true;
        } else {
        }
    }
    public void sumar(View v) {
            numero1 = Double.parseDouble((String) textview.getText());
            numero2=numero1+numero2;
            textview.setText(String.valueOf(numero2));
            Suma = true;
            punto=false;
         Restar=false;
         Dividir=false;
            finalizar=true;


    }

public void butonc(View view) {
        textview.setText("");
        numero2=0;
        numero1=0;
        firstime=false;
        punto=false;
        Suma=false;
        punto=false;
        firstime=true;
        Dividir=false;
        Multiplicar=false;
        finalizar=false;
        }

    public void restar(View view) {
        numero1 = Double.parseDouble((String) textview.getText());
        numero2=numero2-numero1;
        textview.setText(String.valueOf(numero2));
        Restar = true;
        Suma=false;
        punto=false;
        Dividir=false;
        Multiplicar=false;
        finalizar=true;
    }

    public void igual(View view) {
        numero1 = Double.parseDouble((String) textview.getText());
        if (Suma == true) {
            textview.setText(String.valueOf( numero2+numero1));
            Suma = false;
        }

        if (Restar == true) {
            textview.setText(String.valueOf( numero2-numero1));
            Restar = false;
        }

        if (Multiplicar == true) {
            textview.setText(String.valueOf(numero1 * numero2));
            Multiplicar = false;
        }

        if (Dividir == true) {
            textview.setText(String.valueOf(numero2/numero1));
            Dividir = false;
        }
        firstime=false;
    }

    public void multiply(View view) {
        if (firstime==true){
            numero2=1;
            firstime=false;

        }
        numero1 = Double.parseDouble((String) textview.getText());
        numero2=numero2*numero1;
        textview.setText(String.valueOf(numero2));
        Multiplicar = true;
        Suma=false;
        punto=false;
        Restar=false;
        Dividir=false;
        finalizar=true;
    }

    public void dividir(View view) {
        numero1 = Double.parseDouble(textview.getText() + "");
        numero2=numero2/numero1;
        textview.setText(String.valueOf(numero2));
        if (firstime==true){
            numero2=numero1;
            textview.setText(String.valueOf(numero1));
            firstime=false;
        }
        Dividir = true;
        Suma=false;
        Restar=false;
        punto=false;
        Multiplicar=false;
        finalizar=true;
    }

}

