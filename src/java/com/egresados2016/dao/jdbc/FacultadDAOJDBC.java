/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;


import com.egresados2016.dao.interfaces.FacultadDAO;
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
public class FacultadDAOJDBC implements FacultadDAO{
private final Connection con;

    public FacultadDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Facultad crear(Facultad objFa) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_facultad_n(?)}");
                            
                            st.setString(1,objFa.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando facultad en DAO", se);
        }   
    }

    @Override
    public Facultad modificar(Facultad objFa) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_facultad_m(?,?)}");
                             st.setInt(1,objFa.getIdFacultad() );
                            st.setString(2,objFa.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando facultad en DAO", se);
        }   
    }

    @Override
    public Facultad leerxid(Facultad objFa) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_facultad_bco(?)}");
                             st.setInt(1,objFa.getIdFacultad() );
                            
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando facultad en DAO", se);
        }   
    }

    @Override
    public Facultad[] leertodo() throws DAOException {
      try  {
             CallableStatement st=con.prepareCall("{call sp_facultad_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Facultad> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Facultad  (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   );
            }
            return tribs.toArray(new Facultad[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las facultades en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Facultad objFa) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_facultad_e1(?) }");
            
            st.setInt(1,objFa.getIdFacultad());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando facultad");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  facultad en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Facultad objFa) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_facultad_e(?) }");
            
            st.setInt(1,objFa.getIdFacultad());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo facultad");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  facultad en DAO", se);
        }
        return true; 
    }

    
}
