/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.dao.interfaces.PreguntaDAO;
import com.egresados2016.enums.Estados;
import com.egresados2016.enums.TipoPreguntas;
import com.egresados2016.modelo.Encuesta;
import com.egresados2016.modelo.Pregunta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Laptop
 */
public class PreguntaDAOJDBC implements PreguntaDAO{
private final Connection con;

    public PreguntaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Pregunta crear(Pregunta objPr) throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_pregunta_n(?,?,?)}");
                            st.setInt(1, objPr.getEncuesta().getIdEncuesta());
                            st.setString(2,objPr.getTipopregunta().name());
                            st.setString(3,objPr.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Pregunta (
                            rs.getInt("idPregunta"),
                             new Encuesta(
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                                    ),
                           
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando Pregunta en DAO", se);
        }   
    }

    @Override
    public Pregunta modificar(Pregunta objPr) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_pregunta_m(?,?,?,?)}");
                            st.setInt(1,objPr.getIdPregunta() );
                             st.setInt(2, objPr.getEncuesta().getIdEncuesta());
                            st.setString(3, objPr.getTipopregunta().name());
                            st.setString(4,objPr.getDescripcion() );
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Pregunta (
                            rs.getInt("idPregunta"),
                            new Encuesta(
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                                    ),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error creando Pregunta en DAO", se);
        }   
    }

    @Override
    public Pregunta leerxid(Pregunta objPr) throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_pregunta_bco(?)}");
                            st.setInt(1,objPr.getIdPregunta() );
                        
                          
             ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           return (
                    new Pregunta (
                            rs.getInt("idPregunta"),
                            new Encuesta(
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                                    ),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
           } catch (SQLException se) {
            
            throw new DAOException("Error modificando Pregunta en DAO", se);
        }   
    }

    @Override
    public Pregunta[] leertodo() throws DAOException {
      try  {
             CallableStatement st=con.prepareCall("{call sp_pregunta_all()}");
           
              ResultSet rs = st.executeQuery();
                      
            ArrayList<Pregunta> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(new Pregunta (
                            rs.getInt("idPregunta"),
                        new Encuesta(
                            rs.getInt("idEncuesta"),
                            rs.getString("descripcion1"),
                            Estados.valueOf(rs.getString("estado1"))
                                    ),
                            TipoPreguntas.valueOf(rs.getString("TipoPregunta")),
                            rs.getString("descripcion"),
                            Estados.valueOf(rs.getString("estado"))
                   
                             )
                   
                   
                   );
            }
            return tribs.toArray(new Pregunta[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todos las preguntas en DAO: " 
                    + se.getMessage(), se);
        }  
    }

    @Override
    public boolean eliminar(Pregunta objPr) throws DAOException {
        try  {
	           CallableStatement st=con.prepareCall("{call sp_pregunta_e1(?) }");
            
            st.setInt(1,objPr.getIdPregunta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error eliminando pregunta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error eliminando  pregunta en DAO", se);
        }
        return true; 
    }

    @Override
    public boolean destruir(Pregunta objPr) throws DAOException {
       try  {
	           CallableStatement st=con.prepareCall("{call sp_pregunta_e(?) }");
            
            st.setInt(1,objPr.getIdPregunta());


            if (st.execute()) //devuelve verdadero si fallo
            {
                throw new DAOException("Error destruyendo pregunta");
            }
            st.close();
            
        } catch (SQLException se) {
            throw new DAOException("Error destruyendo pregunta en DAO", se);
        }
        return true; 
    }
    
}
