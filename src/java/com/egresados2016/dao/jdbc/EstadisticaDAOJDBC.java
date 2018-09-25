/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.jdbc;

import com.egresados2016.modelo.Estadistica;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.egresados2016.dao.interfaces.EstadisticaDAO;

/**
 *
 * @author Mi Laptop
 */
public class EstadisticaDAOJDBC implements EstadisticaDAO{
private final Connection con;
    public EstadisticaDAOJDBC() {
        this.con = DBManager.getConnection();
    }
    @Override
    public Estadistica [] bachillerxescuela() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_bachiller_por_escuela()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo bachilleres por escuela en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] bachillerxfacultad() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_bachiller_por_facultad()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo bachilleres por facultad en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] tituladoxescuela() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_titulados_por_escuela()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo titulados por escuela en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] tituladoxfacultad() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_titulados_por_facultad()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo titulados por facultad en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    public Estadistica nroegresados() throws DAOException {
      try{
        CallableStatement st=con.prepareCall("{call sp_nro_egresados()}");
          
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de egresados en DAO", se);
        } 
    }

    @Override
    public Estadistica nrobachilleres() throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_nrobachilleres()}");
          
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de bachilleres en DAO", se);
        } 
    }

    @Override
    public Estadistica nrotitulados() throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_nrotitulados()}");
          
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de titulados en DAO", se);
        } 
    }

    @Override
    public Estadistica[] nroegresados_x_anio() throws DAOException {
       try  {
             CallableStatement stm=con.prepareCall("{call sp_nroegresados_x_anio()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo egresados por año en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] nro_preguntas_all_egresado() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_preguntas_all_egresado()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo todas los egresados con preguntas en DAO: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica nro_preguntas_por_egresado(int idEgresado) throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_nro_preguntas_por_egresado(?)}");
                  st.setInt(1,idEgresado);
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando preguntas por egresados DAO", se);
        } 
    }

    @Override
    public Estadistica nro_encuestados() throws DAOException {
        try{
        CallableStatement st=con.prepareCall("{call sp_nro_encuestados()}");
                 
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de encuestados en DAO", se);
        } 
    }

    @Override
    public Estadistica nro_no_encuestados() throws DAOException {
         try{
        CallableStatement st=con.prepareCall("{call sp_nro_no_encuestados()}");
                 
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de no encuestados en DAO", se);
        } 
    }
    @Override
    public Estadistica[] pregunta_1() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_1()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 1: " 
                    + se.getMessage(), se);
        }    
    }
    @Override
    public Estadistica[] pregunta_2() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_2()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 2: " 
                    + se.getMessage(), se);
        } 
    }

    
 @Override
    public Estadistica[] pregunta_3() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_3()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 3: " 
                    + se.getMessage(), se);
        } 
    }
    @Override
    public Estadistica[] pregunta_4() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_4()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 4: " 
                    + se.getMessage(), se);
        } 
    }
     @Override
    public Estadistica[] pregunta_5() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_5()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 4: " 
                    + se.getMessage(), se);
        } 
    }
    @Override
    public Estadistica[] pregunta_6() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_6()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 6: " 
                    + se.getMessage(), se);
        }    
    }

    @Override
    public Estadistica[] pregunta_7() throws DAOException {
       try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_7()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 7: " 
                    + se.getMessage(), se);
        }    
    }
    @Override
    public Estadistica[] pregunta_8() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_8()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_9() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_9()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_10() throws DAOException {
       try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_10()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_11() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_11()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_12() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_12()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_13() throws DAOException {
      try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_13()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_14() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_14()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_15() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_15()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_16() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_16()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_17() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_17()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18: " 
                    + se.getMessage(), se);
        } 
    }

    @Override
    public Estadistica[] pregunta_18_1() throws DAOException {
          try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_18()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 18_1: " 
                    + se.getMessage(), se);
        }     
    }
@Override
    public Estadistica[] pregunta_19_2() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_19()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 19_2: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_20_3() throws DAOException {
         try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_20()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos d epregunta 20_3: " 
                    + se.getMessage(), se);
        }     
    }
@Override
    public Estadistica[] pregunta_21_4() throws DAOException {
       try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_21()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 21_4: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_22_5() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_22()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 22_5: " 
                    + se.getMessage(), se);
        }     

    }
    @Override
    public Estadistica[] pregunta_23_6() throws DAOException {
       try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_23()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos d epregunta 23_6: " 
                    + se.getMessage(), se);
        } 
    }

    
    

    @Override
    public Estadistica[] pregunta_24_7() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_24()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 24_7: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_25_8() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_25()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 25_8: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_26_9() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_26()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 26_9: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_27_10() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_27()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 27_10: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_28_11() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_28()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 28_11: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_29_12() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_29()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 29_12: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_30_13() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_30()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 30_13: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_31_14() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_31()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 31_14: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica[] pregunta_32_15() throws DAOException {
        try  {
             CallableStatement stm=con.prepareCall("{call sp_nro_pregunta_32()}");
            ResultSet rs=stm.executeQuery();
                      
            ArrayList<Estadistica> tribs = new ArrayList<>(); 
            
            while (rs.next()) {
                tribs.add(
                        
                new Estadistica(
                            
                          
                                  
                            rs.getString("descripcion"),                      
                        
                        
                            rs.getInt("cantidad")
                )
                         
                   );
            }
            return tribs.toArray(new Estadistica[0]);
        } catch (SQLException se) {
            
            throw new DAOException("Error obteniedo datos de pregunta 32_15: " 
                    + se.getMessage(), se);
        }     
    }

    @Override
    public Estadistica nroegresadoscongrados() throws DAOException {
       try{
        CallableStatement st=con.prepareCall("{call sp_nro_egresadoscongrados()}");
          
              ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
           
            return (
                      new Estadistica(
                                                        
                            rs.getString("descripcion"),                      
                                                
                            rs.getInt("cantidad")
                )
                         
                   );
            
        } catch (SQLException se) {
            
            throw new DAOException("Error buscando numero de egresados con grados en DAO", se);
        } 
    }

    
    
}
