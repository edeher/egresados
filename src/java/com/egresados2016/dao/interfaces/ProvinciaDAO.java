/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Provincia;

/**
 *
 * @author Mi Laptop
 */
public interface ProvinciaDAO {
    public Provincia crear(Provincia objPro)throws DAOException;
    public Provincia modificar (Provincia objPro)throws DAOException;
    public Provincia leerxid(Provincia objPro)throws DAOException;
    public Provincia []leertodo()throws DAOException;
    public boolean eliminar (Provincia objPro)throws DAOException;
    public boolean destruir(Provincia objPro)throws DAOException;
}
