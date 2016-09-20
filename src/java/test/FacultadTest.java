/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.FacultadDAOFactory;
import com.egresados2016.dao.interfaces.FacultadDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Facultad;



/**
 *
 * @author Mi Laptop
 */
public class FacultadTest {

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
		FacultadDAOFactory fabricate= new FacultadDAOFactory();
                FacultadDAO daote= fabricate.metodoDAO();
                
		Facultad objFa= new Facultad();
		 objFa.setDescripcion("moraless");
              
                
              
                
                 Facultad facu=daote.crear(objFa);
	 System.out.println(" "+facu.toString());
		
		}
     public static void modificar() throws DAOException
    {
		FacultadDAOFactory fabricate= new FacultadDAOFactory();
                FacultadDAO daote= fabricate.metodoDAO();
                
		Facultad objFa= new Facultad();
                objFa.setIdFacultad(1);
		 objFa.setDescripcion("edeherrr");
              
                
              
                
                 Facultad facu=daote.modificar(objFa);
	 System.out.println(" "+facu.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		FacultadDAOFactory fabricate= new FacultadDAOFactory();
                FacultadDAO daote= fabricate.metodoDAO();
                
		Facultad objFa= new Facultad();
		 objFa.setIdFacultad(2);
              
                
              
                
                 Facultad facu=daote.leerxid(objFa);
	 System.out.println(" "+facu.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		FacultadDAOFactory fabricate= new FacultadDAOFactory();
                FacultadDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Facultad[] facu=daote.leertodo();
	  
	  for(Facultad facu1:facu)
	  {
	      
	      System.out.println(" "+facu1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		 FacultadDAOFactory fabricate= new  FacultadDAOFactory();
                 FacultadDAO daote= fabricate.metodoDAO();
                 Facultad objFa= new  Facultad();
		 objFa.setIdFacultad(2);
                
	 daote.eliminar(objFa);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 FacultadDAOFactory fabricate= new  FacultadDAOFactory();
                 FacultadDAO daote= fabricate.metodoDAO();
                 Facultad objFa= new  Facultad();
		 objFa.setIdFacultad(3);
                
	 daote.destruir(objFa);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
