/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Pregunta;

/**
 *
 * @author Mi Laptop
 */
public interface PreguntaDAO {
     public Pregunta crear(Pregunta objPr)throws DAOException;
    public Pregunta modificar (Pregunta objPr)throws DAOException;
    public Pregunta leerxid(Pregunta objPr)throws DAOException;
    public Pregunta []leertodo()throws DAOException;
    public boolean eliminar (Pregunta objPr)throws DAOException;
    public boolean destruir(Pregunta objPr)throws DAOException;
}
