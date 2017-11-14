package com.example.sergioredondo.actividad1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

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
            Log.d("aa","holaaaaaa");
            getEditText();
            getDate(mainActivity.datePicker);

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
    }

    public void getEditText(){


        DataHolder.instance.nombre = mainActivity.etNombre.getText().toString();
        DataHolder.instance.email = mainActivity.etEmail.getText().toString();
        DataHolder.instance.telefono = mainActivity.etTelefono.getText().toString();
        DataHolder.instance.direccion = mainActivity.etDireccion.getText().toString();
    }


    public void getDate(DatePicker datepicker) {
        final Calendar calendar = Calendar.getInstance();
        DataHolder.instance.yy = calendar.get(Calendar.YEAR);
        DataHolder.instance.mm = calendar.get(Calendar.MONTH);
        DataHolder.instance.dd = calendar.get(Calendar.DAY_OF_MONTH);
    }

}
