package com.example.testepalomakoba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;

public class MainActivity extends AppCompatActivity  {
    Button btnconverte;
    TextView jarda,centimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnconverte = (Button)  findViewById(R.id.btnconverte);
        jarda = (TextView) findViewById(R.id.dolar);
        centimetro = (TextView) findViewById(R.id.real);
        btnconverte.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                  String saida;
                  double valorjarda, valorcentimetro;
                  saida=jarda.getText().toString();
                  try{
                     valorjarda = Double.parseDouble(saida);
                  }catch (NumberFormatException erro){
                     valorjarda=1.;
                  }
                  valorcentimetro = valorjarda * 91.44;
                  centimetro.setText(String.format("  %5.2f cm",valorcentimetro));
            }
        });
    }


}