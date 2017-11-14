package com.example.sergioredondo.actividad1;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedHashMap;

public class BookActivity extends AppCompatActivity {


    public LinearLayout viualLibro;

    public Button btnPerfil;
    public Button btnSiguiente;
    public Button btnAnterior;

    private BookActivityEvents events;

    public TextView txtTitulo;
    public TextView txtCuerpo;

    public EditText etTitulo;
    public EditText etCuerpo;

    public String[] titulos;
    public String[] cuerpos;
    public int auxArrLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        events = new BookActivityEvents(this);

        initButton();
        initTextView();
        initMapBooks();
        initEditText();

    }




    public void initButton(){
        btnPerfil = this.findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(events);
        btnPerfil.setText(R.string.btnPerfil);

        btnAnterior = this.findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(events);
        btnAnterior.setText(R.string.btnAnterior);

        btnSiguiente = this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(events);
        btnSiguiente.setText(R.string.btnSiguiente);

    }

    public void initTextView(){
        txtTitulo = this.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.txtTitulo);
        txtCuerpo= this.findViewById(R.id.txtCuerpo);
        txtCuerpo.setText(R.string.txtCuerpo);

    }

    private void initMapBooks() {
        titulos = this.getResources().getStringArray(R.array.titulos);
        cuerpos = this.getResources().getStringArray(R.array.cuerpos);
        auxArrLength = cuerpos.length;
    }

    public void initEditText(){
        etTitulo = this.findViewById(R.id.etTitulo);
        etTitulo.setText(titulos[0]);
        etCuerpo = this.findViewById(R.id.etCuerpo);
        etCuerpo.setText(cuerpos[0]);

    }




}
