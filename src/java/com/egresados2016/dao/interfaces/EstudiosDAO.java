/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Estudios;

/**
 *
 * @author Mi Laptop
 */
public interface EstudiosDAO {
    public Estudios crear(Estudios objEs)throws DAOException;
    public Estudios modificar (Estudios objEs)throws DAOException;
    public Estudios leerxid(Estudios objEs)throws DAOException;
    public Estudios []leertodo()throws DAOException;
    public Estudios []leertodoxidEgresado(Estudios objEs)throws DAOException;
    public boolean eliminar (Estudios objEs)throws DAOException;
    public boolean destruir(Estudios objEs)throws DAOException;
}
