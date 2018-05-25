<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.enums.TipoContrato"%>
<%@page import="com.egresados2016.enums.TipoJornada"%>
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
        Trabajos trabajo = new Trabajos();
        trabajo.setIdTrabajos(Integer.parseInt(request.getParameter("codigo")));

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
            <form id="crearform6" class="form-horizontal form-label-left"  enctype="multipart/form-data">

                <div class="form-group" id="id2">

                    <div class="col-md-9 col-sm-9 col-xs-12" >
                        <input type="text" name="idEgresado6" id="idEgresado6" class="form-control" value="<%=traba.getEgresado().getIdEgresado() %>" readonly="readonly" placeholder="Read-Only Input">
                    </div>
                </div>
                    <div class="form-group" >


                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" name="idTrabajos" id="idTrabajos" class="form-control" value="<%=traba.getIdTrabajos() %>" readonly="readonly" >
                    </div>

                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Inicio</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaini" type="text" class="form-control has-feedback-left" id="input_fechaini6" value="<%=traba.getFechaInicio() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Fin</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechafin" type="text" class="form-control has-feedback-left" id="input_fechafin6" value="<%=traba.getFechaFin() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Puesto</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="puesto" type="text" id="puesto" class="form-control" value="<%=traba.getPuesto() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Entidad</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="entidad" type="text" id="entidad" class="form-control" value="<%=traba.getNomInstitucion() %>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Contrato</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="tipocontrato" id="tipocontrato" class="select2_single form-control" tabindex="-1">
                            <option value="--">--</option>
                            <%for (TipoContrato tip : TipoContrato.values()) {

                            %>
                            <option value="<%=tip.name()%>"  
                                    <%if (traba.getTipocontrato().name() == tip.name()) {
                                                                                                out.print("selected");
                                                                                            }
                                                                                        %>
                                    
                                    >

                                <%=tip.getNom()%></option>
                                <%}%>
                        </select>
                    </div>


                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Sueldo</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="sueldo" id="sueldo" class="select2_single form-control" tabindex="-1">


                            <option value="<%=traba.getSueldo() %>"><%=traba.getSueldo() %></option>
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
                        <select name="tipojornada" id="tipojornada" class="select2_single form-control" tabindex="-1">
                            <option value="--">--</option>
                            <%for (TipoJornada tipjor : TipoJornada.values()) {

                            %>
                            <option value="<%=tipjor.name()%>" 
                                    <%if (traba.getTipojornada().name()  == tipjor.name()) {
                                                                                                out.print("selected");
                                                                                            }
                                                                                        %>
                                    >

                                <%=tipjor.getNom()%></option>
                                <%}%>
                        </select>
                    </div>


                </div>   
            </form>
            <div class="modal-footer">

               <div class="form-group">
                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                        <button type="button" id="btnguardar6" class="btn btn-success">Modificar</button>
                    </div>
                </div>

            </div>


        </div>



        

        
        <script type="text/javascript">
            $(document).ready(function () {
                $('#idEgresado6').hide();
                /*------------------------------*/
                $('#input_fechaini6').daterangepicker({
                    format: 'YYYY-MM-DD',
                    singleDatePicker: true,
                    calender_style: "picker_4"

                },
                        function (start, end, label) {
                            console.log(start.toISOString(), end.toISOString(), label);
                        });
                        $('#input_fechafin6').daterangepicker({
                    format: 'YYYY-MM-DD',
                    singleDatePicker: true,
                    calender_style: "picker_4"

                },
                        function (start, end, label) {
                            console.log(start.toISOString(), end.toISOString(), label);
                        });
                /*---------------nac--------------*/
                


            });
 $('#btnguardar6').click(function () {
                var formdata = new FormData($("#crearform6")[0]);
                $.ajax({
                    url: "../TrabajosController?accion=modificar",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .done(function (id) {

                            //      alert(json.id);
                            //       alert(json.nombre);

                            if (id == 0) {
                                alert('trabajo no se puede modificar');

                                alerta("trabajo no modificado", false);
                            } else
                            {
                               actualizartabla(table3);
                               ocultarmodal();
                                alerta("trabajo modificado", true);
                                
                            }
                        })
            });
          
        </script>
    </body>
</html>
