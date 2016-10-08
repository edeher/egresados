/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.ProvinciaDAOFactory;
import com.egresados2016.dao.interfaces.ProvinciaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Provincia;

/**
 *
 * @author Mi Laptop
 */
public class ProvinciaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
//        crear();
//        modificar();
//        leerxid();
        leerxdepartamento();
//        leertodo();
//        eliminar();
//        destruir();
    }
    public static void crear() throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                
		Provincia objPro= new Provincia();
                objPro.getDepartamento().setIdDepartamento(1);
		 objPro.setDescripcion("moralesss");
              
                 Provincia autorr=daote.crear(objPro);
	 System.out.println(" "+autorr.toString());
		
		}
     public static void modificar() throws DAOException
    {
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                
		Provincia objPro= new Provincia();
                objPro.setIdProvincia(1);
                objPro.getDepartamento().setIdDepartamento(1);
		 objPro.setDescripcion("edeherrr");
              
                 Provincia autorr=daote.modificar(objPro);
	 System.out.println(" "+autorr.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                
		Provincia objPro= new Provincia();
		 objPro.setIdProvincia(2);
              
                 Provincia autorr=daote.leerxid(objPro);
	 System.out.println(" "+autorr.toString());
		
		}
       public static void leerxdepartamento()throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                
		Provincia objPro= new Provincia();
		 objPro.getDepartamento().setIdDepartamento(2);
              
                Provincia[] provi=daote.leertodoxdepartamento(objPro);
	  
	  for(Provincia provi1:provi)
	  {
	      
	      System.out.println(" "+provi1.toString());
	  
	  }
		}
      public static void leertodo()throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
       
	 Provincia[] provi=daote.leertodo();
	  
	  for(Provincia provi1:provi)
	  {
	      
	      System.out.println(" "+provi1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                Provincia objDe= new Provincia();
		 objDe.setIdProvincia(2);
                
	 daote.eliminar(objDe);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		ProvinciaDAOFactory fabricate= new ProvinciaDAOFactory();
                ProvinciaDAO daote= fabricate.metodoDAO();
                Provincia objDe= new Provincia();
		 objDe.setIdProvincia(3);
                
	 daote.destruir(objDe);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
