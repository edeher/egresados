/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.GradosDAOFactory;
import com.egresados2016.dao.interfaces.GradosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Grados;

/**
 *
 * @author Mi Laptop
 */
public class GradosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
        // TODO code application logic here
//        crear();
//        modificar();
//        leerxid();
//        leertodo();
//        eliminar();
//        destruir();
leertodoxescuela();
    }
    public static void crear() throws DAOException
	{
		GradosDAOFactory fabricate= new GradosDAOFactory();
                GradosDAO daote= fabricate.metodoDAO();
                
		Grados objGr= new Grados();
                 objGr.getEscuela().setIdEscuela(1);
		 objGr.setDescripcion("moralessss");
              
                 Grados grado=daote.crear(objGr);
	 System.out.println(" "+grado.toString());
		
		}
     public static void modificar() throws DAOException
    {
		 GradosDAOFactory fabricate= new  GradosDAOFactory();
                 GradosDAO daote= fabricate.metodoDAO();
                
		 Grados objGr= new  Grados();
                objGr.setIdGrados(1);
                objGr.getEscuela().setIdEscuela(1);
		 objGr.setDescripcion("edeherrrr aja");
              
                
              
                
                  Grados grado=daote.modificar(objGr);
	 System.out.println(" "+grado.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		 GradosDAOFactory fabricate= new  GradosDAOFactory();
                 GradosDAO daote= fabricate.metodoDAO();
                
		 Grados objGr= new  Grados();
		 objGr.setIdGrados(2);
              
                
              
                
                 Grados grado=daote.leerxid(objGr);
	 System.out.println(" "+grado.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		 GradosDAOFactory fabricate= new  GradosDAOFactory();
                 GradosDAO daote= fabricate.metodoDAO();
       
	  Grados[] grado=daote.leertodo();
	  
	  for( Grados grado1:grado)
	  {
	      
	      System.out.println(" "+grado1.toString());
	  
	  }
	 
        }
         public static void leertodoxescuela()throws DAOException
	{
		 GradosDAOFactory fabricate= new  GradosDAOFactory();
                 GradosDAO daote= fabricate.metodoDAO();
                 
                  Grados objGr= new  Grados();
		 objGr.getEscuela().setIdEscuela(1);
       
	  Grados[] grado=daote.leertodoxEscuela(objGr);
	  
	  for( Grados grado1:grado)
	  {
	      
	      System.out.println(" "+grado1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		  GradosDAOFactory fabricate= new   GradosDAOFactory();
                  GradosDAO daote= fabricate.metodoDAO();
                  Grados objGr= new   Grados();
		 objGr.setIdGrados(2);
                
	 daote.eliminar(objGr);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		  GradosDAOFactory fabricate= new   GradosDAOFactory();
                  GradosDAO daote= fabricate.metodoDAO();
                  Grados objGr= new   Grados();
		 objGr.setIdGrados(5);
                
	 daote.destruir(objGr);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
     
}
