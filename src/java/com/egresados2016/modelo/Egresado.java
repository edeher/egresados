/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Sexo;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.EstadoCivil;
import java.util.Date;

/**
 *
 * @author Mi Laptop
 */
public class Egresado {
     private int idEgresado;
     private Distrito DistritoNacimiento;
     private Distrito DistritoResidencia;
     private String nombres;
     private String apellidos;
     private Date fechaNac;
     private int edad;
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
        this.DistritoNacimiento= new Distrito();
        this.DistritoResidencia=new Distrito();
    }

    public Egresado(int idEgresado, Distrito DistritoNacimiento, Distrito DistritoResidencia, String nombres, String apellidos, Date fechaNac, int edad, String dni, Sexo sexo, String direccion, String telefono1, String telefono2, String correro, Date fechaIngreso, Date fechaEgreso, int nroHijos, EstadoCivil estadoCivil, Estados estado) {
        this.idEgresado = idEgresado;
        this.DistritoNacimiento = DistritoNacimiento;
        this.DistritoResidencia = DistritoResidencia;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.edad = edad;
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
        return "Egresado{" + "idEgresado=" + idEgresado + ", DistritoNacimiento=" + DistritoNacimiento + ", DistritoResidencia=" + DistritoResidencia + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo.getNom() + ", direccion=" + direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correro=" + correro + ", fechaIngreso=" + fechaIngreso + ", fechaEgreso=" + fechaEgreso + ", nroHijos=" + nroHijos + ", estadoCivil=" + estadoCivil.getNom() + ", estado=" + estado + '}';
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
     * @return the DistritoNacimiento
     */
    public Distrito getDistritoNacimiento() {
        return DistritoNacimiento;
    }

    /**
     * @param DistritoNacimiento the DistritoNacimiento to set
     */
    public void setDistritoNacimiento(Distrito DistritoNacimiento) {
        this.DistritoNacimiento = DistritoNacimiento;
    }

    /**
     * @return the DistritoResidencia
     */
    public Distrito getDistritoResidencia() {
        return DistritoResidencia;
    }

    /**
     * @param DistritoResidencia the DistritoResidencia to set
     */
    public void setDistritoResidencia(Distrito DistritoResidencia) {
        this.DistritoResidencia = DistritoResidencia;
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

    /**
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
