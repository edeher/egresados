/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.EstudiosDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Estudios;
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
public class EstudiosDAOJDBC implements EstudiosDAO{
        private final Connection con;
        public EstudiosDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Estudios crear(Estudios objEs) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_estudios_n(?,?,?,?,?,?,?,?,?)}");
                              
                              st.setInt(1,objEs.getEgresado().getIdEgresado());
                              st.setString(2, objEs.getMencion() );
                              st.setString(3, objEs.getInstitucion());
                              st.setDate(4, new java.sql.Date(objEs.getFechaInicio().getTime()));
                              st.setDate(5, new java.sql.Date(objEs.getFechaFin().getTime()));
                              st.setString(6, objEs.getDuraAcademica());
                              st.setString(7, objEs.getCantidad());
                              st.setString(8, objEs.getPais());
                              st.setString(9, objEs.getFinanciamiento());
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Estudios(  
                   rs.getInt("idEstudios"),
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
                            rs.getDate("fechaIngreso"),
                            rs.getDate("fechaEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
           rs.getString("mencion"),
            rs.getString("institucion"),              
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("duracionAcademica"),
           rs.getString("cantidad"),
           rs.getString("pais"),
           rs.getString("financiamiento"),
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando estudios en DAO", se);
        }   
    }

   

    @Override
    public Estudios leerxid(Estudios objEs) throws DAOException {
          try{
        CallableStatement st=con.prepareCall("{call sp_estudios_bco(?)}");
                              
                               st.setInt(1,objEs.getIdEstudios());
                             
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Estudios(  
                   rs.getInt("idEstudios"),
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
                            rs.getDate("fechaIngreso"),
                            rs.getDate("fechaEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
           rs.getString("mencion"),
            rs.getString("institucion"),              
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("duracionAcademica"),
           rs.getString("cantidad"),
           rs.getString("pais"),
           rs.getString("financiamiento"),
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando estudios en DAO", se);
        }   
    }

    @Override
    public Estudios[] leertodo() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_estudios_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Estudios> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new Estudios(  
                   rs.getInt("idEstudios"),
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
                            rs.getDate("fechaIngreso"),
                            rs.getDate("fechaEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
           rs.getString("mencion"),
            rs.getString("institucion"),              
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("duracionAcademica"),
           rs.getString("cantidad"),
           rs.getString("pais"),
           rs.getString("financiamiento"),
           Estados.valueOf(rs.getString("estado"))
                 ));
            }
            return tribs.toArray(new Estudios[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los estudios en DAO: " 
                    + se.getMessage(), se);
        }  
    }
    @Override
    public Estudios[] leertodoxidEgresado(Estudios objEs) throws DAOException {
      try  {
             CallableStatement st=con.prepareCall("{call sp_estudios_bcoxidegresado(?)}");
            st.setInt(1,objEs.getEgresado().getIdEgresado());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Estudios> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new Estudios(  
                   rs.getInt("idEstudios"),
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
                            rs.getDate("fechaIngreso"),
                            rs.getDate("fechaEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
           rs.getString("mencion"),
            rs.getString("institucion"),              
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("duracionAcademica"),
           rs.getString("cantidad"),
           rs.getString("pais"),
           rs.getString("financiamiento"),
           Estados.valueOf(rs.getString("estado"))
                 ));
            }
            return tribs.toArray(new Estudios[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los estudios en DAO: " 
                    + se.getMessage(), se);
        }  
    }
    @Override
    public boolean eliminar(Estudios objEs) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_estudios_e1(?) }");
            
            st.setInt(1,objEs.getIdEstudios());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando estudios");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  estudios en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Estudios objEs) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_estudios_e(?) }");
            
            st.setInt(1,objEs.getIdEstudios());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error detruyendo estudios");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo estudios en DAO", se);
        }
        return true; 
    }

    @Override
    public Estudios modificar(Estudios objEs) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_estudios_m(?,?,?,?,?,?,?,?,?,?)}");
                              st.setInt(1, objEs.getIdEstudios());
                              st.setInt(2,objEs.getEgresado().getIdEgresado());
                              st.setString(3, objEs.getMencion() );
                              st.setString(4, objEs.getInstitucion());
                              st.setDate(5, new java.sql.Date(objEs.getFechaInicio().getTime()));
                              st.setDate(6, new java.sql.Date(objEs.getFechaFin().getTime()));
                              st.setString(7, objEs.getDuraAcademica());
                              st.setString(8, objEs.getCantidad());
                              st.setString(9, objEs.getPais());
                              st.setString(10, objEs.getFinanciamiento());
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Estudios(  
                   rs.getInt("idEstudios"),
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
                            rs.getDate("fechaIngreso"),
                            rs.getDate("fechaEgreso"),
                            rs.getInt("nroHijos"),
                            EstadoCivil.valueOf(rs.getString("estadoCivil")),
                            Estados.valueOf(rs.getString("estado10"))
                   
                             ),
           rs.getString("mencion"),
            rs.getString("institucion"),              
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("duracionAcademica"),
           rs.getString("cantidad"),
           rs.getString("pais"),
           rs.getString("financiamiento"),
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando estudios en DAO", se);
        }   
    }

    
    
}
