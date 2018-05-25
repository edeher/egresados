/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Afirmacion;


/**
 *
 * @author Mi Laptop
 */
public class PreguntaEgresado {
    private int idPreguntaEgresado;
    private Pregunta pregunta;
    private Egresado egresado;
    private Respuesta respuesta;
    private Afirmacion afirmacion;

    public PreguntaEgresado() {
        this.pregunta=new Pregunta();
        this.egresado=new Egresado();
        this.respuesta=new Respuesta();
    }

    public PreguntaEgresado(int idPreguntaEgresado, Pregunta pregunta, Egresado egresado, Respuesta respuesta, Afirmacion afirmacion) {
        this.idPreguntaEgresado = idPreguntaEgresado;
        this.pregunta = pregunta;
        this.egresado = egresado;
        this.respuesta = respuesta;
        this.afirmacion = afirmacion;
    }

    @Override
    public String toString() {
        return "PreguntaEgresado{" + "idPreguntaEgresado=" + idPreguntaEgresado + ", pregunta=" + pregunta + ", egresado=" + egresado + ", respuesta=" + respuesta + ", afirmacion=" + afirmacion + '}';
    }
    

    public int getIdPreguntaEgresado() {
        return idPreguntaEgresado;
    }

    public void setIdPreguntaEgresado(int idPreguntaEgresado) {
        this.idPreguntaEgresado = idPreguntaEgresado;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public Afirmacion getAfirmacion() {
        return afirmacion;
    }

    public void setAfirmacion(Afirmacion afirmacion) {
        this.afirmacion = afirmacion;
    }

   
}
