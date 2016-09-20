/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.EstudiosDAOFactory;
import com.egresados2016.dao.interfaces.EstudiosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.modelo.Estudios;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Mi Laptop
 */
public class EstudiosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException, ParseException{
        // TODO code application logic here
//        crear();
        modificar();
//        leerxid();
//        leertodo();
//        leertodoxidEgresado();
//        eliminar();
//        destruir();
    }
    public static void crear() throws DAOException, ParseException
	{
		EstudiosDAOFactory fabricate= new EstudiosDAOFactory();
                EstudiosDAO daote= fabricate.metodoDAO();
                
		Estudios objEs= new Estudios();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                
                 objEs.getEgresado().setIdEgresado(1);
                 objEs.setMencion("pruebass");
                 objEs.setInstitucion("pruebitas");
                 
                 objEs.setFechaInicio(fec);
                 objEs.setFechaFin(fec);
                 
                 objEs.setDuraAcademica("horas");
                 objEs.setCantidad("12");
                 
                 objEs.setPais("noruega");
                 objEs.setFinanciamiento("de otros");
                
            
                Estudios estu=daote.crear(objEs);
	 System.out.println(" "+estu.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		
		}
     public static void modificar() throws DAOException
    {
		EstudiosDAOFactory fabricate= new EstudiosDAOFactory();
                EstudiosDAO daote= fabricate.metodoDAO();
                
		Estudios objEs= new Estudios();
                System.out.println("entrando ");
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                
                 objEs.setIdEstudios(1);
                 objEs.getEgresado().setIdEgresado(1);
                 objEs.setMencion("pruebas1234");
                 objEs.setInstitucion("pruebitas1234");
                 
                 objEs.setFechaInicio(fec);
                 objEs.setFechaFin(fec);
                 
                 objEs.setDuraAcademica("horas");
                 objEs.setCantidad("12");
                 
                 objEs.setPais("noruega");
                 objEs.setFinanciamiento("de otros");
                
            
                Estudios estu=daote.modificar(objEs);
                 
	 System.out.println(" "+estu.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		}
    
       public static void leerxid()throws DAOException
	{
		   EstudiosDAOFactory fabricate= new    EstudiosDAOFactory();
                   EstudiosDAO daote= fabricate.metodoDAO();
                
		  Estudios objEs= new    Estudios();
		 objEs.setIdEstudios(2);
              
                   Estudios estu=daote.leerxid(objEs);
	 System.out.println(" "+estu.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		   EstudiosDAOFactory fabricate= new    EstudiosDAOFactory();
                   EstudiosDAO daote= fabricate.metodoDAO();
       
	   Estudios[] estu=daote.leertodo();
	  
	  for(   Estudios estu1:estu)
	  {
	      
	      System.out.println(" "+estu1.toString());
	  
	  }
	 
        }
        public static void leertodoxidEgresado()throws DAOException
	{
		   EstudiosDAOFactory fabricate= new    EstudiosDAOFactory();
                   EstudiosDAO daote= fabricate.metodoDAO();
                     Estudios objEs= new    Estudios();
		 objEs.getEgresado().setIdEgresado(1);
       
	   Estudios[] estu=daote.leertodoxidEgresado(objEs);
	  
	  for(   Estudios estu1:estu)
	  {
	      
	      System.out.println(" "+estu1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		    EstudiosDAOFactory fabricate= new     EstudiosDAOFactory();
                   EstudiosDAO daote= fabricate.metodoDAO();
                    Estudios objEs= new     Estudios();
		 objEs.setIdEstudios(6);
                
	 daote.eliminar(objEs);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		    EstudiosDAOFactory fabricate= new     EstudiosDAOFactory();
                    EstudiosDAO daote= fabricate.metodoDAO();
                    Estudios objEs= new     Estudios();
		 objEs.setIdEstudios(6);
                
	 daote.destruir(objEs);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
