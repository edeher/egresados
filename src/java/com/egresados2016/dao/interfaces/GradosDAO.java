/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Grados;

/**
 *
 * @author Mi Laptop
 */
public interface GradosDAO {
    public Grados crear(Grados objGr)throws DAOException;
    public Grados modificar (Grados objGr)throws DAOException;
    public Grados leerxid(Grados objGr)throws DAOException;
    public Grados []leertodo()throws DAOException;
    public boolean eliminar (Grados objGr)throws DAOException;
    public boolean destruir(Grados objGr)throws DAOException;
}
