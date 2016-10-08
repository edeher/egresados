/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.DistritoDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
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
public class DistritoDAOJDBC implements DistritoDAO{
    private final Connection con;

    public DistritoDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Distrito crear(Distrito objDi) throws DAOException {
     try{
        CallableStatement st=con.prepareCall("{call sp_distrito_n(?,?)}");
                            st.setInt(1, objDi.getProvincia().getIdProvincia());
                            st.setString(2,objDi.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Distrito  (
                            rs.getInt("idDistrito"),
                            new Provincia(
                                   rs.getInt("idProvincia"),
                                     new Departamento(
                                           rs.getInt("idDepartamento"),

                                           rs.getString("descripcion1"),

                                           Estados.valueOf( rs.getString("estado1"))
                            ),

                                   rs.getString("descripcion2"),

                                   Estados.valueOf( rs.getString("estado2"))
                            ),
                     rs.getString("descripcion"),
                     Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando distrito en DAO", se);
        }   
    }

    @Override
    public Distrito modificar(Distrito objDi) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_distrito_m(?,?,?)}");
                            st.setInt(1, objDi.getIdDistrito());
                            st.setInt(2, objDi.getProvincia().getIdProvincia());
                            st.setString(3,objDi.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Distrito  (
                            rs.getInt("idDistrito"),
                            new Provincia(
                                   rs.getInt("idProvincia"),
                                     new Departamento(
                                           rs.getInt("idDepartamento"),

                                           rs.getString("descripcion1"),

                                           Estados.valueOf( rs.getString("estado1"))
                            ),

                                   rs.getString("descripcion2"),

                                   Estados.valueOf( rs.getString("estado2"))
                            ),
                     rs.getString("descripcion"),
                     Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando distrito en DAO", se);
        }   
    }

    @Override
    public Distrito leerxid(Distrito objDi) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_distrito_bco(?)}");
                            st.setInt(1, objDi.getIdDistrito());
                            
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Distrito  (
                            rs.getInt("idDistrito"),
                            new Provincia(
                                   rs.getInt("idProvincia"),
                                     new Departamento(
                                           rs.getInt("idDepartamento"),

                                           rs.getString("descripcion1"),

                                           Estados.valueOf( rs.getString("estado1"))
                            ),

                                   rs.getString("descripcion2"),

                                   Estados.valueOf( rs.getString("estado2"))
                            ),
                     rs.getString("descripcion"),
                     Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error leyendo distrito en DAO", se);
        }   
    }

    @Override
    public Distrito[] leertodo() throws DAOException {
      try  {
             CallableStatement st=con.prepareCall("{call sp_distrito_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Distrito> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Distrito  (
                            rs.getInt("idDistrito"),
                            new Provincia(
                                   rs.getInt("idProvincia"),
                                     new Departamento(
                                           rs.getInt("idDepartamento"),

                                           rs.getString("descripcion1"),

                                           Estados.valueOf( rs.getString("estado1"))
                            ),

                                   rs.getString("descripcion2"),

                                   Estados.valueOf( rs.getString("estado2"))
                            ),
                     rs.getString("descripcion"),
                     Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
            }
            return tribs.toArray(new Distrito[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las distritos en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Distrito objDi) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_distrito_e1(?) }");
            
            st.setInt(1,objDi.getIdDistrito());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando distrito");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  distrito en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Distrito objDi) throws DAOException {
     try  {
	           CallableStatement st=con.prepareCall("{call sp_distrito_e(?) }");
            
            st.setInt(1,objDi.getIdDistrito());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo distrito");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  distrito en DAO", se);
        }
        return true; 
    }

    @Override
    public Distrito[] leertodoxprovincia(Distrito objDi) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_distrito_bcoxprovincia(?)}");
                        st.setInt(1, objDi.getProvincia().getIdProvincia());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Distrito> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Distrito  (
                            rs.getInt("idDistrito"),
                            new Provincia(
                                   rs.getInt("idProvincia"),
                                     new Departamento(
                                           rs.getInt("idDepartamento"),

                                           rs.getString("descripcion1"),

                                           Estados.valueOf( rs.getString("estado1"))
                            ),

                                   rs.getString("descripcion2"),

                                   Estados.valueOf( rs.getString("estado2"))
                            ),
                     rs.getString("descripcion"),
                     Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
            }
            return tribs.toArray(new Distrito[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las distritos en DAO: " 
                    + se.getMessage(), se);
        }  
    }
    
    
}
