package com.example.sergioredondo.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button btnSiguiente;
    public Button btnEditar;
    public Button btnGuardar;
    private  MainActivityEvents events;
    public TextView txtNombre;
    public TextView txtEmail;
    public TextView txtTelefono;
    public TextView txtDireccion;

    public EditText etNombre;
    public EditText etEmail;
    public EditText etTelefono;
    public EditText etDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);

        initButton();
        initEditText();

    }

    public void initButton(){
        btnSiguiente = this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(events);
        btnEditar = this.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(events);
        btnGuardar.setVisibility(View.GONE);
    }

    public void initEditText(){
        etNombre = this.findViewById(R.id.etNombre);
        etEmail = this.findViewById(R.id.etEmail);
        etTelefono = this.findViewById(R.id.etTelefono);
        etDireccion = this.findViewById(R.id.etDireccion);
    }

    public EditText getEtNombre(){return etNombre; }
    public EditText getEtEmail(){return etEmail; }
    public EditText getEtTelefono(){return etTelefono; }
    public EditText getEtDireccion(){return etDireccion; }

}
