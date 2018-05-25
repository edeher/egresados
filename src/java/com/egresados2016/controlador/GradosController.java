/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.GradosDAOFactory;
import com.egresados2016.dao.interfaces.GradosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Escuela;
import com.egresados2016.modelo.Grados;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mi Laptop
 */
@WebServlet(name = "GradosController", urlPatterns = {"/GradosController"})
public class GradosController extends HttpServlet {
    private GradosDAOFactory fabricate;
    private GradosDAO daote;
    private Grados objGra;

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
        fabricate = new GradosDAOFactory();
        daote=fabricate.metodoDAO();
        switch(accion){
        
            case "obtenerporEscuela":obtenerporEscuela(request,response);break;
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
            Logger.getLogger(GradosController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GradosController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obtenerporEscuela(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        objGra=new Grados();
        objGra.getEscuela().setIdEscuela(Integer.parseInt(request.getParameter("codigo")));
        
        Grados []grado=daote.leertodoxEscuela(objGra);
        StringBuilder grados=new StringBuilder();
        for(Grados grado1: grado)
        {
            grados.append("<option value='").append(grado1.getIdGrados()).append("'>")
                    .append(grado1.getDescripcion()).append("</option>");
        }
        out.print(grados.toString());
        
    }

}
