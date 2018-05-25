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
        <!-- dataTables -->
        <link href="../js/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
        <link href="../js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../js/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../js/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../js/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- dataTables -->

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

    <body class="nav-sm">

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
                        <%@ include file="../JSPjspf/menuUsu.jspf"%>

                        <!-- /menu footer buttons -->
            <!---            <%@ include file="../JSPjspf/herramientas.jspf"%>--->
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <%@ include file="../JSPjspf/cabeceraUsu.jspf"%>
                <!-- /top navigation -->


                <!-- page content -->

                <div class="right_col" role="main">

                    <div class="row_selected">



                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2><i class=""></i> Egresados </h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div id="div-alerta" style="padding: 1px;display:none " class=" alert alert-success pull-right"  >

                                    </div>
                                    <div class="x_content">

                                        <div class="col-md-6 col-xs-12">
                                            <div class="x_panel">

                                                <div class="x_content">
                                                    <div class="x_title">
                                                        <h2>Datos Personales</h2>

                                                        <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                                        </table>

                                                    </div>

                                                </div> 

                                            </div>

                                        </div>           

                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- footer content -->

                     <%@include file="../JSPjspf/footer.jspf" %>
                    <!-- /footer content -->

                    <!-- /page content -->

                </div>
                <div id="miModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">



                        </div>
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
            <script src="../js/jquery.min.js" type="text/javascript"></script>
            <script src="../js/bootstrap.min.js" type="text/javascript"></script>
            <!--------------------calendario----------->
            <!-- bootstrap progress js -->
            <script src="../js/progressbar/bootstrap-progressbar.min.js"></script>
            <script src="../js/nicescroll/jquery.nicescroll.min.js"></script>
            <!-- daterangepicker -->
            <script src="../js/moment/moment.min.js" type="text/javascript"></script>
            <script src="../js/datepicker/daterangepicker.js" type="text/javascript"></script>
            <!------------------------------------------------------>
            <!-- icheck efecto del radio button -->
            <script src="../js/custom.js"></script>
            <script src="../js/icheck/icheck.min.js"></script>
            <!-- Datatables-->
            <script src="../js/datatables/jquery.dataTables.min.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.buttons.min.js" type="text/javascript"></script>
            <link href="../js/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css"/>
            <script src="../js/datatables/jszip.min.js" type="text/javascript"></script>
            <script src="../js/datatables/pdfmake.min.js" type="text/javascript"></script>
            <script src="../js/datatables/vfs_fonts.js" type="text/javascript"></script>
            <script src="../js/datatables/buttons.html5.min.js" type="text/javascript"></script>
            <script src="../js/datatables/buttons.print.min.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.fixedHeader.min.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.keyTable.min.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.responsive.min.js" type="text/javascript"></script>
            <script src="../js/datatables/responsive.bootstrap.min.js" type="text/javascript"></script>
            <script src="../js/datatables/dataTables.scroller.min.js" type="text/javascript"></script>

            <script type="text/javascript">

                $(document).ready(function () {
                    var table, band, msj;
                    table = $('#datatable-responsive').DataTable({

                        "language": {
                            "url": "../css/datatables/Spanish.json"
                        },
                        "columns": [{"title": "Cod"},
                            {"title": "DNI"},
                            {"title": "Nombres/Apellidos"},
                            {"title": "Edad"},
                            {"title": "Correo"},
                            {"title": "Telefono"},
                            {"title": "<a id='btnNuevo' href='#' ><i class='fa fa-plus ' data-toggle='tooltip' data-placement='top' title='NUEVO'></i></a>"}],
                        "columnDefs": [
                            {"targets": [6],
                                "orderable": false,
                                "className": 'text-center'},
                            {"targets": -1,
                                "data": null,

                                "defaultContent": '<button name="btnVer" data-toggle="tooltip" data-placement="left" title="VER EGRESADO"><a><i class="fa fa-search"></i></a></button>'}
                        ],

                        "ajax": "../EgresadoController?accion=obtenertodos",
                        "initComplete": function () {
                            $('[data-toggle="tooltip"]').tooltip({
                                trigger: 'hover',
                                html: true
                            });


                        }


                    });
                    table.on('order.dt search.dt', function () {
                        table.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                            cell.innerHTML = i + 1;
                        });
                    }).draw();

                    $('#datatable-responsive tbody').on('click', 'button', function () {
                        var nombre = $(this).attr('name');
                        var data = table.row($(this).parents('tr')).data();

                        if (nombre == 'btnVer') {

                            //window.location.href='VerPublicacion.jsp?idPublicacion='+data[0];
                            window.location.href = '../JSPview/VerEgresadoUsu.jsp?idEgresado=' + data[0];
                        }

                    });
                    $('#datatable-responsive thead').on('click', 'a', function () {
                        var nombre = $(this).attr('id');
                        if (nombre == 'btnNuevo')
                            $('.modal-lg').css('width', '600px');
                        mostrarModal('../JSPnew/NuevoEgresado.jsp');
                    });



                });
                /*funcion independiete que MUESTRA EL MODAL*/
                function mostrarModal(url) {
                    $('#miModal .modal-content').load(url, function () {
                        $('#miModal').modal('show');
                    });
                }
                 function ocultarmodal() {
                $('#miModal').modal('hide');
            }


                $('#btnguardar').click(function () {
                    var formdata = new FormData($("#crearform")[0]);
                    $.ajax({
                        url: "../EgresadoController?accion=crearEgresado",
                        type: "post",
                        contentType: false,
                        data: formdata,
                        processData: false,
                        cache: false})
                            .done(function (id) {

                                if (id == 0) {
                                    alert('Egresado ya  existe');

                                    alerta("Egresado no creado", false);
                                } else
                                {
                                    alert('creado con exito');
                                    $('#idEgresado').val(id);
                                    $('#idEgresado1').val(id);
                                    $('#btnmodificar').show();
                                    $('#btnguardar').hide();

                                    $('#profile-tab').attr('data-toggle', 'tab');
                                    $('#profile-tab').tab('show');
                                    $('#profile-tab2').attr('data-toggle', 'tab');

                                    alerta("Egresado creado", true);
                                }
                            })



                });
                $('#btnmodificar').click(function () {
                    var formdata = new FormData($("#crearform")[0]);
                    $.ajax({
                        url: "../EgresadoController?accion=modificarEgresado",
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

            </script>

    </body>
</html>
