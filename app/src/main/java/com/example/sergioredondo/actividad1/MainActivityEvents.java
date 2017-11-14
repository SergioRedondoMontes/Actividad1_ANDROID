package com.example.sergioredondo.actividad1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by sergioredondo on 10/11/17.
 */

public class MainActivityEvents implements View.OnClickListener {

    private MainActivity mainActivity;


    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnEditar){
            actionBtnEditar();

        }else if (view.getId() == R.id.btnBook){
           // mainActivity.viualFormulario.setVisibility(View.GONE);

            Intent intent = new Intent(mainActivity,BookActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();

        }else if(view.getId() == R.id.btnGuardar){
            getEditText();
            getDate();
            actionBtnGuardar();
        }

    }


    public void actionBtnEditar(){
        mainActivity.etNombre.setEnabled(true);
        mainActivity.etEmail.setEnabled(true);
        mainActivity.etTelefono.setEnabled(true);
        mainActivity.etDireccion.setEnabled(true);
        //mainActivity.datePicker.setEnabled(true);
        mainActivity.btnEditar.setVisibility(View.GONE);

        mainActivity.btnGuardar.setText(R.string.btnGuardar);
        mainActivity.btnGuardar.setOnClickListener(this);
        mainActivity.btnGuardar.setVisibility(View.VISIBLE);
        DataHolder.instance.aux=false;
    }

    public void getEditText(){


        DataHolder.instance.nombre = mainActivity.etNombre.getText().toString();
        DataHolder.instance.email = mainActivity.etEmail.getText().toString();
        DataHolder.instance.telefono = mainActivity.etTelefono.getText().toString();
        DataHolder.instance.direccion = mainActivity.etDireccion.getText().toString();
    }

    public void actionBtnGuardar(){
        mainActivity.etNombre.setEnabled(false);
        mainActivity.etEmail.setEnabled(false);
        mainActivity.etTelefono.setEnabled(false);
        mainActivity.etDireccion.setEnabled(false);
        mainActivity.btnGuardar.setVisibility(View.GONE);

        mainActivity.btnEditar.setText(R.string.btnEditar);
        mainActivity.btnEditar.setOnClickListener(this);
        mainActivity.btnEditar.setVisibility(View.VISIBLE);

    }


    public void getDate() {
        DataHolder.instance.yy = mainActivity.datePicker.getYear();
        DataHolder.instance.mm = mainActivity.datePicker.getMonth();
        DataHolder.instance.dd = mainActivity.datePicker.getDayOfMonth();
    }

}
