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
public class PreguntaEgresado {
    private int idPreguntaEgresado;
    private Pregunta pregunta;
    private Egresado egresado;
    private Respuesta respuesta;
    private Estados estado;

    public PreguntaEgresado() {
        this.pregunta=new Pregunta();
        this.egresado=new Egresado();
        this.respuesta=new Respuesta();
    }

    public PreguntaEgresado(int idPreguntaEgresado, Pregunta pregunta, Egresado egresado, Respuesta respuesta, Estados estado) {
        this.idPreguntaEgresado = idPreguntaEgresado;
        this.pregunta = pregunta;
        this.egresado = egresado;
        this.respuesta = respuesta;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PreguntaEgresado{" + "idPreguntaEgresado=" + idPreguntaEgresado + ", pregunta=" + pregunta + ", egresado=" + egresado + ", respuesta=" + respuesta + ", estado=" + estado + '}';
    }

    
    
    /**
     * @return the idPreguntaEgresado
     */
    public int getIdPreguntaEgresado() {
        return idPreguntaEgresado;
    }

    /**
     * @param idPreguntaEgresado the idPreguntaEgresado to set
     */
    public void setIdPreguntaEgresado(int idPreguntaEgresado) {
        this.idPreguntaEgresado = idPreguntaEgresado;
    }

    /**
     * @return the pregunta
     */
    public Pregunta getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the egresado
     */
    public Egresado getEgresado() {
        return egresado;
    }

    /**
     * @param egresado the egresado to set
     */
    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    /**
     * @return the respuesta
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
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
