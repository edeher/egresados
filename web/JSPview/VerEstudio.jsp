<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.modelo.Estudios"%>
<%@page import="com.egresados2016.dao.interfaces.EstudiosDAO"%>
<%@page import="com.egresados2016.dao.factory.EstudiosDAOFactory"%>

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
        
        Estudios estu=new Estudios();
        estu.setIdEstudios(Integer.parseInt(request.getParameter("codigo")));
        
        EstudiosDAOFactory fabricate = new EstudiosDAOFactory();
        EstudiosDAO daote = fabricate.metodoDAO();
        Estudios estudios = daote.leerxid(estu);

    %>
    <body>
        <style>
            .daterangepicker{z-index:1151 !important;}
        </style>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel"> ESTUDIOS </h4>

        </div>

        <div class="modal-body">     
            <form class="form-horizontal form-label-left" id="crearform" enctype="multipart/form-data">
                <div class="form-group">
                    <!--<label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo </label>-->
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="hidden" id="idEgresado1" name="idEgresado" class="form-control" readonly="readonly"  value="Autogenerado">
                    </div>
                </div>

                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Mencion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="nombres" type="text" class="form-control" readonly="readonly" value="<%=estudios.getMencion() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Intitucion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="apellidos" type="text" class="form-control" readonly="readonly" value="<%=estudios.getInstitucion() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Inicio</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" readonly="readonly" value="<%=estudios.getFechaInicio() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>
                    <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Finalizacion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" readonly="readonly" value="<%=estudios.getFechaFin() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>
                
                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Duracion  </label>
                    <div class="col-md-3 col-sm-3 col-xs-6">
                         <input name="telefono1" type="text" class="form-control" readonly="readonly" value="<%=estudios.getCantidad() %>">
                        
                    </div>
                     <div class="col-md-3 col-sm-3 col-xs-6">
                        
                        <input name="direccion" type="text" class="form-control" readonly="readonly" value="<%=estudios.getDuraAcademica() %>">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Pais</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name=telefono2 type="text" class="form-control" readonly="readonly" value="<%=estudios.getPais() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Financiamiento</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="email" type="email" class="form-control" readonly="readonly" value="<%=estudios.getFinanciamiento() %>">
                    </div>
                </div>
                
                
                
                
            </form>
            <div class="modal-footer">
                
                 <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>

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
