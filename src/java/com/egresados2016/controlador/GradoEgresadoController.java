/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.GradoEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.GradoEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.GradoEgresado;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static test.EgresadoTest.eliminar;

/**
 *
 * @author Mi Laptop
 */
@WebServlet(name = "GradoEgresadoController", urlPatterns = {"/GradoEgresadoController"})
@MultipartConfig
public class GradoEgresadoController extends HttpServlet {
    private GradoEgresadoDAOFactory fabricate;
    private GradoEgresadoDAO daote;
    private GradoEgresado objGraEgre;

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
        fabricate=new GradoEgresadoDAOFactory();
        daote=fabricate.metodoDAO();
        switch(accion)
        {
            case "obtenerxidEgresado":obtenerxidEgresado(request,response);break;
            case "crear":crear(request,response);break;
            case "modificar":modificar(request,response);break;
            case "eliminar":eliminar(request,response);break;
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
            Logger.getLogger(GradoEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GradoEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GradoEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GradoEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obtenerxidEgresado(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
     objGraEgre=new GradoEgresado();
     objGraEgre.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("codigo")));
     
     GradoEgresado [] graegre=daote.leertodoxegresados(objGraEgre);
     
      JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayGradoEgresado = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosGradoEgresado; 
       for (GradoEgresado graegre1 :graegre) {
            //System.out.println(solicitud.toString());            
            arrayDatosGradoEgresado = Json.createArrayBuilder();
             arrayDatosGradoEgresado.add(graegre1.getIdGradoEgresado() );
            arrayDatosGradoEgresado.add(graegre1.getGrados().getEscuela().getFacultad().getDescripcion());
            arrayDatosGradoEgresado.add(graegre1.getGrados().getEscuela().getDescripcion());
            arrayDatosGradoEgresado.add(graegre1.getGrados().getDescripcion());
            
             
            arrayGradoEgresado.add(arrayDatosGradoEgresado);
        }
        objbuilder.add("data", arrayGradoEgresado);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
      objGraEgre =new GradoEgresado();
      
//      Enumeration enumeration=request.getParameterNames();
//        while (enumeration.hasMoreElements())
//        {
//        System.out.println(enumeration.nextElement());
//        }
      SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fecha = new Date(fe.parse(request.getParameter("fechaGrado")).getTime());
//      
      objGraEgre.getGrados().setIdGrados(Integer.parseInt(request.getParameter("grado")));
      objGraEgre.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado2")));
      objGraEgre.setFecha(fecha);
        System.out.println("creando");
        GradoEgresado graegre=daote.crear(objGraEgre);
              
            try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(graegre==null){
                      pw.println(0); 
                 }else
                 {
                   //   int id=graegre.getIdGradoEgresado();
                    
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException, ParseException {
       objGraEgre =new GradoEgresado();
        System.out.println("ingresando");
//      
      SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fecha = new Date(fe.parse(request.getParameter("fechaGrado")).getTime());
       
      objGraEgre.setIdGradoEgresado(Integer.parseInt(request.getParameter("idGradoEgresado")));
      objGraEgre.getGrados().setIdGrados(Integer.parseInt(request.getParameter("grado")));
      objGraEgre.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado7")));
      objGraEgre.setFecha(fecha);
        System.out.println("creando");
        GradoEgresado graegre=daote.modificar(objGraEgre);
              
            try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(graegre==null){
                      pw.println(0); 
                      System.out.println("no modificado");
                 }else
                 {
                   //   int id=graegre.getIdGradoEgresado();
                     System.out.println("modificado");
                     pw.println(1); 
                 }
                 
           
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws DAOException {
        objGraEgre =new GradoEgresado();
        
        objGraEgre.setIdGradoEgresado(Integer.parseInt(request.getParameter("idGradoEgresado")));
        
        System.out.println("codigo llego :"+objGraEgre.getIdGradoEgresado());
        daote.destruir(objGraEgre);
        System.out.println("destruido");
    }

}
