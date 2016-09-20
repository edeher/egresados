/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import java.sql.Date;

/**
 *
 * @author Mi Laptop
 */
public class Grados {
   private int idGrados;
   private Escuela escuela;
   private String descripcion;
   private Estados estado;

    public Grados() {
        this.escuela=new Escuela();
    }

    public Grados(int idGrado, Escuela escuela, String descripcion, Estados estado) {
        this.idGrados = idGrado;
        this.escuela = escuela;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Grados{" + "idGrado=" + idGrados + ", escuela=" + escuela + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
   
   

    /**
     * @return the idGrados
     */
    public int getIdGrados() {
        return idGrados;
    }

    /**
     * @param idGrados the idGrados to set
     */
    public void setIdGrados(int idGrados) {
        this.idGrados = idGrados;
    }

    /**
     * @return the escuela
     */
    public Escuela getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
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
