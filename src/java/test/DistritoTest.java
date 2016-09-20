/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.DistritoDAOFactory;
import com.egresados2016.dao.interfaces.DistritoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Distrito;

/**
 *
 * @author Mi Laptop
 */
public class DistritoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
//       crear();
//       modificar();
//        leerxid();
        leertodo();
//        eliminar();
//        destruir();
                
    }
    public static void crear() throws DAOException
	{
		DistritoDAOFactory fabricate= new DistritoDAOFactory();
                DistritoDAO daote= fabricate.metodoDAO();
                
		Distrito objDis= new Distrito();
                objDis.getProvincia().setIdProvincia(1);
		 objDis.setDescripcion("moralessss");
              
                 Distrito autorr=daote.crear(objDis);
	 System.out.println(" "+autorr.toString());
		
		}
     public static void modificar() throws DAOException
    {
		DistritoDAOFactory fabricate= new DistritoDAOFactory();
                DistritoDAO daote= fabricate.metodoDAO();
                
		Distrito objDis= new Distrito();
                objDis.setIdDistrito(1);
                objDis.getProvincia().setIdProvincia(1);
		 objDis.setDescripcion("edeherrrr");
              
                 Distrito autorr=daote.modificar(objDis);
	 System.out.println(" "+autorr.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		DistritoDAOFactory fabricate= new DistritoDAOFactory();
                DistritoDAO daote= fabricate.metodoDAO();
                
		Distrito objDis= new Distrito();
		 objDis.setIdDistrito(2);
              
                 Distrito autorr=daote.leerxid(objDis);
	 System.out.println(" "+autorr.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		DistritoDAOFactory fabricate= new DistritoDAOFactory();
                DistritoDAO daote= fabricate.metodoDAO();
       
	 Distrito[] Distri=daote.leertodo();
	  
	  for(Distrito Distri1:Distri)
	  {
	      
	      System.out.println(" "+Distri1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		DistritoDAOFactory fabricate= new DistritoDAOFactory();
                DistritoDAO daote= fabricate.metodoDAO();
                Distrito objDis= new Distrito();
		 objDis.setIdDistrito(2);
                
	 daote.eliminar(objDis);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 DistritoDAOFactory fabricate= new  DistritoDAOFactory();
                 DistritoDAO daote= fabricate.metodoDAO();
                 Distrito objDis= new  Distrito();
		 objDis.setIdDistrito(3);
                
	 daote.destruir(objDis);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
