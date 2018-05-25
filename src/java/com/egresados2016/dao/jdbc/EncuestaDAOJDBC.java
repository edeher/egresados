/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.EncuestaDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Encuesta;
import com.egresados2016.modelo.Facultad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class EncuestaDAOJDBC implements EncuestaDAO{
private final Connection con;

    public EncuestaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Encuesta crear(Encuesta objEncu) throws DAOException {
          try{
        CallableStatement st=con.prepareCall("{call sp_encuesta_n(?)}");
                            
                            st.setString(1,objEncu.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Encuesta (
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando encuesta en DAO", se);
        }   
    }

    @Override
    public Encuesta modificar(Encuesta objEncu) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_encuesta_m(?,?)}");
                             st.setInt(1,objEncu.getIdEncuesta() );
                            st.setString(2,objEncu.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Encuesta (
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando encuesta en DAO", se);
        }   
    }

    @Override
    public Encuesta leerxid(Encuesta objEncu) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_encuesta_bco(?)}");
                             st.setInt(1,objEncu.getIdEncuesta() );
                            
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Encuesta (
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando encuesta en DAO", se);
        }   
    }

    @Override
    public Encuesta[] leertodo() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_encuesta_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Encuesta> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Encuesta  (
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   );
            }
            return tribs.toArray(new Encuesta[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las Encuestas en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean elimnarr(Encuesta objEncu) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_encuesta_e1(?) }");
            
            st.setInt(1,objEncu.getIdEncuesta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando encuesta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  encuesta en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Encuesta objEncu) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_encuesta_e(?) }");
            
            st.setInt(1,objEncu.getIdEncuesta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo encuesta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  encuesta en DAO", se);
        }
        return true; 
    }
    
}
