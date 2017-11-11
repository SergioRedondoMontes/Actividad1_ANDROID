package com.example.sergioredondo.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    private DataHolder dataHolder;

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

        initButton();
        initEditText();
        initTextView();
        onDateChanged(datePicker,dataHolder.yy,dataHolder.mm,dataHolder.dd);
    }

    public void initButton(){
        btnBook = this.findViewById(R.id.btnBook);
        btnBook.setOnClickListener(events);
        btnBook.setText("btnBook");
        btnEditar = this.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(events);
        btnEditar.setText("btnEditar");
        btnGuardar.setVisibility(View.GONE);
    }

    public void initEditText(){
        etNombre = this.findViewById(R.id.etNombre);
        etNombre.setText(dataHolder.nombre);
        etEmail = this.findViewById(R.id.etEmail);
        etEmail.setText(dataHolder.email);
        etTelefono = this.findViewById(R.id.etTelefono);
        etTelefono.setText(dataHolder.telefono);
        etDireccion = this.findViewById(R.id.etDireccion);
        etDireccion.setText(dataHolder.direccion);
    }

    public void initTextView(){
        txtNombre.setText("txtNombre");
        txtEmail.setText("txtEmail");
        txtTelefono.setText("txtTelefono");
        txtDireccion.setText("txtDireccion");
        txtFInscripcion.setText("txtFInscripcion");
    }

    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Calendar selectedCalendar = Calendar.getInstance();
        selectedCalendar.set(Calendar.YEAR, year);
        selectedCalendar.set(Calendar.MONTH, monthOfYear);
        selectedCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    }

    public EditText getEtNombre(){return etNombre; }
    public EditText getEtEmail(){return etEmail; }
    public EditText getEtTelefono(){return etTelefono; }
    public EditText getEtDireccion(){return etDireccion; }

}
