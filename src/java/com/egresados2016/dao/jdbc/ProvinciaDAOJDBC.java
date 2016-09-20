/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.ProvinciaDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Provincia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class ProvinciaDAOJDBC implements ProvinciaDAO{
private final Connection con;

    public ProvinciaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Provincia crear(Provincia objPro) throws DAOException {
    try{
        CallableStatement st=con.prepareCall("{call sp_provincia_n(?,?)}");
                            st.setInt(1, objPro.getDepartamento().getIdDepartamento());
                            st.setString(2,objPro.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Provincia(
                            rs.getInt("idProvincia"),
                              new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion1"),
                           
                            Estados.valueOf( rs.getString("estado1"))
                     ),
                            
                            rs.getString("descripcion"),
                           
                            Estados.valueOf( rs.getString("estado"))
                     ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando provincia en DAO", se);
        }   
    }

    @Override
    public Provincia modificar(Provincia objPro) throws DAOException {
    try{
        CallableStatement st=con.prepareCall("{call sp_provincia_m(?,?,?)}");
                             st.setInt(1, objPro.getIdProvincia());
                            st.setInt(2, objPro.getDepartamento().getIdDepartamento());
                            st.setString(3,objPro.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Provincia(
                            rs.getInt("idProvincia"),
                              new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion1"),
                           
                            Estados.valueOf( rs.getString("estado1"))
                     ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     )
                          
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando provincia en DAO", se);
        }    
    }

    @Override
    public Provincia leerxid(Provincia objPro) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_provincia_bco(?)}");
                             st.setInt(1, objPro.getIdProvincia());
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Provincia(
                            rs.getInt("idProvincia"),
                              new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion1"),
                           
                            Estados.valueOf( rs.getString("estado1"))
                     ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     )                          
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando provincia en DAO", se);
        }    
    }

    @Override
    public Provincia[] leertodo() throws DAOException {
        try  {
             CallableStatement st=con.prepareCall("{call sp_provincia_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Provincia> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                    new Provincia(
                            rs.getInt("idProvincia"),
                              new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion1"),
                           
                            Estados.valueOf( rs.getString("estado1"))
                     ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     ) 
                     );
            }
            return tribs.toArray(new Provincia[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las provincias en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Provincia objPro) throws DAOException {
     try  {
	           CallableStatement st=con.prepareCall("{call sp_provincia_e1(?) }");
            
            st.setInt(1,objPro.getIdProvincia());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando provincia");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  provincia en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Provincia objPro) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_provincia_e(?) }");
            
            st.setInt(1,objPro.getIdProvincia());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo provincia");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  provincia en DAO", se);
        }
        return true; 
    }
    
}
