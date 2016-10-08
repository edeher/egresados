/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.DistritoDAOFactory;
import com.egresados2016.dao.interfaces.DistritoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Distrito;
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
@WebServlet(name = "DistritoController", urlPatterns = {"/DistritoController"})
@MultipartConfig
public class DistritoController extends HttpServlet {
private Distrito objDi;
private DistritoDAO daote;
private DistritoDAOFactory fabricate;
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
        fabricate=new DistritoDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion)
        {
            case "buscarporprovincia":buscarporprovincia(request,response);break;
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
        Logger.getLogger(DistritoController.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(DistritoController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void buscarporprovincia(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        objDi=new Distrito();
        objDi.getProvincia().setIdProvincia(Integer.parseInt(request.getParameter("codigo")));
        
        Distrito []distri=daote.leertodoxprovincia(objDi);
        StringBuilder distritos=new StringBuilder();
        for(Distrito distri1: distri)
        {
            distritos.append("<option value='").append(distri1.getIdDistrito()).append("'>")
                    .append(distri1.getDescripcion()).append("</option>");
        }
        out.print(distritos.toString());
    }

}
