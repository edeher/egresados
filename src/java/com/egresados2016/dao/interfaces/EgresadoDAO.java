/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Egresado;

/**
 *
 * @author Mi Laptop
 */
public interface EgresadoDAO {
    public Egresado crear(Egresado objE)throws DAOException;
    public Egresado modificar (Egresado objE)throws DAOException;
    public Egresado leerxid(Egresado objE)throws DAOException;
    public Egresado leerxDni(Egresado objE)throws DAOException;
    public Egresado []leertodo()throws DAOException;
    public Egresado []egresados_sin_encuestar()throws DAOException;
    public boolean eliminar (Egresado objE)throws DAOException;
    public boolean destruir(Egresado objE)throws DAOException;
}
