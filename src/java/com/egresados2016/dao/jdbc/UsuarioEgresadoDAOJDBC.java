/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.UsuarioEgresadoDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.modelo.Facultad;
import com.egresados2016.modelo.Provincia;
import com.egresados2016.modelo.UsuarioEgresado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author i7
 */
public class UsuarioEgresadoDAOJDBC implements UsuarioEgresadoDAO{
    
    private final Connection con;
    public UsuarioEgresadoDAOJDBC(){
        this.con=DBManager.getConnection();
    }
    //metodos para cuentas de usuario de egresados, desde linux netbeans

    @Override
    public UsuarioEgresado crear(UsuarioEgresado ogbjUsuEgre) throws DAOException {
        try {
            
             CallableStatement st=con.prepareCall("{call sp_usuarioEgresado_n(?,?,?)}");
                             st.setInt(1,ogbjUsuEgre.getEgresado().getIdEgresado() );
                             st.setString(2,ogbjUsuEgre.getUsuario() );
                             st.setString(3,ogbjUsuEgre.getContrasena() );
                              
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new UsuarioEgresado (
                            rs.getInt("idUsuarioEgresado"),
                           new Egresado (
                            rs.getInt("idEgresado"),
                            new Distrito  (
                            rs.getInt("idDistritoNac"),
                            new Provincia(
                                   rs.getInt("idProvinciaNac"),
                                   new Departamento(
                                           rs.getInt("idDepartamentoNac"),

                                           rs.getString("departamentoNac"),

                                           Estados.valueOf( rs.getString("estado1"))
                                    ),
                                   rs.getString("provinciaNac"),
                                   Estados.valueOf( rs.getString("estado2"))
                                   ),
                            rs.getString("distritoNac"),
                            Estados.valueOf(rs.getString("estado3"))
                   
                             ),
                            new Distrito  (
                            rs.getInt("idDistritoRec"),
                            new Provincia(
                                   rs.getInt("idProvinciaRec"),
                                     new Departamento(
                                           rs.getInt("idDepartamentoRec"),

                                           rs.getString("departamentoRec"),

                                           Estados.valueOf( rs.getString("estado4"))
                                    ),

                                   rs.getString("provinciaRec"),

                                   Estados.valueOf( rs.getString("estado5"))
                                ),
                            rs.getString("distritoRec"),
                            Estados.valueOf(rs.getString("estado6"))
                   
                             ),
                             new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado0"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado00"))
                   ),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getDate("fechaNac"),
                            rs.getInt("edad"),
                            rs.getString("dni"),
                            Sexo.valueOf( rs.getString("sexo")),
                            rs.getString("direccion"),
                            rs.getString("telefono1"),
                            rs.getString("telefono2"),
                            rs.getString("correo"),
                           rs.getString("anioIngreso"),
                            rs.getString("anioEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
                            
                            rs.getString("usuario"),
                            null,
                            Estados.valueOf(rs.getString("estado"))
                             )
                   );
            
           
        } catch (Exception e) {
            throw  new DAOException("error creando usuario egresado",e);
        }
    }

    @Override
    public UsuarioEgresado modcontraseña(UsuarioEgresado ObjUsuEgre, String contrasenanew) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_usuarioEgresado_modcontrasena(?,?,?,?)}");
                             st.setInt(1,ObjUsuEgre.getIdUsuarioEgresado() );
                             st.setString(2,ObjUsuEgre.getUsuario() );
                             st.setString(3,ObjUsuEgre.getContrasena() );
                             st.setString(4, contrasenanew);
                             
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new UsuarioEgresado (
                            rs.getInt("idUsuarioEgresado"),
                           new Egresado (
                            rs.getInt("idEgresado"),
                            new Distrito  (
                            rs.getInt("idDistritoNac"),
                            new Provincia(
                                   rs.getInt("idProvinciaNac"),
                                   new Departamento(
                                           rs.getInt("idDepartamentoNac"),

                                           rs.getString("departamentoNac"),

                                           Estados.valueOf( rs.getString("estado1"))
                                    ),
                                   rs.getString("provinciaNac"),
                                   Estados.valueOf( rs.getString("estado2"))
                                   ),
                            rs.getString("distritoNac"),
                            Estados.valueOf(rs.getString("estado3"))
                   
                             ),
                            new Distrito  (
                            rs.getInt("idDistritoRec"),
                            new Provincia(
                                   rs.getInt("idProvinciaRec"),
                                     new Departamento(
                                           rs.getInt("idDepartamentoRec"),

                                           rs.getString("departamentoRec"),

                                           Estados.valueOf( rs.getString("estado4"))
                                    ),

                                   rs.getString("provinciaRec"),

                                   Estados.valueOf( rs.getString("estado5"))
                                ),
                            rs.getString("distritoRec"),
                            Estados.valueOf(rs.getString("estado6"))
                   
                             ),
                             new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado0"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado00"))
                   ),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getDate("fechaNac"),
                            rs.getInt("edad"),
                            rs.getString("dni"),
                            Sexo.valueOf( rs.getString("sexo")),
                            rs.getString("direccion"),
                            rs.getString("telefono1"),
                            rs.getString("telefono2"),
                            rs.getString("correo"),
                           rs.getString("anioIngreso"),
                            rs.getString("anioEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
                            
                            rs.getString("usuario"),
                            null,
                            Estados.valueOf(rs.getString("estado"))
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error cambiando contraseña usuario en DAO", se);
        }   
    
    }

    @Override
    public UsuarioEgresado leerxid(UsuarioEgresado ogbjUsuEgre) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_usuarioEgresado_bco(?)}");
                            
                            st.setInt(1,ogbjUsuEgre.getIdUsuarioEgresado() );
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new UsuarioEgresado (
                            rs.getInt("idUsuarioEgresado"),
                           new Egresado (
                            rs.getInt("idEgresado"),
                            new Distrito  (
                            rs.getInt("idDistritoNac"),
                            new Provincia(
                                   rs.getInt("idProvinciaNac"),
                                   new Departamento(
                                           rs.getInt("idDepartamentoNac"),

                                           rs.getString("departamentoNac"),

                                           Estados.valueOf( rs.getString("estado1"))
                                    ),
                                   rs.getString("provinciaNac"),
                                   Estados.valueOf( rs.getString("estado2"))
                                   ),
                            rs.getString("distritoNac"),
                            Estados.valueOf(rs.getString("estado3"))
                   
                             ),
                            new Distrito  (
                            rs.getInt("idDistritoRec"),
                            new Provincia(
                                   rs.getInt("idProvinciaRec"),
                                     new Departamento(
                                           rs.getInt("idDepartamentoRec"),

                                           rs.getString("departamentoRec"),

                                           Estados.valueOf( rs.getString("estado4"))
                                    ),

                                   rs.getString("provinciaRec"),

                                   Estados.valueOf( rs.getString("estado5"))
                                ),
                            rs.getString("distritoRec"),
                            Estados.valueOf(rs.getString("estado6"))
                   
                             ),
                             new Escuela(
                           rs.getInt("idEscuela"),
                    new Facultad (
                            rs.getInt("idFacultad"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado0"))
                   
                             ),
                    rs.getString("descripcion"),
                    Estados.valueOf(rs.getString("estado00"))
                   ),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getDate("fechaNac"),
                            rs.getInt("edad"),
                            rs.getString("dni"),
                            Sexo.valueOf( rs.getString("sexo")),
                            rs.getString("direccion"),
                            rs.getString("telefono1"),
                            rs.getString("telefono2"),
                            rs.getString("correo"),
                           rs.getString("anioIngreso"),
                            rs.getString("anioEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
                            
                            rs.getString("usuario"),
                            null,
                            Estados.valueOf(rs.getString("estado"))
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando usuario en DAO", se);
        } 
    }

    @Override
    public UsuarioEgresado[] leertodo() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioEgresado validar(UsuarioEgresado ogbjUsuEgre) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
