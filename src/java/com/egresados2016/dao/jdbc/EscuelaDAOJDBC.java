/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.EscuelaDAO;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Facultad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Mi Laptop
 */
public class EscuelaDAOJDBC implements EscuelaDAO{
private final Connection con;

    public EscuelaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Escuela crear(Escuela objEs) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_escuela_n(?,?)}");
                            st.setInt(1,objEs.getFacultad().getIdFacultad() );
                            st.setString(2,objEs.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado"))
                   )
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando escuela en DAO", se);
        }   
    }

    @Override
    public Escuela modificar(Escuela objEs) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_escuela_m(?,?,?)}");
                             st.setInt(1,objEs.getIdEscuela() );
                            st.setInt(2,objEs.getFacultad().getIdFacultad() );
                            st.setString(3,objEs.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado"))
                   )
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando escuela en DAO", se);
        }   
    }

    @Override
    public Escuela leerxid(Escuela objEs) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_escuela_bco(?)}");
                             st.setInt(1,objEs.getIdEscuela() );
                          
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado"))
                   )
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando escuela en DAO", se);
        }   
    }

    @Override
    public Escuela[] leertodo() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_escuela_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Escuela> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Escuela(
                           rs.getInt("idEscuela"),
                            new Facultad (
                                rs.getInt("idFacultad"),
                                rs.getString("descripcion1"),
                                Estados.valueOf(rs.getString("estado1"))
                   
                             ),
                        rs.getString("descripcion"),
                        Estados.valueOf(rs.getString("estado"))
                   )
                   
                   );
            }
            return tribs.toArray(new Escuela[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las escuelas en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public Escuela[] leertodo(Escuela objEs) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_escuela_bcoxidFacultad(?)}");
                                 st.setInt(1,objEs.getFacultad().getIdFacultad() );
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Escuela> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Escuela(
                           rs.getInt("idEscuela"),
                            new Facultad (
                                rs.getInt("idFacultad"),
                                rs.getString("descripcion1"),
                                Estados.valueOf(rs.getString("estado1"))
                   
                             ),
                        rs.getString("descripcion"),
                        Estados.valueOf(rs.getString("estado"))
                   )
                   
                   );
            }
            return tribs.toArray(new Escuela[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las escuelas en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Escuela objEs) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_escuela_e1(?) }");
            
            st.setInt(1,objEs.getIdEscuela());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando escuela");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  escuela en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Escuela objEs) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_escuela_e(?) }");
            
            st.setInt(1,objEs.getIdEscuela());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo escuela");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  escuela en DAO", se);
        }
        return true; 
    }

}
