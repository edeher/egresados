/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.PreguntaEgresado;

/**
 *
 * @author Mi Laptop
 */
public interface PreguntaEgresadoDAO {
    public  PreguntaEgresado crear( PreguntaEgresado objPreE) throws DAOException;//asocia la excepcion para usar las ecepciones
    public  PreguntaEgresado  modificar( PreguntaEgresado objPreE)throws DAOException;
    public  PreguntaEgresado leerxid ( PreguntaEgresado objPreE)throws DAOException;
    public  PreguntaEgresado[] leertodo()throws DAOException;
    public  PreguntaEgresado[] leertodoxidEgresado(PreguntaEgresado objPreE)throws DAOException;
    public  PreguntaEgresado[] leertodoxidPregunta( PreguntaEgresado objPreE)throws DAOException;
    public  PreguntaEgresado[] leertodoxidRespuesta( PreguntaEgresado objPreE)throws DAOException;
    public boolean eliminar( PreguntaEgresado objPreE)throws DAOException;
    public boolean destruir( PreguntaEgresado objPreE)throws DAOException;
}
