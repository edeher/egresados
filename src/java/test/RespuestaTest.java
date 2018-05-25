/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.RespuestaDAOFactory;
import com.egresados2016.dao.interfaces.RespuestaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.Grupo;
import com.egresados2016.modelo.Respuesta;

/**
 *
 * @author Mi Laptop
 */
public class RespuestaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws DAOException{
        // TODO code application logic here
//        crear();
//        modificar();
//        leerxid();
        leertodo();
//        eliminar();
//        destruir();
    }
     public static void crear() throws DAOException
	{
		RespuestaDAOFactory fabricate= new RespuestaDAOFactory();
                RespuestaDAO daote= fabricate.metodoDAO();
                
		Respuesta objRe= new Respuesta();
                objRe.setGrupo(Grupo.NO);
		 objRe.setDescripcion("moralesss");
              
                
              
                
                 Respuesta autorr=daote.crear(objRe);
	 System.out.println(" "+autorr.toString());
		
		}
     public static void modificar() throws DAOException
    {
		RespuestaDAOFactory fabricate= new RespuestaDAOFactory();
                RespuestaDAO daote= fabricate.metodoDAO();
                
		Respuesta objRe= new Respuesta();
                objRe.setIdRespuesta(16);
                objRe.setGrupo(Grupo.NO);
		 objRe.setDescripcion("ede");
      
                 Respuesta autorr=daote.modificar(objRe);
	 System.out.println(" "+autorr.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		RespuestaDAOFactory fabricate= new RespuestaDAOFactory();
                RespuestaDAO daote= fabricate.metodoDAO();
                
		Respuesta objRe= new Respuesta();
		 objRe.setIdRespuesta(2);
              
                
              
                
                 Respuesta autorr=daote.leerxid(objRe);
	 System.out.println(" "+autorr.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		RespuestaDAOFactory fabricate= new RespuestaDAOFactory();
                RespuestaDAO daote= fabricate.metodoDAO();
       
	 Respuesta[] res=daote.leertodo();
	  
	  for(Respuesta res1:res)
	  {
	      
	      System.out.println(" "+res1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		 RespuestaDAOFactory fabricate= new  RespuestaDAOFactory();
                 RespuestaDAO daote= fabricate.metodoDAO();
                 Respuesta objRe= new  Respuesta();
		 objRe.setIdRespuesta(2);
                
	 daote.eliminar(objRe);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 RespuestaDAOFactory fabricate= new  RespuestaDAOFactory();
                 RespuestaDAO daote= fabricate.metodoDAO();
                 Respuesta objRe= new  Respuesta();
		 objRe.setIdRespuesta(8);
                
	 daote.destruir(objRe);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
