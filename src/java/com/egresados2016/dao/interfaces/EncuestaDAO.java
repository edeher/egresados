/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Encuesta;

/**
 *
 * @author Mi Laptop
 */
public interface EncuestaDAO {
    
    public Encuesta crear(Encuesta objEncu)throws DAOException;
    public Encuesta modificar (Encuesta objEncu) throws DAOException;
    public Encuesta leerxid(Encuesta objEncu)throws DAOException;
    public Encuesta [] leertodo () throws DAOException;
    public boolean elimnarr(Encuesta objEncu)throws DAOException;
    public boolean destruir (Encuesta objEncu) throws DAOException;
}
