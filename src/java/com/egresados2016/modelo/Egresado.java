/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Sexo;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.EstadoCivil;
import java.sql.Date;

/**
 *
 * @author Mi Laptop
 */
public class Egresado {
     private int idEgresado;
     private Distrito idDistritoNacimiento;
     private Distrito idDistritoResidencia;
     private String nombres;
     private String apellidos;
     private String dni;
     private Sexo sexo;
     private String direccion;
     private String telefono1;
     private String telefono2;
     private String correro;
     private Date fechaIngreso;
     private Date fechaEgreso;
     private int nroHijos;
     private EstadoCivil estadoCivil;
     private Estados estado;

    public Egresado() {
        this.idDistritoNacimiento= new Distrito();
        this.idDistritoResidencia=new Distrito();
    }

    public Egresado(int idEgresado, Distrito idDistritoNacimiento, Distrito idDistritoResidencia, String nombres, String apellidos, String dni, Sexo sexo, String direccion, String telefono1, String telefono2, String correro, Date fechaIngreso, Date fechaEgreso, int nroHijos, EstadoCivil estadoCivil, Estados estado) {
        this.idEgresado = idEgresado;
        this.idDistritoNacimiento = idDistritoNacimiento;
        this.idDistritoResidencia = idDistritoResidencia;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correro = correro;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.nroHijos = nroHijos;
        this.estadoCivil = estadoCivil;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Egresado{" + "idEgresado=" + idEgresado + ", idDistritoNacimiento=" + idDistritoNacimiento + ", idDistritoResidencia=" + idDistritoResidencia + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", sexo=" + sexo + ", direccion=" + direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correro=" + correro + ", fechaIngreso=" + fechaIngreso + ", fechaEgreso=" + fechaEgreso + ", nroHijos=" + nroHijos + ", estadoCivil=" + estadoCivil + ", estado=" + estado + '}';
    }

     
     
    /**
     * @return the idEgresado
     */
    public int getIdEgresado() {
        return idEgresado;
    }

    /**
     * @param idEgresado the idEgresado to set
     */
    public void setIdEgresado(int idEgresado) {
        this.idEgresado = idEgresado;
    }

    /**
     * @return the idDistritoNacimiento
     */
    public Distrito getIdDistritoNacimiento() {
        return idDistritoNacimiento;
    }

    /**
     * @param idDistritoNacimiento the idDistritoNacimiento to set
     */
    public void setIdDistritoNacimiento(Distrito idDistritoNacimiento) {
        this.idDistritoNacimiento = idDistritoNacimiento;
    }

    /**
     * @return the idDistritoResidencia
     */
    public Distrito getIdDistritoResidencia() {
        return idDistritoResidencia;
    }

    /**
     * @param idDistritoResidencia the idDistritoResidencia to set
     */
    public void setIdDistritoResidencia(Distrito idDistritoResidencia) {
        this.idDistritoResidencia = idDistritoResidencia;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono1
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * @param telefono1 the telefono1 to set
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * @return the telefono2
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * @param telefono2 the telefono2 to set
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    /**
     * @return the correro
     */
    public String getCorrero() {
        return correro;
    }

    /**
     * @param correro the correro to set
     */
    public void setCorrero(String correro) {
        this.correro = correro;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the fechaEgreso
     */
    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * @param fechaEgreso the fechaEgreso to set
     */
    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    /**
     * @return the nroHijos
     */
    public int getNroHijos() {
        return nroHijos;
    }

    /**
     * @param nroHijos the nroHijos to set
     */
    public void setNroHijos(int nroHijos) {
        this.nroHijos = nroHijos;
    }

    /**
     * @return the estadoCivil
     */
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
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
