/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.UsuarioEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.UsuarioEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.UsuarioEgresado;

/**
 *
 * @author i7
 */
public class UsuarioEgresadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        // TODO code application logic here
//        crear();
//        modcontrasena();
//        leerxid();
//        leertodo();
validar();
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
