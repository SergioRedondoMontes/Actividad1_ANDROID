package com.example.sergioredondo.actividad1;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    private  BookActivityEvents events;

    public TextView txtTitulo;
    public TextView txtCuerpo;

    public EditText etTitulo;
    public EditText etCuerpo;

    //public LinkedHashMap<String,String> mapBooks;
    public String[] titulos;
    public String[] cuerpos;
    public int auxArrLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        initMapBooks();
        initButton();
        initEditText();
        initTextView();
    }

    private void initMapBooks() {
        titulos = this.getResources().getStringArray(R.array.titulos);
        cuerpos = this.getResources().getStringArray(R.array.cuerpos);
        /*
        mapBooks = new LinkedHashMap<String,String>();
        for (int i = 0; i < Math.min(titulos.length, cuerpos.length); ++i) {
            mapBooks.put(titulos[i], cuerpos[i]);
        }
        */
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

    public void initTextView(){
        txtTitulo.setText("txtTitulo");
        txtCuerpo.setText("txtCuerpo");

    }

    public void initEditText(){
        auxArrLength = cuerpos.length;
        etTitulo = this.findViewById(R.id.etTitulo);
        etTitulo.setText(titulos[0]);
        etCuerpo = this.findViewById(R.id.etCuerpo);
        etCuerpo.setText(cuerpos[0]);

    }


}
