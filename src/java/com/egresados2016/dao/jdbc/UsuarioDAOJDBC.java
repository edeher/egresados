/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.UsuarioDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoUsuario;
import com.egresados2016.modelo.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mi Laptop
 */
public class UsuarioDAOJDBC implements  UsuarioDAO{
private final Connection con;

    public UsuarioDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Usuario crear(Usuario objUsu) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_usuario_n(?,?,?)}");
                            
                            st.setString(1,objUsu.getUsuario() );
                             st.setString(2,objUsu.getContrasena() );
                              st.setString(3,objUsu.getTipoUsuario().name() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Usuario (
                            rs.getInt("idUsuario"),
                            rs.getString("usuario"),
                            null,
                            TipoUsuario.valueOf(rs.getString("tipoUsuario")),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando usuario en DAO", se);
        }   
    }

    @Override
    public Usuario modcontrasena(Usuario objUsu, String contrasenanew) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_usuario_modcontrasena(?,?,?,?,?)}");
                             st.setInt(1,objUsu.getIdUsuario() );
                            st.setString(2,objUsu.getUsuario() );
                             st.setString(3,objUsu.getContrasena() );
                             st.setString(4, contrasenanew);
                              st.setString(5,objUsu.getTipoUsuario().name() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Usuario (
                            rs.getInt("idUsuario"),
                            rs.getString("usuario"),
                            null,
                            TipoUsuario.valueOf(rs.getString("tipoUsuario")),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error cambiando contraseña usuario en DAO", se);
        }   
    }

    @Override
    public Usuario leer(Usuario objUsu) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_usuario_bco(?)}");
                            
                            st.setInt(1,objUsu.getIdUsuario() );
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Usuario (
                            rs.getInt("idUsuario"),
                            rs.getString("usuario"),
                            null,
                            TipoUsuario.valueOf(rs.getString("tipoUsuario")),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando usuario en DAO", se);
        }   
    }

    @Override
    public Usuario validar(Usuario objUsu) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_usuario_validar(?,?)}");
                            
                            st.setString(1,objUsu.getUsuario() );
                            st.setString(2, objUsu.getContrasena());
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Usuario (
                            rs.getInt("idUsuario"),
                            rs.getString("usuario"),
                            null,
                            TipoUsuario.valueOf(rs.getString("tipoUsuario")),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando usuario en DAO", se);
        }   
    }
    
}
