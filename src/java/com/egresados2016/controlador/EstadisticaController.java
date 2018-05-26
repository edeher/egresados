/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.EstadisticaDAOFactory;
import com.egresados2016.dao.interfaces.EstadisticaDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Estadistica;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mi Laptop
 */
@WebServlet(name = "EstadisticaController", urlPatterns = {"/EstadisticaController"})
public class EstadisticaController extends HttpServlet {

    private Estadistica objEstad;
    private EstadisticaDAO daote;
    private EstadisticaDAOFactory fabricate;

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

        String accion = request.getParameter("accion");

        fabricate = new EstadisticaDAOFactory();
        daote = fabricate.metodoDAO();

        switch (accion) {
            case "bachillerxescuela":
                bachillerxescuela(request, response);
                break;
            case "bachillerxfacultad":
                bachillerxfacultad(request, response);
                break;
            case "tituladosxescuela":
                tituladosxescuela(request, response);
                break;
            case "tituladosxfacultad":
                tituladosxfacultad(request, response);
                break;
            case "nroegresados_x_anio":
                nroegresados_x_anio(request, response);
                break;
            case "nroegresados_x_anio2":
                nroegresados_x_anio2(request, response);
                break;

            case "pregunta_1":
                pregunta_1(request, response);
                break;
            case "pregunta_2":
                pregunta_2(request, response);
                break;
            case "pregunta_3":
                pregunta_3(request, response);
                break;
            case "pregunta_4":
                pregunta_4(request, response);
                break;
            case "pregunta_5":
                pregunta_5(request, response);
                break;
            case "pregunta_6":
                pregunta_6(request, response);
                break;
            case "pregunta_7":
                pregunta_7(request, response);
                break;
            case "pregunta_8":
                pregunta_8(request, response);
                break;
            case "pregunta_9":
                pregunta_9(request, response);
                break;
            case "pregunta_10":
                pregunta_10(request, response);
                break;
            case "pregunta_11":
                pregunta_11(request, response);
                break;
            case "pregunta_12":
                pregunta_12(request, response);
                break;
            case "pregunta_13":
                pregunta_13(request, response);
                break;
            case "pregunta_14":
                pregunta_14(request, response);
                break;
            case "pregunta_15":
                pregunta_15(request, response);
                break;
            case "pregunta_16":
                pregunta_16(request, response);
                break;
            case "pregunta_17":
                pregunta_17(request, response);
                break;

            case "pregunta_18_1":
                pregunta_18_1(request, response);
                break;
            case "pregunta_19_2":
                pregunta_19_2(request, response);
                break;
            case "pregunta_20_3":
                pregunta_20_3(request, response);
                break;
            case "pregunta_21_4":
                pregunta_21_4(request, response);
                break;
            case "pregunta_22_5":
                pregunta_22_5(request, response);
                break;
            case "pregunta_23_6":
                pregunta_23_6(request, response);
                break;
            case "pregunta_24_7":
                pregunta_24_7(request, response);
                break;
            case "pregunta_25_8":
                pregunta_25_8(request, response);
                break;
            case "pregunta_26_9":
                pregunta_26_9(request, response);
                break;
            case "pregunta_27_10":
                pregunta_27_10(request, response);
                break;
            case "pregunta_28_11":
                pregunta_28_11(request, response);
                break;
            case "pregunta_29_12":
                pregunta_29_12(request, response);
                break;
            case "pregunta_30_13":
                pregunta_30_13(request, response);
                break;
            case "pregunta_31_14":
                pregunta_31_14(request, response);
                break;
            case "pregunta_32_15":
                pregunta_32_15(request, response);
                break;

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
            Logger.getLogger(EstadisticaController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EstadisticaController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void bachillerxescuela(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.bachillerxescuela();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void bachillerxfacultad(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.bachillerxfacultad();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void tituladosxescuela(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.tituladoxescuela();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void tituladosxfacultad(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.tituladoxfacultad();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void nroegresados_x_anio(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.nroegresados_x_anio();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("category", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void nroegresados_x_anio2(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.nroegresados_x_anio();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_1(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_1();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }

    }

    private void pregunta_2(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_2();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_3(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_3();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_4(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_4();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_5(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_5();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_6(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_6();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_7(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_7();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_8(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_8();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_9(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        Estadistica[] esta = daote.pregunta_9();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_10(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        Estadistica[] esta = daote.pregunta_10();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_11(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        Estadistica[] esta = daote.pregunta_11();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_12(HttpServletRequest request, HttpServletResponse response) throws IOException, DAOException {
        Estadistica[] esta = daote.pregunta_12();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_13(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_13();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_14(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_14();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_15(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_15();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_16(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_16();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_17(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_17();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();

        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_18_1(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_18_1();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_19_2(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_19_2();
        
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_20_3(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_20_3();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_21_4(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       Estadistica[] esta = daote.pregunta_21_4();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_22_5(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_22_5();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_23_6(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_23_6();
       
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("value", esta1.getValor());
            objbuilder.add("name", esta1.getDescripcion());

            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_24_7(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_24_7();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_25_8(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_25_8();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_26_9(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_26_9();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_27_10(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_27_10();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_28_11(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_28_11();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_29_12(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_29_12();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_30_13(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_30_13();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_31_14(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_31_14();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

    private void pregunta_32_15(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        Estadistica[] esta = daote.pregunta_32_15();
        JsonArrayBuilder arraybuilder = Json.createArrayBuilder();
        JsonObjectBuilder objbuilder = Json.createObjectBuilder();
        for (Estadistica esta1 : esta) {
            objbuilder.add("name", esta1.getDescripcion());
            objbuilder.add("value", esta1.getValor());
            arraybuilder.add(objbuilder);
        }
        objbuilder.add("top", arraybuilder);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");

        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString());
        }
    }

}
