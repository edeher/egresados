/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.EgresadoDAOFactory;
import com.egresados2016.dao.interfaces.EgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Egresado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author Mi Laptop
 */
public class EgresadoTest {

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
egresados_sin_encuestar();;
    }
    public static void crear() throws DAOException
	{
		EgresadoDAOFactory fabricate= new EgresadoDAOFactory();
                EgresadoDAO daote= fabricate.metodoDAO();
                
		Egresado objE= new Egresado();
                
             try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("2016-02-20").getTime());    
                
                 objE.getDistritoNacimiento().setIdDistrito(1);
                 objE.getDistritoResidencia().setIdDistrito(1);
                 objE.getEscuela().setIdEscuela(1);
                 objE.setNombres("edeher");
                 objE.setApellidos("ponce");
                 objE.setFechaNac(fec);
                 objE.setDni("44444499");
                 objE.setSexo(Sexo.M);
                 objE.setDireccion("ya llego");
                 objE.setTelefono1("789456123");
                 objE.setTelefono2("321456988");
                 objE.setCorrero("@@@@@@@@");
                 objE.setAnioIngreso("2006");
                 objE.setAnioEgreso("2008");
                 objE.setNroHijos(3);
                 objE.setEstadoCivil(EstadoCivil.CO);
            
                 Egresado egre=daote.crear(objE);
	 System.out.println(" "+egre.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		
		}
     public static void modificar() throws DAOException
    {
		  EgresadoDAOFactory fabricate= new   EgresadoDAOFactory();
                 EgresadoDAO daote= fabricate.metodoDAO();
                
		  Egresado objE= new   Egresado();
                 try{
          SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
          Date fec = new Date(fe.parse("1981-02-20").getTime()); 
           Date fec1 = new Date(fe.parse("1981-02-20").getTime()); 
                 objE.setIdEgresado(3);
                 objE.getDistritoNacimiento().setIdDistrito(1);
                 objE.getDistritoResidencia().setIdDistrito(1);
                 objE.setNombres("cuarto");
                 objE.setApellidos("ponce");
                 objE.setFechaNac(fec);
                 objE.setDni("44444444");
                 objE.setSexo(Sexo.M);
                 objE.setDireccion("ya llego");
                 objE.setTelefono1("789456123");
                 objE.setTelefono2("321456988");
                 objE.setCorrero("@@@@@@@@");
                 objE.setAnioIngreso("2006");
                 objE.setAnioEgreso("2008");
                 objE.setNroHijos(3);
                 objE.setEstadoCivil(EstadoCivil.CO);
            
                 Egresado egre=daote.modificar(objE);
	 System.out.println(" "+egre.toString());
         
         
           } 
                          catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		}
    
       public static void leerxid()throws DAOException
	{
		  EgresadoDAOFactory fabricate= new   EgresadoDAOFactory();
                  EgresadoDAO daote= fabricate.metodoDAO();
                
		  Egresado objE= new   Egresado();
		 objE.setIdEgresado(2);
              
                  Egresado egre=daote.leerxid(objE);
	 System.out.println(" "+egre.toString());
		
		}
     
       public static void leertodo()throws DAOException
	{
		  EgresadoDAOFactory fabricate= new   EgresadoDAOFactory();
                  EgresadoDAO daote= fabricate.metodoDAO();
       
	  Egresado[] egre=daote.leertodo();
	  
	  for(  Egresado egre1:egre)
	  {
	      
	      System.out.println(" "+egre1.toString());
	  
	  }
	 
        }
       public static void egresados_sin_encuestar()throws DAOException
	{
		  EgresadoDAOFactory fabricate= new   EgresadoDAOFactory();
                  EgresadoDAO daote= fabricate.metodoDAO();
       
	  Egresado[] egre=daote.egresados_sin_encuestar();
	  
	  for(  Egresado egre1:egre)
	  {
	      
	      System.out.println(" "+egre1.toString());
	  
	  }
	 
        }
       public static void eliminar()throws DAOException
	{
		   EgresadoDAOFactory fabricate= new    EgresadoDAOFactory();
                   EgresadoDAO daote= fabricate.metodoDAO();
                   Egresado objE= new    Egresado();
		 objE.setIdEgresado(2);
                
	 daote.eliminar(objE);
	 System.out.println("se elimino correctamente");
	 
	    
	}
        public static void destruir()throws DAOException
	{
		   EgresadoDAOFactory fabricate= new    EgresadoDAOFactory();
                   EgresadoDAO daote= fabricate.metodoDAO();
                   Egresado objE= new    Egresado();
		 objE.setIdEgresado(6);
                
	 daote.destruir(objE);
	 System.out.println("se destruyo correctamente");
	 
	    
	}
}
