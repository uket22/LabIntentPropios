package com.example.jotaz.labintentpropios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.InicializarControles();
    }

    private void InicializarControles()
    {
        usuario = (EditText)findViewById(R.id.txtUsuario);
        contrasena = (EditText)findViewById(R.id.txtContrasena);
    }

    public void Login(View view)
    {
        if (usuario.getText().toString().equals("juan507")) {

            if (contrasena.getText().toString().equals("12345"))
            {
                Intent i = new Intent(this, WelcomeActivity.class);
                i.putExtra("usuario", usuario.getText().toString() );
                startActivity(i);
            }else {
                Toast.makeText(this,"Contrasena Incorrecta",Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this,"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
        }
    }

    public void Registrar(View view)
    {
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }

}
