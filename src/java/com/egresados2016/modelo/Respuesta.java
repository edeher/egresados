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
public class Respuesta {
    private int idRespuesta;
    private String descripcion;
    private Estados estado;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, String descripcion, Estados estado) {
        this.idRespuesta = idRespuesta;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "idRespuesta=" + idRespuesta + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

    
    
    /**
     * @return the idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * @param idRespuesta the idRespuesta to set
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
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
