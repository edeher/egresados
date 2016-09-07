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
//        crearfacultad();
//        modificarfacultad();
//        eliminarfacultad();
//        leer();
        leertodo();
    }
    public static void crearfacultad() throws DAOException
    {
        FacultadDAOFactory fabricate= new FacultadDAOFactory();
        FacultadDAO daote= fabricate.metodoDAO();
          Facultad objFa = new Facultad();
          
           
             objFa.setDescripcion("administracion");
              
              
              daote.crear(objFa);
               
           
    }
    public static void modificarfacultad() throws DAOException
    {
        FacultadDAOFactory fabricate= new FacultadDAOFactory();
        FacultadDAO daote= fabricate.metodoDAO();
          Facultad objFa = new Facultad();
          
                objFa.setIdFacultad(2);
             objFa.setDescripcion("administracion y contabilidad");
              
              
              daote.modificar(objFa);
               
           
    }
   
   
     public static void leertodo() throws DAOException
    {
        FacultadDAOFactory fabricate= new FacultadDAOFactory();
        FacultadDAO daote= fabricate.metodoDAO();
          int idFacultad=2;
              
             Facultad [] fau= daote.leertodo();
             for(Facultad usuv1:fau)
	  {
	      
	      System.out.println(" "+usuv1.toString());
	  
	  }
               
           
    }
}
