/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.GradoEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.GradoEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.GradoEgresado;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Mi Laptop
 */
public class GradoEgresadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws DAOException, ParseException{
        // TODO code application logic here
//        crear();
//        modificar();
//        leerxid();
//        leertodo();
//        leertodoxgrado();
//        leertodoxegresado();
//        eliminar();
        destruir();
    }
     public static void crear() throws DAOException, ParseException
	{
		GradoEgresadoDAOFactory fabricate= new GradoEgresadoDAOFactory();
                GradoEgresadoDAO daote= fabricate.metodoDAO();
                
		GradoEgresado objGrE= new GradoEgresado();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                
                 objGrE.getGrados().setIdGrados(1);
                 objGrE.getEgresado().setIdEgresado(5);
                 objGrE.setFecha(fec);
                 
            
                 GradoEgresado graegre=daote.crear(objGrE);
	 System.out.println(" "+graegre.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		
		}
     public static void modificar() throws DAOException
   {
		GradoEgresadoDAOFactory fabricate= new GradoEgresadoDAOFactory();
                GradoEgresadoDAO daote= fabricate.metodoDAO();
                
		GradoEgresado objGrE= new GradoEgresado();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                 objGrE.setIdGradoEgresado(1);
                 objGrE.getGrados().setIdGrados(3);
                 objGrE.getEgresado().setIdEgresado(5);
                 objGrE.setFecha(fec);
                 
            
                 GradoEgresado graegre=daote.modificar(objGrE);
	 System.out.println(" "+graegre.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		}
    
       public static void leerxid()throws DAOException
	{
		   GradoEgresadoDAOFactory fabricate= new    GradoEgresadoDAOFactory();
                   GradoEgresadoDAO daote= fabricate.metodoDAO();
                
		   GradoEgresado objGrE= new    GradoEgresado();
		 objGrE.setIdGradoEgresado(2);
              
                   GradoEgresado graegre=daote.leerxid(objGrE);
	 System.out.println(" "+graegre.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		   GradoEgresadoDAOFactory fabricate= new    GradoEgresadoDAOFactory();
                   GradoEgresadoDAO daote= fabricate.metodoDAO();
       
	   GradoEgresado[] graegre=daote.leertodo();
	  
	  for(   GradoEgresado graegre1:graegre)
	  {
	      
	      System.out.println(" "+graegre1.toString());
	  
	  }
	 
        }
       public static void leertodoxgrado()throws DAOException
	{
		   GradoEgresadoDAOFactory fabricate= new    GradoEgresadoDAOFactory();
                   GradoEgresadoDAO daote= fabricate.metodoDAO();
                   
                    GradoEgresado objGrE= new     GradoEgresado();
		 objGrE.getGrados().setIdGrados(1);
       
	   GradoEgresado[] graegre=daote.leertodoxgrados(objGrE);
	  
	  for(   GradoEgresado graegre1:graegre)
	  {
	      
	      System.out.println(" "+graegre1.toString());
	  
	  }
	 
        }
       public static void leertodoxegresado()throws DAOException
	{
		   GradoEgresadoDAOFactory fabricate= new    GradoEgresadoDAOFactory();
                   GradoEgresadoDAO daote= fabricate.metodoDAO();
         GradoEgresado objGrE= new     GradoEgresado();
		 objGrE.getEgresado().setIdEgresado(3);
	   GradoEgresado[] graegre=daote.leertodoxegresados(objGrE);
	  
	  for(   GradoEgresado graegre1:graegre)
	  {
	      
	      System.out.println(" "+graegre1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		    GradoEgresadoDAOFactory fabricate= new     GradoEgresadoDAOFactory();
                    GradoEgresadoDAO daote= fabricate.metodoDAO();
                    GradoEgresado objGrE= new     GradoEgresado();
		 objGrE.setIdGradoEgresado(7);
                
	 daote.eliminar(objGrE);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		    GradoEgresadoDAOFactory fabricate= new     GradoEgresadoDAOFactory();
                    GradoEgresadoDAO daote= fabricate.metodoDAO();
                    GradoEgresado objGr= new     GradoEgresado();
		 objGr.setIdGradoEgresado(7);
                
	 daote.destruir(objGr);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
