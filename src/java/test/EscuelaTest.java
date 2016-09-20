/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.EscuelaDAOFactory;
import com.egresados2016.dao.interfaces.EscuelaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Escuela;



/**
 *
 * @author Mi Laptop
 */
public class EscuelaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
        // TODO code application logic here
                //crear();
                //modificar();
//                leerxid();
//                leertodo2();
//                leertodoxidFacultad();
//                eliminar();
                destruir();
    }
     public static void crear() throws DAOException
	{
		EscuelaDAOFactory fabricate= new EscuelaDAOFactory();
                EscuelaDAO daote= fabricate.metodoDAO();
                
		Escuela objEs= new Escuela();
                 objEs.getFacultad().setIdFacultad(1);
		 objEs.setDescripcion("moralesss");
              
                 Escuela escu=daote.crear(objEs);
	 System.out.println(" "+escu.toString());
		
		}
     public static void modificar() throws DAOException
    {
		EscuelaDAOFactory fabricate= new EscuelaDAOFactory();
                EscuelaDAO daote= fabricate.metodoDAO();
                
		Escuela objEs= new Escuela();
                objEs.setIdEscuela(1);
                objEs.getFacultad().setIdFacultad(2);
		 objEs.setDescripcion("edeherrrr");
              
                
              
                
                 Escuela escu=daote.modificar(objEs);
	 System.out.println(" "+escu.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		EscuelaDAOFactory fabricate= new EscuelaDAOFactory();
                EscuelaDAO daote= fabricate.metodoDAO();
                
		Escuela objFa= new Escuela();
		 objFa.setIdEscuela(2);
              
                
              
                
                Escuela escu=daote.leerxid(objFa);
	 System.out.println(" "+escu.toString());
		
		}
      public static void leertodoxidFacultad()throws DAOException
	{
		EscuelaDAOFactory fabricate= new EscuelaDAOFactory();
                EscuelaDAO daote= fabricate.metodoDAO();
                Escuela objEs= new Escuela();
		 objEs.getFacultad().setIdFacultad(2);
	 Escuela[] escu=daote.leertodo(objEs);
	  
	  for(Escuela escu1:escu)
	  {
	      
	      System.out.println(" "+escu1.toString());
	  
	  }
	 
        }
       public static void leertodo2()throws DAOException
	{
		EscuelaDAOFactory fabricate= new EscuelaDAOFactory();
                EscuelaDAO daote= fabricate.metodoDAO();
       
	 Escuela[] escu=daote.leertodo();
	  
	  for(Escuela escu1:escu)
	  {
	      
	      System.out.println(" "+escu1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		 EscuelaDAOFactory fabricate= new  EscuelaDAOFactory();
                 EscuelaDAO daote= fabricate.metodoDAO();
                 Escuela objEs= new  Escuela();
		 objEs.setIdEscuela(2);
                
	 daote.eliminar(objEs);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 EscuelaDAOFactory fabricate= new  EscuelaDAOFactory();
                 EscuelaDAO daote= fabricate.metodoDAO();
                 Escuela objEs= new  Escuela();
		 objEs.setIdEscuela(3);
                
	 daote.destruir(objEs);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
     
}
