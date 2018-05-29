/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.EgresadoDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.modelo.Facultad;
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
public class EgresadoDAOJDBC implements EgresadoDAO{
private final Connection con;

    public EgresadoDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Egresado crear(Egresado objE) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_egresado_n(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                            
                             st.setInt(1,objE.getDistritoNacimiento().getIdDistrito() );
                             st.setInt(2,objE.getDistritoResidencia().getIdDistrito() );
                             st.setInt(3, objE.getEscuela().getIdEscuela());
                             st.setString(4,objE.getNombres() );
                              st.setString(5,objE.getApellidos() );
                              st.setDate(6,new java.sql.Date(objE.getFechaNac().getTime()) );
                              st.setString(7,objE.getDni() );
                              st.setString(8,objE.getSexo().name() );
                              st.setString(9,objE.getDireccion() );
                              st.setString(10,objE.getTelefono1() );
                              st.setString(11,objE.getTelefono2() );
                              st.setString(12,objE.getCorrero() );
                              st.setString(13,objE.getAnioIngreso());
                               st.setString(14,objE.getAnioEgreso());
                              st.setInt(15,objE.getNroHijos() );
                              st.setString(16,objE.getEstadoCivil().name() );
                              
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando egresado en DAO", se);
        }   
    }

    @Override
    public Egresado modificar(Egresado objE) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_egresado_m(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                                st.setInt(1,objE.getIdEgresado() );
                             st.setInt(2,objE.getDistritoNacimiento().getIdDistrito() );
                             st.setInt(3,objE.getDistritoResidencia().getIdDistrito() );
                              st.setInt(4, objE.getEscuela().getIdEscuela());
                             st.setString(5,objE.getNombres() );
                              st.setString(6,objE.getApellidos() );
                              st.setDate(7,new java.sql.Date(objE.getFechaNac().getTime() ));
                              st.setString(8,objE.getDni() );
                              st.setString(9,objE.getSexo().name() );
                              st.setString(10,objE.getDireccion() );
                              st.setString(11,objE.getTelefono1() );
                              st.setString(12,objE.getTelefono2() );
                              st.setString(13,objE.getCorrero() );
                               st.setString(14,objE.getAnioIngreso());
                               st.setString(15,objE.getAnioEgreso());
                              st.setInt(16,objE.getNroHijos() );
                              st.setString(17,objE.getEstadoCivil().name() );
                              
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando egresado en DAO", se);
        }   
    }

    @Override
    public Egresado leerxid(Egresado objE) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_egresado_bco(?)}");
                            
                             st.setInt(1,objE.getIdEgresado());
                              
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando egresado en DAO", se);
        }   
    }

    @Override
    public Egresado[] leertodo() throws DAOException {
      try  {
             CallableStatement st=con.prepareCall("{call sp_egresado_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Egresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
            }
            return tribs.toArray(new Egresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los egresados en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Egresado objE) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_egresado_e1(?) }");
            
            st.setInt(1,objE.getIdEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando egresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  egresado en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Egresado objE) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_egresado_e(?) }");
            
            st.setInt(1,objE.getIdEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo egresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  egresado en DAO", se);
        }
        return true; 
    }

    @Override
    public Egresado[] egresados_sin_encuestar() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_egresados_sin_encuestar()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Egresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
            }
            return tribs.toArray(new Egresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los egresados en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public Egresado leerxDni(Egresado objE) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_egresado_bcoxdni(?)}");
                            
                             st.setString(1,objE.getDni());
                              
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
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
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando egresado en DAO", se);
        }   
    }
    
}
