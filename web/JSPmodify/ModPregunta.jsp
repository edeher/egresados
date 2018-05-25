<%-- 
    Document   : NewPublicacion
    Created on : 01/06/2016, 09:26:30 AM
    Author     : Mi Laptop
--%>

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
        Pregunta objPre = new Pregunta();
        objPre.setIdPregunta(Integer.parseInt(request.getParameter("codigo")));

        PreguntaDAOFactory fabricate = new PreguntaDAOFactory();
        PreguntaDAO daote = fabricate.metodoDAO();
        Pregunta pregu = daote.leerxid(objPre);
 EncuestaDAOFactory fabricate1 = new EncuestaDAOFactory();
        EncuestaDAO daote1 = fabricate1.metodoDAO();
        Encuesta[] encu = daote1.leertodo();
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
                        <input type="text" name="idPregunta" id="idPregunta" class="form-control" value="<%=pregu.getIdPregunta() %>" readonly="readonly" >
                    </div>

                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Encuesta</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="idEncuesta" id="idEncuesta" class="form-control">
                            <option value="--">--</option>
                            <%for (Encuesta encu1 : encu) {

                            %>
                            <option value="<%=encu1.getIdEncuesta()%>"
                                    <%if (pregu.getEncuesta().getIdEncuesta() == encu1.getIdEncuesta()) {
                                                                                                out.print("selected");
                                                                                            }
                                                                                        %>
                                    >
                                <%=encu1.getDescripcion()%></option>
                                <%}%>

                        </select>
                    </div>


                </div>


                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo Pregunta</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="tipopregunta" id="tipopregunta" class="select2_single form-control" tabindex="-1">
                            <option value="--">--</option>
                            <%for (TipoPreguntas es : TipoPreguntas.values()) {

                            %>
                            <option value="<%=es.name()%>" 
                                    
                                      <%if (pregu.getTipopregunta().name() == es.name()) {
                                                                                                out.print("selected");
                                                                                            }
                                    %>
                                    >
                                <%=es.getNom()%></option>
                                <%}%>
                        </select>
                    </div>


                </div>

                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Decripcion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="descripcion" id="descripcion" type="text" class="form-control" value="<%=pregu.getDescripcion() %>">
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
                $('#idPregunta').hide();
                /*------------------------------*/
               
                /*---------------nac--------------*/



            });
            $('#btnguardar2').click(function () {
                var formdata = new FormData($("#crearform2")[0]);
                $.ajax({
                    url: "../PreguntaController?accion=modificar",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .done(function (id) {

                            //      alert(json.id);
                            //       alert(json.nombre);

                            if (id == 0) {
                                alert('pregunta no se puede modificar');

                                alerta("pregunta no modificada", false);
                            } else
                            {
                                actualizartabla(table);
                                ocultarmodal();
                                alerta("pregunta modificada", true);

                            }
                        })
            });

        </script>
    </body>
</html>
