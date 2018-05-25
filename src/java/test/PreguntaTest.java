/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.PreguntaDAOFactory;
import com.egresados2016.dao.interfaces.PreguntaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.TipoPreguntas;
import com.egresados2016.modelo.Pregunta;

/**
 *
 * @author Mi Laptop
 */
public class PreguntaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
        // TODO code application logic here
//        crear();
//        modificar();
        leerxid();
//        leertodo();
//        eliminar();
//        destruir();
    }
    public static void crear() throws DAOException
	{
		PreguntaDAOFactory fabricate= new PreguntaDAOFactory();
                PreguntaDAO daote= fabricate.metodoDAO();
                
		Pregunta objPr= new Pregunta();
                objPr.getEncuesta().setIdEncuesta(1);
                objPr.setTipopregunta(TipoPreguntas.L);
		 objPr.setDescripcion("morals");
              
                
              
                
                Pregunta autorr=daote.crear(objPr);
	 System.out.println(" "+autorr.toString());
		
		}
     public static void modificar() throws DAOException
    {
		PreguntaDAOFactory fabricate= new PreguntaDAOFactory();
                PreguntaDAO daote= fabricate.metodoDAO();
                
		Pregunta objPr= new Pregunta();
                objPr.setIdPregunta(17);
                objPr.getEncuesta().setIdEncuesta(1);
                objPr.setTipopregunta(TipoPreguntas.L);
		 objPr.setDescripcion("edeherrrr");
              
                 Pregunta pregu=daote.modificar(objPr);
	 System.out.println(" "+pregu.toString());
		
		}
    
       public static void leerxid()throws DAOException
	{
		PreguntaDAOFactory fabricate= new PreguntaDAOFactory();
               PreguntaDAO daote= fabricate.metodoDAO();
                
		Pregunta objPr= new Pregunta();
		 objPr.setIdPregunta(18);
              
                 Pregunta Pregu=daote.leerxid(objPr);
	 System.out.println(" "+Pregu.toString());
		
		}
      public static void leertodo()throws DAOException
	{
		PreguntaDAOFactory fabricate= new PreguntaDAOFactory();
                PreguntaDAO daote= fabricate.metodoDAO();
       
               
	 Pregunta[] pregu=daote.leertodo();
	  
	  for(Pregunta pregu1:pregu)
	  {
	      
	      System.out.println(" "+pregu1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		 PreguntaDAOFactory fabricate= new  PreguntaDAOFactory();
                 PreguntaDAO daote= fabricate.metodoDAO();
                 Pregunta objPr= new  Pregunta();
		 objPr.setIdPregunta(2);
                
	 daote.eliminar(objPr);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		 PreguntaDAOFactory fabricate= new  PreguntaDAOFactory();
                 PreguntaDAO daote= fabricate.metodoDAO();
                 Pregunta objFa= new  Pregunta();
		 objFa.setIdPregunta(10);
                
	 daote.destruir(objFa);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
