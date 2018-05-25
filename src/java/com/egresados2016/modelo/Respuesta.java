/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Grupo;

/**
 *
 * @author Mi Laptop
 */
public class Respuesta {
    private int idRespuesta;
    private Grupo grupo;
    private String descripcion;
    private Estados estado;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, Grupo grupo, String descripcion, Estados estado) {
        this.idRespuesta = idRespuesta;
        this.grupo = grupo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "idRespuesta=" + idRespuesta + ", grupo=" + grupo + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
