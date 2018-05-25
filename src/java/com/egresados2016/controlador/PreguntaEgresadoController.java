/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.controlador;

import com.egresados2016.dao.factory.PreguntaEgresadoDAOFactory;
import com.egresados2016.dao.interfaces.PreguntaEgresadoDAO;
import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.enums.Afirmacion;
import com.egresados2016.modelo.PreguntaEgresado;
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
@WebServlet(name = "PreguntaEgresadoController", urlPatterns = {"/PreguntaEgresadoController"})
@MultipartConfig
public class PreguntaEgresadoController extends HttpServlet {
private PreguntaEgresadoDAOFactory fabricate;
private PreguntaEgresadoDAO daote;
private PreguntaEgresado objPreEgre;
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
      
        fabricate=new PreguntaEgresadoDAOFactory();
        daote=fabricate.metodoDAO();
        
        switch(accion){
            
            case "crear":crear(request,response);break;
           
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
        Logger.getLogger(PreguntaEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(PreguntaEgresadoController.class.getName()).log(Level.SEVERE, null, ex);
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

    private void crear(HttpServletRequest request, HttpServletResponse response) throws DAOException, IOException {
        System.out.println("entrando al primer crear");
        objPreEgre= new PreguntaEgresado();
        int contador=0;
        int egresado= Integer.parseInt(request.getParameter("idEgresado5"));
        String res1=request.getParameter("res[1]");
        String res2=request.getParameter("res[2]");
        String res3=request.getParameter("res[3]");
        String res4=request.getParameter("res[4]");
        
       /*----------------------primer for------------------*/
       
        for (int e = 0; e < 30; e++) 
            {
               
              int pregunta = Integer.parseInt(request.getParameter("idPregunta["+e+"]"));
                
              int respuesta = Integer.parseInt(request.getParameter("res["+e+"]"));
              
              objPreEgre.getPregunta().setIdPregunta(pregunta);  
              objPreEgre.getEgresado().setIdEgresado(egresado);
              objPreEgre.getRespuesta().setIdRespuesta(respuesta);
              objPreEgre.setAfirmacion(Afirmacion.ON);
              
              daote.crear(objPreEgre);
              contador=contador+1;
                 contador=30-contador;
            }
        /*--------------------------segundo for------------------------------*/
        for(int i=0;i<6;i++){
            
           
            int preguntas = Integer.parseInt(request.getParameter("idPreguntas["+i+"]"));
           
            
            if(preguntas==2&&res1.equals("1")){
                   
                    for(int j=0;j<4;j++){
                        String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                        if(respu!=null){
                            int respuesta=Integer.parseInt(respu);
                            objPreEgre.getPregunta().setIdPregunta(preguntas);  
                            objPreEgre.getEgresado().setIdEgresado(egresado);
                            objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                            objPreEgre.setAfirmacion(Afirmacion.ON);
                            daote.crear(objPreEgre);
                           
                          }
                    }
            }
            if(preguntas==3&&res2.equals("1")){
                   
                    for(int j=0;j<4;j++){
                        String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                        if(respu!=null){
                            int respuesta=Integer.parseInt(respu);
                            objPreEgre.getPregunta().setIdPregunta(preguntas);  
                            objPreEgre.getEgresado().setIdEgresado(egresado);
                            objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                            objPreEgre.setAfirmacion(Afirmacion.ON);
                            daote.crear(objPreEgre);
                           
                        }
                    }
            }
                   
            if(preguntas==4){
                  
                    if(res3.equals("1") ){
                        for(int j=0;j<5;j++){
                            String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                            if(respu!=null){
                                int respuesta=Integer.parseInt(respu);
                                objPreEgre.getPregunta().setIdPregunta(preguntas);  
                                objPreEgre.getEgresado().setIdEgresado(egresado);
                                objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                                objPreEgre.setAfirmacion(Afirmacion.ON);
                                daote.crear(objPreEgre);
                                
                            }
                        }
                    }
                    else  if(res3.equals("2") ){
                        for(int j=5;j<11;j++){
                            String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                            if(respu!=null){
                                int respuesta=Integer.parseInt(respu);
                                objPreEgre.getPregunta().setIdPregunta(preguntas);  
                                objPreEgre.getEgresado().setIdEgresado(egresado);
                                objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                                objPreEgre.setAfirmacion(Afirmacion.ON);
                                daote.crear(objPreEgre);
                              
                            } 
                        }
                    }
            }
                    
            if(preguntas==5){
                  
                    if(res4.equals("1")){    
                        for(int j=0;j<5;j++){
                            String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                            if(respu!=null){
                                int respuesta=Integer.parseInt(respu);
                                objPreEgre.getPregunta().setIdPregunta(preguntas);  
                                objPreEgre.getEgresado().setIdEgresado(egresado);
                                objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                                objPreEgre.setAfirmacion(Afirmacion.ON);
                                daote.crear(objPreEgre);
                               
                            }
                        }
                    }
                    else  if(res4.equals("2") ){
                        for(int j=5;j<10;j++){
                            String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                            if(respu!=null){
                                int respuesta=Integer.parseInt(respu);
                                objPreEgre.getPregunta().setIdPregunta(preguntas);  
                                objPreEgre.getEgresado().setIdEgresado(egresado);
                                objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                                objPreEgre.setAfirmacion(Afirmacion.ON);
                                daote.crear(objPreEgre);
                             
                            }
                        }
                    }
            }
                     /*------------------------------------------------------------------------------------*/
            if(preguntas==8){
                   
                    for(int j=0;j<7;j++){
                        String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                        if(respu!=null){
                            int respuesta=Integer.parseInt(respu);
                            objPreEgre.getPregunta().setIdPregunta(preguntas); 
                            objPreEgre.getEgresado().setIdEgresado(egresado);
                            objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                            objPreEgre.setAfirmacion(Afirmacion.ON);
                            daote.crear(objPreEgre);
                          
                        }
                    }
            }
            if(preguntas==30){
                   
                    for(int j=0;j<8;j++){
                        String respu=request.getParameter("hobbies["+i+"]["+j+"]");
                        if(respu!=null){
                            int respuesta=Integer.parseInt(respu);
                            objPreEgre.getPregunta().setIdPregunta(preguntas);  
                            objPreEgre.getEgresado().setIdEgresado(egresado);
                            objPreEgre.getRespuesta().setIdRespuesta(respuesta);
                            objPreEgre.setAfirmacion(Afirmacion.ON);
                            daote.crear(objPreEgre);
                          
                        }
                    }
            }

        }
        
        
            try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
                if(contador==0){
                    pw.println(contador); 
                    System.out.println("si ha creado");
                }
                else{
                    pw.println(contador); 
                    System.out.println("no ha creado");
                }
            }  
    }

    

}
