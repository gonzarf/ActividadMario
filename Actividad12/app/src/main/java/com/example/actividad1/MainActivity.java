package com.example.actividad1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showalert(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("RECUPERACIÓN DE CONTRASEÑA");
            alert.setMessage("Introduzca correo de recuperación");

                EditText password = new EditText(this);
                password.setInputType(InputType.TYPE_CLASS_TEXT);
                password.setHint("correo@example.com");
            alert.setView(password);

            alert.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (!password.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Correo enviado correctamente a " + password.getText().toString() , Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(MainActivity.this, "Introduzca un correo", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            alert.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            alert.create().show();

    }
}