/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Trabajos;

/**
 *
 * @author Mi Laptop
 */
public interface TrabajosDAO {
     public Trabajos crear(Trabajos objTra)throws DAOException;
    public Trabajos modificar (Trabajos objTra)throws DAOException;
    public Trabajos leerxid(Trabajos objTra)throws DAOException;
    public Trabajos []leertodo()throws DAOException;
    public boolean eliminar (Trabajos objTra)throws DAOException;
    public boolean destruir(Trabajos objTra)throws DAOException;
}
