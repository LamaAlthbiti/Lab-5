package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaration section
    EditText amountB;
    Button calculate;
    TextView amountT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView : method of activity class. It shows layout on screen.
        setContentView(R.layout.activity_main);

        // findViewById : method finds a view that was identified by the id attribute from the XML layout resource.
        amountB = (EditText) findViewById(R.id.E1);
        calculate = (Button) findViewById(R.id.B1);
        amountT = (TextView) findViewById(R.id.T1);
    }


    // OnClick Button B1 this methos will work
    public void Calculate(View view){

        //Get the input text as String
        String Stax = amountB.getText().toString();

        //Check if intered text is Empty then print statment Try again!!!!
        if(Stax.isEmpty()){

            // Set String in the Text view
            amountT.setText("Please enter a value and Try again!!");
        }

        else{ // if the entered text not empty

            // Convert String to Double
            double Dtax =Double.parseDouble(Stax);

            //Calculate the tax
            double tax = Dtax * 0.15;

            // Set String in the Text view
            amountT.setText("Your Tax = "+tax+" SAR \n\n Amount after adding the tax = "+(Dtax+tax));



        }


    }
}