package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amountB;
    Button calculate;
    TextView amountT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountB = (EditText) findViewById(R.id.E1);
        calculate = (Button) findViewById(R.id.B1);
        amountT = (TextView) findViewById(R.id.T1);
    }

    public void Calculate(View view){
        String Stax = amountB.getText().toString();

        if(Stax.isEmpty()){
            amountT.setText("Try again!!!!");
        }
        else{
            double Dtax =Double.parseDouble(Stax);
            double tax = Dtax * 0.15;
            amountT.setText("Your Tax = "+tax+" SR \n\n Amount after adding the tax = "+(Dtax+tax));



        }


    }
}