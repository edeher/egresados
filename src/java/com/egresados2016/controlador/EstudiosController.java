/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.EstudiosDAOFactory;
import com.egresados2016.dao.interfaces.EstudiosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Estudios;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "EstudiosController", urlPatterns = {"/EstudiosController"})
@MultipartConfig
public class EstudiosController extends HttpServlet {
    private EstudiosDAOFactory fabricate;
    private EstudiosDAO daote;
    private Estudios objEs;

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
        fabricate=new EstudiosDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion)
        {   
            case "obetenerxEgresado":obetenerxEgresado(request,response); break;
            case "crear":crear(request,response);break;
            case "modififcar":modificar(request,response);break;
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
            Logger.getLogger(EstudiosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EstudiosController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EstudiosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EstudiosController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obetenerxEgresado(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        objEs=new Estudios();
        objEs.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("codigo")));
        Estudios[] estu=daote.leertodoxidEgresado(objEs);
        
         JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayEstudios = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosEstudios; 
       for (Estudios estu1 : estu) {
            //System.out.println(solicitud.toString());            
            arrayDatosEstudios = Json.createArrayBuilder();
            arrayDatosEstudios.add(estu1.getIdEstudios());
            arrayDatosEstudios.add(estu1.getMencion());
            arrayDatosEstudios.add(estu1.getInstitucion());
            arrayDatosEstudios.add(estu1.getFechaInicio().toString());
            arrayDatosEstudios.add(estu1.getFechaFin().toString());
             
            arrayEstudios.add(arrayDatosEstudios);
}
        objbuilder.add("data", arrayEstudios);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
        
        
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
     objEs = new Estudios();
     SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fechainicio = new Date(fe.parse(request.getParameter("fechaini")).getTime());
        Date fechafin = new Date(fe.parse(request.getParameter("fechafin")).getTime());
     
     
     objEs.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado4")));
     objEs.setMencion(request.getParameter("mencion"));
     objEs.setInstitucion(request.getParameter("institucion"));
     objEs.setFechaInicio(fechainicio);
     objEs.setFechaFin(fechafin);
     objEs.setDuraAcademica(request.getParameter("duracionacademica"));
     objEs.setCantidad(request.getParameter("cantidad"));
     objEs.setPais(request.getParameter("pais"));
     objEs.setFinanciamiento(request.getParameter("financiamiento"));
     
        Estudios estu=daote.crear(objEs);
            try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(estu==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
        objEs = new Estudios();
     SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fechainicio = new Date(fe.parse(request.getParameter("fechaini")).getTime());
        Date fechafin = new Date(fe.parse(request.getParameter("fechafin")).getTime());
     
     objEs.setIdEstudios(Integer.parseInt(request.getParameter("idEstudios")));
     objEs.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado5")));
     objEs.setMencion(request.getParameter("mencion"));
     objEs.setInstitucion(request.getParameter("institucion"));
     objEs.setFechaInicio(fechainicio);
     objEs.setFechaFin(fechafin);
     objEs.setDuraAcademica(request.getParameter("duracionacademica"));
     objEs.setCantidad(request.getParameter("cantidad"));
     objEs.setPais(request.getParameter("pais"));
     objEs.setFinanciamiento(request.getParameter("financiamiento"));
     
        Estudios estu=daote.modificar(objEs);
            try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(estu==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws DAOException {
       objEs= new Estudios();
       objEs.setIdEstudios(Integer.parseInt(request.getParameter("idEstudios")));
       
       daote.destruir(objEs);
    }

}
