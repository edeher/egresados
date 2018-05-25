/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.EscuelaDAOFactory;
import com.egresados2016.dao.interfaces.EscuelaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Escuela;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "EscuelaController", urlPatterns = {"/EscuelaController"})
@MultipartConfig
public class EscuelaController extends HttpServlet {
private EscuelaDAOFactory fabricate;
private EscuelaDAO daote;
private Escuela objEs;
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
       fabricate=new EscuelaDAOFactory();
       daote=fabricate.metodoDAO();
       
       switch(accion){
           
           case "obtenerporFacultad":obtenerporFacultad(request,response);break;
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
        Logger.getLogger(EscuelaController.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(EscuelaController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obtenerporFacultad(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
      response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        objEs=new Escuela();
      
        
        objEs.getFacultad().setIdFacultad(Integer.parseInt(request.getParameter("codigo")));
        
        Escuela []escu=daote.leertodo(objEs);
        StringBuilder escuelas=new StringBuilder();
        for(Escuela escu1: escu)
        {
            escuelas.append("<option value='").append(escu1.getIdEscuela()).append("'>")
                    .append(escu1.getDescripcion()).append("</option>");
        }
        out.print(escuelas.toString());
    }

}
