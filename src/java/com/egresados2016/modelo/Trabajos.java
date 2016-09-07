/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoContrato;
import com.egresados2016.enums.TipoJornada;
import java.sql.Date;

/**
 *
 * @author Mi Laptop
 */
public class Trabajos {
    private int idTrabajos;
    private Egresado egresado;
    private Date fechaInicio;
    private Date fechaFin;
    private String puesto;
    private String nomInstitucion;
    private TipoContrato tipocontrato;
    private String sueldo;
    private TipoJornada tipojornada;
    private Estados estado;

    public Trabajos() {
    }

    public Trabajos(int idTrabajos, Egresado egresado, Date fechaInicio, Date fechaFin, String puesto, String nomInstitucion, TipoContrato tipocontrato, String sueldo, TipoJornada tipojornada, Estados estado) {
        this.idTrabajos = idTrabajos;
        this.egresado = egresado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puesto = puesto;
        this.nomInstitucion = nomInstitucion;
        this.tipocontrato = tipocontrato;
        this.sueldo = sueldo;
        this.tipojornada = tipojornada;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Trabajos{" + "idTrabajos=" + idTrabajos + ", egresado=" + egresado + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", puesto=" + puesto + ", nomInstitucion=" + nomInstitucion + ", tipocontrato=" + tipocontrato + ", sueldo=" + sueldo + ", tipojornada=" + tipojornada + ", estado=" + estado + '}';
    }
    
    

    /**
     * @return the idTrabajos
     */
    public int getIdTrabajos() {
        return idTrabajos;
    }

    /**
     * @param idTrabajos the idTrabajos to set
     */
    public void setIdTrabajos(int idTrabajos) {
        this.idTrabajos = idTrabajos;
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
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the nomInstitucion
     */
    public String getNomInstitucion() {
        return nomInstitucion;
    }

    /**
     * @param nomInstitucion the nomInstitucion to set
     */
    public void setNomInstitucion(String nomInstitucion) {
        this.nomInstitucion = nomInstitucion;
    }

    /**
     * @return the tipocontrato
     */
    public TipoContrato getTipocontrato() {
        return tipocontrato;
    }

    /**
     * @param tipocontrato the tipocontrato to set
     */
    public void setTipocontrato(TipoContrato tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    /**
     * @return the sueldo
     */
    public String getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the tipojornada
     */
    public TipoJornada getTipojornada() {
        return tipojornada;
    }

    /**
     * @param tipojornada the tipojornada to set
     */
    public void setTipojornada(TipoJornada tipojornada) {
        this.tipojornada = tipojornada;
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
