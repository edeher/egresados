/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.ProvinciaDAOFactory;
import com.egresados2016.dao.interfaces.ProvinciaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Provincia;
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
@WebServlet(name = "ProvinciaController", urlPatterns = {"/ProvinciaController"})
@MultipartConfig
public class ProvinciaController extends HttpServlet {
    private Provincia objPro;
    private ProvinciaDAO daote;
    private ProvinciaDAOFactory fabricate;

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
        fabricate =new ProvinciaDAOFactory();
        daote=fabricate.metodoDAO();
        switch(accion)
        {
            case "buscarpordepartamento":buscarpordepartamento(request,response);break;
        
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
            Logger.getLogger(ProvinciaController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProvinciaController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void buscarpordepartamento(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        System.out.println("recibiendo");
        /*-----------------------------------------------------------------------------------------------*/
        objPro=new Provincia();
        objPro.getDepartamento().setIdDepartamento(Integer.parseInt(request.getParameter("codigo")));
        System.out.println("codigo "+objPro.getDepartamento().getIdDepartamento());
        /*-----------------------------------------------------------------------------------------------*/  
        Provincia []provi=daote.leertodoxdepartamento(objPro);
        StringBuilder provincias=new StringBuilder();
        /*-----------------------------------------------------------------------------------------------*/  
        for(Provincia provi1: provi)
        {
            System.out.println("sss"+provi1);
            provincias.append("<option value='").append(provi1.getIdProvincia()).append("'>")
                    .append(provi1.getDescripcion()).append("</option>");
        }
        out.print(provincias.toString());
    }

}
