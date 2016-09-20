/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import java.util.Date;

/**
 *
 * @author Mi Laptop
 */
public class Estudios {
    private int idEstudios;
    
    private Egresado egresado;
    
    private String mencion;
    private String institucion;
    private Date fechaInicio;
    private Date fechaFin;
    private String duraAcademica;
    private String cantidad;
    private String pais;
    private String Financiamiento;
    private Estados estado;

    public Estudios() {
        this.egresado=new Egresado();
    }

    public Estudios(int idEstudios, Egresado egresado, String mencion, String institucion, Date fechaInicio, Date fechaFin, String duraAcademica, String cantidad, String pais, String Financiamiento, Estados estado) {
        this.idEstudios = idEstudios;
        this.egresado = egresado;
        this.mencion = mencion;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duraAcademica = duraAcademica;
        this.cantidad = cantidad;
        this.pais = pais;
        this.Financiamiento = Financiamiento;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudios{" + "idEstudios=" + idEstudios + ", egresado=" + egresado + ", mencion=" + mencion + ", institucion=" + institucion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", duraAcademica=" + duraAcademica + ", cantidad=" + cantidad + ", pais=" + pais + ", Financiamiento=" + Financiamiento + ", estado=" + estado + '}';
    }

    
    
    /**
     * @return the idEstudios
     */
    public int getIdEstudios() {
        return idEstudios;
    }

    /**
     * @param idEstudios the idEstudios to set
     */
    public void setIdEstudios(int idEstudios) {
        this.idEstudios = idEstudios;
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
     * @return the mencion
     */
    public String getMencion() {
        return mencion;
    }

    /**
     * @param mencion the mencion to set
     */
    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    /**
     * @return the institucion
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * @param institucion the institucion to set
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the duraAcademica
     */
    public String getDuraAcademica() {
        return duraAcademica;
    }

    /**
     * @param duraAcademica the duraAcademica to set
     */
    public void setDuraAcademica(String duraAcademica) {
        this.duraAcademica = duraAcademica;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the Financiamiento
     */
    public String getFinanciamiento() {
        return Financiamiento;
    }

    /**
     * @param Financiamiento the Financiamiento to set
     */
    public void setFinanciamiento(String Financiamiento) {
        this.Financiamiento = Financiamiento;
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
