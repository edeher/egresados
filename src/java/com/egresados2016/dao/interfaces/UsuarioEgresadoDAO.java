/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.UsuarioEgresado;


public interface UsuarioEgresadoDAO {
    public UsuarioEgresado crear(UsuarioEgresado ogbjUsuEgre, String contrasenanew)throws DAOException;
    public UsuarioEgresado modcontraseña(UsuarioEgresado ObjUsuEgre, String contrasenanew,String contrasenanew1) throws DAOException;
    public UsuarioEgresado leerxid(UsuarioEgresado ogbjUsuEgre)throws DAOException;
    public UsuarioEgresado[]leertodo()throws DAOException;
    public UsuarioEgresado validar (UsuarioEgresado ogbjUsuEgre)throws DAOException;
    
    
}
