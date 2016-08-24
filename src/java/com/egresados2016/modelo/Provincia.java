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
public class Provincia {
    
    private int idProvincia;
    private Departamento departamento;
    private String descripcion;
    private Estados estado;

    public Provincia() {
        this.departamento=new Departamento();
    }

    public Provincia(int idProvincia, Departamento departamento, String descripcion, Estados estado) {
        this.idProvincia = idProvincia;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Provincia{" + "idProvincia=" + idProvincia + ", departamento=" + departamento + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    /**
     * @return the idProvincia
     */
    public int getIdProvincia() {
        return idProvincia;
    }

    /**
     * @param idProvincia the idProvincia to set
     */
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
