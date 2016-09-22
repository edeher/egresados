/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.TrabajosDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.enums.TipoContrato;
import com.egresados2016.enums.TipoJornada;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Estudios;
import com.egresados2016.modelo.Provincia;
import com.egresados2016.modelo.Trabajos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class TrabajosDAOJDBC implements TrabajosDAO{
  private final Connection con;
        public TrabajosDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Trabajos crear(Trabajos objTra) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_trabajos_n(?,?,?,?,?,?,?,?)}");
                              
                              st.setInt(1,objTra.getEgresado().getIdEgresado());
                              st.setDate(2, new java.sql.Date(objTra.getFechaInicio().getTime()));
                              st.setDate(3, new java.sql.Date(objTra.getFechaFin().getTime()));
                              st.setString(4, objTra.getPuesto());
                              st.setString(5, objTra.getNomInstitucion());
                              st.setString(6, objTra.getTipocontrato().name());
                              st.setString(7, objTra.getSueldo());
                              st.setString(8, objTra.getTipojornada().name());
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Trabajos(  
                   rs.getInt("idTrabajos"),
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
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("puesto"),
           rs.getString("nomInstitucion"),
           TipoContrato.valueOf(rs.getString("tipoContrato")),
           rs.getString("sueldo"),
           TipoJornada.valueOf(rs.getString("tipoJornada")),              
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error creando trabajos en DAO", se);
        }   
    }

    @Override
    public Trabajos modificar(Trabajos objTra) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_trabajos_m(?,?,?,?,?,?,?,?,?)}");
                              
                              st.setInt(1,objTra.getIdTrabajos()); 
                              st.setInt(2,objTra.getEgresado().getIdEgresado());
                              st.setDate(3, new java.sql.Date(objTra.getFechaInicio().getTime()));
                              st.setDate(4, new java.sql.Date(objTra.getFechaFin().getTime()));
                              st.setString(5, objTra.getPuesto());
                              st.setString(6, objTra.getNomInstitucion());
                              st.setString(7, objTra.getTipocontrato().name());
                              st.setString(8, objTra.getSueldo());
                              st.setString(9, objTra.getTipojornada().name());
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Trabajos(  
                   rs.getInt("idTrabajos"),
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
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("puesto"),
           rs.getString("nomInstitucion"),
           TipoContrato.valueOf(rs.getString("tipoContrato")),
           rs.getString("sueldo"),
           TipoJornada.valueOf(rs.getString("tipoJornada")),              
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando trabajos en DAO", se);
        }   
    }

    @Override
    public Trabajos leerxid(Trabajos objTra) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_trabajos_bco(?)}");
                              
                              st.setInt(1,objTra.getIdTrabajos()); 
                             
                              
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                   
                   
                 new Trabajos(  
                   rs.getInt("idTrabajos"),
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
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("puesto"),
           rs.getString("nomInstitucion"),
           TipoContrato.valueOf(rs.getString("tipoContrato")),
           rs.getString("sueldo"),
           TipoJornada.valueOf(rs.getString("tipoJornada")),              
           Estados.valueOf(rs.getString("estado"))
                 ));
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando trabajos en DAO", se);
        }   
    }

    @Override
    public Trabajos[] leertodo() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_trabajos_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Trabajos> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                      new Trabajos(  
                   rs.getInt("idTrabajos"),
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
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("puesto"),
           rs.getString("nomInstitucion"),
           TipoContrato.valueOf(rs.getString("tipoContrato")),
           rs.getString("sueldo"),
           TipoJornada.valueOf(rs.getString("tipoJornada")),              
           Estados.valueOf(rs.getString("estado"))
                 ));
            }
            return tribs.toArray(new Trabajos[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los trabajos en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Trabajos objTra) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_trabajos_e1(?) }");
            
            st.setInt(1,objTra.getIdTrabajos());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando trabajo");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  trabajo en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Trabajos objTra) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_trabajos_e(?) }");
            
            st.setInt(1,objTra.getIdTrabajos());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo trabajo");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  trabajo en DAO", se);
        }
        return true; 
    }

    @Override
    public Trabajos[] leertodoxidEgresado(Trabajos objTra) throws DAOException {
         try  {
             CallableStatement st=con.prepareCall("{call sp_trabajos_bcoxidegresado(?)}");
            st.setInt(1,objTra.getEgresado().getIdEgresado());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Trabajos> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new Trabajos(  
                   rs.getInt("idTrabajos"),
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
           rs.getDate("fechaInicio"),
           rs.getDate("fechaFin"),
           rs.getString("puesto"),
           rs.getString("nomInstitucion"),
           TipoContrato.valueOf(rs.getString("tipoContrato")),
           rs.getString("sueldo"),
           TipoJornada.valueOf(rs.getString("tipoJornada")),              
           Estados.valueOf(rs.getString("estado"))
                 ));
            }
            return tribs.toArray(new Trabajos[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los trabajos en DAO: " 
                    + se.getMessage(), se);
        }  
    }
    
}
