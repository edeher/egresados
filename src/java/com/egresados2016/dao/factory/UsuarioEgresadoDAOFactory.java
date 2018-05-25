/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.factory;

import com.egresados2016.dao.interfaces.UsuarioEgresadoDAO;
import com.egresados2016.dao.jdbc.UsuarioEgresadoDAOJDBC;


public class UsuarioEgresadoDAOFactory {
    public UsuarioEgresadoDAO metodoDAO()
    {
        return new UsuarioEgresadoDAOJDBC();
    }
}
