/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.DepartamentoDAOFactory;
import com.egresados2016.dao.interfaces.DepartamentoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Departamento;
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
@WebServlet(name = "DepartamentoController", urlPatterns = {"/DepartamentoController"})
@MultipartConfig
public class DepartamentoController extends HttpServlet {
private Departamento objDe;
private DepartamentoDAO daote;
private DepartamentoDAOFactory fabricate;
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
      fabricate= new DepartamentoDAOFactory();
      daote=fabricate.metodoDAO();
      
      switch(accion)
      {
          case "obtenertodos":obtenertodos(request,response);break;
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
        Logger.getLogger(DepartamentoController.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(DepartamentoController.class.getName()).log(Level.SEVERE, null, ex);
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
       Departamento[] depa = daote.leertodo();         
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayDepartamento = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosDepartamento; 
       for (Departamento depa1 : depa) {
            //System.out.println(solicitud.toString());            
            arrayDatosDepartamento = Json.createArrayBuilder();
            arrayDatosDepartamento.add(depa1 .getIdDepartamento());
            arrayDatosDepartamento.add(depa1 .getDescripcion());
           
            arrayDepartamento.add(arrayDatosDepartamento);
        }
        objbuilder.add("data", arrayDepartamento );
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

}
