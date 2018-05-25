/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.DepartamentoDAOFactory;
import com.egresados2016.dao.interfaces.DepartamentoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Departamento;

/**
 *
 * @author Mi Laptop
 */
public class DepartamentoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws DAOException{
        
//        crear();
//        modificar();
//        leerxid();
        leertodo();
//        eliminar();
//        destruir();
    }
      public static void crear() throws DAOException
	{
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
                
		Departamento objDe= new Departamento();
		 objDe.setDescripcion("moraless");
              
                
              
                
                 Departamento autorr=daote.crear(objDe);
	 System.out.println(" "+autorr.toString());
		
		}
     public static void modificar() throws DAOException
    {
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
                
		Departamento objDe= new Departamento();
                objDe.setIdDepartamento(1);
		 objDe.setDescripcion("edeherr");
              
                
              
                
                 Departamento autorr=daote.modificar(objDe);
	 System.out.println(" "+autorr.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
                
		Departamento objDe= new Departamento();
		 objDe.setIdDepartamento(2);
              
                
              
                
                 Departamento autorr=daote.leerxid(objDe);
	 System.out.println(" "+autorr.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Departamento[] depa=daote.leertodo();
	  
	  for(Departamento depa1:depa)
	  {
	      
	      System.out.println(" "+depa1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
                Departamento objDe= new Departamento();
		 objDe.setIdDepartamento(2);
                
	 daote.eliminar(objDe);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		DepartamentoDAOFactory fabricate= new DepartamentoDAOFactory();
                DepartamentoDAO daote= fabricate.metodoDAO();
                Departamento objDe= new Departamento();
		 objDe.setIdDepartamento(6);
                
	 daote.destruir(objDe);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
