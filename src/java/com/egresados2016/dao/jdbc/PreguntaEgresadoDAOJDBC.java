/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.PreguntaEgresadoDAO;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.Sexo;
import com.egresados2016.enums.TipoPreguntas;
import com.egresados2016.modelo.Departamento;
import com.egresados2016.modelo.Distrito;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.Pregunta;
import com.egresados2016.modelo.PreguntaEgresado;
import com.egresados2016.modelo.Provincia;
import com.egresados2016.modelo.Respuesta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class PreguntaEgresadoDAOJDBC implements PreguntaEgresadoDAO{
private final Connection con;

    public PreguntaEgresadoDAOJDBC() {
        this.con = DBManager.getConnection();
    }

    @Override
    public PreguntaEgresado crear(PreguntaEgresado objPreE) throws DAOException {
     try{
        CallableStatement st=con.prepareCall("{call sp_preguntaegresado_n(?,?,?)}");
                            st.setInt(1, objPreE.getPregunta().getIdPregunta());
                            st.setInt(2,objPreE.getEgresado().getIdEgresado() );
                            st.setInt(3,objPreE.getRespuesta().getIdRespuesta() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando preguntaegresado en DAO", se);
        }   
    }

    @Override
    public PreguntaEgresado modificar(PreguntaEgresado objPreE) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_preguntaegresado_m(?,?,?,?)}");
                            st.setInt(1, objPreE.getIdPreguntaEgresado());
                            st.setInt(2, objPreE.getPregunta().getIdPregunta());
                            st.setInt(3,objPreE.getEgresado().getIdEgresado() );
                            st.setInt(4,objPreE.getRespuesta().getIdRespuesta() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando preguntaegresado en DAO", se);
        }   
    }

    @Override
    public PreguntaEgresado leerxid(PreguntaEgresado objPreE) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_preguntaegresado_bco(?)}");
                            st.setInt(1, objPreE.getIdPreguntaEgresado());
                            
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                       new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error buscando preguntaegresado en DAO", se);
        }   
    }

    @Override
    public PreguntaEgresado[] leertodo() throws DAOException {
        try  {
             CallableStatement st=con.prepareCall("{call sp_preguntaegresado_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<PreguntaEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new PreguntaEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las preguntasegresado en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public PreguntaEgresado[] leertodoxidEgresado(PreguntaEgresado objPreE) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_preguntaegresado_bcoxidEgresado(?)}");
                             st.setInt(1, objPreE.getEgresado().getIdEgresado());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<PreguntaEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new PreguntaEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las preguntasegresado por egresado en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public PreguntaEgresado[] leertodoxidPregunta(PreguntaEgresado objPreE) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_preguntaegresado_bcoxidPregunta(?)}");
                             st.setInt(1, objPreE.getPregunta().getIdPregunta());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<PreguntaEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new PreguntaEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las preguntasegresado por pregunta en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public PreguntaEgresado[] leertodoxidRespuesta(PreguntaEgresado objPreE) throws DAOException {
       try  {
             CallableStatement st=con.prepareCall("{call sp_preguntaegresado_bcoxidRespuesta(?)}");
                             st.setInt(1, objPreE.getRespuesta().getIdRespuesta());
              ResultSet rs = st.executeQuery();
                      
            ArrayList<PreguntaEgresado> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(new PreguntaEgresado(  
                               rs.getInt("idPreguntaEgresado"),
                      new Pregunta (
                            rs.getInt("idPregunta"),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion7"),
                            Estados.valueOf(rs.getString("estado7"))
                   
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
                                new Respuesta (
                            rs.getInt("idRespuesta"),
                            rs.getString("descripcion11"),
                            Estados.valueOf(rs.getString("estado11"))
                   
                             )
                               ,
                               
                                Estados.valueOf(rs.getString("estado"))
                   
                       )
                   );
            }
            return tribs.toArray(new PreguntaEgresado[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las preguntasegresado por respuesta en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(PreguntaEgresado objPreE) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_preguntaegresado_e1(?) }");
            
            st.setInt(1,objPreE.getIdPreguntaEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando preguntaegresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  preguntaegresado en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(PreguntaEgresado objPreE) throws DAOException {
      try  {
	           CallableStatement st=con.prepareCall("{call sp_preguntaegresado_e(?) }");
            
            st.setInt(1,objPreE.getIdPreguntaEgresado());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo preguntaegresado");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo  preguntaegresado en DAO", se);
        }
        return true; 
    }
    
    
}
