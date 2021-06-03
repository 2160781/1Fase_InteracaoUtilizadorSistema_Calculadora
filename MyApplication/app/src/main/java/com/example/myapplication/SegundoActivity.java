package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    //metodo boton SIGUIENTE 2

        //metodo dos botoes
        public void Siguiente2(View view)  {

            Intent ir_a_cod_Qr =new Intent(this,codigo_qr.class);
        startActivity(ir_a_cod_Qr);


    }
}