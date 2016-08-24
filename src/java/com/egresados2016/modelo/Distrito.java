/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;

/**
 *
 * @author Mi Laptop
 */
public class Distrito {
    private int idDistrito;
    private Provincia provincia;
    private String descripcion;
    private Estados estado;

    public Distrito() {
        this.provincia=new Provincia();
    }

    public Distrito(int idDistrito, Provincia provincia, String descripcion, Estados estado) {
        this.idDistrito = idDistrito;
        this.provincia = provincia;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Distrito{" + "idDistrito=" + idDistrito + ", provincia=" + provincia + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

    
    /**
     * @return the idDistrito
     */
    public int getIdDistrito() {
        return idDistrito;
    }

    /**
     * @param idDistrito the idDistrito to set
     */
    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    /**
     * @return the provincia
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the estado
     */
    public Estados getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
