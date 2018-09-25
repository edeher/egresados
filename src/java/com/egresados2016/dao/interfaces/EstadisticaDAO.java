/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.dao.interfaces;

import com.egresados2016.dao.jdbc.DAOException;
import com.egresados2016.modelo.Estadistica;

/**
 *
 * @author Mi Laptop
 */
public interface EstadisticaDAO {
    
    public Estadistica [] bachillerxescuela() throws DAOException;
    public Estadistica [] bachillerxfacultad() throws DAOException;
    public Estadistica [] tituladoxescuela() throws DAOException;
    public Estadistica [] tituladoxfacultad() throws DAOException;
    public Estadistica [] nroegresados_x_anio() throws DAOException;
    public Estadistica [] nro_preguntas_all_egresado() throws DAOException;
    
     public Estadistica  nroegresados() throws DAOException;
     public Estadistica  nroegresadoscongrados() throws DAOException;
     public Estadistica  nrobachilleres() throws DAOException;
     public Estadistica  nrotitulados() throws DAOException;
     public Estadistica  nro_preguntas_por_egresado(int idEgresado) throws DAOException;
     public Estadistica  nro_encuestados() throws DAOException;
     public Estadistica  nro_no_encuestados() throws DAOException;
     public Estadistica []pregunta_1()throws DAOException;
     public Estadistica []pregunta_2()throws DAOException;
     public Estadistica []pregunta_3()throws DAOException;
     public Estadistica []pregunta_4()throws DAOException;
     public Estadistica []pregunta_5()throws DAOException;
     public Estadistica []pregunta_6()throws DAOException;
     public Estadistica []pregunta_7()throws DAOException;
     public Estadistica []pregunta_8()throws DAOException;
     public Estadistica []pregunta_9()throws DAOException;
     public Estadistica []pregunta_10()throws DAOException;
     public Estadistica []pregunta_11()throws DAOException;
     public Estadistica []pregunta_12()throws DAOException;
     public Estadistica []pregunta_13()throws DAOException;
     public Estadistica []pregunta_14()throws DAOException;
     public Estadistica []pregunta_15()throws DAOException;
     public Estadistica []pregunta_16()throws DAOException;
     public Estadistica []pregunta_17()throws DAOException;
     
    //------------------------------------------------------//
     
     public Estadistica []pregunta_18_1() throws DAOException;
     public Estadistica []pregunta_19_2() throws DAOException;
     public Estadistica []pregunta_20_3() throws DAOException;
     public Estadistica []pregunta_21_4() throws DAOException;
     public Estadistica []pregunta_22_5() throws DAOException;
     public Estadistica []pregunta_23_6() throws DAOException;
     public Estadistica []pregunta_24_7() throws DAOException;
     public Estadistica []pregunta_25_8() throws DAOException;
     public Estadistica []pregunta_26_9() throws DAOException;
     public Estadistica []pregunta_27_10() throws DAOException;
     public Estadistica []pregunta_28_11() throws DAOException;
     public Estadistica []pregunta_29_12() throws DAOException;
     public Estadistica []pregunta_30_13() throws DAOException;
     public Estadistica []pregunta_31_14() throws DAOException;
     public Estadistica []pregunta_32_15() throws DAOException;
     
    
    
     
     
}
