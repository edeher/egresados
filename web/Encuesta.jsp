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
                                        <h2><i class=""></i> Poryecto "Evaluación y Análisis del estado situacional de los egresados de la UNIA, para mejorar su inserción al campo laboral"</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div id="div-alerta" style="padding: 1px;display:none " class=" alert alert-success pull-right"  >

                                    </div>
                                    <div class="x_content">


                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                            <!-- cabezeras d elos taps-->             
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Datos Personales</a>
                                                </li>
                                               <!-- <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab2"  aria-expanded="false">Grados</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab3"  aria-expanded="false">Datos Laborales</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content4" role="tab" id="profile-tab4"  aria-expanded="false">Estudios</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content5" role="tab" id="profile-tab5"   aria-expanded="false">Encuesta</a>
                                                </li>-->
                                            </ul>

                                            <!-- --------------------------------------------->               
                                            <div id="myTabContent" class="tab-content">

                                                <!-- -------cuerpo tab_content1------------------->                
                                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <div class="x_panel">

                                                            <div class="x_content">
                                                                <br />
                                                                <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data">
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input type="text" id="idEgresado1" name="idEgresado1" class="form-control" readonly="readonly"  value="Autogenerado">
                                                                        </div>
                                                                    </div>


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
                                                                </form>
                                                                <div class="form-group">
                                                                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                                                                        
                                                                        <button type="button" id="btnguardar"  class="btn btn-success">Guardar</button>
                                                                        <button type="button" id="btnmodificar"  class="btn btn-success">Modificar</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- ---------------------------------------------> 
                                                <!-- ---------cuerpo tab_content2--------------> 
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">

                                                    <div class="col-md-6 col-xs-12">

                                                        <!-------------nuevo de tab panel 2------------------>
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>NUEVO GRADO </h2>
                                                                <ul class="nav navbar-right panel_toolbox">
                                                                    <li><a class="collapse-link"><i class="fa fa-chevron-down"></i></a>
                                                                    </li>
                                                                </ul>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content" id="tab2">
                                                                <br />
                                                                <form class="form-horizontal form-label-left " id="crearformtab2" enctype="multipart/form-data">


                                                                    <div class="form-group">

                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input type="text" name="idEgresado2" id="idEgresado2" class="form-control" value="0" readonly="readonly" placeholder="Read-Only Input">
                                                                        </div>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">GradoAcademico</label>
                                                                        <div class="col-md-3 col-sm-6 col-xs-6">
                                                                            <select name="facultad" id="SelectFacultad" class="form-control">
                                                                                <option value="--">Facultad.</option>
                                                                                <%for (Facultad facu1 : facu) {

                                                                                %>
                                                                                <option value="<%=facu1.getIdFacultad()%>"

                                                                                        >
                                                                                    <%=facu1.getDescripcion()%></option>
                                                                                    <%}%>
                                                                            </select>
                                                                        </div>
                                                                        <div class="col-md-3 col-sm-6 col-xs-6">
                                                                            <select  name="escuela" id="SelectEscuela" class="select2_group form-control">
                                                                                <option value="--">Escuela</option>
                                                                            </select>
                                                                        </div>
                                                                        <div class="col-md-3 col-sm-6 col-xs-6">
                                                                            <select name="grado" id="SelectGrado" class="select2_group form-control">
                                                                                <option value="--">Grado</option>
                                                                            </select>
                                                                        </div>
                                                                    </div>

                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Obtencion de Grado</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input  name="fechaGrado" type="text" class="form-control has-feedback-left" id="input_fpublicacion2" value="">
                                                                            <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                        </div>
                                                                    </div>

                                                                </form>
                                                                <div class="ln_solid"></div>
                                                                <div class="form-group">
                                                                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                                                                        <button type="button" id="btnguardartab2" class="btn btn-success">Guardar</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <!-----------------tabla de tab panel 2---------------->
                                                        <div class="x_panel">

                                                            <div class="x_content">
                                                                <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data"> 
                                                                    <!--    <div class="form-group" id="id2">
                                                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>
                                                                    <div class="col-md-9 col-sm-9 col-xs-12" >
                                                                        <input type="text" id="idEgresado22" name="idEgresado22"  class="form-control" readonly="readonly"  value="0">
                                                                    </div>
                                                                </div>-->
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-6">Egresado</label>
                                                                        <div class="col-md-3 col-sm-3 col-xs-6">
                                                                            <input type="text" id="nombres" class="form-control" disabled="disabled" value="">
                                                                        </div>
                                                                    </div>

                                                                </form>  


                                                                <div class="x_title">
                                                                    <h2>Grados Obtenidos </h2>

                                                                    <table id="datatable-responsive2" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                                                    </table>

                                                                </div>

                                                            </div> 

                                                        </div>
                                                    </div>
                                                </div>
                                                <!-------------------------------------------------------------------------------------------------->
                                                <!-- ------cuerpo tab_content3--------> 
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <!------------------------------------------>
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>NUEVO TRABAJO</h2>
                                                                <ul class="nav navbar-right panel_toolbox">
                                                                    <li><a class="collapse-link"><i id="bit3" class="fa fa-chevron-down"></i></a>
                                                                    </li>
                                                                </ul>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content" id="tab3">
                                                                <br />
                                                                <form id="crearformtab3" class="form-horizontal form-label-left"  enctype="multipart/form-data">

                                                                    <div class="form-group" id="id2">

                                                                        <div class="col-md-9 col-sm-9 col-xs-12" >
                                                                            <input type="text" name="idEgresado3" id="idEgresado3" class="form-control" value="0" readonly="readonly" placeholder="Read-Only Input">
                                                                        </div>
                                                                    </div>

                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Inicio</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input  name="fechaini" type="text" class="form-control has-feedback-left" id="input_fechaini" value="">
                                                                            <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                                                                        </div>
                                                                    </div>

                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Fin</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input  name="fechafin" type="text" class="form-control has-feedback-left" id="input_fechafin" value="">
                                                                            <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                        </div>
                                                                    </div>

                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Puesto</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="puesto" type="text" class="form-control" value="">
                                                                        </div>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Entidad</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="entidad" type="text" class="form-control" value="">
                                                                        </div>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Contrato</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="tipocontrato" class="select2_single form-control" tabindex="-1">
                                                                                <option value="--">--</option>
                                                                                <%for (TipoContrato tip : TipoContrato.values()) {

                                                                                %>
                                                                                <option value="<%=tip.name()%>"  >

                                                                                    <%=tip.getNom()%></option>
                                                                                    <%}%>
                                                                            </select>
                                                                        </div>


                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Sueldo</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="sueldo" class="select2_single form-control" tabindex="-1">


                                                                                <option value="--">--</option>
                                                                                <option value="De s/.0.00 a s/.500">De s/.0.00 a s/.500</option>
                                                                                <option value="De s/.600 a s/.1000">De s/.600 a s/.1000</option>
                                                                                <option value="De s/.1100 a s/.2000">De s/.1100 a s/.2000</option>
                                                                                <option value="De s/.2100 a s/2500">De s/.2100 a s/2500</option>


                                                                            </select>
                                                                        </div>


                                                                    </div>


                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Jornada</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="tipojornada" class="select2_single form-control" tabindex="-1">
                                                                                <option value="--">--</option>
                                                                                <%for (TipoJornada tipjor : TipoJornada.values()) {

                                                                                %>
                                                                                <option value="<%=tipjor.name()%>"  >

                                                                                    <%=tipjor.getNom()%></option>
                                                                                    <%}%>
                                                                            </select>
                                                                        </div>


                                                                    </div>   
                                                                </form>
                                                                <div class="ln_solid"></div>
                                                                <div class="form-group">
                                                                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                                                                        <button type="button" id="btnguardartab3" class="btn btn-success">Guardar</button>
                                                                    </div>
                                                                </div>
                                                            </div>


                                                        </div>

                                                        <!------------------------------------------tabla de tab3 ----------------------------------------->                                            


                                                        <div class="x_panel">

                                                            <div class="x_content">
                                                                <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data"> 
                                                                    <!-- <div class="form-group" id="id3">
                                                                         <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>
                                                                         <div class="col-md-9 col-sm-9 col-xs-12" >
                                                                             <input type="text" id="idEgresado33" name="idEgresado33"  class="form-control" readonly="readonly"  value="0">
                                                                         </div>
                                                                     </div>-->
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-6">Egresado</label>
                                                                        <div class="col-md-3 col-sm-3 col-xs-6">
                                                                            <input type="text" id="nombres" class="form-control" disabled="disabled" value="">
                                                                        </div>
                                                                    </div>

                                                                </form>  


                                                                <div class="x_title">
                                                                    <h2>Trabajos realizados </h2>

                                                                    <table id="datatable-responsive3" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                                                    </table>

                                                                </div>

                                                            </div> 

                                                        </div>
                                                    </div>




                                                </div>     

                                                <!-- ---------------------------------------------> 
                                                <!-- ---------cuerpo tab_content4--------------> 
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content4" aria-labelledby="profile-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <!------------------------------------------>
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>NUEVO ESTUDIO REALIZADO</h2>
                                                                <ul class="nav navbar-right panel_toolbox">
                                                                    <li><a class="collapse-link"><i id="bit4" class="fa fa-chevron-down"></i></a>
                                                                    </li>
                                                                </ul>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content" id="tab4">
                                                                <br />
                                                                <form id="crearformtab4" class="form-horizontal form-label-left"  enctype="multipart/form-data">

                                                                    <div class="form-group" id="id2">

                                                                        <div class="col-md-9 col-sm-9 col-xs-12" >
                                                                            <input type="text" name="idEgresado4" id="idEgresado4" class="form-control" value="0" readonly="readonly" placeholder="Read-Only Input">
                                                                        </div>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Mencion</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="mencion" type="text" class="form-control" value="">
                                                                        </div>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Institucion</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="institucion" type="text" class="form-control" value="">
                                                                        </div>
                                                                    </div>            
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Inicio</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input  name="fechaini" type="text" class="form-control has-feedback-left" id="input_fechaini2" value="">
                                                                            <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                                                                        </div>
                                                                    </div>

                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Fin</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input  name="fechafin" type="text" class="form-control has-feedback-left" id="input_fechafin2" value="">
                                                                            <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                                                                        </div>
                                                                    </div>


                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Duracion Academica</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="duracionacademica" class="select2_single form-control" tabindex="-1">
                                                                                <option value="--">--</option>
                                                                                <option value="horas">horas</option>
                                                                                <option value="dias">dias</option>
                                                                                <option value="meses">meses</option>
                                                                                <option value="bimestre">bimestre</option>
                                                                                <option value="trimestre">trimestre</option>
                                                                                <option value="semestre">semestre</option>
                                                                            </select>
                                                                        </div>


                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Cantidad</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="cantidad" type="text" class="form-control" value="">
                                                                        </div>
                                                                    </div> 


                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Pais</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="pais" class="select2_single form-control" tabindex="-1">
                                                                                <option value="--">---</option>
                                                                                <option value="Afganistán">Afganistán</option>
                                                                                <option value="Albania">Albania</option>
                                                                                <option value=">Alemania">Alemania</option>
                                                                                <option value="Andorra">Andorra</option>
                                                                                <option value="Angola">Angola</option>
                                                                                <option value="Anguilla">Anguilla</option>
                                                                                <option value="Antártida">Antártida</option>
                                                                                <option value="Antigua y Barbuda">Antigua y Barbuda</option>
                                                                                <option value="Antillas Holandesas">Antillas Holandesas</option>
                                                                                <option value="Arabia Saudí">Arabia Saudí</option>
                                                                                <option value="Argelia">Argelia</option>
                                                                                <option value="Argentina">Argentina</option>
                                                                                <option value="Armenia">Armenia</option>
                                                                                <option value="Aruba">Aruba</option>
                                                                                <option value="Australia">Australia</option>
                                                                                <option value="Austria">Austria</option>
                                                                                <option value="Azerbaiyán">Azerbaiyán</option>
                                                                                <option value="Bahamas">Bahamas</option>
                                                                                <option value="Bahrein">Bahrein</option>
                                                                                <option value="Bangladesh">Bangladesh</option>
                                                                                <option value="Barbados">Barbados</option>
                                                                                <option value="Bélgica">Bélgica</option>
                                                                                <option value="Belice">Belice</option>
                                                                                <option value="Benin">Benin</option>
                                                                                <option value="Bermudas">Bermudas</option>
                                                                                <option value="Bielorrusia">Bielorrusia</option>
                                                                                <option value="Birmania">Birmania</option>
                                                                                <option value="Bolivia">Bolivia</option>
                                                                                <option value="Bosnia y Herzegovina">Bosnia y Herzegovina</option>
                                                                                <option value="Botswana">Botswana</option>
                                                                                <option value="Brasil">Brasil</option>
                                                                                <option value="Brunei">Brunei</option>
                                                                                <option value="Bulgaria">Bulgaria</option>
                                                                                <option value="Burkina Faso">Burkina Faso</option>
                                                                                <option value="Burundi">Burundi</option>
                                                                                <option value="Bután">Bután</option>
                                                                                <option value="Cabo Verde">Cabo Verde</option>
                                                                                <option value="Camboya">Camboya</option>
                                                                                <option value="Camerún">Camerún</option>
                                                                                <option value="Canadá">Canadá</option>
                                                                                <option value="Chad">Chad</option>
                                                                                <option value="Chile">Chile</option>
                                                                                <option value="China">China</option>
                                                                                <option value="Chipre">Chipre</option>
                                                                                <option value="Ciudad del Vaticano (Santa Sede)">Ciudad del Vaticano (Santa Sede)</option>
                                                                                <option value="Colombia">Colombia</option>
                                                                                <option value="Comores">Comores</option>
                                                                                <option value="Congo">Congo</option>
                                                                                <option value="Congo, República Democrática del">Congo, República Democrática del</option>
                                                                                <option value="Corea">Corea</option>
                                                                                <option value="Corea del Norte">Corea del Norte</option>
                                                                                <option value="Costa de Marfíl">Costa de Marfíl</option>
                                                                                <option value="Costa Rica">Costa Rica</option>
                                                                                <option value="Croacia (Hrvatska)">Croacia (Hrvatska)</option>
                                                                                <option value="Cuba">Cuba</option>
                                                                                <option value="DinamarcaDK">Dinamarca</option>
                                                                                <option value="Djibouti">Djibouti</option>
                                                                                <option value="Dominica">Dominica</option>
                                                                                <option value="Ecuador">Ecuador</option>
                                                                                <option value="Egipto">Egipto</option>
                                                                                <option value="El Salvador">El Salvador</option>
                                                                                <option value="Emiratos Árabes Unidos">Emiratos Árabes Unidos</option>
                                                                                <option value="Eritrea">Eritrea</option>
                                                                                <option value="Eslovenia">Eslovenia</option>
                                                                                <option value="España" >España</option>
                                                                                <option value="Estados Unidos">Estados Unidos</option>
                                                                                <option value="Estonia">Estonia</option>
                                                                                <option value="Etiopía">Etiopía</option>
                                                                                <option value="Fiji">Fiji</option>
                                                                                <option value="Filipinas">Filipinas</option>
                                                                                <option value="Finlandia">Finlandia</option>
                                                                                <option value="FR">Francia</option>
                                                                                <option value="Francia">Gabón</option>
                                                                                <option value="Gambia">Gambia</option>
                                                                                <option value="Georgia">Georgia</option>
                                                                                <option value="Ghana">Ghana</option>
                                                                                <option value="Gibraltar">Gibraltar</option>
                                                                                <option value="Granada">Granada</option>
                                                                                <option value="Grecia">Grecia</option>
                                                                                <option value="Groenlandia">Groenlandia</option>
                                                                                <option value="Guadalupe">Guadalupe</option>
                                                                                <option value="Guam">Guam</option>
                                                                                <option value="Guatemal">Guatemala</option>
                                                                                <option value="Guayana">Guayana</option>
                                                                                <option value="Guayana Francesa">Guayana Francesa</option>
                                                                                <option value="Guinea">Guinea</option>
                                                                                <option value="Guinea Ecuatorial">Guinea Ecuatorial</option>
                                                                                <option value="Guinea-Bissau">Guinea-Bissau</option>
                                                                                <option value="Haití">Haití</option>
                                                                                <option value="Honduras">Honduras</option>
                                                                                <option value="Hungría">Hungría</option>
                                                                                <option value="India">India</option>
                                                                                <option value="Indonesia">Indonesia</option>
                                                                                <option value="Irak">Irak</option>
                                                                                <option value="Irán">Irán</option>
                                                                                <option value="Irlanda">Irlanda</option>
                                                                                <option value="Isla Bouvet">Isla Bouvet</option>
                                                                                <option value="Isla de Christmas">Isla de Christmas</option>
                                                                                <option value="Islandia">Islandia</option>
                                                                                <option value="Islas Caimán">Islas Caimán</option>
                                                                                <option value="Islas Cook">Islas Cook</option>
                                                                                <option value="Islas de Cocos o Keeling">Islas de Cocos o Keeling</option>
                                                                                <option value="Islas Faroe">Islas Faroe</option>
                                                                                <option value="Islas Heard y McDonald">Islas Heard y McDonald</option>
                                                                                <option value="Islas Malvinas">Islas Malvinas</option>
                                                                                <option value="Islas Marianas del Nort">Islas Marianas del Norte</option>
                                                                                <option value="Islas Marshall">Islas Marshall</option>
                                                                                <option value="Islas menores de Estados Unidos">Islas menores de Estados Unidos</option>
                                                                                <option value="Islas Palau">Islas Palau</option>
                                                                                <option value="Islas Salomón">Islas Salomón</option>
                                                                                <option value="Islas Svalbard y Jan Mayen">Islas Svalbard y Jan Mayen</option>
                                                                                <option value="Islas Tokelau">Islas Tokelau</option>
                                                                                <option value="Islas Turks y Caicos">Islas Turks y Caicos</option>
                                                                                <option value="Islas Vírgenes (EEUU)">Islas Vírgenes (EEUU)</option>
                                                                                <option value="Islas Vírgenes (Reino Unido)">Islas Vírgenes (Reino Unido)</option>
                                                                                <option value="Islas Wallis y Futuna">Islas Wallis y Futuna</option>
                                                                                <option value="Israel">Israel</option>
                                                                                <option value="ItaliaT">Italia</option>
                                                                                <option value="Jamaica">Jamaica</option>
                                                                                <option value="Japón">Japón</option>
                                                                                <option value="Jordania">Jordania</option>
                                                                                <option value="Kazajistán">Kazajistán</option>
                                                                                <option value="Kenia">Kenia</option>
                                                                                <option value="Kirguizistán">Kirguizistán</option>
                                                                                <option value="Kiribati">Kiribati</option>
                                                                                <option value="Kuwait">Kuwait</option>
                                                                                <option value="Laos">Laos</option>
                                                                                <option value="Lesotho">Lesotho</option>
                                                                                <option value="Letonia">Letonia</option>
                                                                                <option value="Líbano">Líbano</option>
                                                                                <option value="Liberia">Liberia</option>
                                                                                <option value="Libia">Libia</option>
                                                                                <option value="Liechtenstein">Liechtenstein</option>
                                                                                <option value="Lituania">Lituania</option>
                                                                                <option value="Luxemburgo">Luxemburgo</option>
                                                                                <option value="Macedonia, Ex-República Yugoslava de">Macedonia, Ex-República Yugoslava de</option>
                                                                                <option value="Madagascar">Madagascar</option>
                                                                                <option value="Malasia">Malasia</option>
                                                                                <option value="Malawi">Malawi</option>
                                                                                <option value="Maldivas">Maldivas</option>
                                                                                <option value="Malí">Malí</option>
                                                                                <option value="Malta">Malta</option>
                                                                                <option value="Marruecos">Marruecos</option>
                                                                                <option value="Martinica">Martinica</option>
                                                                                <option value=Mauricio">Mauricio</option>
                                                                                <option value="Mauritania">Mauritania</option>
                                                                                <option value="Mayotte">Mayotte</option>
                                                                                <option value="México">México</option>
                                                                                <option value="Mongolia">Micronesia</option>
                                                                                <option value="Moldavia">Moldavia</option>
                                                                                <option value="Mónaco">Mónaco</option>
                                                                                <option value="Mongolia">Mongolia</option>
                                                                                <option value="Montserrat">Montserrat</option>
                                                                                <option value="Mozambique">Mozambique</option>
                                                                                <option value="Namibia">Namibia</option>
                                                                                <option value="Nauru">Nauru</option>
                                                                                <option value="Nepal">Nepal</option>
                                                                                <option value="Nicaragua">Nicaragua</option>
                                                                                <option value="Níger">Níger</option>
                                                                                <option value="Nigeria">Nigeria</option>
                                                                                <option value="Niue">Niue</option>
                                                                                <option value="Norfolk">Norfolk</option>
                                                                                <option value="Noruega">Noruega</option>
                                                                                <option value="Nueva Caledonia">Nueva Caledonia</option>
                                                                                <option value="Nueva Zelanda">Nueva Zelanda</option>
                                                                                <option value="Omán">Omán</option>
                                                                                <option value="Países Bajos">Países Bajos</option>
                                                                                <option value="Panamá">Panamá</option>
                                                                                <option value="Papúa Nueva Guinea">Papúa Nueva Guinea</option>
                                                                                <option value="Paquistán">Paquistán</option>
                                                                                <option value="Paraguay">Paraguay</option>
                                                                                <option value="Perú">Perú</option>
                                                                                <option value="Pitcairn">Pitcairn</option>
                                                                                <option value="Polinesia Francesa">Polinesia Francesa</option>
                                                                                <option value="Polonia">Polonia</option>
                                                                                <option value="Portugal">Portugal</option>
                                                                                <option value="Puerto Rico">Puerto Rico</option>
                                                                                <option value="Qatar">Qatar</option>
                                                                                <option value="Reino Unido">Reino Unido</option>
                                                                                <option value="República Centroafricana">República Centroafricana</option>
                                                                                <option value="República Checa">República Checa</option>
                                                                                <option value="República de Sudáfrica">República de Sudáfrica</option>
                                                                                <option value="República Dominicana">República Dominicana</option>
                                                                                <option value="República Eslovaca">República Eslovaca</option>
                                                                                <option value="Reunión">Reunión</option>
                                                                                <option value="Ruanda">Ruanda</option>
                                                                                <option value="Rumania">Rumania</option>
                                                                                <option value="Rusia">Rusia</option>
                                                                                <option value="Sahara Occidental">Sahara Occidental</option>
                                                                                <option value="Saint Kitts y Nevis">Saint Kitts y Nevis</option>
                                                                                <option value="Samoa">Samoa</option>
                                                                                <option value="Samoa Americana">Samoa Americana</option>
                                                                                <option value="San Marino">San Marino</option>
                                                                                <option value="San Vicente y Granadinas">San Vicente y Granadinas</option>
                                                                                <option value="Santa Helena">Santa Helena</option>
                                                                                <option value="Santa Lucía">Santa Lucía</option>
                                                                                <option value="Santo Tomé y Príncipe">Santo Tomé y Príncipe</option>
                                                                                <option value="Senegal">Senegal</option>
                                                                                <option value="Seychelles">Seychelles</option>
                                                                                <option value="Sierra Leona">Sierra Leona</option>
                                                                                <option value="Singapur">Singapur</option>
                                                                                <option value="Siria">Siria</option>
                                                                                <option value="Somalia">Somalia</option>
                                                                                <option value="Sri Lanka">Sri Lanka</option>
                                                                                <option value="St Pierre y Miquelon">St Pierre y Miquelon</option>
                                                                                <option value="Suazilandia">Suazilandia</option>
                                                                                <option value="Sudán">Sudán</option>
                                                                                <option value="Suecia">Suecia</option>
                                                                                <option value="Suiza">Suiza</option>
                                                                                <option value="Surinam">Surinam</option>
                                                                                <option value="Tailandia">Tailandia</option>
                                                                                <option value="Taiwán">Taiwán</option>
                                                                                <option value="Tanzania">Tanzania</option>
                                                                                <option value="Tayikistán">Tayikistán</option>
                                                                                <option value="Territorios franceses del Sur">Territorios franceses del Sur</option>
                                                                                <option value="Timor Oriental">Timor Oriental</option>
                                                                                <option value="Togo">Togo</option>
                                                                                <option value="Tonga">Tonga</option>
                                                                                <option value="Trinidad y Tobago">Trinidad y Tobago</option>
                                                                                <option value="Túnez">Túnez</option>
                                                                                <option value="Turkmenistán">Turkmenistán</option>
                                                                                <option value="Turquía">Turquía</option>
                                                                                <option value="Tuvalu">Tuvalu</option>
                                                                                <option value="Ucrania">Ucrania</option>
                                                                                <option value="Uganda">Uganda</option>
                                                                                <option value="Uruguay">Uruguay</option>
                                                                                <option value="Uzbekistán">Uzbekistán</option>
                                                                                <option value="Vanuatu">Vanuatu</option>
                                                                                <option value="Venezuela">Venezuela</option>
                                                                                <option value="Vietnam">Vietnam</option>
                                                                                <option value="Yemen">Yemen</option>
                                                                                <option value="Yugoslavia">Yugoslavia</option>
                                                                                <option value="Zambia">Zambia</option>
                                                                                <option value="Zimbabue">Zimbabue</option>
                                                                            </select>
                                                                        </div>


                                                                    </div>  
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Financiamiento</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <select name="financiamiento" class="select2_single form-control" tabindex="-1">
                                                                                <option value="--">--</option>
                                                                                <option value="personal">personal</option>
                                                                                <option value="beca_18">beca 18</option>
                                                                                <option value="DONG">ONG</option>
                                                                                <option value="INT. PRIVADA">INT. PRIVADA</option>

                                                                            </select>
                                                                        </div>


                                                                    </div>  
                                                                </form>
                                                                <div class="ln_solid"></div>
                                                                <div class="form-group">
                                                                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                                                                        <button type="button" id="btnguardartab4"class="btn btn-success">Guardar</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <!------------------tabla 4------------------------->
                                                        <div class="x_panel">

                                                            <div class="x_content">
                                                                <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data"> 
                                                                    <!-- <div class="form-group" id="id4">
 
                                                                         <div class="col-md-9 col-sm-9 col-xs-12" >
                                                                             <input type="text" id="idEgresado44" name="idEgresado44"  class="form-control" readonly="readonly"  value="0 ">
                                                                         </div>
                                                                     </div>-->
                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-6">Egresado</label>
                                                                        <div class="col-md-3 col-sm-3 col-xs-6">
                                                                            <input type="text" id="nombres" class="form-control" disabled="disabled" value="">
                                                                        </div>
                                                                    </div>

                                                                </form>  
                                                                <div class="x_title">
                                                                    <h2>Estudios Realizados</h2>

                                                                    <table id="datatable-responsive4" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                                                    </table>

                                                                </div>

                                                            </div> 

                                                        </div>
                                                    </div>
                                                </div>
                                                <!-------------------------------------------------------------------------------------------------->
                                                <!-- ---------cuerpo tab_content5--------------> 
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content5" aria-labelledby="profile-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <form class="form-horizontal form-label-left " id="crearformtab5" enctype="multipart/form-data">
                                                            
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>Preguntas Academicas <small>Click to validate</small></h2>
                                                                <ul class="nav navbar-right panel_toolbox">
                                                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                                    </li>
                                                                    <li class="dropdown">
                                                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                                        <ul class="dropdown-menu" role="menu">
                                                                            <li><a href="#">Settings 1</a>
                                                                            </li>
                                                                            <li><a href="#">Settings 2</a>
                                                                            </li>
                                                                        </ul>
                                                                    </li>
                                                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                                    </li>
                                                                </ul>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">

                                                                <!-- start form for validation -->
                                                                
                                                                    <input type="text" id="idEgresado5" name="idEgresado5" class="form-control" readonly="readonly"  value="0">
                                                                    <input type="text" id="idPregunta1" name="idPregunta[0]" class="form-control" readonly="readonly"  value="<%=pregu[0].getIdPregunta() %>">
                                                                    <label for="fullname">1.<%=pregu[0].getDescripcion() %></label>
                                                                   <p>
                                                                       SI:
                                                                       <input type="radio" class="flat" name="res[0]" id="res14" value="<%=respu[0].getIdRespuesta() %>"  checked="" required /> NO:
                                                                        <input type="radio" class="flat" name="res[0]" id="res12" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p>  
                                                                    
                                                                    <input type="text" id="idPregunta2" name="idPregunta[1]" class="form-control" readonly="readonly"  value="<%=pregu[1].getIdPregunta() %>">
                                                                    <br>

                                                                    <label for="email">2.<%=pregu[1].getDescripcion() %></label>
                                                                    <p class="x1x1">
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[1]" id="res[2]" value="<%=respu[0].getIdRespuesta() %>" /> NO:
                                                                        <input type="radio" class="flat" name="res[1]" id="res22" value="<%=respu[1].getIdRespuesta() %>" checked="" />
                                                                    </p>    
                                                                    
                                                                    <input type="text" id="idPregunta3" name="idPreguntas[0]" class="form-control" readonly="readonly"  value="<%=pregu[1].getIdPregunta() %>">
                                                                    <div id="xxx1">
                                                                        <label for="email">     Si su respuesta fue afirmativa mencione las cusas de la demora en la obtencion de su grado de Bachiller?</label>
                                                                        <p style="padding: 5px;">

                                                                            <input type="checkbox" name="hobbies[0][0]" id="hobby2" value="<%=respu[2].getIdRespuesta()%>"checked="checked" class="flat" /> <%=respu[2].getDescripcion()%>
                                                                            <br />

                                                                            <input type="checkbox" name="hobbies[0][1]" id="hobby3" value="<%=respu[3].getIdRespuesta()%>" class="flat" /> <%=respu[3].getDescripcion()%>
                                                                            <br />

                                                                            <input type="checkbox" name="hobbies[0][2]" id="hobby4" value="<%=respu[4].getIdRespuesta()%>" class="flat" /> <%=respu[4].getDescripcion()%>
                                                                            <br />
                                                                            <input type="checkbox" name="hobbies[0][3]" id="hobby4" value="<%=respu[5].getIdRespuesta()%>" class="flat" /> <%=respu[5].getDescripcion()%>
                                                                            <br />
                                                                        <p> 
                                                                    </div>
                                                                        
                                                                        <br>
                                                                   
                                                                    <input type="text" id="idPregunta4" name="idPregunta[2]" class="form-control" readonly="readonly"  value="<%=pregu[2].getIdPregunta() %>">
                                                                    <label for="email">3.<%=pregu[2].getDescripcion() %></label>
                                                                   <p class="x2x2">
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[2]" id="res3" value="<%=respu[0].getIdRespuesta() %>"   /> NO:
                                                                        <input type="radio" class="flat" name="res[2]" id="res3" value="<%=respu[1].getIdRespuesta() %>" checked="" required />
                                                                    </p>   <br>
                                                                    
                                                                    <input type="text" id="idPregunta5" name="idPreguntas[1]" class="form-control" readonly="readonly"  value="<%=pregu[2].getIdPregunta() %>">
                                                                     <div id="xxx2">
                                                                    <label for="email">     Si su respuesta fue afirmativa mencione las cusas de la demora en la obtencion de su titulo profesional</label>
                                                                     <p style="padding: 5px;">
                                                                        

                                                                        <input type="checkbox" name="hobbies[1][0]" id="hobby2" value="<%=respu[2].getIdRespuesta() %>" class="flat" checked="checked" /> <%=respu[2].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[1][1]" id="hobby3" value="<%=respu[3].getIdRespuesta() %>" class="flat" /> <%=respu[3].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[1][2]" id="hobby4" value="<%=respu[4].getIdRespuesta() %>" class="flat" /> <%=respu[4].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[1][3]" id="hobby4" value="<%=respu[5].getIdRespuesta() %>" class="flat" /> <%=respu[5].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                     </div> 
                                                                        <br>
                                                                        
                                                                    <input type="text" id="idPregunta6" name="idPregunta[3]" class="form-control" readonly="readonly"  value="<%=pregu[3].getIdPregunta() %>">
                                                                    <label for="email">4.<%=pregu[3].getDescripcion() %></label>
                                                                    <p class="x3x3">
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[3]" id="genderM" value="<%=respu[0].getIdRespuesta() %>" checked="" required  /> NO:
                                                                        <input type="radio" class="flat" name="res[3]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p>   
                                                                    <br>
                                                                    <div id="xxx3">  
                                                                    <input type="text" id="idPregunta7" name="idPreguntas[2]" class="form-control" readonly="readonly"  value="<%=pregu[3].getIdPregunta() %>">
                                                                    
                                                                    <label for="email">  Señale los motivos</label>
                                                                      <p style="padding: 5px;">
                                  
                                                                        <input type="checkbox" name="hobbies[2][0]" id="hobby2" value="<%=respu[6].getIdRespuesta() %>" class="flat" checked="checked"/> <%=respu[6].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[2][1]" id="hobby3" value="<%=respu[7].getIdRespuesta() %>" class="flat" /> <%=respu[7].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[2][2]" id="hobby4" value="<%=respu[8].getIdRespuesta() %>" class="flat" /> <%=respu[8].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[2][3]" id="hobby4" value="<%=respu[9].getIdRespuesta() %>" class="flat" /> <%=respu[9].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[2][4]" id="hobby4" value="<%=respu[10].getIdRespuesta() %>" class="flat" /> <%=respu[10].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                        <br>
                                                                      </div>  
                                                                         <div id="xxx4">
                                                                   <!-- <input type="text" id="idPregunta8" name="idPreguntas[3]" class="form-control" readonly="readonly"  value="<%=pregu[3].getIdPregunta() %>">-->
                                                                   
                                                                    <label> Señale los motivos</label>
                                                                    <p style="padding: 5px;">
                                                                        
                                                                        <input type="checkbox" name="hobbies[2][5]" id="hobby1" value="<%=respu[11].getIdRespuesta() %>" class="flat" /> <%=respu[11].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[2][6]" id="hobby3" value="<%=respu[12].getIdRespuesta() %>" class="flat" /> <%=respu[12].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[2][7]" id="hobby4" value="<%=respu[13].getIdRespuesta() %>" class="flat" /> <%=respu[13].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[2][8]" id="hobby4" value="<%=respu[14].getIdRespuesta() %>" class="flat" /> <%=respu[14].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[2][9]" id="hobby4" value="<%=respu[15].getIdRespuesta() %>" class="flat" /> <%=respu[15].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[2][10]" id="hobby4" value="<%=respu[16].getIdRespuesta() %>" class="flat" /> <%=respu[16].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                        
                                                                        <br>
                                                                       </div> 
                                                                    <input type="text" id="idPregunta9" name="idPregunta[4]" class="form-control" readonly="readonly"  value="<%=pregu[4].getIdPregunta() %>">
                                                                        <label for="email">5.<%=pregu[4].getDescripcion() %></label>
                                                                   <p class="x4x4">
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[4]" id="genderM" value="<%=respu[0].getIdRespuesta() %>" checked="" required /> NO:
                                                                        <input type="radio" class="flat" name="res[4]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" /> 
                                                                    </p> 
                                                                       <br>
                                                                     <div id="xxx5">  
                                                                    <input type="text" id="idPregunta10" name="idPreguntas[3]" class="form-control" readonly="readonly"  value="<%=pregu[4].getIdPregunta() %>">
                                                                    <label for="email">  Señale los motivos</label>
                                                                      <p style="padding: 5px;">
                                  
                                                                        <input type="checkbox" name="hobbies[3][0]" id="hobby2"  value="<%=respu[17].getIdRespuesta() %>" class="flat" checked="checked"/> <%=respu[17].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[3][1]" id="hobby3" value="<%=respu[18].getIdRespuesta() %>" class="flat" /> <%=respu[18].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[3][2]" id="hobby4" value="<%=respu[19].getIdRespuesta() %>" class="flat" /> <%=respu[19].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[3][3]" id="hobby4" value="<%=respu[20].getIdRespuesta() %>" class="flat" /> <%=respu[20].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[3][4]" id="hobby4" value="<%=respu[21].getIdRespuesta() %>" class="flat" /> <%=respu[21].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                           <br>
                                                                     </div>
                                                                        <div id="xxx6">  
                                                                   <!-- <input type="text" id="idPregunta11" name="idPreguntas[5]" class="form-control" readonly="readonly"  value="<%=pregu[4].getIdPregunta() %>">-->
                                                                    <label> Señale los motivos</label>
                                                                    <p style="padding: 5px;">
                                                                        
                                                                        <input type="checkbox" name="hobbies[3][5]" id="hobby1"  value="<%=respu[22].getIdRespuesta() %>" class="flat" /> <%=respu[22].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[3][6]" id="hobby3" value="<%=respu[23].getIdRespuesta() %>" class="flat" /> <%=respu[23].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[3][7]" id="hobby4" value="<%=respu[24].getIdRespuesta() %>" class="flat" /> <%=respu[24].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[3][8]" id="hobby4" value="<%=respu[25].getIdRespuesta() %>" class="flat" /> <%=respu[25].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[3][9]" id="hobby4" value="<%=respu[26].getIdRespuesta() %>" class="flat" /> <%=respu[26].getDescripcion() %>
                                                                        <br />
                                                                        
                                                                    <p>
                                                                         
                                                                        <br>
                                                                        </div>
                                                                    <input type="text" id="idPregunta12" name="idPregunta[5]" class="form-control" readonly="readonly"  value="<%=pregu[5].getIdPregunta() %>">
                                                                        <label for="fullname">6.<%=pregu[5].getDescripcion() %></label>
                                                                    <p>
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[5]" id="genderM" value="<%=respu[0].getIdRespuesta() %>"  checked="" required /> NO:
                                                                        <input type="radio" class="flat" name="res[5]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p> 
                                                                     
                                                                    <br>
                                                                       
                                                                    <input type="text" id="idPregunta13" name="idPregunta[6]" class="form-control" readonly="readonly"  value="<%=pregu[6].getIdPregunta() %>">
                                                                     <label for="fullname">7.<%=pregu[6].getDescripcion() %></label>
                                                                   <p>
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[6]" id="genderM" value="<%=respu[0].getIdRespuesta() %>"  checked="" required /> NO:
                                                                        <input type="radio" class="flat" name="res[6]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p> 
                                                                   
                                                                    <br>
                                                                       
                                                                    <input type="text" id="idPregunta14" name="idPreguntas[4]" class="form-control" readonly="readonly"  value="<%=pregu[7].getIdPregunta() %>">
                                                                    <label for="email">  8.<%=pregu[7].getDescripcion() %></label>
                                                                      <p style="padding: 5px;">
                                  
                                                                        <input type="checkbox" name="hobbies[4][0]" id="hobby2"  value="<%=respu[27].getIdRespuesta() %>" class="flat" checked="checked"/> <%=respu[27].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[4][1]" id="hobby3" value="<%=respu[28].getIdRespuesta() %>" class="flat" /> <%=respu[28].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[4][2]" id="hobby4" value="<%=respu[29].getIdRespuesta() %>" class="flat" /> <%=respu[29].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[4][3]" id="hobby4" value="<%=respu[30].getIdRespuesta() %>" class="flat" /> <%=respu[30].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[4][4]" id="hobby4" value="<%=respu[31].getIdRespuesta() %>" class="flat" /> <%=respu[31].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[4][5]" id="hobby4" value="<%=respu[32].getIdRespuesta() %>" class="flat" /> <%=respu[32].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[4][6]" id="hobby4" value="<%=respu[33].getIdRespuesta() %>" class="flat" /> <%=respu[33].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                          
                                                                        <br>
                                                                        
                                                                    <input type="text" id="idPregunta15" name="idPregunta[7]" class="form-control" readonly="readonly"  value="<%=pregu[8].getIdPregunta() %>">
                                                                         <label for="email">Califique los siguientes aspectos considerando su experiencia como profesional y el tiempo que estudio en la UNIA</label>
                                                                         
                                                                    <label for="fullname"> 9.<%=pregu[8].getDescripcion() %> </label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[7]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required  /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[7]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[7]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[7]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[7]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                       
                                                                    <br>
                                                                       
                                                                    <input type="text" id="idPregunta16" name="idPregunta[8]" class="form-control" readonly="readonly"  value="<%=pregu[9].getIdPregunta() %>">
                                                                     <label for="fullname"> 10.<%=pregu[9].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[8]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required  /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[8]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[8]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[8]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[8]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                       
                                                                    
                                                                    <br>
                                                                       
                                                                    <input type="text" id="idPregunta17" name="idPregunta[9]" class="form-control" readonly="readonly"  value="<%=pregu[10].getIdPregunta() %>">
                                                                     <label for="fullname"> 11.<%=pregu[10].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[9]" id="genderM" value="<%=respu[34].getIdRespuesta() %>"checked="" required   /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[9]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[9]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[9]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[9]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                       
                                                                    
                                                                    <br>
                                                                      
                                                                    <input type="text" id="idPregunta18" name="idPregunta[10]" class="form-control" readonly="readonly"  value="<%=pregu[11].getIdPregunta() %>">
                                                                     <label for="fullname"> 12.<%=pregu[11].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[10]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required  /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[10]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[10]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[10]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[10]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                      
                                                                    <br>
                                                                        
                                                                    <input type="text" id="idPregunta19" name="idPregunta[11]" class="form-control" readonly="readonly"  value="<%=pregu[12].getIdPregunta() %>">
                                                                     <label for="fullname"> 13.<%=pregu[12].getDescripcion() %></label>
                                                                    <p>
                                                                       <input type="radio" class="flat" name="res[11]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[11]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[11]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[11]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[11]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                      
                                                                    <br>
                                                                        
                                                                    <input type="text" id="idPregunta20" name="idPregunta[12]" class="form-control" readonly="readonly"  value="<%=pregu[13].getIdPregunta() %>">
                                                                     <label for="fullname"> 14.<%=pregu[13].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[12]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[12]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[12]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[12]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[12]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                      
                                                                    <br>
                                                                       
                                                                    <input type="text" id="idPregunta21" name="idPregunta[13]" class="form-control" readonly="readonly"  value="<%=pregu[14].getIdPregunta() %>">
                                                                     <label for="fullname"> 15.<%=pregu[14].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[13]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required  /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[13]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[13]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[13]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[13]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                      
                                                                    <br>
                                                                        
                                                                    <input type="text" id="idPregunta22" name="idPregunta[14]" class="form-control" readonly="readonly"  value="<%=pregu[15].getIdPregunta() %>">
                                                                     <label for="fullname"> 16.<%=pregu[15].getDescripcion() %></label>
                                                                    <p>
                                                                       <input type="radio" class="flat" name="res[14]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[14]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[14]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[14]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[14]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                      
                                                                    <br>
                                                                        
                                                                    <input type="text" id="idPregunta23" name="idPregunta[15]" class="form-control" readonly="readonly"  value="<%=pregu[16].getIdPregunta() %>">
                                                                     <label for="fullname"> 17.<%=pregu[16].getDescripcion() %></label>
                                                                    <p>
                                                                       <input type="radio" class="flat" name="res[15]" id="genderM" value="<%=respu[34].getIdRespuesta() %>" checked="" required  /> <%=respu[34].getDescripcion() %>:<br>
                                                                       <input type="radio" class="flat" name="res[15]" id="genderF" value="<%=respu[35].getIdRespuesta() %>" />  <%=respu[35].getDescripcion() %><br>
                                                                        
                                                                        <input type="radio" class="flat" name="res[15]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        <input type="radio" class="flat" name="res[15]" id="genderF" value="<%=respu[37].getIdRespuesta() %>" /> <%=respu[37].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[15]" id="genderF" value="<%=respu[38].getIdRespuesta() %>" /> <%=respu[38].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                   
                                                           <!-------------------------------------------------------------------------------->         
                                                              
                                                                <!-- end form for validations -->

                                                            </div>
                                                        </div>
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>Preguntas Laborales<small>Click to validate</small></h2>
                                                                <ul class="nav navbar-right panel_toolbox">
                                                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                                    </li>
                                                                    <li class="dropdown">
                                                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                                        <ul class="dropdown-menu" role="menu">
                                                                            <li><a href="#">Settings 1</a>
                                                                            </li>
                                                                            <li><a href="#">Settings 2</a>
                                                                            </li>
                                                                        </ul>
                                                                    </li>
                                                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                                    </li>
                                                                </ul>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">

                                                                <!-- start form for validation -->
                                                                
                                                               
                                                                    <input type="text" id="idPregunta24" name="idPregunta[16]" class="form-control" readonly="readonly"  value="<%=pregu[17].getIdPregunta() %>">
                                                                     <label for="fullname"> 1.<%=pregu[17].getDescripcion() %></label>
                                                                  <p>
                                                                       <input type="radio" class="flat" name="res[16]" id="genderM" value="<%=respu[39].getIdRespuesta() %>" checked="" required  /> <%=respu[39].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[16]" id="genderM" value="<%=respu[40].getIdRespuesta() %>"  /> <%=respu[40].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[16]" id="genderM" value="<%=respu[41].getIdRespuesta() %>"  /> <%=respu[41].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[16]" id="genderM" value="<%=respu[42].getIdRespuesta() %>" /> <%=respu[42].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                               
                                                                    <br>
                                                                 
                                                                    <input type="text" id="idPregunta25" name="idPregunta[17]" class="form-control" readonly="readonly"  value="<%=pregu[18].getIdPregunta() %>">
                                                                     <label for="fullname"> 2.<%=pregu[18].getDescripcion() %></label>
                                                                   <p>
                                                                        <input type="radio" class="flat" name="res[17]" id="genderM" value="<%=respu[43].getIdRespuesta() %>"  checked="" required /> <%=respu[43].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[17]" id="genderM" value="<%=respu[44].getIdRespuesta() %>"  /> <%=respu[44].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[17]" id="genderM" value="<%=respu[45].getIdRespuesta() %>"  /> <%=respu[45].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[17]" id="genderM" value="<%=respu[46].getIdRespuesta() %>" /> <%=respu[46].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                   
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta26" name="idPregunta[18]" class="form-control" readonly="readonly"  value="<%=pregu[19].getIdPregunta() %>">
                                                                     <label for="fullname"> 3.<%=pregu[19].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[18]" id="genderM" value="<%=respu[47].getIdRespuesta() %>"  checked="" required /> <%=respu[47].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[18]" id="genderM" value="<%=respu[48].getIdRespuesta() %>"  /> <%=respu[48].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[18]" id="genderM" value="<%=respu[49].getIdRespuesta() %>"  /> <%=respu[49].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[18]" id="genderM" value="<%=respu[50].getIdRespuesta() %>" /> <%=respu[50].getDescripcion() %><br>
                                                                      
                                                                   </p>
                                                                   
                                                                
                                                                    <input type="text" id="idPregunta27" name="idPregunta[19]" class="form-control" readonly="readonly"  value="<%=pregu[20].getIdPregunta() %>">
                                                                     <label for="fullname"> 4.<%=pregu[20].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[19]" id="genderM" value="<%=respu[51].getIdRespuesta() %>" checked="" required  /> <%=respu[51].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[19]" id="genderM" value="<%=respu[52].getIdRespuesta() %>"  /> <%=respu[52].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[19]" id="genderM" value="<%=respu[53].getIdRespuesta() %>"  /> <%=respu[53].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[19]" id="genderM" value="<%=respu[54].getIdRespuesta() %>" /> <%=respu[54].getDescripcion() %><br>
                                                                         <input type="radio" class="flat" name="res[19]" id="genderM" value="<%=respu[55].getIdRespuesta() %>" /> <%=respu[55].getDescripcion() %><br>
                                                                    </p>
                                                                
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta28" name="idPregunta[20]" class="form-control" readonly="readonly"  value="<%=pregu[21].getIdPregunta() %>">
                                                                     <label for="fullname"> 5.<%=pregu[21].getDescripcion() %></label>
                                                                   <p>
                                                                       
                                                                         <input type="radio" class="flat" name="res[20]" id="genderM" value="<%=respu[56].getIdRespuesta() %>" checked="" required  /> <%=respu[56].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[20]" id="genderM" value="<%=respu[57].getIdRespuesta() %>"  /> <%=respu[57].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[20]" id="genderM" value="<%=respu[58].getIdRespuesta() %>"  /> <%=respu[58].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[20]" id="genderM" value="<%=respu[59].getIdRespuesta() %>" /> <%=respu[59].getDescripcion() %><br>
                                                                        
                                                                        
                                                                    </p>
                                                                    <br>
                                                               
                                                                    <input type="text" id="idPregunta29" name="idPregunta[21]" class="form-control" readonly="readonly"  value="<%=pregu[22].getIdPregunta() %>">
                                                                     <label for="fullname"> 6.<%=pregu[22].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[21]" id="genderM" value="<%=respu[60].getIdRespuesta() %>"  checked="" required /> <%=respu[60].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[21]" id="genderM" value="<%=respu[61].getIdRespuesta() %>"  /> <%=respu[61].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[21]" id="genderM" value="<%=respu[62].getIdRespuesta() %>"  /> <%=respu[62].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[21]" id="genderM" value="<%=respu[63].getIdRespuesta() %>" /> <%=respu[63].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                    <br>
                                                                     
                                                                    <input type="text" id="idPregunta30" name="idPregunta[22]" class="form-control" readonly="readonly"  value="<%=pregu[23].getIdPregunta() %>">
                                                                     <label for="fullname"> 7.<%=pregu[23].getDescripcion() %></label>
                                                                       
                                                                  <p>
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[22]" id="genderM" value="<%=respu[0].getIdRespuesta() %>" checked="" required  /> NO:
                                                                        <input type="radio" class="flat" name="res[22]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p> 
                                                               
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta31" name="idPregunta[23]" class="form-control" readonly="readonly"  value="<%=pregu[24].getIdPregunta() %>">
                                                                     <label for="fullname"> 8.<%=pregu[24].getDescripcion() %></label>
                                                                   <p>
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[23]" id="genderM" value="<%=respu[0].getIdRespuesta() %>"  checked="" required /> NO:
                                                                        <input type="radio" class="flat" name="res[23]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p> 
                                                                    <br>
                                                                          
                                                                    <input type="text" id="idPregunta32" name="idPregunta[24]" class="form-control" readonly="readonly"  value="<%=pregu[25].getIdPregunta() %>">
                                                                     <label for="fullname"> 9.<%=pregu[25].getDescripcion() %></label>
                                                                   <p>
                                                                       SI:
                                                                        <input type="radio" class="flat" name="res[24]" id="genderM" value="<%=respu[0].getIdRespuesta() %>" checked="" required  /> NO:
                                                                        <input type="radio" class="flat" name="res[24]" id="genderF" value="<%=respu[1].getIdRespuesta() %>" />
                                                                    </p> 
                                                                    <br>
                                                                     
                                                                    <input type="text" id="idPregunta33" name="idPregunta[25]" class="form-control" readonly="readonly"  value="<%=pregu[26].getIdPregunta() %>">
                                                                     <label for="fullname"> 10.<%=pregu[26].getDescripcion() %></label>
                                                                   <p>
                                                                      <input type="radio" class="flat" name="res[25]" id="genderM" value="<%=respu[64].getIdRespuesta() %>"  checked="" required /> <%=respu[64].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[25]" id="genderM" value="<%=respu[65].getIdRespuesta() %>"  /> <%=respu[65].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[25]" id="genderM" value="<%=respu[66].getIdRespuesta() %>"  /> <%=respu[66].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[25]" id="genderM" value="<%=respu[67].getIdRespuesta() %>" /> <%=respu[67].getDescripcion() %><br>
                                                                        
                                                                        
                                                                    </p>
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta34" name="idPregunta[26]" class="form-control" readonly="readonly"  value="<%=pregu[27].getIdPregunta() %>">
                                                                     <label for="fullname"> 11.<%=pregu[27].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[26]" id="genderM" value="<%=respu[68].getIdRespuesta() %>"  checked="" required /> <%=respu[68].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[26]" id="genderM" value="<%=respu[69].getIdRespuesta() %>"  /> <%=respu[69].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[26]" id="genderM" value="<%=respu[70].getIdRespuesta() %>"  /> <%=respu[70].getDescripcion() %><br>
                                                                        
                                                                      <input type="radio" class="flat" name="res[26]" id="genderM" value="<%=respu[71].getIdRespuesta() %>" /> <%=respu[71].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[26]" id="genderM" value="<%=respu[63].getIdRespuesta() %>" /> <%=respu[63].getDescripcion() %><br>
                                                                        
                                                                    </p>
                                                                    <br>
                                                                     
                                                                    <input type="text" id="idPregunta35" name="idPregunta[27]" class="form-control" readonly="readonly"  value="<%=pregu[28].getIdPregunta() %>">
                                                                     <label for="fullname"> 12.<%=pregu[28].getDescripcion() %></label>
                                                                   <p>
                                                                       <input type="radio" class="flat" name="res[27]" id="genderM" value="<%=respu[72].getIdRespuesta() %>" checked="" required  /> <%=respu[72].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[27]" id="genderM" value="<%=respu[73].getIdRespuesta() %>"  /> <%=respu[73].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[27]" id="genderM" value="<%=respu[74].getIdRespuesta() %>"  /> <%=respu[74].getDescripcion() %><br>
                                                                        
                                                                        
                                                                        
                                                                    </p>
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta36" name="idPreguntas[5]" class="form-control" readonly="readonly"  value="<%=pregu[29].getIdPregunta() %>">
                                                                     <label for="fullname"> 13.<%=pregu[29].getDescripcion() %></label>
                                                                 <p style="padding: 5px;">
                                  
                                                                        <input type="checkbox" name="hobbies[5][0]" id="hobby2"  value="<%=respu[75].getIdRespuesta() %>" class="flat"checked="checked" /> <%=respu[75].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[5][1]" id="hobby3" value="<%=respu[76].getIdRespuesta() %>" class="flat" /> <%=respu[76].getDescripcion() %>
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[5][2]" id="hobby4" value="<%=respu[77].getIdRespuesta() %>" class="flat" /> <%=respu[77].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[5][3]" id="hobby4" value="<%=respu[78].getIdRespuesta() %>" class="flat" /> <%=respu[78].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[5][4]" id="hobby4" value="<%=respu[79].getIdRespuesta() %>" class="flat" /> <%=respu[79].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[5][5]" id="hobby4" value="<%=respu[80].getIdRespuesta() %>" class="flat" /> <%=respu[80].getDescripcion() %>
                                                                        <br />
                                                                         <input type="checkbox" name="hobbies[5][6]" id="hobby4" value="<%=respu[81].getIdRespuesta() %>" class="flat" /> <%=respu[81].getDescripcion() %>
                                                                        <br />
                                                                        <input type="checkbox" name="hobbies[5][7]" id="hobby4" value="<%=respu[82].getIdRespuesta() %>" class="flat" /> <%=respu[82].getDescripcion() %>
                                                                        <br />
                                                                    <p>
                                                                 
                                                                
                                                                    <br>
                                                                    
                                                                    <input type="text" id="idPregunta37" name="idPregunta[28]" class="form-control" readonly="readonly"  value="<%=pregu[30].getIdPregunta() %>">
                                                                     <label for="fullname"> 14.<%=pregu[30].getDescripcion() %></label>
                                                                   <p>
                                                                        <input type="radio" class="flat" name="res[28]" id="genderM" value="<%=respu[83].getIdRespuesta() %>"  checked="" required /> <%=respu[83].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[28]" id="genderM" value="<%=respu[84].getIdRespuesta() %>"  /> <%=respu[84].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[28]" id="genderM" value="<%=respu[85].getIdRespuesta() %>"  /> <%=respu[85].getDescripcion() %><br>
                                                                       
                                                                       
                                                                    </p>
                                                                    <br>
                                                       
                                                                    <input type="text" id="idPregunta38" name="idPregunta[29]" class="form-control" readonly="readonly"  value="<%=pregu[31].getIdPregunta() %>">
                                                                     <label for="fullname"> 15.<%=pregu[31].getDescripcion() %></label>
                                                                   <p>
                                                                          <input type="radio" class="flat" name="res[29]" id="genderM" value="<%=respu[86].getIdRespuesta() %>" checked="" required  /> <%=respu[86].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[29]" id="genderM" value="<%=respu[36].getIdRespuesta() %>"  /> <%=respu[36].getDescripcion() %><br>
                                                                        
                                                                       <input type="radio" class="flat" name="res[29]" id="genderM" value="<%=respu[87].getIdRespuesta() %>"  /> <%=respu[87].getDescripcion() %><br>
                                                                         <input type="radio" class="flat" name="res[29]" id="genderM" value="<%=respu[88].getIdRespuesta() %>"  /> <%=respu[88].getDescripcion() %><br>
                                                                       <input type="radio" class="flat" name="res[29]" id="genderM" value="<%=respu[89].getIdRespuesta() %>"  /> <%=respu[89].getDescripcion() %><br>
                                                                        
                                                                      
                                                                    </p>     
                                                            
                                                                      

                                                               
                                                                <!-- end form for validations -->

                                                            </div>
                                                                        
                                                         </div>
                                                        </form>
                                                                 <div class="form-group">
                                                                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                                                                        <button type="button" id="btnguardartab5"class="btn btn-success">Guardar</button>
                                                                    </div>
                                                                </div>         
                                                                       
                                                        </div>
                                                </div>
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
                    
                    
                     $('.x1x1 input').on('ifChecked',function(e){
                         $('#xxx1').fadeToggle("fast",function(){});
                     });
                     
                     /*-----------------------------------------------------*/
                      $('.x2x2 input').on('ifChecked',function(e){
                         $('#xxx2').fadeToggle("fast",function(){});
                     });
                     /*-----------------------------------------------------*/
                     
                     $('.x3x3 input').on('ifChecked',function(e){
                        
                         if(this.value==="1"){
                            $('#xxx4').fadeOut("fast",function(){
                                $('#xxx3').fadeIn("fast",function(){});
                            });
                            
                        }else{
                            $('#xxx3').fadeOut("fast",function(){
                                $('#xxx4').fadeIn("fast",function(){});
                            });
                            
                        }
                     });
                     /*-----------------------------------------------------*/  
                          $('.x4x4 input').on('ifChecked',function(e){
                        
                         if(this.value==="1"){
                            $('#xxx6').fadeOut("fast",function(){
                                $('#xxx5').fadeIn("fast",function(){});
                            });
                            
                        }else{
                            $('#xxx5').fadeOut("fast",function(){
                                $('#xxx6').fadeIn("fast",function(){});
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
                                        alert("Falta responder "+contador+" preguntas", false);
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

                                if (confirm("seguro que desea eliminar el Grado" ) == true)
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

                                if (confirm("seguro que desea eliminar el Estudios Realizado" ) == true)
                        {
                           
                            $.ajax(
                                    {
                                       
                                        url: "EstudiosController?accion=eliminar&idEstudios="+ data4[0],
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
