/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import com.egresados2016.dao.factory.EncuestaDAOFactory;
import com.egresados2016.dao.interfaces.EncuestaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Encuesta;


/**
 *
 * @author Mi Laptop
 */
public class EncuestaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
         // TODO code application logic here
//            crear();
//            modificar();
//            leerxid();
//            leertodo();
//            eliminar();
            destruir();
    }
     public static void crear() throws DAOException
	{
		EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
                
		Encuesta objEncu= new Encuesta();
		 objEncu.setDescripcion("moraless");
              
                
                 Encuesta encu=daote.crear(objEncu);
	 System.out.println(" "+encu.toString());
		
		}
     public static void modificar() throws DAOException
    {
		EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
                
		Encuesta objEncu= new Encuesta();
                 objEncu.setIdEncuesta(1);
		 objEncu.setDescripcion("moralesss");
              
                
              
                
                Encuesta encu=daote.modificar(objEncu);
	 System.out.println(" "+encu.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
                
		Encuesta objEncu= new Encuesta();
		objEncu.setIdEncuesta(1);
              
                
              
                
                 Encuesta encu=daote.leerxid(objEncu);
	 System.out.println(" "+encu.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Encuesta[] encu=daote.leertodo();
	  
	  for(Encuesta encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
                
                 Encuesta objFa= new  Encuesta();
		 objFa.setIdEncuesta(3);
                
	 daote.elimnarr(objFa);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 EncuestaDAOFactory fabricate= new EncuestaDAOFactory();
                EncuestaDAO daote= fabricate.metodoDAO();
                
                  Encuesta objFa= new   Encuesta();
		 objFa.setIdEncuesta(3);
                
	 daote.destruir(objFa);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
