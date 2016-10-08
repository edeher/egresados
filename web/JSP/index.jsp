<%-- 
    Document   : index
    Created on : 04/10/2016, 12:02:04 PM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.enums.EstadoCivil"%>
<%@page import="com.egresados2016.modelo.Departamento"%>
<%@page import="com.egresados2016.dao.interfaces.DepartamentoDAO"%>
<%@page import="com.egresados2016.dao.factory.DepartamentoDAOFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuenta Egresados UNIA </title>

        <!-- Bootstrap core CSS -->

        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <link href="../fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="../css/animate.min.css" rel="stylesheet">

        <!-- Custom styling plus plugins -->
        <link href="../css/custom.css" rel="stylesheet">
        <link href="../css/icheck/flat/green.css" rel="stylesheet">



        <link rel="stylesheet" type="text/css" href="../css/maps/jquery-jvectormap-2.0.3.css" />
        <link href="../css/icheck/flat/green.css" rel="stylesheet" />
        <link href="../css/floatexamples.css" rel="stylesheet" type="text/css" />

        <script src="../js/jquery.min.js"></script>
        <script src="../js/nprogress.js"></script>

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

    %>

    <body class="nav-md">

        <div class="container body">


            <div class="main_container">

                <div class="col-md-3 left_col">
                    <div class="left_col scroll-view">

                        <div class="navbar nav_title" style="border: 0;">
                            <a href="" class="site_title"><i class="fa fa-male"></i> <span>Egresados UNIA!</span></a>
                        </div>
                        <div class="clearfix"></div>

                        <!-- menu prile quick info -->

                        <!-- /menu prile quick info -->

                        <br />

                        <!-- sidebar menu -->
                        <%@ include file="../jspf/menu.jspf"%>

                        <!-- /menu footer buttons -->
                        <%@ include file="../jspf/herramientas.jspf"%>
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <%@ include file="../jspf/cabecera.jspf"%>
                <!-- /top navigation -->


                <!-- page content -->

                <div class="right_col" role="main">

                    <div class="row_selected">



                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2><i class=""></i> Perfil <small>Egresado</small></h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">


                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                               <!-- cabezeras d elos taps-->             
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Datos Personales</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content2"     role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">Datos Laborales</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">Encuesta</a>
                                                </li>
                                            </ul>
                                <!-- --------------------------------------------->               
                                            <div id="myTabContent" class="tab-content">
                                                
                            <!-- -------cuerpo tab_content1------------------->                
                                        <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <div class="x_panel">

                                                            <div class="x_content">
                                                                <br />
                                                                <form class="form-horizontal form-label-left" enctype="multipart/form-data">


                                                                    <div class="form-group">
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input type="text" class="form-control" disabled="disabled" placeholder="Autogenerado">
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
                                                                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Nombres</label>
                                                                        <div class="col-md-9 col-sm-9 col-xs-12">
                                                                            <input name="nombre" type="text" class="form-control" placeholder="Campo obligatorio">
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
                                                                            <select name="anioingreso"  class="select2_single form-control" tabindex="-1">
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
                                                                            <select name="anioegreso" class="select2_single form-control" tabindex="-1">
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
                                                                                <option value="3">5</option>
                                                                                <option value="4">6</option>
                                                                                <option value="5">7</option>
                                                                                <option value="6">8</option>
                                                                                <option value="7">9</option>
                                                                                <option value="8">10</option>

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
                                                                        <button type="submit" class="btn btn-primary">Cancel</button>
                                                                        <button type="button" id="btnguardar" class="btn btn-success">Submit</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                       <!-- ---------------------------------------------> 
                                       
                                        <!-- ------cuerpo tab_content2--------> 
                                        <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
                                                    <div class="col-md-6 col-xs-12">



                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>Form Design <small>different form elements</small></h2>
                                                                
                                                                <div class="clearfix"></div>
                                                                
                                                                
                                                            </div>
                                                            
                                                        </div>

                                                                    
                                                 <!-------------------------------------------------------------------------------------------------->
                                                                </form>
                                                                <!-- end form for validations -->

                                                          
                                                       


                                                    </div>
                                                </div>
                                        
                     <!-- ---------------------------------------------> 
                                         
                      <!-- ---------cuerpo tab_content3--------------> 
                                      <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                                    <div class="col-md-6 col-xs-12">
                                                        <div class="x_panel">
                                                            <div class="x_title">
                                                                <h2>Registration Form <small>Click to validate</small></h2>
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
                                                                <form id="demo-form" data-parsley-validate>
                                                                    <label for="fullname">Full Name * :</label>
                                                                    <input type="text" id="fullname" class="form-control" name="fullname" required />

                                                                    <label for="email">Email * :</label>
                                                                    <input type="email" id="email" class="form-control" name="email" data-parsley-trigger="change" required />

                                                                    <label>Gender *:</label>
                                                                    <p>
                                                                        M:
                                                                        <input type="radio" class="flat" name="gender" id="genderM" value="M" checked="" required /> F:
                                                                        <input type="radio" class="flat" name="gender" id="genderF" value="F" />
                                                                    </p>

                                                                    <label>Hobbies (2 minimum):</label>
                                                                    <p style="padding: 5px;">
                                                                        <input type="checkbox" name="hobbies[]" id="hobby1" value="ski" data-parsley-mincheck="2" required class="flat" /> Skiing
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[]" id="hobby2" value="run" class="flat" /> Running
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[]" id="hobby3" value="eat" class="flat" /> Eating
                                                                        <br />

                                                                        <input type="checkbox" name="hobbies[]" id="hobby4" value="sleep" class="flat" /> Sleeping
                                                                        <br />
                                                                    <p>

                                                                        <label for="heard">Heard us by *:</label>
                                                                        <select id="heard" class="form-control" required>
                                                                            <option value="">Choose..</option>
                                                                            <option value="press">Press</option>
                                                                            <option value="net">Internet</option>
                                                                            <option value="mouth">Word of mouth</option>
                                                                        </select>
                                                   
                                                                        <label for="message">Message (20 chars min, 100 max) :</label>
                                                                        <textarea id="message" required="required" class="form-control" name="message" 
                                                                                  data-parsley-trigger="keyup" data-parsley-minlength="20" 
                                                                                  data-parsley-maxlength="100" 
                                                                                  data-parsley-minlength-message="Come on! You need to enter at least a 20 caracters long comment.."
                                                                                  data-parsley-validation-threshold="10">

                                                                        </textarea>

                                                                        <br/>
                                                                        <span class="btn btn-primary">validate form</span>

                                                                </form>
                                                                <!-- end form for validations -->

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
                        <!-- footer content -->

                        <footer>
                            <div class="copyright-info">
                                <p class="pull-right">Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>  
                                </p>
                            </div>
                            <div class="clearfix"></div>
                        </footer>
                        <!-- /footer content -->

                        <!-- /page content -->

                    </div>

                </div>

                <div id="custom_notifications" class="custom-notifications dsp_none">
                    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
                    </ul>
                    <div class="clearfix"></div>
                    <div id="notif-group" class="tabbed_notifications"></div>
                </div>


                <script src="../js/bootstrap.min.js" type="text/javascript"></script>
                <!-- gauge js -->
                <script type="text/javascript" src="../js/gauge/gauge.min.js"></script>
                <script type="text/javascript" src="../js/gauge/gauge_demo.js"></script>
                <!-- bootstrap progress js -->
                <script src="../js/progressbar/bootstrap-progressbar.min.js"></script>
                <script src="../js/nicescroll/jquery.nicescroll.min.js"></script>
                <!-- icheck -->
                <script src="../js/icheck/icheck.min.js"></script>
                <!-- daterangepicker -->
                <script type="text/javascript" src="../js/moment/moment.min.js"></script>
                <script type="text/javascript" src="../js/datepicker/daterangepicker.js"></script>
                <!-- chart js -->
                <script src="../js/chartjs/chart.min.js"></script>

                <script src="../js/custom.js"></script>

                <!-- flot js -->
                <!--[if lte IE 8]><script type="text/javascript" src="js/excanvas.min.js"></script><![endif]-->
                <script type="text/javascript" src="../js/flot/jquery.flot.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.pie.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.orderBars.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.time.min.js"></script>
                <script type="text/javascript" src="../js/flot/date.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.spline.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.stack.js"></script>
                <script type="text/javascript" src="../js/flot/curvedLines.js"></script>
                <script type="text/javascript" src="../js/flot/jquery.flot.resize.js"></script>

                <!-- icheck -->
                <script src="../js/icheck/icheck.min.js"></script>
                <!-- tags -->
                <script src="../js/tags/jquery.tagsinput.min.js"></script>
                <!-- switchery -->
                <script src="../js/switchery/switchery.min.js"></script>
                <!-- daterangepicker -->
                <!-- select2 -->
                <script src="../js/select/select2.full.js"></script>
                <script type="text/javascript">

                    $(document).ready(function () {
                        $('#input_fpublicacion').daterangepicker({
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
                                url: '../ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo,
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
                                url: '../DistritoController?accion=buscarporprovincia&codigo=' + codigo,
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
                                url: '../ProvinciaController?accion=buscarpordepartamento&codigo=' + codigo,
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
                                url: '../DistritoController?accion=buscarporprovincia&codigo=' + codigo,
                                data: $(this).serialize(),
                                success: function (data) {
                                    $('#SelectDisRe').html(data);
                                }
                            });
                        });

                        /*----------------------------------*/

                    });

                    $('#btnguardar').click(function () {

                       $('#profile-tab').href='#tab_content2';

                /*        var formdata = new FormData($("#crearform")[0]);
                        $.ajax({
                            url: "PublicacionController?accion=crearPublicacion",
                            type: "post",
                            contentType: false,
                            data: formdata,
                            processData: false,
                            cache: false})
                                .done(function (msj) {

                                    if (msj == 0) {
                                        alert('ya existe');
                                        ocultarmodal();
                                        alerta("Publicacion no creada", false);
                                    }
                                    else
                                    {
                                        actualizar();
                                        ocultarmodal();
                                        alerta("Publicacion creada", true);
                                    }
                                })*/
        
                                    

                    });

                </script>

                </body>
                </html>
