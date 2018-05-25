/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import com.egresados2016.dao.factory.EncuestaDAOFactory;
import com.egresados2016.dao.factory.EstadisticaDAOFactory;
import com.egresados2016.dao.interfaces.EncuestaDAO;
import com.egresados2016.dao.interfaces.EstadisticaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Encuesta;
import com.egresados2016.modelo.Estadistica;


/**
 *
 * @author Mi Laptop
 */
public class EstadisticaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException{
         // TODO code application logic here

//bachillerxescuela();
//bachillerxfacultad();
//tituladosxescuela();
//tituladosxfacultad();
//numeroegresados();
//numerobachilleres();
//numerotitulados();
//nroegresados_por_anio();
//nro_preguntas_all();
//nro_preguntas_egresado();
//nro_encuestados();
//nro_no_encuestados();
//pregunta7();
//pregunta6();
//pregunta23();
pregunta1();

//           
    }
   
      public static void bachillerxescuela()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.bachillerxescuela();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
         public static void bachillerxfacultad()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.bachillerxfacultad();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
           public static void tituladosxescuela()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.tituladoxescuela();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
             public static void tituladosxfacultad()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.tituladoxfacultad();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
         public static void numeroegresados()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nroegresados();
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
         public static void numerobachilleres()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nrobachilleres();
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
         public static void numerotitulados()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nrotitulados();
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
          public static void nroegresados_por_anio()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.nroegresados_x_anio();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
           public static void nro_preguntas_all()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.nro_preguntas_all_egresado();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
            public static void nro_preguntas_egresado()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nro_preguntas_por_egresado(2);
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
               public static void nro_encuestados()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nro_encuestados();
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
 public static void nro_no_encuestados()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica encu=daote.nro_no_encuestados();
	  
	 
	      
	      System.out.println(" "+encu.toString());
	  
	 
	 
        }
                  public static void pregunta18()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_18_1();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
                  public static void pregunta20()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_20_3();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
   public static void pregunta23()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_23_6();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
    public static void pregunta1()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_32_15();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
    public static void pregunta6()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_6();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
    public static void pregunta7()throws DAOException
	{
		EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
                EstadisticaDAO daote= fabricate.metodoDAO();
       
               
                  
		
	 
	 Estadistica[] encu=daote.pregunta_7();
	  
	  for(Estadistica encu1:encu)
	  {
	      
	      System.out.println(" "+encu1.toString());
	  
	  }
	 
        }
}
