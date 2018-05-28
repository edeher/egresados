/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.UsuarioEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.UsuarioEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.UsuarioEgresado;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author i7
 */
public class UsuarioEgresadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException, ParseException {
        // TODO code application logic here
        crear_n1();
//        crear();
//        modcontrasena();
//        leerxid();
//        leertodo();
//validar();
    }
     public static void crear() throws DAOException
	{
		UsuarioEgresadoDAOFactory fabricate= new UsuarioEgresadoDAOFactory();
                UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
                 String contrasenanew="poderoso";
                
		UsuarioEgresado objUsu= new UsuarioEgresado();
                
                    objUsu.getEgresado().setIdEgresado(11);
                    objUsu.setUsuario("mayong3");
                    objUsu.setContrasena("poderoso");
                    
            
                UsuarioEgresado usuario=daote.crear(objUsu,contrasenanew);
	 System.out.println(" "+usuario.toString());
         
         
		
		}
       public static void crear_n1() throws DAOException
	{
		UsuarioEgresadoDAOFactory fabricate= new UsuarioEgresadoDAOFactory();
                UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
               
                
		UsuarioEgresado objUsu= new UsuarioEgresado();
                
                 try{
                     String contrasenanew="poderoso";
                        SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
                        Date fec = new Date(fe.parse("2016-02-20").getTime());   

                 objUsu.getEgresado().getDistritoNacimiento().setIdDistrito(1);
                 objUsu.getEgresado().getDistritoResidencia().setIdDistrito(1);
                 objUsu.getEgresado().getEscuela().setIdEscuela(1);
                 objUsu.getEgresado().setNombres("edeher");
                 objUsu.getEgresado().setApellidos("ponce");
                 objUsu.getEgresado().setFechaNac(fec);
                 objUsu.getEgresado().setDni("44444466");
                 objUsu.getEgresado().setSexo(Sexo.M);
                 objUsu.getEgresado().setDireccion("ya llego");
                 objUsu.getEgresado().setTelefono1("789456123");
                 objUsu.getEgresado().setTelefono2("321456988");
                 objUsu.getEgresado().setCorrero("@@@@@@@@");
                 objUsu.getEgresado().setAnioIngreso("2006");
                 objUsu.getEgresado().setAnioEgreso("2008");
                 objUsu.getEgresado().setNroHijos(3);
                 objUsu.getEgresado().setEstadoCivil(EstadoCivil.CO);
                 objUsu.setUsuario("mayong7");
                 objUsu.setContrasena("poderoso");
                    
            
                UsuarioEgresado usuario=daote.crear_n1(objUsu, contrasenanew);
                System.out.println(" "+usuario.toString());
         
         }catch (ParseException e) {
			System.out.println("Fecha invalida: " + e.getMessage());
                        }
		
		}
       public static void modcontrasena() throws DAOException
	{
		UsuarioEgresadoDAOFactory fabricate= new UsuarioEgresadoDAOFactory();
                UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
                String contrasenanew="poderoso144";
                  String contrasenanew1="poderoso144";      
		UsuarioEgresado objUsu= new UsuarioEgresado();
                    objUsu.setIdUsuarioEgresado(2);
                    objUsu.setUsuario("pepito2");
                    objUsu.setContrasena("poderoso12");
                    
                    
            
                 UsuarioEgresado usuario=daote.modcontraseña(objUsu, contrasenanew,contrasenanew1);
	 System.out.println(" "+usuario.toString());
         
         
		
		}
       
         public static void leerxid()throws DAOException
	{
		  UsuarioEgresadoDAOFactory fabricate= new    UsuarioEgresadoDAOFactory();
                   UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
		  UsuarioEgresado objUsu= new  UsuarioEgresado();
		 objUsu.setIdUsuarioEgresado(2);
              
                   UsuarioEgresado usu=daote.leerxid(objUsu);
	 System.out.println(" "+usu.toString());
		
		}
         
         
            public static void leertodo()throws DAOException
	{
		   UsuarioEgresadoDAOFactory fabricate= new    UsuarioEgresadoDAOFactory();
                   UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                   
                    
		
       
	  UsuarioEgresado[] estu=daote.leertodo();
	  
	  for(   UsuarioEgresado estu1:estu)
	  {
	      
	      System.out.println(" "+estu1.toString());
	  
	  }
	 
        }
            
            public static void validar()throws DAOException
	{
		 UsuarioEgresadoDAOFactory fabricate= new    UsuarioEgresadoDAOFactory();
                   UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
		 UsuarioEgresado objUsu= new    UsuarioEgresado();
		 objUsu.setUsuario("mayong3");
                 objUsu.setContrasena("poderoso");
              
                   UsuarioEgresado usu=daote.validar(objUsu);
	 System.out.println(" "+usu.toString());
		
		}   
}
