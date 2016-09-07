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
//        crearescuela();
//        modificarescuela();
       
//        leertodo();
//        leertodoFacultad();
    }
     public static void crearescuela() throws DAOException
    {
        EscuelaDAOFactory fabricate= new  EscuelaDAOFactory();
         EscuelaDAO daote= fabricate.metodoDAO();
         Escuela objEs=new Escuela();
         
          objEs.getFacultad().setIdFacultad(1);
             objEs.setDescripcion("educaion secundaria");
              
              daote.crear(objEs);
               
           
    }
     public static void modificarescuela() throws DAOException
    {
        EscuelaDAOFactory fabricate= new  EscuelaDAOFactory();
         EscuelaDAO daote= fabricate.metodoDAO();
         Escuela objEs=new Escuela();
          
             objEs.setIdEscuela(5);
             objEs.getFacultad().setIdFacultad(1);
             objEs.setDescripcion("educaion secundaria bilingüexxxxx");
              
              daote.modificar(objEs);
               
           
    }
     
   
      public static void leertodo()throws DAOException
	{
		  EscuelaDAOFactory fabricate= new  EscuelaDAOFactory();
                  EscuelaDAO daote= fabricate.metodoDAO();
	 Escuela[] usuv=daote.leertodo();
	  
	  for(Escuela usuv1:usuv)
	  {
	      
	      System.out.println(" "+usuv1.toString());
	  
	  }
	 
        } 
     
}
