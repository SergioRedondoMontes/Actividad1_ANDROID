package com.example.sergioredondo.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public LinearLayout viualFormulario;

    public Button btnBook;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);
        datePicker = this.findViewById(R.id.datePicker);
        initButton();
        initEditText();
        initTextView();
        if(!DataHolder.instance.aux) {
            onDateChanged(datePicker);
        }
    }

    public void initButton(){
        btnBook = this.findViewById(R.id.btnBook);
        btnBook.setOnClickListener(events);
        btnBook.setText(R.string.btnBook);
        btnEditar = this.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(events);
        btnEditar.setText(R.string.btnEditar);
        btnGuardar = this.findViewById(R.id.btnGuardar);
        btnGuardar.setVisibility(View.GONE);
    }

    public void initEditText(){
        etNombre = this.findViewById(R.id.etNombre);
        etNombre.setText(DataHolder.instance.nombre);
        etEmail = this.findViewById(R.id.etEmail);
        etEmail.setText(DataHolder.instance.email);
        etTelefono = this.findViewById(R.id.etTelefono);
        etTelefono.setText(DataHolder.instance.telefono);
        etDireccion = this.findViewById(R.id.etDireccion);
        etDireccion.setText(DataHolder.instance.direccion);
    }

    public void initTextView(){
        txtNombre = this.findViewById(R.id.txtNombre);
        txtNombre.setText(R.string.txtNombre);
        txtEmail = this.findViewById(R.id.txtEmail);
        txtEmail.setText(R.string.txtEmail);
        txtTelefono = this.findViewById(R.id.txtTelefono);
        txtTelefono.setText(R.string.txtTelefono);
        txtDireccion = this.findViewById(R.id.txtDireccion);
        txtDireccion.setText(R.string.txtDireccion);
        txtFInscripcion = this.findViewById(R.id.txtFInscripcion);
        txtFInscripcion.setText(R.string.txtFInscripcion);
    }

    public void onDateChanged(DatePicker view) {
        view.updateDate(DataHolder.instance.yy,DataHolder.instance.mm,DataHolder.instance.dd);
    }


}
