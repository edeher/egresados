/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.RespuestaDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Respuesta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class RespuestaDAOJDBC implements RespuestaDAO{
private final Connection con;

    public RespuestaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Respuesta crear(Respuesta objRe) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_respuesta_n(?)}");
                            
                            st.setString(1,objRe.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando respuesta en DAO", se);
        }   
    }

    @Override
    public Respuesta modificar(Respuesta objRe) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_respuesta_m(?,?)}");
                            
                            st.setInt(1,objRe.getIdRespuesta() );
                            st.setString(2,objRe.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando respuesta en DAO", se);
        }   
    }

    @Override
    public Respuesta leerxid(Respuesta objRe) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_respuesta_bco(?)}");
                            
                            st.setInt(1,objRe.getIdRespuesta() );
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando respuesta en DAO", se);
        }   
    }

    @Override
    public Respuesta[] leertodo() throws DAOException {
        try  {
             CallableStatement st=con.prepareCall("{call sp_respuesta_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Respuesta> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                    );
            }
            return tribs.toArray(new Respuesta[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las respuestas en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Respuesta objRe) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_respuesta_e1(?) }");
            
            st.setInt(1,objRe.getIdRespuesta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando respuesta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  respuesta en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Respuesta objRe) throws DAOException {
         try  {
	           CallableStatement st=con.prepareCall("{call sp_respuesta_e(?) }");
            
            st.setInt(1,objRe.getIdRespuesta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo respuesta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  respuesta en DAO", se);
        }
        return true; 
    }
    
}
