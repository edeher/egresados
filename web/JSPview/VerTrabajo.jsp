<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.dao.interfaces.TrabajosDAO"%>
<%@page import="com.egresados2016.dao.factory.TrabajosDAOFactory"%>
<%@page import="com.egresados2016.dao.factory.TrabajosDAOFactory"%>
<%@page import="com.egresados2016.modelo.Trabajos"%>

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
       Trabajos trabajo=new Trabajos();
        trabajo.setIdTrabajos (Integer.parseInt(request.getParameter("codigo")));
        
        TrabajosDAOFactory fabricate = new TrabajosDAOFactory();
        TrabajosDAO daote = fabricate.metodoDAO();
        Trabajos traba = daote.leerxid(trabajo);

    %>
    <body>
        <style>
            .daterangepicker{z-index:1151 !important;}
        </style>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel">TRABAJO  </h4>

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
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Inicio</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" readonly="readonly" value="<%=traba.getFechaInicio() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>
                    <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha de Finalizacion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaNa" type="text" class="form-control has-feedback-left" id="input_fpublicacion" readonly="readonly" value="<%=traba.getFechaFin() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Puesto</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="nombres" type="text" class="form-control" readonly="readonly" value="<%=traba.getPuesto() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Intitucion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="apellidos" type="text" class="form-control" readonly="readonly" value="<%=traba.getNomInstitucion() %>">
                    </div>
                </div>
                
                
                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Contrato </label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                         <input name="telefono1" type="text" class="form-control" readonly="readonly" value="<%=traba.getTipocontrato().getNom() %>">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">sueldo</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name=telefono2 type="text" class="form-control" readonly="readonly" value="<%=traba.getSueldo() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Jornada</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="email" type="email" class="form-control" readonly="readonly" value="<%=traba.getTipojornada().getNom() %>">
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
