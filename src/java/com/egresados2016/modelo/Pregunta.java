/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoPreguntas;

/**
 *
 * @author Mi Laptop
 */
public class Pregunta {
    private int idPregunta;
    private Encuesta encuesta;
    private TipoPreguntas tipopregunta;
    private String descripcion;
    private Estados estado;

    public Pregunta() {
        this.encuesta=new Encuesta();
    }

    public Pregunta(int idPregunta, Encuesta encuesta, TipoPreguntas tipopregunta, String descripcion, Estados estado) {
        this.idPregunta = idPregunta;
        this.encuesta = encuesta;
        this.tipopregunta = tipopregunta;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "idPregunta=" + idPregunta + ", encuesta=" + encuesta + ", tipopregunta=" + tipopregunta + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public TipoPreguntas getTipopregunta() {
        return tipopregunta;
    }

    public void setTipopregunta(TipoPreguntas tipopregunta) {
        this.tipopregunta = tipopregunta;
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
