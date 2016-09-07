/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Respuesta;

/**
 *
 * @author Mi Laptop
 */
public interface RespuestaDAO {
       public Respuesta crear(Respuesta objRe)throws DAOException;
    public Respuesta modificar (Respuesta objRe)throws DAOException;
    public Respuesta leerxid(Respuesta objRe)throws DAOException;
    public Respuesta []leertodo()throws DAOException;
    public boolean eliminar (Respuesta objRe)throws DAOException;
    public boolean destruir(Respuesta objRe)throws DAOException;
}
