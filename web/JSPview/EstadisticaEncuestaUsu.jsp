<%-- 
    Document   : index
    Created on : 04/10/2016, 12:02:04 PM
    Author     : Mi Laptop
--%>

<%@page import="com.egresados2016.modelo.Estadistica"%>
<%@page import="com.egresados2016.dao.interfaces.EstadisticaDAO"%>
<%@page import="com.egresados2016.dao.factory.EstadisticaDAOFactory"%>
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Encuenta Egresados UNIA </title>

        <!-- Bootstrap core CSS -->

        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="../css/animate.min.css" rel="stylesheet">
        <link href="../css/custom.css" rel="stylesheet">
        <link href="../css/icheck/flat/green.css" rel="stylesheet">



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

        EstadisticaDAOFactory fabricate = new EstadisticaDAOFactory();
        EstadisticaDAO daote = fabricate.metodoDAO();

        Estadistica obj1 = daote.nroegresados();
        Estadistica obj2 = daote.nrobachilleres();
        Estadistica obj3 = daote.nrotitulados();
        Estadistica obj4 =daote.nro_encuestados();
Estadistica obj5 =daote.nro_no_encuestados();

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

                    <!-- top tiles -->
                    <div class="row tile_count">
                        <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-user"></i> Total Egresados</span>

                                <div class="count"><%=obj1.getValor()%></div>
                            </div>
                        </div>

                        <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-paypal"></i> Total Bachilleres</span>

                                <div class="count green"><%=obj2.getValor()%></div>
                            </div>
                        </div>
                        <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-send"></i> Total Titulados</span>

                                <div class="count"><%=obj3.getValor()%></div>
                            </div>
                        </div>
                        <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-book"></i>Facultades </span>

                                <div class="count green">2</div>
                            </div>
                        </div>
                        <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-cloud-download"></i> Escuelas Profesionales</span>

                                <div class="count">4</div>
                            </div>
                        </div>
                        <!--  <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                          <div class="left"></div>
                          <div class="right">
                              <span class="count_top"><i class="fa fa-book"></i> Encuestados</span>

                              <div class="count green"><%=obj4.getValor()%></div>
                          </div>
                      </div>
                           <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                          <div class="left"></div>
                          <div class="right">
                              <span class="count_top"><i class="fa fa-cloud-download"></i> sin realizar Encuesta</span>

                              <div class="count"><%=obj5.getValor()%></div>
                          </div>
                      </div>-->

                    </div>
                    <!-- /top tiles -->



                    <div class="">
                        <div class="page-title">
                            <div class="title_left">
                                <h3>
                                    Evaluación de encuesta con datos Academicos
                                    <small>

                                    </small>
                                </h3>
                            </div>


                        </div>
                        <div class="clearfix"></div>

                        <div class="row">


                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>1.-¿Usted se beneficio por alguna beca otorgada </h2>
                                        <h2>por organizaciones diferentes a la UNIA?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid1" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>6.-¿Ha recibido reconocimiento profesional?</h2>
                                        <br>
                                        <br>
                                        <br>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid6" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>7.-¿Recomendaria a otras personas estudiar la misma </h2>
                                        <h2>  carrera profesional que usted?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid7" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>2.-¿Hubo demora en obtener su grado de bachiller </h2>


                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid2" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-8 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>2.-¿Si su respuesta fue afirmativa mencione las cusas de la </h2>
                                        <h2>demora en la obtencion de su grado de Bachiller?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb2" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>3.-¿Hubo demora en obtener su Titulo Profesional</h2>


                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid3" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-8 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>3.-¿Si su respuesta fue afirmativa mencione las cusas de la </h2>
                                        <h2>demora en la obtencion de su Titulo Profesional?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb3" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>


                            <div class="col-md-4 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>4.-si su respuesta fue "NO" señale los motivos</h2>


                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb4a" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>4.-¿Usted esta conforme con la formacion que le brindo la universidad? </h2>


                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid4" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>4.-si su respuesta fue "SI" señale los motivos </h2>


                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb4b" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-4 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>5.-si su respuesta fue "NO" señale los motivos </h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <div id="mainb5a" style="height:300px; "></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>5.-¿Cree que esta mejor preparado con respecto a </h2>
                                            <h2>egresados de otras universidades?</h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <div id="echart_pyramid5" style="height:300px;"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-10 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>5.-si su respuesta fue "SI" señale los motivos </h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb5b" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>8.-¿Que sugiere para mejorar la fomación profesional de </h2>
                                            <h2>la carrera profesional que usted estudios?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb8" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>9.-En su tiempo de estudio en la UNIA,¿Como calificaria la formacion academica que recibio?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb9" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>10.-En su tiempo de estudio en la UNIA,¿Como calificaria la calidad de la plana docente?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb10" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>11.-En su tiempo de estudio en la UNIA,¿Como calificaria la estructura curricular?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb11" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>12.-En su tiempo de estudio en la UNIA,¿Como calificaria el nivel de exigencia academica?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb12" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>13.-En su tiempo de estudio en la UNIA,¿Como calificaria la metodologia de enzeñanza?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb13" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>14.-En su tiempo de estudio en la UNIA,¿Como calificaria la innovacion tecnologica?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb14" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>15.-En su tiempo de estudio en la UNIA,¿Como calificaria la infraestructura y ambientes?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb15" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>16.-En su tiempo de estudio en la UNIA,¿Como calificaria el servicio de biblioteca?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb16" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>17.-En su tiempo de estudio en la UNIA,¿Como calificaria los servicios (comedor, vivienda, etc)?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb17" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>



                            <!-------aca estaba el map-------->


                            <!-------aca estaba el map-------->

                        </div>
                    </div>



                </div>
                <!-- footer content -->

                <%@include file="../JSPjspf/footer.jspf" %>
                <!-- /footer content -->

                <!-- /page content -->


                <div id="miModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">



                        </div>
                    </div>
                </div>


                <div id="custom_notifications" class="custom-notifications dsp_none">
                    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
                    </ul>
                    <div class="clearfix"></div>
                    <div id="notif-group" class="tabbed_notifications"></div>
                </div>
                <script src="../js/jquery.min.js"></script>
                <script src="../js/bootstrap.min.js"></script>
                <script src="../js/progressbar/bootstrap-progressbar.min.js"></script>
                <script src="../js/nicescroll/jquery.nicescroll.min.js"></script>
                <script src="../js/icheck/icheck.min.js"></script>
                <script src="../js/custom.js"></script>


                <!-- echart -->
                <script src="../js/echart/echarts-all.js"></script>
                <script src="../js/echart/green.js"></script>


                <script>
                    $(document).ready(function () {
                        //primer grafico


/// fin de segundo grafico
// ---------------------------graficos para pregunta 1,6 y 7 dona--------------------////////////////////

                        $.getJSON('../EstadisticaController?accion=pregunta_1', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);


                            });

                            var myChart = echarts.init(document.getElementById('echart_pyramid1'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '¿Usted se benefició por alguna beca otrogada por diferentes organizaciones a la UNIA',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#da70d6', '#6495ed', '#333366', '#33CC99',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data
                                    }
                                ]
                            });

                        });
                        $.getJSON('../EstadisticaController?accion=pregunta_6', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });

                            var myChart = echarts.init(document.getElementById('echart_pyramid6'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: 'Si nunca trabajo en su especialidad ¿Por qué?',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#da70d6', '#CCCCFF', '#6495ed', '#3cb371', '#33CC99',
                                                        '#30e0e0', '#40e0d0'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data
                                    }
                                ]
                            });

                        });
                        $.getJSON('../EstadisticaController?accion=pregunta_7', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });

                            var myChart = echarts.init(document.getElementById('echart_pyramid7'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: 'Si nunca trabajo en su especialidad ¿Por qué?',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#33CC99', '#da70d6', '#6495ed',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data
                                    }
                                ]
                            });

                        });
// 
// -----------------------------------------2 ------------------------//
                        $.getJSON('../EstadisticaController?accion=pregunta_2', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            var data1 = [];
                            var valores1 = [];
                            var titulos1 = [];

                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);


                            });
                            for (i = 0; i < 2; i++) {

                                valores1.push(valores[i]);
                                titulos1.push(titulos[i]);
                                data1.push(data[i]);

                            }
                            var myChart = echarts.init(document.getElementById('echart_pyramid2'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '¿Usted se benefició por alguna beca otrogada por diferentes organizaciones a la UNIA',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos1
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#da70d6', '#6495ed', '#333366', '#33CC99',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data1
                                    }
                                ]
                            });

                        });
                        $.getJSON('../EstadisticaController?accion=pregunta_2', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data2 = [];
                            var valores2 = [];
                            var titulos2 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 2; j < 6; j++) {

                                valores2.push(valores[j]);
                                titulos2.push(titulos[j]);
                                data2.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb2'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'SI',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data2
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos2
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#da70d6',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data2,

                                    }
                                ]

                            });


                        });
// 
// -----------------------------------------3 ------------------------//
                        $.getJSON('../EstadisticaController?accion=pregunta_3', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            var data1 = [];
                            var valores1 = [];
                            var titulos1 = [];

                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);


                            });
                            for (i = 0; i < 2; i++) {

                                valores1.push(valores[i]);
                                titulos1.push(titulos[i]);
                                data1.push(data[i]);

                            }
                            var myChart = echarts.init(document.getElementById('echart_pyramid3'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '¿Usted se benefició por alguna beca otrogada por diferentes organizaciones a la UNIA',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos1
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#da70d6', '#6495ed', '#333366', '#33CC99',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data1
                                    }
                                ]
                            });

                        });
                        $.getJSON('../EstadisticaController?accion=pregunta_3', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data2 = [];
                            var valores2 = [];
                            var titulos2 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 2; j < 6; j++) {

                                valores2.push(valores[j]);
                                titulos2.push(titulos[j]);
                                data2.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb3'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'SI',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data2
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos2
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#da70d6',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data2,

                                    }
                                ]

                            });


                        });
// 
// 
// -----------------------------------------4 ------------------------//
                        $.getJSON('../EstadisticaController?accion=pregunta_4', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            var data1 = [];
                            var valores1 = [];
                            var titulos1 = [];

                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);


                            });
                            for (i = 0; i < 2; i++) {

                                valores1.push(valores[i]);
                                titulos1.push(titulos[i]);
                                data1.push(data[i]);

                            }

                            var myChart = echarts.init(document.getElementById('echart_pyramid4'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '¿Usted se benefició por alguna beca otrogada por diferentes organizaciones a la UNIA',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos1
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#6495ed', '#da70d6'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data1
                                    }
                                ]
                            });

                        });

                        $.getJSON('../EstadisticaController?accion=pregunta_4', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data2 = [];
                            var valores2 = [];
                            var titulos2 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 2; j < 7; j++) {

                                valores2.push(valores[j]);
                                titulos2.push(titulos[j]);
                                data2.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb4b'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'NO',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data2
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos2
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#6495ed',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data2,

                                    }
                                ]

                            });


                        });
                        $.getJSON('../EstadisticaController?accion=pregunta_4', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data3 = [];
                            var valores3 = [];
                            var titulos3 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 7; j < 13; j++) {

                                valores3.push(valores[j]);
                                titulos3.push(titulos[j]);
                                data3.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb4a'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'SI',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data3
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos3
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#da70d6',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data3,

                                    }
                                ]

                            });


                        });

                        ///---------------------------------------5---------------------------------------------                     
$.getJSON('../EstadisticaController?accion=pregunta_5', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];
                            var data1 = [];
                            var valores1 = [];
                            var titulos1 = [];

                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);


                            });
                            for (i = 0; i < 2; i++) {

                                valores1.push(valores[i]);
                                titulos1.push(titulos[i]);
                                data1.push(data[i]);

                            }

                            var myChart = echarts.init(document.getElementById('echart_pyramid5'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '¿Usted se benefició por alguna beca otrogada por diferentes organizaciones a la UNIA',
                                    x: 'left'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} Egresados {a} <br/> ({b})"
                                },
                                legend: {
                                    x: 'center',
                                    y: 'bottom',
                                    data: titulos1
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: '-',
                                        type: 'pie',
                                        radius: [30, 90], //tamaño del grafio
                                        center: ['50%', 150], //ubicacion del grafico
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#6495ed', '#da70d6'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                },
                                                labelLine: {
                                                    show: true   ///lineas
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '30',
                                                        fontWeight: 'bold'
                                                    }
                                                }
                                            }
                                        },
                                        data: data1
                                    }
                                ]
                            });

                        });

$.getJSON('../EstadisticaController?accion=pregunta_5', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data2 = [];
                            var valores2 = [];
                            var titulos2 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 2; j < 7; j++) {

                                valores2.push(valores[j]);
                                titulos2.push(titulos[j]);
                                data2.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb5b'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'NO',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data2
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos2
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#6495ed',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data2,

                                    }
                                ]

                            });


                        });
 $.getJSON('../EstadisticaController?accion=pregunta_5', function (json) {
                            var data = [];
                            var valores = [];
                            var titulos = [];

                            var data3 = [];
                            var valores3 = [];
                            var titulos3 = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            for (j = 7; j < 12; j++) {

                                valores3.push(valores[j]);
                                titulos3.push(titulos[j]);
                                data3.push(data[j]);

                            }

                            var myChart = echarts.init(document.getElementById('mainb5a'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'SI',
                                    subtext: '¿?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: data3
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos3
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'

                                    }
                                ],
                                series: [
                                    {
                                        name: ' con ',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: '#da70d6',
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: data3,

                                    }
                                ]

                            });


                        });


//--------------------------------------------8---------------------------------------
  $.getJSON('../EstadisticaController?accion=pregunta_8', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb8'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
      
//------------------------------------------------9-----------------------------

                        $.getJSON('../EstadisticaController?accion=pregunta_9', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb9'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });

//------------------------------------------------10-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_10', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb10'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });

//------------------------------------------------11-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_11', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb11'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------12-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_12', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb12'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------13-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_13', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb13'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------14-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_14', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb14'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------15-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_15', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb15'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------16-----------------------------
$.getJSON('../EstadisticaController?accion=pregunta_16', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb16'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });
//------------------------------------------------17-----------------------------

$.getJSON('../EstadisticaController?accion=pregunta_17', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb17'), theme);
                            myChart.setOption({
                                title: {
                                    text: ' ',
                                    subtext: '¿Cuantos empleos han sido de su especialidad?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}"
                                },
                                legend: {
                                    data: ['Egresados']
                                },
                                toolbox: {
                                    show: true,
                                    orient: 'vertical',
                                    x: 'right',
                                    y: 'center',
                                    feature: {

                                        magicType: {show: true, type: ['line', 'bar']},
                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                xAxis: [
                                    {
                                        type: 'category',
                                        data: titulos
                                    }
                                ],
                                yAxis: [
                                    {
                                        type: 'value'
                                    }
                                ],
                                series: [
                                    {
                                        name: 'Egresados',
                                        type: 'bar',
                                        itemStyle: {
                                            normal: {
                                                color: function (params) {
                                                    // build a color map as your need.
                                                    var colorList = [
                                                        '#333366', '#3cb371', '#30e0e0', '#da70d6', '#40e0d0',
                                                        '#6495ed', '#CCCCFF', '#33CC99'
                                                    ];
                                                    return colorList[params.dataIndex]
                                                },
                                                label: {
                                                    show: true,
                                                    position: 'inside',
                                                    formatter: '\n{c}'
                                                }
                                            }
                                        },
                                        data: valores,
                                        markPoint: {
                                            data: [
                                                {type: 'max', name: ' '},
                                                {type: 'min', name: ' '}]
                                        },

                                        markLine: {
                                            itemStyle: {
                                                normal: {
                                                    lineStyle: {
                                                        type: 'dashed'
                                                    }
                                                }
                                            },
                                            data: [
                                                [{type: 'min'}, {type: 'max'}]
                                            ]
                                        }
                                    }
                                ]
                            });
                        });




                        //fin del ready
                    })
                </script>

                </body>
                </html>
