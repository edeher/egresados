/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.GradoEgresadoDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.modelo.Facultad;
import com.egresados2016.modelo.GradoEgresado;
import com.egresados2016.modelo.Grados;
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
public class GradoEgresadoDAOJDBC implements GradoEgresadoDAO{
private final Connection con;

    public GradoEgresadoDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public GradoEgresado crear(GradoEgresado objGraE) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_gradoegresado_n(?,?,?)}");
                            st.setInt(1, objGraE.getGrados().getIdGrados());
                            st.setInt(2,objGraE.getEgresado().getIdEgresado() );
                            st.setDate(3,new java.sql.Date(objGraE.getFecha().getTime()) );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando grados en DAO", se);
        }   
    }

    @Override
    public GradoEgresado modificar(GradoEgresado objGraE) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_gradoegresado_m(?,?,?,?)}");
                            st.setInt(1, objGraE.getIdGradoEgresado());
                            st.setInt(2, objGraE.getGrados().getIdGrados());
                            st.setInt(3,objGraE.getEgresado().getIdEgresado() );
                            st.setDate(4,new java.sql.Date(objGraE.getFecha().getTime()) );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificndo gradosegresados en DAO", se);
        }   
    }

    @Override
    public GradoEgresado leerxid(GradoEgresado objGraE) throws DAOException {
     try{
        CallableStatement st=con.prepareCall("{call sp_gradoegresado_bco(?)}");
                            st.setInt(1, objGraE.getIdGradoEgresado());
                          ;
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error leyendo grados egresados en DAO", se);
        }   
    }

    @Override
    public GradoEgresado[] leertodo() throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_gradoegresado_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<GradoEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new GradoEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los gradosegresados en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public GradoEgresado[] leertodoxgrados(GradoEgresado objGraE) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_gradoegresado_bcoxidGrados(?)}");
                            st.setInt(1, objGraE.getGrados().getIdGrados());
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<GradoEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new GradoEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los gradosegresados x idgrados en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public GradoEgresado[] leertodoxegresados(GradoEgresado objGraE) throws DAOException {
     try  {
             CallableStatement st=con.prepareCall("{call sp_gradoegresado_bcoxidEgresado(?)}");
                            st.setInt(1, objGraE.getEgresado().getIdEgresado());
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<GradoEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                     new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new GradoEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos los gradosegresados x idegresado en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(GradoEgresado objGraE) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_gradoegresado_e1(?) }");
            
            st.setInt(1,objGraE.getIdGradoEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando gradoegresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  gradoegresado en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(GradoEgresado objGraE) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_gradoegresado_e(?) }");
            
            st.setInt(1,objGraE.getIdGradoEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo gradoegresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  gradoegresado en DAO", se);
        }
        return true; 
    }
    
    @Override
    public GradoEgresado leerxidXids(GradoEgresado objGraE) throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_gradoegresado_bcoxidEgresado_idGrados(?,?)}");
                             st.setInt(1, objGraE.getIdGradoEgresado());
                                st.setInt(2, objGraE.getEgresado().getIdEgresado());
                           
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
}
           return (
                       new GradoEgresado(  
                               rs.getInt("idGradoEgresado"),
                     new Grados(
                            rs.getInt("idGrados"),
                            new Escuela(
                            rs.getInt("idEscuela"),
                                new Facultad (
                                    rs.getInt("idFacultad"),
                                    rs.getString("descripcion7"),
                                    Estados.valueOf(rs.getString("estado7"))
                                ),
                            rs.getString("descripcion8"),
                            Estados.valueOf(rs.getString("estado8"))
                            ),
                            rs.getString("descripcion9"),
                            Estados.valueOf( rs.getString("estado9"))
                     ),
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
                   
                             ), new Escuela(
                           rs.getInt("idEscuela1"),
                    new Facultad (
                            rs.getInt("idFacultad1"),
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
                               rs.getDate("fecha"),
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error leyendo grados egresados en DAO", se);
        }   
    }
    
}
