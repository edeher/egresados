/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.GradosDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.modelo.Facultad;
import com.egresados2016.modelo.Grados;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class GradosDAOJDBC implements GradosDAO{
   private final Connection con;

    public GradosDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Grados crear(Grados objGr) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_grados_n(?,?)}");
                            st.setInt(1, objGr.getEscuela().getIdEscuela());
                            st.setString(2,objGr.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion1"),
                                    Estados.valueOf(rs.getString("estado1"))
                                ),
                            rs.getString("descripcion2"),
                            Estados.valueOf(rs.getString("estado2"))
                            ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando grados en DAO", se);
        }   
    }

    @Override
    public Grados modificar(Grados objGr) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_grados_m(?,?,?)}");
                            st.setInt(1, objGr.getIdGrados());
                            st.setInt(2, objGr.getEscuela().getIdEscuela());
                            st.setString(3,objGr.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion1"),
                                    Estados.valueOf(rs.getString("estado1"))
                                ),
                            rs.getString("descripcion2"),
                            Estados.valueOf(rs.getString("estado2"))
                            ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando grados en DAO", se);
        }   
    }

    @Override
    public Grados leerxid(Grados objGr) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_grados_bco(?)}");
                            st.setInt(1, objGr.getIdGrados());
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                        
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion1"),
                                    Estados.valueOf(rs.getString("estado1"))
                                ),
                            rs.getString("descripcion2"),
                            Estados.valueOf(rs.getString("estado2"))
                            ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando grados en DAO", se);
        }   
    }

    @Override
    public Grados[] leertodo() throws DAOException {
        try  {
             CallableStatement st=con.prepareCall("{call sp_grados_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Grados> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion1"),
                                    Estados.valueOf(rs.getString("estado1"))
                                ),
                            rs.getString("descripcion2"),
                            Estados.valueOf(rs.getString("estado2"))
                            ),
                            rs.getString("descripcion"),
                            Estados.valueOf( rs.getString("estado"))
                     ));
            }
            return tribs.toArray(new Grados[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los grados en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Grados objGr) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_grados_e1(?) }");
            
            st.setInt(1,objGr.getIdGrados());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando grados");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  grados en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Grados objGr) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_grados_e(?) }");
            
            st.setInt(1,objGr.getIdGrados());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo grados");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo grados en DAO", se);
        }
        return true; 
    }
    
}
