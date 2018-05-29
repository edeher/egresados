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
                                                        Usuario / Egresados Registrados</a>
                                                </li>
                                                <li role="presentation" class="">
                                                    <a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">
                                                        Usuario / Egresados no Registrados
                                                    </a>
                                                </li> 
                                            </ul>

                                            <!-- --------------------------------------------->               
                                            <div class="container">
                                                <div id="myTabContent" class="tab-content">  

                                                    <!---cuerpo de pestaña 1 --->
                                                    <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                        <form class="form-horizontal form-label-left" id="crearformtab1" enctype="multipart/form-data">


                                                            <div class="col-sm-6">

                                                                <div class="input-group">
                                                                    <input type="text" class="form-control" name="dnix" id="dnix" placeholder="Ingrese su DNI">
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
                                                                                <input type="hidden" name="idEgresado1"id="idEgresado1" value="" />
                                                                                <input name="nombres1" id="nombres1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Apellidos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="apellidos1" id="apellidos1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Dni</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="dni1" id="dni1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Direccion</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="direccion1" id="direccion1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono </label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="telefono1" id="telefono1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Correo Electronico</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="correo1" id="correo1"class="form-control has-feedback-left" readonly="readonly" type="text" class="form-control" value="">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Usuario</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="usuario1" id="usuario1" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Contraseña</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="password1" id="password1" type="password" class="form-control" placeholder="Ingrese contraseña">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Confirme Contraseña</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="password2" id="password2" type="password" class="form-control" placeholder="confirme contraseña">
                                                                            </div>
                                                                        </div>



                                                                    </div></div></div>    


                                                        </form>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-default" id="btnlimpiar1" data-dismiss="modal">Limpiar</button>
                                                            <button type="button" class="btn btn-primary" id="btnguardar11" >Guardar</button>
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
                                                                                <select name="SelectDepaNa2" id="SelectDepaNa2" class="form-control">
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
                                                                                <select  name="SelectProNa2" id="SelectProNa2" class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="SelectDisNa2" id="SelectDisNa2" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Lugar de Residencia</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="SelectDepaRe2" id="SelectDepaRe2" class="form-control">
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
                                                                                <select name="SelectProRe2" id="SelectProRe2"  class="select2_group form-control">
                                                                                    <option value="--">Provincia</option>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="SelectDisRe2" id="SelectDisRe2" class="select2_group form-control">
                                                                                    <option value="--">Distrito</option>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Carrera Profesional</label>
                                                                            <div class="col-md-3 col-sm-6 col-xs-6">
                                                                                <select name="SelectFacultad2" id="SelectFacultad2" class="form-control">
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
                                                                                <select  name="SelectEscuela2" id="SelectEscuela2" class=" form-control">
                                                                                    <option value="--">Escuela</option>
                                                                                </select>
                                                                            </div>

                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Nombres</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="nombres2" id="nombres2" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Apellidos</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="apellidos2" id="apellidos2" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de nacimiento</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input  name="fechaNa2" type="text" class="form-control has-feedback-left" id="fechaNa2" value="">
                                                                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Dni</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="dni2" type="text" id="dni2" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">
                                                                                Sexo
                                                                            </label>

                                                                            <div class="col-md-9 col-sm-9 col-xs-12">

                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo2" id="genderM2" value="M" checked="" required /> Masculino
                                                                                    </label>
                                                                                </div>
                                                                                <div class="radio">
                                                                                    <label>
                                                                                        <input type="radio" class="flat" name="sexo2" id="genderF2" value="F" /> Femenino
                                                                                    </label>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Direccion</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="direccion2" type="text" id="direccion2" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>


                                                                    </div></div></div>  
                                                            <div class="col-md-6 col-sm-12 col-xs-12">
                                                                <div class="x_panel">

                                                                    <div class="x_content">       

                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 1</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="telefono12" type="text" id="telefono12" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Telefono 2</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name=telefono22 type="text" id="telefono22" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Correo Electronico</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="correo2" type="email" id="correo2" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Año de Ingreso</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select name="anioingreso2" id="anioingreso2" class="select2_single form-control" tabindex="-1">
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
                                                                                <select name="anioegreso2" id="anioegreso2"class="select2_single form-control" tabindex="-1">
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
                                                                                <select name="nrohijos2" id="nrohijos2" class="select2_single form-control" tabindex="-1">
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
                                                                                <select name="estadoci2" id="estadoci2" class="select2_single form-control" tabindex="-1">
                                                                                    <option value="--">--</option>
                                                                                    <%for (EstadoCivil es : EstadoCivil.values()) {

                                                                                    %>
                                                                                    <option value="<%=es.name()%>"  >
                                                                                        <%=es.getNom()%></option>
                                                                                        <%}%>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Usuario</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="usuario2" id="usuario2" type="text" class="form-control" placeholder="Campo obligatorio">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Contraseña</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="password2" id="password2" type="password" class="form-control" placeholder="Ingrese contraseña">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Confirme Contraseña</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="password22" id="password22" type="password" class="form-control" placeholder="confirme contraseña">
                                                                            </div>
                                                                        </div>
                                                                    </div></div></div>  

                                                        </form>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-default" id="btnlimpiar2" data-dismiss="modal">Limpiar</button>
                                                            <button type="button" class="btn btn-primary" id="btnguardar22" >Guardar</button>
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

                            /*------------------------------*/
                            $('#fechaNa2').daterangepicker({
                                format: 'YYYY-MM-DD',
                                singleDatePicker: true,
                                calender_style: "picker_4"

                            },
                                    function (start, end, label) {
                                        console.log(start.toISOString(), end.toISOString(), label);
                                    });
                            /*------------------------------*/
                            /*---------------nac--------------*/
                            $('#SelectDepaNa2').on('change', function () {
                                var codigo1 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo1,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectProNa2').html(data);
                                    }
                                });
                            });

                            $('#SelectProNa2').on('change', function () {
                                var codigo2 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'DistritoController?accion=buscarporprovincia&codigo=' + codigo2,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectDisNa2').html(data);
                                    }
                                });
                            });

                            /*---------------Re--------------*/
                            $('#SelectDepaRe2').on('change', function () {
                                var codigo3 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo3,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectProRe2').html(data);
                                    }
                                });
                            });

                            $('#SelectProRe2').on('change', function () {
                                var codigo4 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'DistritoController?accion=buscarporprovincia&codigo=' + codigo4,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectDisRe2').html(data);
                                    }
                                });
                            });

                            /*-------------------------------------------*/

                        $('#SelectFacultad2').on('change', function () {
                                var codigo5 = this.value;

                                $.ajax({
                                    type: 'POST',
                                    url: 'EscuelaController?accion=obtenerporFacultad&codigo=' + codigo5,
                                    data: $(this).serialize(),
                                    success: function (data) {
                                        $('#SelectEscuela2').html(data);
                                    }
                                });
                            });



                            /*----------------------------------*/

                        });
                        $('#btncargar').click(function () {

                            var dnix = $("#dnix").val();


                        $.getJSON('EgresadoController?accion=obtenerxdni&dni=' + dnix, function (json) {

                                var codigo = [];
                                var nombres = [];
                                var apellidos = [];
                                var dni = [];
                                var telefono = [];
                                var direccion = [];
                                var correo = [];

                                $.each(json.egre, function (item, obj) {
                                    codigo.push(obj.codigo);
                                    $('#idEgresado1').val(codigo);

                                    nombres.push(obj.nombres);
                                    $('#nombres1').val(nombres);

                                    apellidos.push(obj.apellidos);
                                    $('#apellidos1').val(apellidos);

                                    dni.push(obj.dni);
                                    $('#dni1').val(dni);

                                    direccion.push(obj.direccion);
                                    $('#direccion1').val(direccion);

                                    telefono.push(obj.telefono);
                                    $('#telefono1').val(telefono);

                                    correo.push(obj.correo);
                                    $('#correo1').val(correo);
                                });

                            });

                        });
                        $('#btnguardar11').click(function () {
                            var formdata = new FormData($("#crearformtab1")[0]);
                            $.ajax({
                                url: "UsuarioEgresadoController?accion=crear",
                                type: "post",
                                contentType: false,
                                data: formdata,
                                processData: false,
                                cache: false})
                                    .done(function (msj) {

                                        if (msj == 0) {
                                            alert('Usuario ya existe, recuerde que las contraseñas deben ser iguales');

                                            alerta("usuario no creado", false);

                                        } else
                                        {
                                            alerta("Usuario creado, espere 5 segundos, Luego Ingrese con su Usuario creado ", true);

                                            setTimeout("window.location.href = 'JSPsession/loginEgresado.jsp'", 5000);
                                            //window.location.href = 'JSPsession/loginEgresado.jsp';
                                        }
                                    })

                        });
                        $('#btnguardar22').click(function () {
                            var formdata = new FormData($("#crearformtab2")[0]);
                            $.ajax({
                                url: "UsuarioEgresadoController?accion=crear_n1",
                                type: "post",
                                contentType: false,
                                data: formdata,
                                processData: false,
                                cache: false})
                                    .done(function (msj) {

                                        if (msj == 0) {
                                            alert('Usuario ya existe, recuerde que las contraseñas deben ser iguales');

                                            alerta("usuario no creado", false);

                                        } else
                                        {
                                            alerta("Usuario creado, espere 5 segundos, Luego Ingrese con su Usuario creado ", true);

                                            setTimeout("window.location.href = 'JSPsession/loginEgresado.jsp'", 5000);
                                            //window.location.href = 'JSPsession/loginEgresado.jsp';
                                        }
                                    })

                        });
                        $('#btnlimpiar1').click(function () {
                            $('#dnix').val('');
                            $('#nombres1').val('');
                            $('#apellidos1').val('');
                            $('#dni1').val('');
                            $('#direccion1').val('');
                            $('#telefono1').val('');
                            $('#correo1').val('');
                            $('#usuario1').val('');
                            $('#password1').val('');
                            $('#password2').val('');
                        });
                        $('#btnlimpiar2').click(function () {
                            $('#SelectDepaNa2').val('--');
                            $('#SelectProNa2').val('--');
                            $('#SelectDisNa2').val('--');
                            $('#SelectDepaRe2').val('--');
                            $('#SelectProRe2').val('--');
                            $('#SelectDisRe2').val('--');
                            $('#SelectFacultad2').val('--');
                            $('#SelectEscuela2').val('--');
                            $('#nombres2').val('');
                            $('#apellidos2').val('');
                            $('#fechaNa2').val('');
                            $('#dni2').val('');
                            $('#direccion2').val('');
                            $('#telefono12').val('');
                            $('#telefono22').val('');
                            $('#correo2').val('');
                            $('#anioingreso2').val('');
                            $('#anioegreso2').val('');
                            $('#nrohijos2').val('');
                            $('#estadoci2').val('');
                            $('#usuario2').val('');
                            $('#password2').val('');
                            $('#password2').val('');
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



                    </script>

                    </body>
                    </html>
