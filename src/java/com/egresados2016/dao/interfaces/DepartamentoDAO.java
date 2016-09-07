/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Departamento;

/**
 *
 * @author Mi Laptop
 */
public interface DepartamentoDAO {
    
    public Departamento crear(Departamento objDe)throws DAOException;
    public Departamento modificar (Departamento objDe)throws DAOException;
    public Departamento leerxid(Departamento objDe)throws DAOException;
    public Departamento []leertodo()throws DAOException;
    public boolean eliminar (Departamento objDe)throws DAOException;
    public boolean destruir(Departamento objDe)throws DAOException;
}
