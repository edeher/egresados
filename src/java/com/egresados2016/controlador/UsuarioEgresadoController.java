/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.EgresadoDAOFactory;
import com.egresados2016.dao.factory.UsuarioEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.EgresadoDAO;
import com.egresados2016.dao.interfaces.UsuarioEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Egresado;
import com.egresados2016.modelo.UsuarioEgresado;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author i7
 */
@WebServlet(name = "UsuarioEgresadoController", urlPatterns = {"/UsuarioEgresadoController"})
@MultipartConfig
public class UsuarioEgresadoController extends HttpServlet {
    private UsuarioEgresado objU;
    private UsuarioEgresadoDAOFactory fabricate;
    private UsuarioEgresadoDAO daote;
   
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DAOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
     String accion=request.getParameter("accion");
        fabricate =new UsuarioEgresadoDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion)
        {
            case "validar":validar(request,response);
                break;
            case "cerrarsesion":cerrarsesion(request,response);
                break;
            case "crear":crear(request,response);
                break;
            case "crear_n1":crear_n1(request,response);
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (DAOException ex) {
        Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(UsuarioEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (DAOException ex) {
        Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(UsuarioEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void validar(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
       HttpSession sesion=request.getSession();
        System.out.println("ingreso a opcion");
        
        Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        
      objU=new UsuarioEgresado();
      objU.setUsuario(request.getParameter("usuario"));
      String usuarios=request.getParameter("usuario");
      objU.setContrasena(request.getParameter("clave"));
       String claves=request.getParameter("clave");
        System.out.println("buscando");
        
        
      UsuarioEgresado usu1=daote.validar(objU);
      System.out.println("buscando1");
       
     
       if (usu1 != null){
            
           System.out.println("entro al if principal");
             sesion.setAttribute("sesion",usu1);
             
             
             System.out.println("entro al if  de usuario");
             response.sendRedirect("JSPview/VerUsuEgresado.jsp");
           
            
        }
        else{
           System.out.println("no ingreso ningun usuario");
             response.sendRedirect("JSPsession/error.jsp");
        }
      
      
    }

    private void cerrarsesion(HttpServletRequest request, HttpServletResponse response) throws IOException {
          HttpSession sesion=request.getSession();
         UsuarioEgresado   usu=(UsuarioEgresado)sesion.getAttribute("sesion");
        sesion.removeAttribute("sesion");
        response.sendRedirect("JSPsession/loginEgresado.jsp");
    }

    private void crear_n1(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
        objU = new UsuarioEgresado();
        Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        String contrasenanew=request.getParameter("password22");
       System.out.println("entrando");
         SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
         Date fec = new Date(fe.parse(request.getParameter("fechaNa2")).getTime());    
       
         System.out.println("recibio");
               
       objU.getEgresado().getDistritoNacimiento().setIdDistrito(Integer.parseInt(request.getParameter("SelectDisNa2"))   );
                 objU.getEgresado().getDistritoResidencia().setIdDistrito(Integer.parseInt(request.getParameter("SelectDisRe2")) );
                 objU.getEgresado().getEscuela().setIdEscuela(Integer.parseInt(request.getParameter("SelectEscuela2")) );
                 objU.getEgresado().setNombres(request.getParameter("nombres2").toString().toUpperCase());
                 objU.getEgresado().setApellidos(request.getParameter("apellidos2").toString().toUpperCase());
                objU.getEgresado().setFechaNac(fec);
                 objU.getEgresado().setDni(request.getParameter("dni2"));
                 objU.getEgresado().setSexo(Sexo.valueOf(request.getParameter("sexo2"))  );
                objU.getEgresado().setDireccion(request.getParameter("direccion2"));
                 objU.getEgresado().setTelefono1(request.getParameter("telefono12"));
                objU.getEgresado().setTelefono2(request.getParameter("telefono22"));
                objU.getEgresado().setCorrero(request.getParameter("correo2").toString().toLowerCase());
                 objU.getEgresado().setAnioIngreso(request.getParameter("anioingreso2"));
                 objU.getEgresado().setAnioEgreso(request.getParameter("anioegreso2"));
                 objU.getEgresado().setNroHijos(Integer.parseInt(request.getParameter("nrohijos2")));
                 objU.getEgresado().setEstadoCivil(EstadoCivil.valueOf(request.getParameter("estadoci2")) );
                 objU.setUsuario(request.getParameter("usuario2"));
                 objU.setContrasena(request.getParameter("password2"));
       
       UsuarioEgresado autor=daote.crear_n1(objU, contrasenanew);
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(autor==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        objU = new UsuarioEgresado();
        Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
      
           
         String contrasenanew=request.getParameter("password2");
        
               
       objU.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado1")));
        
       objU.setUsuario(request.getParameter("usuario1"));
       
       objU.setContrasena(request.getParameter("password1"));
     
        
       UsuarioEgresado usuegre=daote.crear(objU, contrasenanew);
         try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(usuegre==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
           
        }
    }

}
