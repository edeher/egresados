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
        modcontrasena();
    }
     public static void crear() throws DAOException
	{
		UsuarioEgresadoDAOFactory fabricate= new UsuarioEgresadoDAOFactory();
                UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
		UsuarioEgresado objUsu= new UsuarioEgresado();
                
                    objUsu.getEgresado().setIdEgresado(6);
                    objUsu.setUsuario("mayong");
                    objUsu.setContrasena("poderoso");
                    
            
                UsuarioEgresado usuario=daote.crear(objUsu);
	 System.out.println(" "+usuario.toString());
         
         
		
		}
     
       public static void modcontrasena() throws DAOException
	{
		UsuarioEgresadoDAOFactory fabricate= new UsuarioEgresadoDAOFactory();
                UsuarioEgresadoDAO daote= fabricate.metodoDAO();
                
                String contrasenanew="poderoso144";
                        
		UsuarioEgresado objUsu= new UsuarioEgresado();
                    objUsu.setIdUsuarioEgresado(2);
                    objUsu.setUsuario("pepito2");
                    objUsu.setContrasena("poderoso12");
                    
                    
            
                 UsuarioEgresado usuario=daote.modcontraseña(objUsu, contrasenanew);
	 System.out.println(" "+usuario.toString());
         
         
		
		}
}
