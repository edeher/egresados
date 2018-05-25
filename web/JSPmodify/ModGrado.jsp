<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.dao.interfaces.FacultadDAO"%>
<%@page import="com.egresados2016.dao.factory.FacultadDAOFactory"%>
<%@page import="com.egresados2016.modelo.Facultad"%>
<%@page import="com.egresados2016.dao.interfaces.GradoEgresadoDAO"%>
<%@page import="com.egresados2016.dao.factory.GradoEgresadoDAOFactory"%>
<%@page import="com.egresados2016.modelo.GradoEgresado"%>
<%@page import="com.egresados2016.modelo.Grados"%>
<%@page import="com.egresados2016.dao.interfaces.GradosDAO"%>
<%@page import="com.egresados2016.dao.factory.GradosDAOFactory"%>

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

        GradoEgresado gradoegresado = new GradoEgresado();
        gradoegresado.setIdGradoEgresado(Integer.parseInt(request.getParameter("codigo")));
        gradoegresado.getEgresado().setIdEgresado(Integer.parseInt(request.getParameter("idEgresado")));
        
       
        GradoEgresadoDAOFactory fabricate = new GradoEgresadoDAOFactory();
        GradoEgresadoDAO daote = fabricate.metodoDAO();
        GradoEgresado graegre = daote.leerxidXids(gradoegresado);
         System.out.println(" "+graegre.toString());
        
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
            <h4 class="modal-title" id="myModalLabel">MODIFICAR GRADO  </h4>

        </div>

        <div class="modal-body">     
            <form class="form-horizontal form-label-left " id="crearform7" enctype="multipart/form-data">


                <div class="form-group">

                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" name="idEgresado7" id="idEgresado7" class="form-control" value="<%=graegre.getEgresado().getIdEgresado() %>" readonly="readonly" placeholder="Read-Only Input">
                    </div>
                </div>
                    <div class="form-group" >


                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" name="idGradoEgresado" id="idGradoEgresado" class="form-control" value="<%=graegre.getIdGradoEgresado() %>" readonly="readonly" >
                    </div>

                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">GradoAcademico</label>
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <select name="facultad" id="SelectFacultad7" class="form-control">
                           
                            <%for (Facultad facu1 : facu) {

                            %>
                            <option value="<%=facu1.getIdFacultad()%>"
                                    <%if (graegre.getGrados().getEscuela().getFacultad().getIdFacultad() == facu1.getIdFacultad()) {
                                                                                                out.print("selected");
                                                                                            }
                                                                                        %>
                                    >
                                <%=facu1.getDescripcion()%></option>
                                <%}%>
                        </select>
                    </div>
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <select  name="escuela" id="SelectEscuela7" class=" form-control">
                            <option value="<%=graegre.getGrados().getEscuela().getIdEscuela() %>"><%=graegre.getGrados().getEscuela().getDescripcion() %></option>
                        </select>
                    </div>
                    <div class="col-md-3 col-sm-6 col-xs-6">
                        <select name="grado" id="SelectGrado7" class=" form-control">
                            <option value="<%=graegre.getGrados().getIdGrados() %>"><%=graegre.getGrados().getDescripcion() %></option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Obtencion de Grado</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaGrado"  type="text" class="form-control has-feedback-left" id="input_fpublicacion7" value="<%=graegre.getFecha() %>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     



                    </div>
                </div>

            </form>
            <div class="modal-footer">

               <div class="form-group">
                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                        <button type="button" id="btnguardar7" class="btn btn-success">Modificar</button>
                    </div>
                </div>

            </div>


        </div>




      

        <script type="text/javascript">
            $(document).ready(function () {
                $('#idEgresado7').hide();
                /*------------------------------*/
                $('#input_fpublicacion7').daterangepicker({
                    format: 'YYYY-MM-DD',
                    singleDatePicker: true,
                    calender_style: "picker_4"

                },
                        function (start, end, label) {
                            console.log(start.toISOString(), end.toISOString(), label);
                        });
                     });
                     
                     
                       $('#SelectFacultad7').on('change', function () {
                        var codigo7 = this.value;

                        $.ajax({
                            type: 'POST',
                            url: '../EscuelaController?accion=obtenerporFacultad&codigo=' + codigo7,
                            data: $(this).serialize(),
                            success: function (data) {
                                $('#SelectEscuela7').html(data);
                            }
                        });
                    });

                    $('#SelectEscuela7').on('change', function () {
                        var codigo8 = this.value;

                        $.ajax({
                            type: 'POST',
                            url: '../GradosController?accion=obtenerporEscuela&codigo=' + codigo8,
                            data: $(this).serialize(),
                            success: function (data) {
                                $('#SelectGrado7').html(data);
                            }
                        });
                    });
                    
                     $('#btnguardar7').click(function () {
                var formdata = new FormData($("#crearform7")[0]);
                $.ajax({
                    url: "../GradoEgresadoController?accion=modificar",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .done(function (id) {

                            //      alert(json.id);
                            //       alert(json.nombre);

                            if (id == 0) {
                                alert('Grado no se puede modificar');

                                alerta("Grado no modificado", false);
                            } else
                            {
                               actualizartabla(table4);
                               ocultarmodal();
                                alerta("Grado modificado", true);
                                
                            }
                        })
            });
        </script>
    </body>
</html>
