/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.GradoEgresado;


/**
 *
 * @author Mi Laptop
 */
public interface GradoEgresadoDAO {
     public GradoEgresado crear( GradoEgresado objGraE) throws DAOException;//asocia la excepcion para usar las ecepciones
    public GradoEgresado  modificar(GradoEgresado objGraE)throws DAOException;
    public GradoEgresado leerxid (GradoEgresado objGraE)throws DAOException;
    public GradoEgresado leerxidXids(GradoEgresado objGraE)throws DAOException;
    public GradoEgresado[] leertodo()throws DAOException;
    public GradoEgresado[] leertodoxgrados(GradoEgresado objGraE)throws DAOException;
     public GradoEgresado[] leertodoxegresados(GradoEgresado objGraE)throws DAOException;
    public boolean eliminar(GradoEgresado objGraE)throws DAOException;
    public boolean destruir(GradoEgresado objGraE)throws DAOException;
}
