package com.example.juegoaleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private TextView resultado;
    private Button lanzar;
    private  Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=findViewById(R.id.txtnumero);
        resultado=findViewById(R.id.txtresultado);
        lanzar=findViewById(R.id.btnlanzar);
        salir=findViewById(R.id.btnsalir);

        final Integer num[]={
                0,1,2,3,4,5,6,7,8,9,10,11,12, 13,
                14, 15, 16, 17, 18, 19, 20,21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
                36, 37, 38, 39,40,41, 42, 43, 44, 45, 46,
                47,48,49,50,51,52,53,54,55,56,57,58,59
                ,60,61,62,63,64,65,66,67,68,69,70,71,72,
                73,74,75,76,77,78,79,80,81,82,83,84,85,
                86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
        };


        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand =new Random();
                int user,Num = rand.nextInt(100);


                user=Integer.parseInt(usuario.getText().toString());
                resultado.setText(String.valueOf(num[Num]));
                resultado.setVisibility(View.VISIBLE);
                if(user==Num){


                    Toast.makeText(MainActivity.this,"Usted gano",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"siga intentando ",Toast.LENGTH_LONG).show();

                }





            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
