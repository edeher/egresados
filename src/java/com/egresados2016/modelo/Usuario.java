/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoUsuario;

/**
 *
 * @author Mi Laptop
 */
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contrasena;
    private TipoUsuario tipoUsuario;
    private Estados estado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String contrasena, TipoUsuario tipoUsuario, Estados estado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", contrasena=" + contrasena + ", tipoUsuario=" + tipoUsuario + ", estado=" + estado + '}';
    }
    
    
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    
    
}
