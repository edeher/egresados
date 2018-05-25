/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.egresados2016.dao.factory.UsuarioDAOFactory;
import com.egresados2016.dao.interfaces.UsuarioDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.TipoUsuario;
import com.egresados2016.modelo.Usuario;
import java.text.ParseException;

/**
 *
 * @author Mi Laptop
 */
public class UsuarioTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        // TODO code application logic here
//        crear();
//        modcontrasena();
//        leerxid();
        validar();
    }
    public static void crear() throws DAOException
	{
		UsuarioDAOFactory fabricate= new UsuarioDAOFactory();
                UsuarioDAO daote= fabricate.metodoDAO();
                
		Usuario objUsu= new Usuario();
                
                    objUsu.setUsuario("mayong");
                    objUsu.setContrasena("poderoso");
                    objUsu.setTipoUsuario(TipoUsuario.AS);
            
                Usuario usuario=daote.crear(objUsu);
	 System.out.println(" "+usuario.toString());
         
         
		
		}
    
     public static void modcontrasena() throws DAOException
	{
		UsuarioDAOFactory fabricate= new UsuarioDAOFactory();
                UsuarioDAO daote= fabricate.metodoDAO();
                String contrasenanew="poderoso";
		Usuario objUsu= new Usuario();
                    objUsu.setIdUsuario(1);
                    objUsu.setUsuario("eponce");
                    objUsu.setContrasena("poderoso144");
                    
                    objUsu.setTipoUsuario(TipoUsuario.AS);
            
                Usuario usuario=daote.modcontrasena(objUsu, contrasenanew);
	 System.out.println(" "+usuario.toString());
         
         
		
		}

       public static void leerxid()throws DAOException
	{
		  UsuarioDAOFactory fabricate= new    UsuarioDAOFactory();
                   UsuarioDAO daote= fabricate.metodoDAO();
                
		  Usuario objUsu= new    Usuario();
		 objUsu.setIdUsuario(1);
              
                   Usuario usu=daote.leer(objUsu);
	 System.out.println(" "+usu.toString());
		
		}
     
public static void validar()throws DAOException
	{
		  UsuarioDAOFactory fabricate= new    UsuarioDAOFactory();
                   UsuarioDAO daote= fabricate.metodoDAO();
                
		  Usuario objUsu= new    Usuario();
		 objUsu.setUsuario("eponce");
                 objUsu.setContrasena("poderoso");
              
                   Usuario usu=daote.validar(objUsu);
	 System.out.println(" "+usu.toString());
		
		}   
}
