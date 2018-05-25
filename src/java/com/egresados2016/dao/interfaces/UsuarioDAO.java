/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Usuario;

/**
 *
 * @author Mi Laptop
 */
public interface UsuarioDAO {
    
    public Usuario crear(Usuario objUsu)throws DAOException;
     public Usuario modcontrasena(Usuario objUsu,String contrasenanew)throws DAOException;
      public Usuario leer(Usuario objUsu)throws DAOException;
      public Usuario validar (Usuario objUsu)throws DAOException;
    
}
