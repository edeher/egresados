/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.PreguntaDAOFactory;
import com.egresados2016.dao.interfaces.PreguntaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.TipoPreguntas;
import com.egresados2016.modelo.Pregunta;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 *
 * @author Mi Laptop
 */
@WebServlet(name = "PreguntaController", urlPatterns = {"/PreguntaController"})
@MultipartConfig
public class PreguntaController extends HttpServlet {
    private PreguntaDAOFactory fabricate;
    private PreguntaDAO daote ;
    private Pregunta objPre;
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
            throws ServletException, IOException, DAOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion= request.getParameter("accion");
        fabricate =new PreguntaDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion){
            
            case "obtenertodos":obtenertodos(request,response);break;
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
            Logger.getLogger(PreguntaController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PreguntaController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obtenertodos(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        objPre=new Pregunta();
       
       
       Pregunta[] pre=daote.leertodo();
       
       JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayPregunta = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosPregunta; 
       for (Pregunta pre1 : pre) {
            //System.out.println(solicitud.toString());            
            arrayDatosPregunta = Json.createArrayBuilder();
             arrayDatosPregunta.add(pre1.getIdPregunta());
             arrayDatosPregunta.add(pre1.getEncuesta().getDescripcion());
            arrayDatosPregunta.add(pre1.getTipopregunta().getNom());
            
            arrayDatosPregunta.add(pre1.getDescripcion());
            
             
            arrayPregunta.add(arrayDatosPregunta);
        }
        objbuilder.add("data", arrayPregunta);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       objPre =new Pregunta();
       objPre.getEncuesta().setIdEncuesta(Integer.parseInt(request.getParameter("idEncuesta")));
       objPre.setTipopregunta(TipoPreguntas.valueOf(request.getParameter("tipopregunta")));
       objPre.setDescripcion(request.getParameter("descripcion"));
       
       Pregunta pregu=daote.crear(objPre);
       
         try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(pregu==null){
                      pw.println(0); 
                 }else
                 {
                     int id=pregu.getIdPregunta();
                      pw.println(id); 
                 }
                 
           
        }
       
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        objPre =new Pregunta();
        objPre.setIdPregunta(Integer.parseInt(request.getParameter("idPregunta")));
       objPre.getEncuesta().setIdEncuesta(Integer.parseInt(request.getParameter("idEncuesta")));
       objPre.setTipopregunta(TipoPreguntas.valueOf(request.getParameter("tipopregunta")));
       objPre.setDescripcion(request.getParameter("descripcion"));
       
       Pregunta pregu=daote.modificar(objPre);
       
         try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(pregu==null){
                      pw.println(0); 
                 }else
                 {
                     int id=pregu.getIdPregunta();
                      pw.println(id); 
                 }
                 
           
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws DAOException {
       objPre =new Pregunta();
        
        objPre.setIdPregunta(Integer.parseInt(request.getParameter("idPregunta")));
        
        System.out.println("codigo llego :"+objPre.getIdPregunta());
        daote.destruir(objPre);
        System.out.println("destruido");
    }

}
