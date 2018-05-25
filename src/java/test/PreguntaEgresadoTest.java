/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.PreguntaEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.PreguntaEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.Afirmacion;
import com.egresados2016.modelo.PreguntaEgresado;
import java.text.ParseException;

/**
 *
 * @author Mi Laptop
 */
public class PreguntaEgresadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws DAOException{
        // TODO code application logic here
//        crear();
//        modificar();
//        leerxid();
//        leertodo();
//        leertodoxidegresado();
//        leertodoxidpregunta();
//        leertodoxidrespuesta();
//        eliminar();
//        destruir();
        
    }
     public static void crear() throws DAOException
	{
		PreguntaEgresadoDAOFactory fabricate= new PreguntaEgresadoDAOFactory();
                PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                
		PreguntaEgresado objPrE= new PreguntaEgresado();
                
            
                 objPrE.getPregunta().setIdPregunta(20);
                 objPrE.getEgresado().setIdEgresado(1);
                 objPrE.getRespuesta().setIdRespuesta(1);
                 objPrE.setAfirmacion(Afirmacion.ON);
                 
            
                 PreguntaEgresado preegre=daote.crear(objPrE);
	 System.out.println(" "+preegre.toString());
         
        
		
		}
     public static void modificar() throws DAOException
   {
		PreguntaEgresadoDAOFactory fabricate= new PreguntaEgresadoDAOFactory();
                PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                
		PreguntaEgresado objPrE= new PreguntaEgresado();
                
                 objPrE.setIdPreguntaEgresado(7);
                 objPrE.getPregunta().setIdPregunta(18);
                 objPrE.getEgresado().setIdEgresado(1);
                 objPrE.getRespuesta().setIdRespuesta(1);
                 objPrE.setAfirmacion(Afirmacion.OF);
            
                 PreguntaEgresado preegre=daote.modificar(objPrE);
	 System.out.println(" "+preegre.toString());
         
		}
    
       public static void leerxid()throws DAOException
	{
		   PreguntaEgresadoDAOFactory fabricate= new    PreguntaEgresadoDAOFactory();
                   PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                
		   PreguntaEgresado objPrE= new PreguntaEgresado();
		 objPrE.setIdPreguntaEgresado(1);
              
                   PreguntaEgresado preegre=daote.leerxid(objPrE);
	 System.out.println(" "+preegre.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new  PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
       
	   PreguntaEgresado[] preegre=daote.leertodo();
	  
	  for(    PreguntaEgresado preegre1:preegre)
	  {
	      
	      System.out.println(" "+preegre1.toString());
	  
	  }
	 
        }
       public static void leertodoxidegresado()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new     PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                   
                     PreguntaEgresado objPrE= new      PreguntaEgresado();
		 objPrE.getEgresado().setIdEgresado(1);
       
	    PreguntaEgresado[] preegre=daote.leertodoxidEgresado(objPrE);
	  
	  for(    PreguntaEgresado preegre1:preegre)
	  {
	      
	      System.out.println(" "+preegre1.toString());
	  
	  }
	 
        }
       public static void leertodoxidpregunta()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new     PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
          PreguntaEgresado objPrE= new      PreguntaEgresado();
		 objPrE.getPregunta().setIdPregunta(17);
	    PreguntaEgresado[] preegre=daote.leertodoxidPregunta(objPrE);
	  
	  for(   PreguntaEgresado preegre1:preegre)
	  {
	      
	      System.out.println(" "+preegre1.toString());
	  
	  }
	 
        }
        public static void leertodoxidrespuesta()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new     PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
          PreguntaEgresado objPrE= new      PreguntaEgresado();
		 objPrE.getRespuesta().setIdRespuesta(1);
	    PreguntaEgresado[] preegre=daote.leertodoxidRespuesta(objPrE);
	  
	  for(   PreguntaEgresado preegre1:preegre)
	  {
	      
	      System.out.println(" "+preegre1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                    PreguntaEgresado objGrE= new PreguntaEgresado();
		 objGrE.setIdPreguntaEgresado(7);
                
	 daote.eliminar(objGrE);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		    PreguntaEgresadoDAOFactory fabricate= new PreguntaEgresadoDAOFactory();
                    PreguntaEgresadoDAO daote= fabricate.metodoDAO();
                    PreguntaEgresado objGrE= new PreguntaEgresado();
		 objGrE.setIdPreguntaEgresado(7);
                
	 daote.destruir(objGrE);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
