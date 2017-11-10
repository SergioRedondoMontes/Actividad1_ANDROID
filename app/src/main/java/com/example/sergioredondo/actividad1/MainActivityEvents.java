package com.example.sergioredondo.actividad1;

import android.view.View;

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
            mainActivity.etNombre.setEnabled(true);
            mainActivity.etEmail.setEnabled(true);
            mainActivity.etTelefono.setEnabled(true);
            mainActivity.etDireccion.setEnabled(true);
            mainActivity.btnEditar.setVisibility(View.GONE);

        }else if (view.getId() == R.id.btnSiguiente){

        }
        /*
        if (view.getId() == R.id.btnMain){

            mainActivity.txtHolaMundo.setText("Felicidades");

            //mainActivity.btnMain.setVisibility(View.GONE);
            mainActivity.btnMain.setEnabled(false);

            Intent intent = new Intent(mainActivity,SecondActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();

            mainActivity.vistaUno.setVisibility(View.GONE);
            mainActivity.vistaDos.setVisibility(View.VISIBLE);
        }

         */
    }

}
