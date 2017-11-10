package com.example.sergioredondo.actividad1;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {


    public LinearLayout viualLibro;

    public Button btnPerfil;
    public Button btnSiguiente;
    public Button btnAnterior;

    private  BookActivityEvents events;

    public TextView txtTitulo;
    public TextView txtCuerpo;

    public EditText etTitulo;
    public EditText etCuerpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        initButton();
        initEditText();
        initTextView();
    }


    public void initButton(){
        btnPerfil = this.findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(events);
        btnPerfil.setText("btnPerfil");

        btnAnterior = this.findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(events);
        btnAnterior.setText("btnAnterior");

        btnSiguiente = this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(events);
        btnSiguiente.setText("btnBook");

    }

    public void initEditText(){
        etTitulo = this.findViewById(R.id.etTitulo);
        etCuerpo = this.findViewById(R.id.etCuerpo);

    }

    public void initTextView(){
        txtTitulo.setText("txtTitulo");
        txtCuerpo.setText("txtCuerpo");

    }
}
