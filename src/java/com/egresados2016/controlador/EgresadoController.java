/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.EgresadoDAOFactory;
import com.egresados2016.dao.interfaces.EgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.EstadoCivil;
import com.egresados2016.enums.Sexo;
import com.egresados2016.modelo.Egresado;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
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
@WebServlet(name = "EgresadoController", urlPatterns = {"/EgresadoController"})
@MultipartConfig
public class EgresadoController extends HttpServlet {
    private EgresadoDAOFactory fabricate;
    private EgresadoDAO daote;
    private Egresado objEgre;

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
        fabricate = new EgresadoDAOFactory();
        daote = fabricate.metodoDAO();
        switch(accion)
        {
            case "obtenertodos": obtenertodos(request,response); break;
            case "crear" : crear(request,response);break;
            case "modificar": modificar(request,response);break;
            case "obtenernoencuestados": obtenernoencuestados(request,response); break;
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
            Logger.getLogger(EgresadoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EgresadoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(EgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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
       objEgre=new Egresado();
       
       
       Egresado[] egre=daote.leertodo();
       
       JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayEgresado = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosEgresado; 
       for (Egresado egre1 : egre) {
            //System.out.println(solicitud.toString());            
            arrayDatosEgresado = Json.createArrayBuilder();
             arrayDatosEgresado.add(egre1.getIdEgresado());
            arrayDatosEgresado.add(egre1.getDni());
            arrayDatosEgresado.add(egre1.getNombres()+", "+egre1.getApellidos());
            arrayDatosEgresado.add(egre1.getEdad());
            arrayDatosEgresado.add(egre1.getCorrero());
             arrayDatosEgresado.add(egre1.getTelefono1());
            arrayEgresado.add(arrayDatosEgresado);
        }
        objbuilder.add("data", arrayEgresado);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
      objEgre =new Egresado();
      Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        System.out.println("entrando");
         SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
           Date fec = new Date(fe.parse(request.getParameter("fechaNa")).getTime());    
         
         System.out.println("recibio");
       
         objEgre.getDistritoNacimiento().setIdDistrito(Integer.parseInt(request.getParameter("distritoNa"))   );
                 objEgre.getDistritoResidencia().setIdDistrito(Integer.parseInt(request.getParameter("distritoRe")) );
                 objEgre.getEscuela().setIdEscuela(Integer.parseInt(request.getParameter("escuela")) );
                 objEgre.setNombres(request.getParameter("nombres").toString().toUpperCase());
                 objEgre.setApellidos(request.getParameter("apellidos").toString().toUpperCase());
                objEgre.setFechaNac(fec);
                 objEgre.setDni(request.getParameter("dni"));
                 objEgre.setSexo(Sexo.valueOf(request.getParameter("sexo"))  );
                objEgre.setDireccion(request.getParameter("direccion"));
                 objEgre.setTelefono1(request.getParameter("telefono1"));
                objEgre.setTelefono2(request.getParameter("telefono2"));
                objEgre.setCorrero(request.getParameter("email").toString().toLowerCase());
                 objEgre.setAnioIngreso(request.getParameter("anioIngreso"));
                 objEgre.setAnioEgreso(request.getParameter("anioEgreso"));
                 objEgre.setNroHijos(Integer.parseInt(request.getParameter("nrohijos")));
                 objEgre.setEstadoCivil(EstadoCivil.valueOf(request.getParameter("estadocivil")) );
            
                 Egresado egre=daote.crear(objEgre);
                  try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(egre==null){
                      pw.println(0); 
                 }else
                 {
                     int id=egre.getIdEgresado();
                    
                      pw.println(id); 
                 }
                 
           
        }  
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response) throws ParseException, DAOException, IOException {
       objEgre =new Egresado();
      Enumeration enumeration=request.getParameterNames();
        while (enumeration.hasMoreElements())
        {
        System.out.println(enumeration.nextElement());
        }
        System.out.println("entrando");
         SimpleDateFormat fe=new SimpleDateFormat("yyyy-MM-dd");
           Date fec = new Date(fe.parse(request.getParameter("fechaNa")).getTime());    
         
         System.out.println("recibio");
                objEgre.setIdEgresado(Integer.parseInt(request.getParameter("idEgresado1")));
                objEgre.getDistritoNacimiento().setIdDistrito(Integer.parseInt(request.getParameter("distritoNa"))   );
                 objEgre.getDistritoResidencia().setIdDistrito(Integer.parseInt(request.getParameter("distritoRe")) );
                  objEgre.getEscuela().setIdEscuela(Integer.parseInt(request.getParameter("escuela")) );
                 objEgre.setNombres(request.getParameter("nombres").toString().toUpperCase());
                 objEgre.setApellidos(request.getParameter("apellidos").toString().toUpperCase());
                objEgre.setFechaNac(fec);
                 objEgre.setDni(request.getParameter("dni"));
                 objEgre.setSexo(Sexo.valueOf(request.getParameter("sexo"))  );
                objEgre.setDireccion(request.getParameter("direccion"));
                 objEgre.setTelefono1(request.getParameter("telefono1"));
                objEgre.setTelefono2(request.getParameter("telefono2"));
                objEgre.setCorrero(request.getParameter("email").toString().toLowerCase());
                 objEgre.setAnioIngreso(request.getParameter("anioIngreso"));
                 objEgre.setAnioEgreso(request.getParameter("anioEgreso"));
                 objEgre.setNroHijos(Integer.parseInt(request.getParameter("nrohijos")));
                 objEgre.setEstadoCivil(EstadoCivil.valueOf(request.getParameter("estadocivil")) );
            
                 Egresado egre=daote.modificar(objEgre);
                  try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                 if(egre==null){
                      pw.println(0); 
                 }else
                 {
                     int id=egre.getIdEgresado();
                    
                      pw.println(id); 
                 }
                 
           
        }  
    }

    private void obtenernoencuestados(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
       objEgre=new Egresado();
       
       
       Egresado[] egre=daote.egresados_sin_encuestar();
       
       JsonObjectBuilder objbuilder = Json.createObjectBuilder();  
        JsonArrayBuilder  arrayEgresado = Json.createArrayBuilder();        
        JsonArrayBuilder  arrayDatosEgresado; 
       for (Egresado egre1 : egre) {
            //System.out.println(solicitud.toString());            
            arrayDatosEgresado = Json.createArrayBuilder();
             arrayDatosEgresado.add(egre1.getIdEgresado());
            arrayDatosEgresado.add(egre1.getDni());
            arrayDatosEgresado.add(egre1.getNombres()+", "+egre1.getApellidos());
            arrayDatosEgresado.add(egre1.getEdad());
            arrayDatosEgresado.add(egre1.getCorrero());
             arrayDatosEgresado.add(egre1.getTelefono1());
            arrayEgresado.add(arrayDatosEgresado);
        }
        objbuilder.add("data", arrayEgresado);
        JsonObject obj = objbuilder.build();
        response.setContentType("application/json");
       
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            pw.println(obj.toString()); 
        }
    }

}
