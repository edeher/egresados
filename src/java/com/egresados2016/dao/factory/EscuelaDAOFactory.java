/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.factory;

import com.egresados2016.dao.interfaces.EscuelaDAO;
import com.egresados2016.dao.jdbc.EscuelaDAOJDBC;

/**
 *
 * @author Mi Laptop
 */
public class EscuelaDAOFactory {
     public EscuelaDAO metodoDAO()
   {
    return new EscuelaDAOJDBC();
   }
}
