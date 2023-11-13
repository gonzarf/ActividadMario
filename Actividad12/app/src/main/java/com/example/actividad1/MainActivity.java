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

            EditText resetemail = new EditText(this);
            resetemail.setInputType(InputType.TYPE_CLASS_TEXT);
            resetemail.setHint("correo@example.com");

            alert.setView(resetemail);

            alert.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Bien", Toast.LENGTH_SHORT).show();
                }
            });
            alert.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Mal", Toast.LENGTH_SHORT).show();
                }
            });
            alert.create().show();
    }
}