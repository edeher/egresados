
package com.egresados2016.modelo;

import com.egresados2016.enums.Estados;

public class UsuarioEgresado {
    
    private int idUsuarioEgresado;
    private Egresado egresado;
    private String usuario;
    private String contrasena;
    private Estados estado;

    public UsuarioEgresado() {
        this.egresado=new Egresado();
    }

    public UsuarioEgresado(int idUsuarioEgresado, Egresado egresado, String usuario, String contrasena, Estados estado) {
        this.idUsuarioEgresado = idUsuarioEgresado;
        this.egresado = egresado;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "UsuarioEgresado{" + "idUsuarioEgresado=" + idUsuarioEgresado + ", egresado=" + egresado + ", usuario=" + usuario + ", contrasena=" + contrasena + ", estado=" + estado + '}';
    }

    public int getIdUsuarioEgresado() {
        return idUsuarioEgresado;
    }

    public void setIdUsuarioEgresado(int idUsuarioEgresado) {
        this.idUsuarioEgresado = idUsuarioEgresado;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
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

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
