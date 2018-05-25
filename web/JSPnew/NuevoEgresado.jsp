<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.modelo.Facultad"%>
<%@page import="com.egresados2016.dao.interfaces.FacultadDAO"%>
<%@page import="com.egresados2016.dao.factory.FacultadDAOFactory"%>
<%@page import="com.egresados2016.modelo.Distrito"%>
<%@page import="com.egresados2016.dao.interfaces.DistritoDAO"%>
<%@page import="com.egresados2016.dao.factory.DistritoDAOFactory"%>
<%@page import="com.egresados2016.modelo.Provincia"%>
<%@page import="com.egresados2016.dao.interfaces.ProvinciaDAO"%>
<%@page import="com.egresados2016.dao.factory.ProvinciaDAOFactory"%>
<%@page import="com.egresados2016.dao.interfaces.DepartamentoDAO"%>
<%@page import="com.egresados2016.dao.factory.DepartamentoDAOFactory"%>
<%@page import="com.egresados2016.modelo.Departamento"%>
<%@page import="com.egresados2016.enums.EstadoCivil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>


        <link href="../fonts/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

        <link href="../css/animate.min.css" rel="stylesheet" type="text/css"/>
        <!-- Custom styling plus plugins -->

        <link href="../css/custom.css" rel="stylesheet" type="text/css"/>

        <link href="../css/icheck/flat/green.css" rel="stylesheet" type="text/css"/>


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
    %>
    <body>
        <style>
            .daterangepicker{z-index:1151 !important;}
        </style>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel">Nuevo  Egresado  </h4>

        </div>

        <div class="modal-body">     
            <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data">
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" id="idEgresado1" name="idEgresado" class="form-control" readonly="readonly"  value="Autogenerado">
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
                                                                        <div class="col-md-3 col-sm-6 col-xs-6">
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
            <div class="modal-footer">
                
                <button type="button" id="btnguardar"  class="btn btn-success">Guardar</button>

            </div>


        </div>


               
    
        
        
        <script type="text/javascript">
            $(document).ready(function () {
                 /*------------------------------*/
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

            });

            $('#send').click(function () {
                var formdata = new FormData($("#crearform")[0]);
                $.ajax({
                    url: "FacultadController?accion=crearFacultad",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .always(function () {
                            actualizar();
                            ocultarmodal();
                            alerta("Facultad creada", true);
                        });
            });
        </script>
    </body>
</html>
