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
                        <%@ include file="../JSPjspf/menuAdministrador.jspf"%>

                        <!-- /menu footer buttons -->
            <!---            <%@ include file="../JSPjspf/herramientas.jspf"%>--->
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <%@ include file="../JSPjspf/cabeceraAdministrador.jspf"%>
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
                                    Evaluación de encuesta con datos Laborales
                                    <small>

                                    </small>
                                </h3>
                            </div>


                        </div>
                        <div class="clearfix"></div>

                        <div class="row">
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>1.-¿Cuantos empleos han sido de su especialidad?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb18_1" style="height:300px; "></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                     <div class="x_title">
                                        <h2>2.-A partir de sus experiencia laboral ¿la formacion profesional que recibio es?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb19_2" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>



                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>3.-¿Actualmente su trabajo esta relacionado con la carrera profesional que estudio?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb20_3" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>4.-Con respecto a las Labores que viene realizando en su empleo actual ¿usted se siente?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb21_4" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>5.-Considera que su remuneracion como profesional</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb22_5" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>6.-Si unca trabajo en su carrera profesional ¿Por que?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb23_6" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>7.-¿Encontro trabajo en el año que egreso?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb24_7" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>8.-¿Encontro trabajo el año que obtubo su bachiller?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb25_8" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>9.-¿Encontro trabajo el año que obtubo su titulo?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb26_9" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>10.-al buscar su primer trabajo ¿que tiempo demoro?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb27_10" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>11.-el puesto que ocupo en su primer trabajo ¿fue?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb28_11" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>12.-Su desempeño en su primer trabajo ¿fue?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb29_12" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>13.-¿Que competencias o habilidades obtenidas han favorecido mas en su ejerecicio profesional?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb30_13" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>14.-En su opinio ¿que posibilidades laborales tiene el egresado d ela UNIA para desempeñarse en su especialidad?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb31_14" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>
                             <div class="col-md-6 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>15.-En su opnion ¿como califica su desempeño profesional en su trabajo?</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb32_15" style="height:400px; "></div>

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
                        
//--------------------------------------18_1------------------------------------------------------------                        
                        $.getJSON('../EstadisticaController?accion=pregunta_18_1', function (json) {
                            var titulos = [];
                            var valores = [];

                            var obje = [];
                            $.each(json.top, function (item, obj) {
                                obje.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });




                            var myChart9 = echarts.init(document.getElementById('mainb18_1'), theme);
                            myChart9.setOption({
                                 title: {
                                    text: ' ',
                                    subtext: '¿Actualmente su trabajo está relacionado con la carrera que ha estudiado?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a}- {b}"
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
                                                        '#da70d6', '#6495ed', '#333366', '#33CC99',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
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


// -------------------------------19_2-------------------------////////////////////

                        $.getJSON('../EstadisticaController?accion=pregunta_19_2', function (json) {
                            var data = [];
                            var valores=[];
                            var titulos = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });

                            var myChart = echarts.init(document.getElementById('mainb19_2'), theme);
                            myChart.setOption({
                                  title: {
                                    text: ' ',
                                    subtext: '¿Actualmente su trabajo está relacionado con la carrera que ha estudiado?',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a}- {b}"
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
                                                        '#da70d6', '#6495ed', '#333366', '#33CC99',
                                                        '#CCCCFF', '#3cb371', '#30e0e0', '#40e0d0'
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
// 
//-------------------------------------------------20_3-----------------------------------------------


                        $.getJSON('../EstadisticaController?accion=pregunta_20_3', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb20_3'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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

//-------------------------------------------21_4--------------------------------------  
           $.getJSON('../EstadisticaController?accion=pregunta_21_4', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb21_4'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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

//-------------------------------------------22_5--------------------------------------  
           $.getJSON('../EstadisticaController?accion=pregunta_22_5', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb22_5'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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

//-------------------------------------------23_6--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_23_6', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb23_6'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------24_7--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_24_7', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb24_7'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------25_8--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_25_8', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb25_8'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------26_9--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_26_9', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb26_9'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------27_10--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_27_10', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb27_10'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------28_11--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_28_11', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb28_11'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------29_12--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_29_12', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb29_12'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------30_13--------------------------------------   
$.getJSON('../EstadisticaController?accion=pregunta_30_13', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb30_13'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------31_14--------------------------------------  
$.getJSON('../EstadisticaController?accion=pregunta_31_14', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb31_14'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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
//-------------------------------------------32_15--------------------------------------   
 $.getJSON('../EstadisticaController?accion=pregunta_32_15', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('mainb32_15'), theme);
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
                                                        '#333366', '#3cb371', '#30e0e0','#da70d6', '#40e0d0',
                                                         '#6495ed','#CCCCFF',  '#33CC99'
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

//-----------------------------------fin-----------------------------------



                        //fin del ready
                    })
                </script>

                </body>
                </html>
