/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Facultad;



/**
 *
 * @author Mi Laptop
 */
public interface FacultadDAO {
     public Facultad crear(Facultad objFa)throws DAOException;
    public Facultad modificar (Facultad objFa)throws DAOException;
    public Facultad leerxid(Facultad objFa)throws DAOException;
    public Facultad []leertodo()throws DAOException;
    public boolean eliminar (Facultad objFa)throws DAOException;
    public boolean destruir(Facultad objFa)throws DAOException;
}
