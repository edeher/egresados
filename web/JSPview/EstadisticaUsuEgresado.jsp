<%-- 
Document   : index
    Created on : 04/10/2016, 12:02:04 PM
    Author     : Mi Laptop
--%>


<%@page import="com.egresados2016.modelo.Estadistica"%>
<%@page import="com.egresados2016.dao.interfaces.EstadisticaDAO"%>
<%@page import="com.egresados2016.dao.factory.EstadisticaDAOFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Estadisticas</title>

        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="../css/animate.min.css" rel="stylesheet">
        <link href="../css/custom.css" rel="stylesheet">
        <link href="../css/icheck/flat/green.css" rel="stylesheet">
        <script src="../js/jquery.min.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
                <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
                <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->

    </head>
    <%  
        EstadisticaDAOFactory fabricate= new EstadisticaDAOFactory();
        EstadisticaDAO daote= fabricate.metodoDAO();
        
        Estadistica  obj1=daote.nroegresados();
        Estadistica  obj2=daote.nrobachilleres();
        Estadistica  obj3=daote.nrotitulados();
        Estadistica  obj4=daote.nro_encuestados();
         Estadistica  obj5=daote.nro_no_encuestados();
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
                        <%@ include file="../JSPjspf/menuUsuaEgresado.jspf"%>

                        <!-- /menu footer buttons -->
            <!---            <%@ include file="../JSPjspf/herramientas.jspf"%>--->
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <%@ include file="../JSPjspf/cabeceraUsuEgresado.jspf"%>
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
                                <span class="count_top"><i class="fa fa-send"></i> Encuestados</span>

                                <div class="count green"><%=obj4.getValor()%></div>
                            </div>
                        </div>
                            <div class="animated flipInY col-md-2 col-sm-4 col-xs-4 tile_stats_count">
                            <div class="left"></div>
                            <div class="right">
                                <span class="count_top"><i class="fa fa-cloud-download"></i> Sin realizar Encuesta</span>

                                <a href="..\JSPfrom\egresadosnoEncuestados.jsp" ><div class="count red"><%=obj5.getValor()%></div></a>
                            </div>
                        </div>

                    </div>
                    <!-- /top tiles -->



                    <div class="">
                        <div class="page-title">
                            <div class="title_left">
                                <h3>
                                    Concentración  de datos Estadísticos 
                                    <small>

                                    </small>
                                </h3>
                            </div>


                        </div>
                        <div class="clearfix"></div>

                        <div class="row">
                            <div class="col-md-8 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Cantidad de Egresados por año</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="mainb" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>




                            <div class="col-md-4 col-sm-4 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Porcentaje de Egresados por año</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pie" style="height:300px;"></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-8 col-sm-8 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Bachiller por Escuela</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pie2" style="height:400px; "></div>

                                    </div>
                                </div>
                            </div>

                            <div class="col-md-4 col-sm-4 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Bachiller por Facultad</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_donut" style="height:400px;"></div>

                                    </div>
                                </div>
                            </div>


                            <div class="col-md-8 col-sm-8col-xs-12">
                                <div class="x_panel">
                                     <div class="x_title">
                                        <h2>Titulados por Escuela</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_pyramid" style="height:400px;"></div>

                                    </div>
                                </div>
                            </div>




                            <div class="col-md-4 col-sm-4 col-xs-12">
                                <div class="x_panel">
                                   <div class="x_title">
                                        <h2>Titulados por Facultad</h2>

                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <div id="echart_donut2" style="height:400px;"></div>

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
                        $.getJSON('../EstadisticaController?accion=nroegresados_x_anio', function (json) {
                            var categorias = [];
                            var valores = [];

                            var obje = [];
                            $.each(json.top, function (item, obj) {
                                obje.push(obj);
                                categorias.push(obj.category);
                                valores.push(obj.value);

                            });




                            var myChart9 = echarts.init(document.getElementById('mainb'), theme);
                            myChart9.setOption({
                                 title: {
                                    text: 'Cantidad de egresados por año',
                                    subtext: '',
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
                                        data: categorias
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
                                                {type: 'max', name: 'Mas egresados en este año'},
                                                {type: 'min', name: 'Menos egresados en este año'}]
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

/// fin de segundo grafico
//segundo grafico
                        $.getJSON('../EstadisticaController?accion=nroegresados_x_anio2', function (json) {

                            var data = [];
                            var titulos = [];
                            $.each(json.top, function (item, obj) {
                                data.push(obj);
                                titulos.push(obj.name);
                            });



                            var myChart = echarts.init(document.getElementById('echart_pie'), theme);
                            myChart.setOption({
                                title: {
                                    text: 'Porcentaje de \n egresados por año',
                                    subtext: '',
                                    x: 'LEFT'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a} {b}<br/>   ({d}%)"
                                },
                                legend:
                                        {
                                            orient: 'vertical',
                                            x: 'left',
                                            //x: 'center',
                                            y: 'bottom',
                                            data: titulos
                                        },
                                /* barras de herramientas*/
                                toolbox: {
                                    show: true,
                                    feature: {

                                        restore: {
                                            show: true
                                        },
                                        saveAsImage: {
                                            show: true
                                        }
                                    }
                                },
                                calculable: true,
                                series: [{
                                        name: 'Egresados',
                                        type: 'pie',
                                        radius: '90%',
                                        center: ['58%', '50%'], //left,top
                                        itemStyle: {
                                            normal: {
                                                label: {
                                                    position: 'inner',
                                                    formatter: function (params) {
                                                        return (params.percent - 0).toFixed(0) + '%'
                                                    }
                                                },
                                                labelLine: {
                                                    show: false
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    formatter: "{b}\n{d}%"
                                                }
                                            }

                                        },
                                        data: data
                                    }]

                            });

                        });
// fin del segunfo grafico
// 
// 
//tercer grafico


                        $.getJSON('../EstadisticaController?accion=bachillerxescuela', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '',
                                    x: 'center'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c}   {a}<br/> ({d}%)"
                                },
                                legend: {
                                    orient: 'vertical',
                                    x: 'left',
                                    //x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                toolbox: {
                                    show: true,
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: 'Bachiller',
                                        type: 'pie',
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
                                                    position: 'top',
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                }
                                            }
                                        },
                                        radius: [30, 140],
                                        center: ['50%', 160],
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        data: data
                                    }
                                ]
                            });
                        });


                        $.getJSON('../EstadisticaController?accion=bachillerxfacultad', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });

                            var myChart = echarts.init(document.getElementById('echart_donut'), theme);
                            myChart.setOption({
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a}<br/> ({d}%)"
                                },
                                calculable: true,
                                legend: {
                                    orient: 'vertical',
                                    x: 'left',
                                    //x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                /* barras de herramientas*/
                                toolbox: {
                                    show: true,
                                    feature: {
                                        restore: {
                                            show: true
                                        },
                                        saveAsImage: {
                                            show: true
                                        }
                                    }
                                },
                                series: [{
                                        name: 'Bachiller',
                                        type: 'pie',
                                        radius: ['35%', '55%'],
                                        center: ['50%', '40%'],
                                        itemStyle: {
                                            normal: {
                                                 label: {
                                                    show: true,
                                                    position: 'top',
                                                    formatter: '{c} {a}\n({d}%)'
                                                },
                                                labelLine: {
                                                    show: true
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '14',
                                                        fontWeight: 'normal'
                                                    }
                                                }
                                            }
                                        },
                                        data: data
                                    }]
                            });
                        });

                        $.getJSON('../EstadisticaController?accion=tituladosxescuela', function (json) {
                            var data = [];
                            var titulos = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);

                            });



                            var myChart = echarts.init(document.getElementById('echart_pyramid'), theme);
                            myChart.setOption({
                                title: {
                                    text: '',
                                    subtext: '',
                                    x: 'center'
                                },
                                tooltip: {
                                    trigger: 'item',
                                    formatter: "{c}   {a}<br/> ({d}%)"
                                },
                                legend: {
                                    orient: 'vertical',
                                    x: 'left',
                                    //x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                toolbox: {
                                    show: true,
                                    feature: {

                                        restore: {show: true},
                                        saveAsImage: {show: true}
                                    }
                                },
                                calculable: true,
                                series: [

                                    {
                                        name: 'Titulados',
                                        type: 'pie',
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
                                                    position: 'top',
                                                    formatter: '{b}\n{c} {a}\n ({d}%)'
                                                }
                                            }
                                        },
                                        radius: [30, 140],
                                        center: ['50%', 160],
                                        roseType: 'area',
                                        x: '50%', // for funnel
                                        max: 40, // for funnel
                                        sort: 'ascending', // for funnel
                                        data: data
                                    }
                                ]
                            });

                        });
                        $.getJSON('../EstadisticaController?accion=tituladosxfacultad', function (json) {
                            var valores = [];
                            var titulos = [];
                            var data = [];
                            $.each(json.top, function (item, obj) {

                                data.push(obj);
                                titulos.push(obj.name);
                                valores.push(obj.value);

                            });


                            var myChart = echarts.init(document.getElementById('echart_donut2'), theme);
                            myChart.setOption({
                                  tooltip: {
                                    trigger: 'item',
                                    formatter: "{c} {a}<br/> ({d}%)"
                                },
                                calculable: true,
                                legend: {
                                    orient: 'vertical',
                                    x: 'left',
                                    //x: 'center',
                                    y: 'bottom',
                                    data: titulos
                                },
                                /* barras de herramientas*/
                                toolbox: {
                                    show: true,
                                    feature: {
                                        restore: {
                                            show: true
                                        },
                                        saveAsImage: {
                                            show: true
                                        }
                                    }
                                },
                                series: [{
                                        name: 'Titulados',
                                        type: 'pie',
                                        radius: ['35%', '55%'],
                                        center: ['50%', '40%'],
                                        itemStyle: {
                                            normal: {
                                                 label: {
                                                    show: true,
                                                    position: 'top',
                                                    formatter: '{c} {a}\n({d}%)'
                                                },
                                                labelLine: {
                                                    show: true
                                                }
                                            },
                                            emphasis: {
                                                label: {
                                                    show: true,
                                                    position: 'center',
                                                    textStyle: {
                                                        fontSize: '14',
                                                        fontWeight: 'normal'
                                                    }
                                                }
                                            }
                                        },
                                        data: data
                                    }]
                            });

                        });





                        //fin del ready
                    })
                </script>

                </body>
                </html>
