/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.DepartamentoDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.modelo.Departamento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class DepartamentoDAOJDBC implements DepartamentoDAO {
    private final Connection con;

    public DepartamentoDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Departamento crear(Departamento objDe) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_departamento_n(?)}");
                            st.setString(1,objDe.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                        
                     new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion"),
                           
                            Estados.valueOf( rs.getString("estado"))
                     )
                            
                            
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando departamento en DAO", se);
        }
      
    }

    @Override
    public Departamento modificar(Departamento objDe) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_departamento_m(?,?)}");
                            st.setInt(1, objDe.getIdDepartamento());
                            st.setString(2,objDe.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                        
                     new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion"),
                           
                            Estados.valueOf( rs.getString("estado"))
                     )
                            
                            
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificandodepartamento en DAO", se);
        }
    }

    @Override
    public Departamento leerxid(Departamento objDe) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_departamento_bco(?)}");
                            st.setInt(1, objDe.getIdDepartamento());
        ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
        return (
                        
                     new Departamento(
                            rs.getInt("idDepartamento"),
                            
                            rs.getString("descripcion"),
                           
                            Estados.valueOf( rs.getString("estado"))
                     )
                            
                            
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando departamento en DAO", se);
        }
    }

    @Override
    public Departamento[] leertodo() throws DAOException {
        try  {
             CallableStatement st=con.prepareCall("{call sp_departamento_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Departamento> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                    new Departamento(
                            rs.getInt("idDepartamento"),
                           
                            rs.getString("descripcion"),
                            
                            Estados.valueOf(rs.getString("estado")))
                     );
            }
            return tribs.toArray(new Departamento[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los departamentos en DAO: " 
                    + se.getMessage(), se);
        }   
        
        
    }

    @Override
    public boolean eliminar(Departamento objDe) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_departamento_e1(?) }");
            
            st.setInt(1,objDe.getIdDepartamento());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando departamento");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  departamento en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Departamento objDe) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_departamento_e(?) }");
            
            st.setInt(1,objDe.getIdDepartamento());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo departamento");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  departamento en DAO", se);
        }
        return true; 
    }

   
    
}
