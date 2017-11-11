package com.example.sergioredondo.actividad1;

/**
 * Created by sergioredondo on 11/11/17.
 */

public class DataHolder {


    public String nombre;
    public String email;
    public String telefono;
    public String direccion;
    public int yy;
    public int mm;
    public int dd;


    public void getNombre(String vnombre){
       nombre=vnombre;
    }

    public String getNombre(){
        return  nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
}
