package com.example.jotaz.labintentpropios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ContenActivity extends AppCompatActivity {

    TextView txtUsuario;
    String nombreUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent i = getIntent();

        this.InicializarControles();
        this.ObtenerValoresIntetn(i);

        txtUsuario.setText("Bienvenido " + nombreUsuario);
    }

    private void InicializarControles(){

        txtUsuario = (TextView)findViewById(R.id.txtUsuario);
    }

    private void ObtenerValoresIntetn(Intent entranteIntent)
    {
        nombreUsuario = entranteIntent.getStringExtra("usuario");
    }

}
