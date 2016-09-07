/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoPregunta;

/**
 *
 * @author Mi Laptop
 */
public class Pregunta {
    private int idPregunta;
    private TipoPregunta tipopregunta;
    private String descripcion;
    private Estados estado;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, TipoPregunta tipopregunta, String descripcion, Estados estado) {
        this.idPregunta = idPregunta;
        this.tipopregunta = tipopregunta;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "idPregunta=" + idPregunta + ", tipopregunta=" + tipopregunta + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

    
    /**
     * @return the idPregunta
     */
    public int getIdPregunta() {
        return idPregunta;
    }

    /**
     * @param idPregunta the idPregunta to set
     */
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    /**
     * @return the tipopregunta
     */
    public TipoPregunta getTipopregunta() {
        return tipopregunta;
    }

    /**
     * @param tipopregunta the tipopregunta to set
     */
    public void setTipopregunta(TipoPregunta tipopregunta) {
        this.tipopregunta = tipopregunta;
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
