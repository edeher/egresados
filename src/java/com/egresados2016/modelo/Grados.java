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
   private int idGrado;
   private Escuela escuela;
   private String descripcion;
   private Date fecha;
   private Estados estado;

    public Grados() {
        this.escuela=new Escuela();
    }

    public Grados(int idGrado, Escuela escuela, String descripcion, Date fecha, Estados estado) {
        this.idGrado = idGrado;
        this.escuela = escuela;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Grados{" + "idGrado=" + idGrado + ", escuela=" + escuela + ", descripcion=" + descripcion + ", fecha=" + fecha + ", estado=" + estado + '}';
    }

   
    /**
     * @return the idGrado
     */
    public int getIdGrado() {
        return idGrado;
    }

    /**
     * @param idGrado the idGrado to set
     */
    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
