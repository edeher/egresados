/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Distrito;

/**
 *
 * @author Mi Laptop
 */
public interface DistritoDAO {
    public Distrito crear(Distrito objDi)throws DAOException;
    public Distrito modificar (Distrito objDi)throws DAOException;
    public Distrito leerxid(Distrito objDi)throws DAOException;
    public Distrito []leertodo()throws DAOException;
    public boolean eliminar (Distrito objDi)throws DAOException;
    public boolean destruir(Distrito objDi)throws DAOException;
}
