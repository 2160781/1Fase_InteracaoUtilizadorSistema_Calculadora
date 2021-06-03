package com.example.new_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultip;
    public Button btnDividir;
    public EditText txtNu1;
    public EditText txtNu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar=(Button) findViewById(R.id.btnSumar);
        btnRestar=(Button) findViewById(R.id.btnRestar);
        btnMultip=(Button) findViewById(R.id.btnMultiplicar);
        btnDividir=(Button) findViewById(R.id.btnDividir);
        txtNu1=(EditText) findViewById(R.id.txtN1);
        txtNu1=(EditText) findViewById(R.id.txtN2);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=0;
                double n2=0;
                double result;
                Toast toast;

                n1=Double.parseDouble(txtNu1.getText().toString());
                n2=Double.parseDouble(txtNu2.getText().toString());
                result=n1+n2;
                toast= Toast.makeText(getApplicationContext(),"Rsultado"+result, Toast.LENGTH_SHORT);
                toast.show();


            }
        }







        );



    }
}