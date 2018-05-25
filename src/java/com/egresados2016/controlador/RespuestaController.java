/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.RespuestaDAOFactory;
import com.egresados2016.dao.interfaces.RespuestaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.Grupo;
import com.egresados2016.modelo.Respuesta;
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
@WebServlet(name = "RespuestaController", urlPatterns = {"/RespuestaController"})
@MultipartConfig
public class RespuestaController extends HttpServlet {
    private RespuestaDAOFactory fabricate;
    private RespuestaDAO daote;
    private Respuesta objRes;

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
       String accion=request.getParameter("accion");
       
       fabricate= new RespuestaDAOFactory();
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
            Logger.getLogger(RespuestaController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RespuestaController.class.getName()).log(Level.SEVERE, null, ex);
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
         objRes =new Respuesta();
       
       
       Respuesta[] respu=daote.leertodo();
       
       JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayRespuesta = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosRespuesta; 
       for (Respuesta respu1 : respu) {
            //System.out.println(solicitud.toString());            
            arrayDatosRespuesta = Json.createArrayBuilder();
             arrayDatosRespuesta.add(respu1.getIdRespuesta());
             arrayDatosRespuesta.add(respu1.getGrupo().getNom());
            arrayDatosRespuesta.add(respu1.getDescripcion());
            
                     
             
            arrayRespuesta.add(arrayDatosRespuesta);
        }
        objbuilder.add("data", arrayRespuesta);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       objRes =new Respuesta();
       
       objRes.setGrupo(Grupo.valueOf(request.getParameter("grupopregunta")));
       objRes.setDescripcion(request.getParameter("descripcion"));
       
       Respuesta respu=daote.crear(objRes);
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(respu==null){
                      pw.println(0); 
                 }else
                 {
                     int id=respu.getIdRespuesta();
                      pw.println(id); 
                 }
                 
           
        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       objRes =new Respuesta();
       objRes.setIdRespuesta(Integer.parseInt(request.getParameter("idRespuesta")));
       objRes.setGrupo(Grupo.valueOf(request.getParameter("grupopregunta")));
       objRes.setDescripcion(request.getParameter("descripcion"));
       
       Respuesta respu=daote.modificar(objRes);
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(respu==null){
                      pw.println(0); 
                 }else
                 {
                     int id=respu.getIdRespuesta();
                      pw.println(id); 
                 }
                 
           
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws DAOException {
       objRes =new Respuesta();
        
        objRes.setIdRespuesta(Integer.parseInt(request.getParameter("idRespuesta")));
        
        System.out.println("codigo llego :"+ objRes.getIdRespuesta());
        daote.destruir(objRes);
        System.out.println("destruido");
    }

}
