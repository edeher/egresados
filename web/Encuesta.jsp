<%-- 
    Document   : index
    Created on : 04/10/2016, 12:02:04 PM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.modelo.Respuesta"%>
<%@page import="com.egresados2016.dao.interfaces.RespuestaDAO"%>
<%@page import="com.egresados2016.dao.factory.RespuestaDAOFactory"%>
<%@page import="com.egresados2016.modelo.Pregunta"%>
<%@page import="com.egresados2016.dao.interfaces.PreguntaDAO"%>
<%@page import="com.egresados2016.dao.factory.PreguntaDAOFactory"%>
<%@page import="com.egresados2016.enums.TipoContrato"%>
<%@page import="com.egresados2016.enums.TipoJornada"%>
<%@page import="com.egresados2016.dao.interfaces.FacultadDAO"%>
<%@page import="com.egresados2016.dao.factory.FacultadDAOFactory"%>
<%@page import="com.egresados2016.modelo.Distrito"%>
<%@page import="com.egresados2016.dao.interfaces.DistritoDAO"%>
<%@page import="com.egresados2016.dao.factory.DistritoDAOFactory"%>
<%@page import="com.egresados2016.modelo.Provincia"%>
<%@page import="com.egresados2016.dao.interfaces.ProvinciaDAO"%>
<%@page import="com.egresados2016.dao.factory.ProvinciaDAOFactory"%>
<%@page import="com.egresados2016.modelo.Facultad"%>
<%@page import="com.egresados2016.enums.EstadoCivil"%>
<%@page import="com.egresados2016.modelo.Departamento"%>
<%@page import="com.egresados2016.dao.interfaces.DepartamentoDAO"%>
<%@page import="com.egresados2016.dao.factory.DepartamentoDAOFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Encuenta Egresados UNIA </title>

        <!-- Bootstrap core CSS -->

        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="css/animate.min.css" rel="stylesheet">

        <!-- Custom styling plus plugins -->
        <link href="css/custom.css" rel="stylesheet">
        <link href="css/icheck/flat/green.css" rel="stylesheet">
        <!-- dataTables -->
        <link href="js/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
        <link href="js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="js/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="js/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="js/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- dataTables -->


        <link rel="stylesheet" type="text/css" href="../css/maps/jquery-jvectormap-2.0.3.css" />
        <link href="css/icheck/flat/green.css" rel="stylesheet" />
        <link href="css/floatexamples.css" rel="stylesheet" type="text/css" />

        <script src="js/jquery.min.js"></script>
        <script src="js/nprogress.js"></script>

        <!--[if lt IE 9]>
              <script src="../assets/js/ie8-responsive-file-warning.js"></script>
              <![endif]-->

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
                <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
                <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
              <![endif]-->

    </head>
    <%
        DepartamentoDAOFactory fabricate = new DepartamentoDAOFactory();
        DepartamentoDAO daote = fabricate.metodoDAO();
        Departamento[] depa = daote.leertodo();

        ProvinciaDAOFactory fabricate2 = new ProvinciaDAOFactory();
        ProvinciaDAO daote2 = fabricate2.metodoDAO();
        Provincia[] provi = daote2.leertodo();

        DistritoDAOFactory fabricate3 = new DistritoDAOFactory();
        DistritoDAO daote3 = fabricate3.metodoDAO();
        Distrito[] dis = daote3.leertodo();

        FacultadDAOFactory fabricate4 = new FacultadDAOFactory();
        FacultadDAO daote4 = fabricate4.metodoDAO();
        Facultad[] facu = daote4.leertodo();

        PreguntaDAOFactory fabricate5 = new PreguntaDAOFactory();
        PreguntaDAO daote5 = fabricate5.metodoDAO();
        Pregunta[] pregu = daote5.leertodo();

        RespuestaDAOFactory fabricate6 = new RespuestaDAOFactory();
        RespuestaDAO daote6 = fabricate6.metodoDAO();
        Respuesta[] respu = daote6.leertodo();
    %>

    <body class="nav-sm">

        <div class="container body">


            <div class="main_container">

                <div class="col-md-3 left_col">
                    <div class="left_col scroll-view">

                        <div class="navbar nav_title" style="border: 0;">
                            <a href="" class="site_title"><img src="images/LOGO UNIA.png" width="30" height="40"/> <span>Egresados UNIA!</span></a>

                        </div>
                        <div class="clearfix"></div>

                        <!-- menu prile quick info -->

                        <!-- /menu prile quick info -->

                        <br />

                        <!-- sidebar menu -->
                        <%@ include file="JSPjspf/menuIndex.jspf"%>

                        <!-- /menu footer buttons -->
            <!---            <%@ include file="JSPjspf/herramientas.jspf"%>--->
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <%@ include file="JSPjspf/cabeceraIndex.jspf"%>
                <!-- /top navigation -->


                <!-- page content -->

                <div class="right_col" role="main">

                    <div class="row_selected">



                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2><i class=""></i> Registrese</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div id="div-alerta" style="padding: 1px;display:none " class=" alert alert-success pull-right"  >

                                    </div>
                                    <div class="x_content">


                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                            <!-- cabezeras d elos taps-->             
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active">
                                                    <a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">
                                                        Datos Personales</a>
                                                </li>
                                                <li role="presentation" class="">
                                                    <a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">
                                                        Crear Nuevo Autor2
                                                    </a>
                                                </li> 
                                            </ul>

                                            <!-- --------------------------------------------->               
                                            <div class="container">
                                                <div id="myTabContent" class="tab-content">  

                                                    <!---cuerpo de pestaña 1 --->
                                                    <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                        <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data">


                                                            <div class="col-sm-6">

                                                                <div class="input-group">
                                                                    <input type="text" class="form-control" name="dnix" id="dnix">
                                                                    <span class="input-group-btn">
                                                                        <button type="button" id="btncargar" name="cargar" class="btn btn-primary">Cargar!</button>
                                                                    </span>
                                                                </div>
                                                                <div class="right col-xs-5 text-center">
                                                                    <img src="images/LOGO UNIA.png" alt="" class="img-circle img-responsive">
                                                                </div>
                                                            </div>

                                                            <div class="col-md-6 col-sm-12 col-xs-12">
                                                                <div class="x_panel">

                                                                    <div class="x_content">       
                                                                        
                                                                        
                                                                        
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nombres</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="nombres" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Apellidos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="apellidos" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de nacimiento</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" value="">
                                                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Dni</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="dni" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Direccion</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="direccion" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 1</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="telefono1" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Correo Electronico</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="email" type="email" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                         
                                                                        
                                                                        
                                                                        
                                                                    </div></div></div>    


                                                        </form>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                                            <button type="button" class="btn btn-primary" id="btnguardar1" >Guardar</button>
                                                        </div>




                                                    </div>

                                                    <!-- ---------------------------------------------> 
                                                    <!-- ---------cuerpo tab_content2--------------> 
                                                    <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="home-tab">
                                                        <form class="form-horizontal form-label-left " id="crearformtab2" enctype="multipart/form-data">

                                                            <div class="col-md-6 col-sm-12 col-xs-12">
                                                                <div class="x_panel">

                                                                    <div class="x_content">       
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Lugar de Nacimiento</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="departamentoNa" id="SelectDepaNa" class="form-control">
                                                                                    <option value="--">Depart.</option>
                                                                                    <%for (Departamento depa1 : depa) {

                                                                                    %>
                                                                                    <option value="<%=depa1.getIdDepartamento()%>"

                                                                                            >
                                                                                        <%=depa1.getDescripcion()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select  name="provinciaNa" id="SelectProNa" class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="distritoNa" id="SelectDisNa" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Lugar de Residencia</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="departamentoRe" id="SelectDepaRe" class="form-control">
                                                                                    <option value="--">Depart.</option>
                                                                                    <%for (Departamento depa1 : depa) {

                                                                                    %>
                                                                                    <option value="<%=depa1.getIdDepartamento()%>"

                                                                                            >
                                                                                        <%=depa1.getDescripcion()%></option>
                                                                                        <%}%>

                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="provinciaRe" id="SelectProRe"  class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="distritoRe" id="SelectDisRe" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Carrera Profesional</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="facultad" id="SelectFacultad" class="form-control">
                                                                                    <option value="--">Facultad</option>
                                                                                    <%for (Facultad facu1 : facu) {

                                                                                    %>
                                                                                    <option value="<%=facu1.getIdFacultad()%>"

                                                                                            >
                                                                                        <%=facu1.getDescripcion()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3col-sm-6 col-xs-6">
                                                                                <select  name="escuela" id="SelectEscuela" class=" form-control">
                                                                                    <option value="--">Escuela</option>
                                                                                </select>
                                                                            </div>

                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nombres</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="nombres" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Apellidos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="apellidos" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de nacimiento</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" value="">
                                                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Dni</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="dni" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">
                                                                                Sexo
                                                                            </label>

                                                                            <div class="col-md-9 col-sm-9 col-xs-12">

                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo" id="genderM" value="M" checked="" required /> Masculino
                                                                                    </label>
                                                                                </div>
                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo" id="genderF" value="F" /> Femenino
                                                                                    </label>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Direccion</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="direccion" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 1</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="telefono1" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 2</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name=telefono2 type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Correo Electronico</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="email" type="email" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Año de Ingreso</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="anioIngreso"  class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="2005">2005</option>
                                                                                    <option value="2006">2006</option>
                                                                                    <option value="2007">2007</option>
                                                                                    <option value="2008">2008</option>
                                                                                    <option value="2009">2009</option>
                                                                                    <option value="2010">2010</option>
                                                                                    <option value="2011">2011</option>
                                                                                    <option value="2012">2012</option>
                                                                                    <option value="2013">2013</option>
                                                                                    <option value="2014">2014</option>
                                                                                    <option value="2015">2015</option>
                                                                                    <option value="2016">2016</option>
                                                                                    <option value="2017">2017</option>
                                                                                    <option value="2018">2018</option>

                                                                                </select>
                                                                            </div>


                                                                        </div>   
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Año de Egreso</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="anioEgreso" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="2010">2010</option>
                                                                                    <option value="2011">2011</option>
                                                                                    <option value="2012">2012</option>
                                                                                    <option value="2013">2013</option>
                                                                                    <option value="2014">2014</option>
                                                                                    <option value="2015">2015</option>
                                                                                    <option value="2016">2016</option>
                                                                                    <option value="2017">2017</option>
                                                                                    <option value="2018">2018</option>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nro de Hijos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="nrohijos" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="0">0</option>
                                                                                    <option value="1">1</option>
                                                                                    <option value="2">2</option>
                                                                                    <option value="3">3</option>
                                                                                    <option value="4">4</option>
                                                                                    <option value="5">5</option>
                                                                                    <option value="6">6</option>
                                                                                    <option value="7">7</option>
                                                                                    <option value="8">8</option>
                                                                                    <option value="9">9</option>
                                                                                    <option value="10">10</option>

                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Estado Civil</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="estadocivil" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <%for (EstadoCivil es : EstadoCivil.values()) {

                                                                                    %>
                                                                                    <option value="<%=es.name()%>"  >
                                                                                        <%=es.getNom()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                    </div></div></div>  
                                                            <div class="col-md-6 col-sm-12 col-xs-12">
                                                                <div class="x_panel">

                                                                    <div class="x_content">       
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Lugar de Nacimiento</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="departamentoNa" id="SelectDepaNa" class="form-control">
                                                                                    <option value="--">Depart.</option>
                                                                                    <%for (Departamento depa1 : depa) {

                                                                                    %>
                                                                                    <option value="<%=depa1.getIdDepartamento()%>"

                                                                                            >
                                                                                        <%=depa1.getDescripcion()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select  name="provinciaNa" id="SelectProNa" class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="distritoNa" id="SelectDisNa" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Lugar de Residencia</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="departamentoRe" id="SelectDepaRe" class="form-control">
                                                                                    <option value="--">Depart.</option>
                                                                                    <%for (Departamento depa1 : depa) {

                                                                                    %>
                                                                                    <option value="<%=depa1.getIdDepartamento()%>"

                                                                                            >
                                                                                        <%=depa1.getDescripcion()%></option>
                                                                                        <%}%>

                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="provinciaRe" id="SelectProRe"  class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="distritoRe" id="SelectDisRe" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Carrera Profesional</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="facultad" id="SelectFacultad" class="form-control">
                                                                                    <option value="--">Facultad</option>
                                                                                    <%for (Facultad facu1 : facu) {

                                                                                    %>
                                                                                    <option value="<%=facu1.getIdFacultad()%>"

                                                                                            >
                                                                                        <%=facu1.getDescripcion()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3col-sm-6 col-xs-6">
                                                                                <select  name="escuela" id="SelectEscuela" class=" form-control">
                                                                                    <option value="--">Escuela</option>
                                                                                </select>
                                                                            </div>

                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nombres</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="nombres" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Apellidos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="apellidos" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de nacimiento</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" value="">
                                                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Dni</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="dni" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">
                                                                                Sexo
                                                                            </label>

                                                                            <div class="col-md-9 col-sm-9 col-xs-12">

                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo" id="genderM" value="M" checked="" required /> Masculino
                                                                                    </label>
                                                                                </div>
                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo" id="genderF" value="F" /> Femenino
                                                                                    </label>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Direccion</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="direccion" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 1</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="telefono1" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 2</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name=telefono2 type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Correo Electronico</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="email" type="email" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Año de Ingreso</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="anioIngreso"  class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="2005">2005</option>
                                                                                    <option value="2006">2006</option>
                                                                                    <option value="2007">2007</option>
                                                                                    <option value="2008">2008</option>
                                                                                    <option value="2009">2009</option>
                                                                                    <option value="2010">2010</option>
                                                                                    <option value="2011">2011</option>
                                                                                    <option value="2012">2012</option>
                                                                                    <option value="2013">2013</option>
                                                                                    <option value="2014">2014</option>
                                                                                    <option value="2015">2015</option>
                                                                                    <option value="2016">2016</option>
                                                                                    <option value="2017">2017</option>
                                                                                    <option value="2018">2018</option>

                                                                                </select>
                                                                            </div>


                                                                        </div>   
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Año de Egreso</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="anioEgreso" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="2010">2010</option>
                                                                                    <option value="2011">2011</option>
                                                                                    <option value="2012">2012</option>
                                                                                    <option value="2013">2013</option>
                                                                                    <option value="2014">2014</option>
                                                                                    <option value="2015">2015</option>
                                                                                    <option value="2016">2016</option>
                                                                                    <option value="2017">2017</option>
                                                                                    <option value="2018">2018</option>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nro de Hijos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="nrohijos" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <option value="0">0</option>
                                                                                    <option value="1">1</option>
                                                                                    <option value="2">2</option>
                                                                                    <option value="3">3</option>
                                                                                    <option value="4">4</option>
                                                                                    <option value="5">5</option>
                                                                                    <option value="6">6</option>
                                                                                    <option value="7">7</option>
                                                                                    <option value="8">8</option>
                                                                                    <option value="9">9</option>
                                                                                    <option value="10">10</option>

                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Estado Civil</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="estadocivil" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <%for (EstadoCivil es : EstadoCivil.values()) {

                                                                                    %>
                                                                                    <option value="<%=es.name()%>"  >
                                                                                        <%=es.getNom()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                    </div></div></div>  

                                                        </form>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                                                            <button type="button" class="btn btn-primary" id="btnguardar2" >Guardar</button>
                                                        </div>


                                                    </div>
                                                    <!-------------------------------------------------------------------------------------------------->

                                                    <!-------------------------------------------------------------------------------------------------->
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- footer content -->

                    <%@include file="JSPjspf/footer.jspf" %>
                    <!-- /footer content -->

                    <!-- /page content -->


                    <div id="miModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">



                            </div>
                        </div>
                    </div>


                    <div id="custom_notifications" class="custom-notifications dsp_none">
                        <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
                        </ul>
                        <div class="clearfix"></div>
                        <div id="notif-group" class="tabbed_notifications"></div>
                    </div>
                    <!-------------------------------------------java script------------------------------------------>
                    <script src="js/jquery.min.js" type="text/javascript"></script>
                    <script src="js/bootstrap.min.js" type="text/javascript"></script>
                    <!--------------------calendario----------->
                    <!-- bootstrap progress js -->
                    <script src="js/progressbar/bootstrap-progressbar.min.js"></script>
                    <script src="js/nicescroll/jquery.nicescroll.min.js"></script>
                    <!-- daterangepicker -->
                    <script src="js/moment/moment.min.js" type="text/javascript"></script>
                    <script src="js/datepicker/daterangepicker.js" type="text/javascript"></script>
                    <!------------------------------------------------------>
                    <!-- icheck efecto del radio button -->
                    <script src="js/custom.js"></script>
                    <script src="js/icheck/icheck.min.js"></script>
                    <!-- Datatables-->
                    <script src="js/datatables/jquery.dataTables.min.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.buttons.min.js" type="text/javascript"></script>
                    <link href="js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css"/>
                    <script src="js/datatables/jszip.min.js" type="text/javascript"></script>
                    <script src="js/datatables/pdfmake.min.js" type="text/javascript"></script>
                    <script src="js/datatables/vfs_fonts.js" type="text/javascript"></script>
                    <script src="js/datatables/buttons.html5.min.js" type="text/javascript"></script>
                    <script src="js/datatables/buttons.print.min.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.fixedHeader.min.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.keyTable.min.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.responsive.min.js" type="text/javascript"></script>
                    <script src="js/datatables/responsive.bootstrap.min.js" type="text/javascript"></script>
                    <script src="js/datatables/dataTables.scroller.min.js" type="text/javascript"></script>



                    <script type="text/javascript">

                        $(document).ready(function () {
                            $('#idEgresado2').hide();
                            $('#idEgresado3').hide();
                            $('#idEgresado4').hide();
                            $('#idEgresado5').hide();



                            $('#btnmodificar').hide();
                            $('#tab2').css('display', 'none');
                            $('#tab3').css('display', 'none');
                            $('#tab4').css('display', 'none');

                            /*------------------------------*/
                            $('#input_fpublicacion').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            /*------------------------------*/
                            $('#input_fpublicacion2').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });


                            /*-----------------------------------------------------------------------*/

                            $('#input_fechafin').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            $('#input_fechaini').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            /*-----------------------------------------------------------------------*/

                            $('#input_fechafin2').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            $('#input_fechaini2').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            /*---------------nac--------------*/
                            $('#SelectDepaNa').on('change', function () {
                                var codigo = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectProNa').html(data);
                                    }
                                });
                            });

                            $('#SelectProNa').on('change', function () {
                                var codigo = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'DistritoController?accion=buscarporprovincia&codigo=' + codigo,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectDisNa').html(data);
                                    }
                                });
                            });

                            /*----------------------------------*/
                            /*---------------nac--------------*/
                            $('#SelectDepaRe').on('change', function () {
                                var codigo = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectProRe').html(data);
                                    }
                                });
                            });

                            $('#SelectProRe').on('change', function () {
                                var codigo = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'DistritoController?accion=buscarporprovincia&codigo=' + codigo,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectDisRe').html(data);
                                    }
                                });
                            });
                            $('#SelectFacultad').on('change', function () {
                                var codigo5 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'EscuelaController?accion=obtenerporFacultad&codigo=' + codigo5,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectEscuela').html(data);
                                    }
                                });
                            });

                            $('#SelectEscuela').on('change', function () {
                                var codigo6 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'GradosController?accion=obtenerporEscuela&codigo=' + codigo6,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectGrado').html(data);
                                    }
                                });
                            });

                            /*-------------------------------------------------------------------------------------------*/
                            $('#xxx').hide();
                            $('#xxx1').hide();
                            $('#xxx2').hide();
                            $('#xxx4').hide();
                            $('#xxx6').hide();


                            $('.x1x1 input').on('ifChecked', function (e) {
                                $('#xxx1').fadeToggle("fast", function () {});
                            });

                            /*-----------------------------------------------------*/
                            $('.x2x2 input').on('ifChecked', function (e) {
                                $('#xxx2').fadeToggle("fast", function () {});
                            });
                            /*-----------------------------------------------------*/

                            $('.x3x3 input').on('ifChecked', function (e) {

                                if (this.value === "1") {
                                    $('#xxx4').fadeOut("fast", function () {
                                        $('#xxx3').fadeIn("fast", function () {});
                                    });

                                } else {
                                    $('#xxx3').fadeOut("fast", function () {
                                        $('#xxx4').fadeIn("fast", function () {});
                                    });

                                }
                            });
                            /*-----------------------------------------------------*/
                            $('.x4x4 input').on('ifChecked', function (e) {

                                if (this.value === "1") {
                                    $('#xxx6').fadeOut("fast", function () {
                                        $('#xxx5').fadeIn("fast", function () {});
                                    });

                                } else {
                                    $('#xxx5').fadeOut("fast", function () {
                                        $('#xxx6').fadeIn("fast", function () {});
                                    });

                                }
                            });



                            $('#idPregunta1').hide();

                            $('#idPregunta2').hide();

                            $('#idPregunta3').hide();

                            $('#idPregunta4').hide();

                            $('#idPregunta5').hide();

                            $('#idPregunta6').hide();

                            $('#idPregunta7').hide();

                            $('#idPregunta8').hide();

                            $('#idPregunta9').hide();


                            $('#idPregunta10').hide();

                            $('#idPregunta11').hide();

                            $('#idPregunta12').hide();

                            $('#idPregunta13').hide();


                            $('#idPregunta14').hide();

                            $('#idPregunta15').hide();

                            $('#idPregunta16').hide();

                            $('#idPregunta17').hide();

                            $('#idPregunta18').hide();

                            $('#idPregunta19').hide();

                            $('#idPregunta20').hide();

                            $('#idPregunta21').hide();

                            $('#idPregunta22').hide();


                            $('#idPregunta23').hide();

                            $('#idPregunta24').hide();

                            $('#idPregunta25').hide();

                            $('#idPregunta26').hide();

                            $('#idPregunta27').hide();

                            $('#idPregunta28').hide();

                            $('#idPregunta29').hide();

                            $('#idPregunta30').hide();

                            $('#idPregunta31').hide();


                            $('#idPregunta32').hide();

                            $('#idPregunta33').hide();

                            $('#idPregunta34').hide();

                            $('#idPregunta35').hide();


                            $('#idPregunta36').hide();

                            $('#idPregunta37').hide();

                            $('#idPregunta38').hide();


                            /*------------------------------------------------------------------------------------*/
                        });

                        $('#btnguardar').click(function () {
                            var formdata = new FormData($("#crearform")[0]);
                            $.ajax({
                                url: "EgresadoController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata,
                                processData: false,
                                cache: false})
                                    .done(function (id) {

                                        //      alert(json.id);
                                        //       alert(json.nombre);

                                        if (id == 0) {
                                            alert('Egresado ya  existe');

                                            alerta("Egresado no creado", false);
                                        } else
                                        {
                                            alert('creado con exito');
                                            $('#idEgresado1').val(id);
                                            $('#idEgresado2').val(id);
                                            $('#idEgresado3').val(id);
                                            $('#idEgresado4').val(id);
                                            $('#idEgresado5').val(id);
                                            //  $('#nombres2').val(json.nombre);
                                            $('#btnmodificar').show();
                                            $('#btnguardar').hide();

                                            $('#profile-tab2').attr('data-toggle', 'tab');
                                            $('#profile-tab2').tab('show');
                                            $('#profile-tab3').attr('data-toggle', 'tab');
                                            $('#profile-tab4').attr('data-toggle', 'tab');
                                            $('#profile-tab5').attr('data-toggle', 'tab');

                                            alerta("Egresado creado", true);
                                            crearTablas(id);
                                        }
                                    })
                        });

                        $('#btnmodificar').click(function () {
                            var formdata = new FormData($("#crearform")[0]);
                            $.ajax({
                                url: "EgresadoController?accion=modificar",
                                type: "post",
                                contentType: false,
                                data: formdata,
                                processData: false,
                                cache: false})
                                    .done(function (id) {

                                        if (id == 0) {
                                            alert('nose pudo modificar');

                                            alerta("egresado no modificado", false);
                                        } else
                                        {

                                            alert('modificando');

                                            alerta("egresado modificado", true);
                                        }
                                    })



                        });

                        function alerta(msj, band) {
                            $("#div-alerta").fadeOut(0, function () {
                                band === true ?
                                        $("#div-alerta").removeClass("alert-danger").addClass("alert-success") :
                                        $("#div-alerta").removeClass("alert-success").addClass("alert-danger");
                                $("#div-alerta").html("<h5 style='margin: 6px;'>" +
                                        "<strong>" + msj + "</strong>" +
                                        "</h5>");
                                $("#div-alerta").fadeIn();
                            });
                        }
                        /*-----------------------------------------------------------------------------------------*/
                        $('#btnguardartab2').click(function () {
                            var formdata2 = new FormData($("#crearformtab2")[0]);
                            $.ajax({
                                url: "GradoEgresadoController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata2,
                                processData: false,
                                cache: false})
                                    .done(function (id2) {

                                        if (id2 == 0) {
                                            alert('Grado ya  existe');

                                            alerta("Imposible añadir Grado", false);
                                        } else
                                        {
                                            alert('creado con exito');
                                            actualizartabla(table2);
                                            alerta("Grado añadido", true);
                                            $('#SelectFacultad').val('--');
                                            $('#SelectEscuela option:selected').text('Escuela');
                                            $('#SelectGrado option:selected').text('Grado');
                                            $('#input_fpublicacion2').val("");
                                        }
                                    })

                        });
                        $('#btnguardartab3').click(function () {
                            var formdata3 = new FormData($("#crearformtab3")[0]);
                            $.ajax({
                                url: "TrabajosController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata3,
                                processData: false,
                                cache: false})
                                    .done(function (id3) {

                                        if (id3 == 0) {
                                            alert('Este trabajo ya  existe');

                                            alerta("Trabajo no Adicionado", false);
                                        } else
                                        {
                                            alert('creado con exito');
                                            actualizartabla(table3);
                                            alerta("Trabajo añadido", true);
                                            $('#input_fechaini').val("");
                                            $('#input_fechafin').val("");
                                            $('#puesto').val("");
                                            $('#entidad').val("");
                                            $('#tipocontrato').val('--');
                                            $('#sueldo').val('--');
                                            $('#tipojornada').val('--');
                                            $('#tab3').css('display', 'none');
                                            $('#bit3').attr('class', 'fa fa-chevron-down')

                                        }
                                    })



                        });
                        $('#btnguardartab4').click(function () {
                            var formdata4 = new FormData($("#crearformtab4")[0]);
                            $.ajax({
                                url: "EstudiosController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata4,
                                processData: false,
                                cache: false})
                                    .done(function (id4) {

                                        if (id4 == 0) {
                                            alert('Este Estudio realizado ya  existe');

                                            alerta("Estudioa realizado no Adicionado", false);
                                        } else
                                        {
                                            alert('creado con exito');
                                            actualizartabla(table4);
                                            alerta("Estudio realizado añadido", true);
                                            $('#mencion').val("");
                                            $('#institucion').val("");
                                            $('#input_fechaini2').val("");
                                            $('#input_fechafin2').val("");
                                            $('#duracionacademica').val('--');
                                            $('#cantidad').val("");
                                            $('#pais').val('--');
                                            $('#financiamiento').val('--');
                                            $('#tab4').css('display', 'none');
                                            $('#bit4').attr('class', 'fa fa-chevron-down')
                                        }
                                    })



                        });

                        $('#btnguardartab5').click(function () {
                            var formdata5 = new FormData($("#crearformtab5")[0]);
                            $.ajax({
                                url: "PreguntaEgresadoController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata5,
                                processData: false,
                                cache: false})

                                    .done(function (contador) {

                                        if (contador == 0) {

                                            alerta("encuesta realizada", true);
                                        } else
                                        {
                                            alert("Falta responder " + contador + " preguntas", false);
                                            alerta("encuesta imcompleta", true);
                                        }
                                    })
                        });
                        /*---------------------------------------------------------------------------------------------*/
                        /*-----------------------crear las tablassssss--------------------------------------------*/
                        function crearTablas(ids) {

                            /*----------------------------------*/
                            /*----------------tabla de grados obtenidos -----------------------------------------------*/
                            table2 = $('#datatable-responsive2').DataTable({
                                "language": {
                                    "url": "css/datatables/Spanish.json"
                                },
                                "columns": [
                                    {"title": "Cod"},
                                    {"title": "Facultad"},
                                    {"title": "Escuela"},
                                    {"title": "Grado"},

                                    {"title": "<a id='btnNuevo' href='#' ><i class='fa fa-plus ' data-toggle='tooltip' data-placement='top' title='NUEVO'></i></a>"}],
                                "columnDefs": [
                                    {"targets": [4],
                                        "orderable": false,
                                        "className": 'text-center'},
                                    {"targets": -1,
                                        "data": null,
                                        "defaultContent": '<button name="btnVer2" data-toggle="tooltip" data-placement="left" title="VER PUBLICACION"><a><i class="fa fa-search"></i></a></button>&nbsp&nbsp<button name="btnEditar2" data-toggle="tooltip" data-placement="left" title="EDITAR"><a><i class="fa fa-pencil"></i></a></button>&nbsp&nbsp<button name="btnEliminar2" data-toggle="tooltip" data-placement="right" title="ELIMINAR"><a><i class="fa fa-remove"></i></a></button>'}
                                ],
                                "ajax": "GradoEgresadoController?accion=obtenerxidEgresado&codigo=" + ids,
                                "initComplete": function () {
                                    $('[data-toggle="tooltip"]').tooltip({
                                        trigger: 'hover',
                                        html: true
                                    });
                                }
                            });
                            table2.on('order.dt search.dt', function () {
                                table2.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                                    cell.innerHTML = i + 1;
                                });
                            }).draw();
                            $('#datatable-responsive2 tbody').on('click', 'button', function () {
                                var nombre2 = $(this).attr('name');
                                var data2 = table2.row($(this).parents('tr')).data();

                                if (nombre2 == 'btnVer2') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPview/VerGrado.jsp?codigo=' + data2[0] + '&idEgresado=' + ids);
                                }
                                if (nombre2 == 'btnEditar2') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPmodify/ModGrado.jsp?codigo=' + data2[0] + '&idEgresado=' + ids);
                                }
                                if (nombre2 == 'btnEliminar2') {

                                    if (confirm("seguro que desea eliminar el Grado") == true)
                                    {
                                        $.ajax(
                                                {
                                                    url: "GradoEgresadoController?accion=eliminar&idGradoEgresado=" + data2[0],
                                                }
                                        )

                                                .always(function ()
                                                {
                                                    actualizartabla(table2);
                                                    alerta("Grado Eliminada", true);
                                                });

                                    }
                                }
                            });

                            /*---------------------------------------------------------------------------------------------------------------------------------------*/
                            /*-------------------tabla de datos laborales---------*/

                            table3 = $('#datatable-responsive3').DataTable({
                                "language": {
                                    "url": "css/datatables/Spanish.json"
                                },
                                "columns": [{"title": "Cod"},
                                    {"title": "Institucion"},
                                    {"title": "Puesto"},
                                    {"title": "Fecha/Inicio"},
                                    {"title": "Fecha/Fin"},
                                    {"title": "<a id='btnNuevo' href='#' ><i class='fa fa-plus ' data-toggle='tooltip' data-placement='top' title='NUEVO'></i></a>"}],
                                "columnDefs": [
                                    {"targets": [5],
                                        "orderable": false,
                                        "className": 'text-center'},
                                    {"targets": -1,
                                        "data": null,
                                        "defaultContent": '<button name="btnVer3" data-toggle="tooltip" data-placement="left" title="VER PUBLICACION"><a><i class="fa fa-search"></i></a></button>&nbsp&nbsp<button name="btnEditar3" data-toggle="tooltip" data-placement="left" title="EDITAR"><a><i class="fa fa-pencil"></i></a></button>&nbsp&nbsp<button name="btnEliminar3" data-toggle="tooltip" data-placement="right" title="ELIMINAR"><a><i class="fa fa-remove"></i></a></button>'}
                                ],
                                "ajax": "TrabajosController?accion=obtenerporidEgresado&codigo=" + ids,
                                "initComplete": function () {
                                    $('[data-toggle="tooltip"]').tooltip({
                                        trigger: 'hover',
                                        html: true
                                    });
                                }
                            });
                            table3.on('order.dt search.dt', function () {
                                table3.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                                    cell.innerHTML = i + 1;
                                });
                            }).draw();
                            $('#datatable-responsive3 tbody').on('click', 'button', function () {
                                var nombre3 = $(this).attr('name');
                                var data3 = table3.row($(this).parents('tr')).data();

                                if (nombre3 == 'btnVer3') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPview/VerTrabajo.jsp?codigo=' + data3[0]);
                                }
                                if (nombre3 == 'btnEditar3') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPmodify/ModTrabajo.jsp?codigo=' + data3[0]);
                                }
                                if (nombre3 == 'btnEliminar3') {

                                    if (confirm("seguro que desea eliminar el Dato Laboral") == true)
                                    {
                                        $.ajax(
                                                {
                                                    url: "TrabajosController?accion=eliminar&idTrabajos=" + data3[0],
                                                }
                                        )

                                                .always(function ()
                                                {
                                                    actualizartabla(table3);
                                                    alerta("Trabajo Eliminada", true);
                                                });

                                    }
                                }
                            });
                            /*----------------tabla de estudios realizados -----------------------------------------------*/
                            table4 = $('#datatable-responsive4').DataTable({
                                "language": {
                                    "url": "css/datatables/Spanish.json"
                                },
                                "columns": [
                                    {"title": "Cod"},
                                    {"title": "Mencion"},
                                    {"title": "institucion"},
                                    {"title": "Fecha/Inicio"},
                                    {"title": "Fecha/Fin"},
                                    {"title": "<a id='btnNuevo' href='#' ><i class='fa fa-plus ' data-toggle='tooltip' data-placement='top' title='NUEVO'></i></a>"}],
                                "columnDefs": [
                                    {"targets": [5],
                                        "orderable": false,
                                        "className": 'text-center'},
                                    {"targets": -1,
                                        "data": null,
                                        "defaultContent": '<button name="btnVer4" data-toggle="tooltip" data-placement="left" title="VER PUBLICACION"><a><i class="fa fa-search"></i></a></button>&nbsp&nbsp<button name="btnEditar4" data-toggle="tooltip" data-placement="left" title="EDITAR"><a><i class="fa fa-pencil"></i></a></button>&nbsp&nbsp<button name="btnEliminar4" data-toggle="tooltip" data-placement="right" title="ELIMINAR"><a><i class="fa fa-remove"></i></a></button>'}
                                ],
                                "ajax": "EstudiosController?accion=obetenerxEgresado&codigo=" + ids,
                                "initComplete": function () {
                                    $('[data-toggle="tooltip"]').tooltip({
                                        trigger: 'hover',
                                        html: true
                                    });
                                }
                            });
                            table4.on('order.dt search.dt', function () {
                                table4.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                                    cell.innerHTML = i + 1;
                                });
                            }).draw();
                            $('#datatable-responsive4 tbody').on('click', 'button', function () {
                                var nombre4 = $(this).attr('name');
                                var data4 = table4.row($(this).parents('tr')).data();

                                if (nombre4 == 'btnVer4') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPview/VerEstudio.jsp?codigo=' + data4[0]);
                                }
                                if (nombre4 == 'btnEditar4') {

                                    $('.modal-lg').css('width', '600px');
                                    mostrarModal('JSPmodify/ModEstudio.jsp?codigo=' + data4[0]);
                                }
                                if (nombre4 == 'btnEliminar4') {

                                    if (confirm("seguro que desea eliminar el Estudios Realizado") == true)
                                    {

                                        $.ajax(
                                                {

                                                    url: "EstudiosController?accion=eliminar&idEstudios=" + data4[0],
                                                }
                                        )


                                                .always(function ()
                                                {
                                                    actualizartabla(table4);
                                                    alerta("Estudio Eliminada", true);
                                                });

                                    }
                                }
                            });
                            /*---------------------------------------------------------------------------------------------------------------------------------------*/




                        }
                        function actualizartabla(tableOX) {
                            tableOX.ajax.reload(function () {
                                tableOX.columns.adjust().draw();
                            },
                                    false);


                        }
                        function ocultarmodal() {
                            $('#miModal').modal('hide');
                        }
                        function mostrarModal(url) {
                            $('#miModal .modal-content').load(url, function () {
                                $('#miModal').modal('show');
                            });
                        }

                    </script>

                    </body>
                    </html>
