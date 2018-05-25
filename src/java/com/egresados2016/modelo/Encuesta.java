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
public class Encuesta {
    private int idEncuesta;
    private String descripcion;
    private Estados estado;

    public Encuesta() {
    }

    public Encuesta(int idEncuesta, String descripcion, Estados estado) {
        this.idEncuesta = idEncuesta;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Encuesta{" + "idEncuesta=" + idEncuesta + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    
    
}
