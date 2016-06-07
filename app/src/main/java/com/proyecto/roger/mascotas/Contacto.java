package com.proyecto.roger.mascotas;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contacto extends AppCompatActivity {

    Button btn;
    EditText nombre,email,comentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        btn = (Button) findViewById(R.id.submit);
        nombre = (EditText) findViewById(R.id.nombre);
        email = (EditText) findViewById(R.id.email_address);
        comentario = (EditText)findViewById(R.id.comentario);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isend = new Intent(android.content.Intent.ACTION_SEND);
                isend.setType("plain/text");
                isend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ email.getText().toString()});
                isend.putExtra(android.content.Intent.EXTRA_SUBJECT, nombre.getText().toString());
                isend.putExtra(android.content.Intent.EXTRA_TEXT, comentario.getText());
                startActivity(isend);
            }
        });
    }
}
