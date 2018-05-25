/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.TrabajosDAOFactory;
import com.egresados2016.dao.interfaces.TrabajosDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.TipoContrato;
import com.egresados2016.enums.TipoJornada;
import com.egresados2016.modelo.Trabajos;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
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
@WebServlet(name = "TrabajosController", urlPatterns = {"/TrabajosController"})
@MultipartConfig
public class TrabajosController extends HttpServlet {
    private TrabajosDAOFactory fabricate;
    private TrabajosDAO daote;
    private Trabajos objTra;

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
        String accion =request.getParameter("accion");
        fabricate =new TrabajosDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion)
        {
            case "obtenerporidEgresado":obtenerporidEgresado(request,response);break;
            case "crear" :crear(request,response);break;
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
            Logger.getLogger(TrabajosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TrabajosController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TrabajosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TrabajosController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void obtenerporidEgresado(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       objTra=new Trabajos();
       
       objTra.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("codigo")));
       Trabajos[] tra=daote.leertodoxidEgresado(objTra);
       
       JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayTrabajos = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosTrabajos; 
       for (Trabajos tra1 : tra) {
            //System.out.println(solicitud.toString());            
            arrayDatosTrabajos = Json.createArrayBuilder();
             arrayDatosTrabajos.add(tra1.getIdTrabajos());
             arrayDatosTrabajos.add(tra1.getPuesto());
            arrayDatosTrabajos.add(tra1.getNomInstitucion());
            
            arrayDatosTrabajos.add(tra1.getFechaInicio().toString());
            arrayDatosTrabajos.add(tra1.getFechaFin().toString());
             
            arrayTrabajos.add(arrayDatosTrabajos);
        }
        objbuilder.add("data", arrayTrabajos);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
       
    
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
        System.out.println("entrando");
        objTra=new Trabajos();
         Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fechaini = new Date(fe.parse(request.getParameter("fechaini")).getTime());
        Date fechafin = new Date(fe.parse(request.getParameter("fechafin")).getTime());
        
         objTra.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado3")));
        
        objTra.setFechaInicio(fechaini);
        objTra.setFechaFin(fechafin);
        objTra.setPuesto(request.getParameter("puesto"));
        objTra.setNomInstitucion(request.getParameter("entidad"));
        objTra.setTipocontrato(TipoContrato.valueOf(request.getParameter("tipocontrato")));
        objTra.setSueldo(request.getParameter("sueldo"));
        objTra.setTipojornada(TipoJornada.valueOf(request.getParameter("tipojornada")));
        
        Trabajos traba=daote.crear(objTra);
        
      //  System.out.println("titulo de la base de datos: "+publi.getTitulo());
        
             try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(traba==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException, ParseException {
       objTra=new Trabajos();
         Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
       Date fechaini = new Date(fe.parse(request.getParameter("fechaini")).getTime());
        Date fechafin = new Date(fe.parse(request.getParameter("fechafin")).getTime());
        
        
        objTra.setIdTrabajos(Integer.parseInt(request.getParameter("idTrabajos")));
        objTra.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado6")));
        
        objTra.setFechaInicio(fechaini);
        objTra.setFechaFin(fechafin);
        objTra.setPuesto(request.getParameter("puesto"));
        objTra.setNomInstitucion(request.getParameter("entidad"));
        objTra.setTipocontrato(TipoContrato.valueOf(request.getParameter("tipocontrato")));
        objTra.setSueldo(request.getParameter("sueldo"));
        objTra.setTipojornada(TipoJornada.valueOf(request.getParameter("tipojornada")));
        
        Trabajos traba=daote.modificar(objTra);
        
      //  System.out.println("titulo de la base de datos: "+publi.getTitulo());
        
             try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(traba==null){
                      pw.println(0); 
                 }else
                 {
                      pw.println(1); 
                 }
                 
           
        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws DAOException {
       objTra=new Trabajos();
       
       objTra.setIdTrabajos(Integer.parseInt(request.getParameter("idTrabajos")));
       
       daote.destruir(objTra);
    }

}
