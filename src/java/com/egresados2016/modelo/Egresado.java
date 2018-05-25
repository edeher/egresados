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
     private Distrito DistritoNacimiento;
     private Distrito DistritoResidencia;
     private Escuela escuela;
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
     private String anioIngreso;
     private String anioEgreso;
     private int nroHijos;
     private EstadoCivil estadoCivil;
     private Estados estado;

    public Egresado() {
        this.DistritoNacimiento= new Distrito();
        this.DistritoResidencia=new Distrito();
        this.escuela=new Escuela();
    }

    public Egresado(int idEgresado, Distrito DistritoNacimiento, Distrito DistritoResidencia, Escuela escuela, String nombres, String apellidos, Date fechaNac, int edad, String dni, Sexo sexo, String direccion, String telefono1, String telefono2, String correro, String anioIngreso, String anioEgreso, int nroHijos, EstadoCivil estadoCivil, Estados estado) {
        this.idEgresado = idEgresado;
        this.DistritoNacimiento = DistritoNacimiento;
        this.DistritoResidencia = DistritoResidencia;
        this.escuela = escuela;
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
        this.anioIngreso = anioIngreso;
        this.anioEgreso = anioEgreso;
        this.nroHijos = nroHijos;
        this.estadoCivil = estadoCivil;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Egresado{" + "idEgresado=" + idEgresado + ", DistritoNacimiento=" + DistritoNacimiento + ", DistritoResidencia=" + DistritoResidencia + ", escuela=" + escuela + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", direccion=" + direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correro=" + correro + ", anioIngreso=" + anioIngreso + ", anioEgreso=" + anioEgreso + ", nroHijos=" + nroHijos + ", estadoCivil=" + estadoCivil + ", estado=" + estado + '}';
    }

     
     
    public int getIdEgresado() {
        return idEgresado;
    }

    public void setIdEgresado(int idEgresado) {
        this.idEgresado = idEgresado;
    }

    public Distrito getDistritoNacimiento() {
        return DistritoNacimiento;
    }

    public void setDistritoNacimiento(Distrito DistritoNacimiento) {
        this.DistritoNacimiento = DistritoNacimiento;
    }

    public Distrito getDistritoResidencia() {
        return DistritoResidencia;
    }

    public void setDistritoResidencia(Distrito DistritoResidencia) {
        this.DistritoResidencia = DistritoResidencia;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorrero() {
        return correro;
    }

    public void setCorrero(String correro) {
        this.correro = correro;
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(String anioEgreso) {
        this.anioEgreso = anioEgreso;
    }

    public int getNroHijos() {
        return nroHijos;
    }

    public void setNroHijos(int nroHijos) {
        this.nroHijos = nroHijos;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    
   

   
}
