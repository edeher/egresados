/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.GradosDAOFactory;
import com.egresados2016.dao.interfaces.GradosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Grados;
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
@WebServlet(name = "GradosController", urlPatterns = {"/GradosController"})
@MultipartConfig
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
            case "modificar":modificar(request,response);break;
            case "crear":crear(request,response);break;
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

    private void obtenerporEscuela(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        System.out.println("recibiendo");
        /*-----------------------------------------------------------------------------------------------*/
        objGra=new Grados();
        objGra.getEscuela().setIdEscuela((Integer.parseInt(request.getParameter("codigo"))));
        System.out.println("codigo "+objGra.getEscuela().getIdEscuela());
        /*-----------------------------------------------------------------------------------------------*/  
        Grados [] grado=daote.leertodoxEscuela(objGra);
        StringBuilder gradoss=new StringBuilder();
        /*-----------------------------------------------------------------------------------------------*/  
        for(Grados grado1: grado)
        {
            System.out.println("sss"+grado1);
           gradoss.append("<option value='").append(grado1.getIdGrados()).append("'>")
                    .append(grado1.getDescripcion()).append("</option>");
        }
        out.print(gradoss.toString());
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
