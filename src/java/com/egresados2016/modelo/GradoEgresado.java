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
public class GradoEgresado {
    private int idGradoEgresado;
    private Grados grados;
    private Egresado egresado;
    private Date fecha;
    private Estados estado;

    public GradoEgresado() {
        this.egresado=new Egresado();
        this.grados=new Grados();
    }

    public GradoEgresado(int idGradoEgresado, Grados grados, Egresado egresado, Date fecha, Estados estado) {
        this.idGradoEgresado = idGradoEgresado;
        this.grados = grados;
        this.egresado = egresado;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "GradoEgresado{" + "idGradoEgresado=" + idGradoEgresado + ", grados=" + grados + ", egresado=" + egresado + ", fecha=" + fecha + ", estado=" + estado + '}';
    }

    
    
    /**
     * @return the idGradoEgresado
     */
    public int getIdGradoEgresado() {
        return idGradoEgresado;
    }

    /**
     * @param idGradoEgresado the idGradoEgresado to set
     */
    public void setIdGradoEgresado(int idGradoEgresado) {
        this.idGradoEgresado = idGradoEgresado;
    }

    /**
     * @return the grados
     */
    public Grados getGrados() {
        return grados;
    }

    /**
     * @param grados the grados to set
     */
    public void setGrados(Grados grados) {
        this.grados = grados;
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
