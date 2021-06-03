package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import javax.xml.transform.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;
import me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler;

public class codigo_qr extends AppCompatActivity implements ResultHandler {
private ZXingScannerView nScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_qr);



  }

    //metodo dos botoes
    public void anterior( View view)  {

        Intent anterior=new Intent(this,MainActivity.class);
        startActivity(anterior);

}
    //metodo dos botoes
    public void  escanear( View view)  {

        nScannerView=new ZXingScannerView( this );
        setContentView( nScannerView );
        nScannerView.setResultHandler( this );
        nScannerView.startCamera();



        }



    @Override
    public void handleResult(com.google.zxing.Result result) {


        Log.v("ResultHandler",result.getText());
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle( "Resultado del scan" );
        builder.setMessage( result.getText() );
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        //nScannerView.resumeCameraPreview( this );






    }
}