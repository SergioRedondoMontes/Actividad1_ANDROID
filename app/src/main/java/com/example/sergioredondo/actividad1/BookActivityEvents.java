package com.example.sergioredondo.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by sergioredondo on 10/11/17.
 */


public class BookActivityEvents implements View.OnClickListener {

    private BookActivity bookActivity;
    private int contador = 0;

    public BookActivityEvents(BookActivity bookActivity) {
        this.bookActivity = bookActivity;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnPerfil){
            Intent intent = new Intent(bookActivity,MainActivity.class);
            bookActivity.startActivity(intent);
            bookActivity.finish();
        }else if (view.getId() == R.id.btnAnterior){
            contador=contador-1;
            pasarpagina();
        }else if (view.getId() == R.id.btnSiguiente);
            contador++;
            pasarpagina();
        }


    public void pasarpagina() {
        if ((contador > 0) && (contador < bookActivity.auxArrLength)) {
            bookActivity.etCuerpo.setText(bookActivity.cuerpos[contador]);
            bookActivity.etTitulo.setText(bookActivity.titulos[contador]);
        } else if (contador < 0 ){
            contador = bookActivity.auxArrLength;
            bookActivity.etCuerpo.setText(bookActivity.cuerpos[contador]);
            bookActivity.etTitulo.setText(bookActivity.titulos[contador]);
        }else if(contador > bookActivity.auxArrLength){
            contador = 0;
            bookActivity.etCuerpo.setText(bookActivity.cuerpos[contador]);
            bookActivity.etTitulo.setText(bookActivity.titulos[contador]);
        }
    }


}
