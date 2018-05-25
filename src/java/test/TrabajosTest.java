/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.TrabajosDAOFactory;
import com.egresados2016.dao.interfaces.TrabajosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.TipoContrato;
import com.egresados2016.enums.TipoJornada;
import com.egresados2016.modelo.Trabajos;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Mi Laptop
 */
public class TrabajosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException, ParseException{
        // TODO code application logic here
//        crear();
//        modificar();
//        leerxid();
//        leertodo();
        leertodoxidEgresado();
//        eliminar();
//        destruir();
    }
    public static void crear() throws DAOException, ParseException
	{
		TrabajosDAOFactory fabricate= new TrabajosDAOFactory();
                TrabajosDAO daote= fabricate.metodoDAO();
                
		Trabajos objTra= new Trabajos();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                
                 objTra.getEgresado().setIdEgresado(1);
                 objTra.setFechaInicio(fec);
                 objTra.setFechaFin(fec);
                 objTra.setPuesto("jefe");
                 objTra.setNomInstitucion("seguritas");
                 objTra.setTipocontrato(TipoContrato.LO);
                 objTra.setSueldo("2000-1200");
                 objTra.setTipojornada(TipoJornada.JC);
            
                Trabajos traba=daote.crear(objTra);
	 System.out.println(" "+traba.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		
		}
     public static void modificar() throws DAOException
   {
		TrabajosDAOFactory fabricate= new TrabajosDAOFactory();
                TrabajosDAO daote= fabricate.metodoDAO();
                
		Trabajos objTra= new Trabajos();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                 objTra.setIdTrabajos(1);
                 objTra.getEgresado().setIdEgresado(1);
                 objTra.setFechaInicio(fec);
                 objTra.setFechaFin(fec);
                 objTra.setPuesto("jefe exteriorr");
                 objTra.setNomInstitucion("aguilas");
                 objTra.setTipocontrato(TipoContrato.CA);
                 objTra.setSueldo("2000-1200");
                 objTra.setTipojornada(TipoJornada.JH);
            
                Trabajos estu=daote.modificar(objTra);
	 System.out.println(" "+estu.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		}
    
       public static void leerxid()throws DAOException
	{
		  TrabajosDAOFactory fabricate= new    TrabajosDAOFactory();
                   TrabajosDAO daote= fabricate.metodoDAO();
                
		  Trabajos objTra= new    Trabajos();
		 objTra.setIdTrabajos(2);
              
                   Trabajos estu=daote.leerxid(objTra);
	 System.out.println(" "+estu.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		   TrabajosDAOFactory fabricate= new    TrabajosDAOFactory();
                   TrabajosDAO daote= fabricate.metodoDAO();
       
	   Trabajos[] traba=daote.leertodo();
	  
	  for(  Trabajos traba1:traba)
	  {
	      
	      System.out.println(" "+traba1.toString());
	  
	  }
	 
        }
        public static void leertodoxidEgresado()throws DAOException
	{
		   TrabajosDAOFactory fabricate= new    TrabajosDAOFactory();
                   TrabajosDAO daote= fabricate.metodoDAO();
                     Trabajos objEs= new  Trabajos();
		 objEs.getEgresado().setIdEgresado(2);
       
	  Trabajos[] traba=daote.leertodoxidEgresado(objEs);
	  
	  for( Trabajos traba1:traba)
	  {
	      
	      System.out.println(" "+traba1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		    TrabajosDAOFactory fabricate= new  TrabajosDAOFactory();
                   TrabajosDAO daote= fabricate.metodoDAO();
                    Trabajos objEs= new     Trabajos();
		 objEs.setIdTrabajos(5);
                
	 daote.eliminar(objEs);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		   TrabajosDAOFactory fabricate= new TrabajosDAOFactory();
                   TrabajosDAO daote= fabricate.metodoDAO();
                   Trabajos objEs= new     Trabajos();
		 objEs.setIdTrabajos(5);
                
	 daote.destruir(objEs);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
