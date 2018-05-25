<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.dao.interfaces.RespuestaDAO"%>
<%@page import="com.egresados2016.dao.factory.RespuestaDAOFactory"%>
<%@page import="com.egresados2016.modelo.Respuesta"%>
<%@page import="com.egresados2016.enums.Grupo"%>
<%@page import="com.egresados2016.dao.interfaces.EncuestaDAO"%>
<%@page import="com.egresados2016.dao.factory.EncuestaDAOFactory"%>
<%@page import="com.egresados2016.enums.TipoPreguntas"%>
<%@page import="com.egresados2016.modelo.Encuesta"%>
<%@page import="com.egresados2016.dao.interfaces.PreguntaDAO"%>
<%@page import="com.egresados2016.dao.factory.PreguntaDAOFactory"%>
<%@page import="com.egresados2016.modelo.Pregunta"%>
<%@page import="com.egresados2016.enums.TipoContrato"%>
<%@page import="com.egresados2016.enums.TipoJornada"%>


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
        Respuesta objPre = new Respuesta();
        objPre.setIdRespuesta(Integer.parseInt(request.getParameter("codigo")));

        RespuestaDAOFactory fabricate = new RespuestaDAOFactory();
        RespuestaDAO daote = fabricate.metodoDAO();
        Respuesta respu = daote.leerxid(objPre);

    %>
    <body>
        <style>
            .daterangepicker{z-index:1151 !important;}
        </style>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel">PREGUNTA </h4>

        </div>

        <div class="modal-body">     
            <form class="form-horizontal form-label-left " id="crearform2" enctype="multipart/form-data">
                    <div class="form-group" >


                    
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" name="idRespuesta" id="idRespuesta" class="form-control" value="<%=respu.getIdRespuesta() %>" readonly="readonly" >
                    </div>

                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Grupo de Preguntas</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="grupopregunta" id="grupopregunta" class="select2_single form-control" tabindex="-1">
                            <option value="--">--</option>
                            <%for (Grupo gr : Grupo.values()) {

                            %>
                            <option value="<%=gr.name()%>"  
                                    <% if(respu.getGrupo().name()==gr.name())
                                    {
                                        out.print("selected");
                                    }
                                    
                                    
                                    %>
                                    
                                    >
                                <%=gr.getNom()%></option>
                                <%}%>
                        </select>
                    </div>


                </div>



                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Decripcion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="descripcion" id="descripcion" type="text" class="form-control" value="<%=respu.getDescripcion()%>">
                    </div>
                </div>

            </form>
            <div class="modal-footer">

                <div class="form-group">
                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                        <button type="button" id="btnguardar2" class="btn btn-success">Modificar</button>
                    </div>
                </div>

            </div>


        </div>





        <script type="text/javascript">
            $(document).ready(function () {
                $('#idRespuesta').hide();
                /*------------------------------*/

            });
            $('#btnguardar2').click(function () {
                var formdata = new FormData($("#crearform2")[0]);
                $.ajax({
                    url: "../RespuestaController?accion=modificar",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .done(function (id) {

                            //      alert(json.id);
                            //       alert(json.nombre);

                            if (id == 0) {
                                alert('Respuesta no se puede modificar');

                                alerta("Respuesta no modificada", false);
                            } else
                            {
                                actualizartabla(table);
                                ocultarmodal();
                                alerta("Respuesta modificada", true);

                            }
                        })
            });

        </script>
    </body>
</html>
