package com.example.sergioredondo.actividad1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
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

        }else if (view.getId() == R.id.btnSiguiente){
            mainActivity.viualFormulario.setVisibility(View.GONE);
            /*
            Intent intent = new Intent(mainActivity,Bookctivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
            */
        }else if(view.getId() == R.id.btnGuardar){
            getEditText();
            getDate(mainActivity.datePicker);
        }

    }


    public void actionBtnEditar(){
        mainActivity.etNombre.setEnabled(true);
        mainActivity.etEmail.setEnabled(true);
        mainActivity.etTelefono.setEnabled(true);
        mainActivity.etDireccion.setEnabled(true);
        mainActivity.datePicker.setEnabled(true);
        mainActivity.btnEditar.setVisibility(View.GONE);
        mainActivity.btnGuardar.setText("btnGuardar");
        mainActivity.btnGuardar.setVisibility(View.VISIBLE);
    }

    public void getEditText(){
        mainActivity.nombre = mainActivity.getEtNombre().toString();
        mainActivity.email = mainActivity.getEtEmail().toString();
        mainActivity.telefono = mainActivity.getEtTelefono().toString();
        mainActivity.direccion = mainActivity.getEtDireccion().toString();
    }

    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Calendar selectedCalendar = Calendar.getInstance();
        selectedCalendar.set(Calendar.YEAR, year);
        selectedCalendar.set(Calendar.MONTH, monthOfYear);
        selectedCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    }

    public void getDate(DatePicker datepicker) {
        final Calendar calendar = Calendar.getInstance();
        mainActivity.yy = calendar.get(Calendar.YEAR);
        mainActivity.mm = calendar.get(Calendar.MONTH);
        mainActivity.dd = calendar.get(Calendar.DAY_OF_MONTH);
    }

}
