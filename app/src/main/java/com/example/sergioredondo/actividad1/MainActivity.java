package com.example.sergioredondo.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public LinearLayout viualFormulario;

    public Button btnSiguiente;
    public Button btnEditar;
    public Button btnGuardar;

    private  MainActivityEvents events;

    public TextView txtNombre;
    public TextView txtEmail;
    public TextView txtTelefono;
    public TextView txtDireccion;
    public TextView txtFInscripcion;

    public EditText etNombre;
    public EditText etEmail;
    public EditText etTelefono;
    public EditText etDireccion;

    public DatePicker datePicker;

    public String nombre;
    public String email;
    public String telefono;
    public String direccion;
    public int yy;
    public int mm;
    public int dd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);

        initButton();
        initEditText();
        initTextView();
    }

    public void initButton(){
        btnSiguiente = this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(events);
        btnSiguiente.setText("btnBook");
        btnEditar = this.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(events);
        btnEditar.setText("btnEditar");
        btnGuardar.setVisibility(View.GONE);
    }

    public void initEditText(){
        etNombre = this.findViewById(R.id.etNombre);
        etEmail = this.findViewById(R.id.etEmail);
        etTelefono = this.findViewById(R.id.etTelefono);
        etDireccion = this.findViewById(R.id.etDireccion);
    }

    public void initTextView(){
        txtNombre.setText("txtNombre");
        txtEmail.setText("txtEmail");
        txtTelefono.setText("txtTelefono");
        txtDireccion.setText("txtDireccion");
        txtFInscripcion.setText("txtFInscripcion");
    }

    public EditText getEtNombre(){return etNombre; }
    public EditText getEtEmail(){return etEmail; }
    public EditText getEtTelefono(){return etTelefono; }
    public EditText getEtDireccion(){return etDireccion; }

}
