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

        Estudios estu = new Estudios();
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
            <h4 class="modal-title" id="myModalLabel">MODIFICAR ESTUDIOS </h4>

        </div>

        <div class="modal-body">     
            <form id="crearform5" class="form-horizontal form-label-left"  enctype="multipart/form-data">

                <div class="form-group" id="id2">

                    <div class="col-md-9 col-sm-9 col-xs-12" >
                        <input type="text" name="idEgresado5" id="idEgresado5" class="form-control" value="<%=estudios.getEgresado().getIdEgresado()%>" >
                    </div>
                </div>
                <div class="form-group" >


                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Codigo</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input type="text" name="idEstudios" id="idEstudios" class="form-control" value="<%=estudios.getIdEstudios()%>" readonly="readonly" >
                    </div>

                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Mencion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="mencion" id="mencion" type="text" class="form-control" value="<%=estudios.getMencion()%>">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Institucion</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="institucion" id="institucion" type="text" class="form-control" value="<%=estudios.getInstitucion()%>">
                    </div>
                </div>            
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Inicio</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechaini"  type="text" class="form-control has-feedback-left" id="input_fechaini5" value="<%=estudios.getFechaInicio()%>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Fecha Fin</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input  name="fechafin"  type="text" class="form-control has-feedback-left" id="input_fechafin5" value="<%=estudios.getFechaFin()%>">
                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>     
                    </div>
                </div>


                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Duracion Academica</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="duracionacademica" id="duracionacademica" class="select2_single form-control" tabindex="-1">
                            <option value="<%=estudios.getEgresado().getIdEgresado()%>"><%=estudios.getDuraAcademica()%></option>
                        
                                                                                <option value="horas">horas</option>
                                                                                <option value="dias">dias</option>
                                                                                <option value="meses">meses</option>
                                                                                <option value="bimestre">bimestre</option>
                                                                                <option value="trimestre">trimestre</option>
                                                                                <option value="semestre">semestre</option>
                        </select>
                    </div>


                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Cantidad</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <input name="cantidad" id="cantidad" type="text" class="form-control" value="<%=estudios.getCantidad()%>">
                    </div>
                </div> 


                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Pais</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="pais" id="pais"class="select2_single form-control" tabindex="-1">
                            <option value="<%=estudios.getPais()%>"><%=estudios.getPais()%></option>
                           <option value="Afganistán">Afganistán</option>
                                                                                <option value="Albania">Albania</option>
                                                                                <option value=">Alemania">Alemania</option>
                                                                                <option value="Andorra">Andorra</option>
                                                                                <option value="Angola">Angola</option>
                                                                                <option value="Anguilla">Anguilla</option>
                                                                                <option value="Antártida">Antártida</option>
                                                                                <option value="Antigua y Barbuda">Antigua y Barbuda</option>
                                                                                <option value="Antillas Holandesas">Antillas Holandesas</option>
                                                                                <option value="Arabia Saudí">Arabia Saudí</option>
                                                                                <option value="Argelia">Argelia</option>
                                                                                <option value="Argentina">Argentina</option>
                                                                                <option value="Armenia">Armenia</option>
                                                                                <option value="Aruba">Aruba</option>
                                                                                <option value="Australia">Australia</option>
                                                                                <option value="Austria">Austria</option>
                                                                                <option value="Azerbaiyán">Azerbaiyán</option>
                                                                                <option value="Bahamas">Bahamas</option>
                                                                                <option value="Bahrein">Bahrein</option>
                                                                                <option value="Bangladesh">Bangladesh</option>
                                                                                <option value="Barbados">Barbados</option>
                                                                                <option value="Bélgica">Bélgica</option>
                                                                                <option value="Belice">Belice</option>
                                                                                <option value="Benin">Benin</option>
                                                                                <option value="Bermudas">Bermudas</option>
                                                                                <option value="Bielorrusia">Bielorrusia</option>
                                                                                <option value="Birmania">Birmania</option>
                                                                                <option value="Bolivia">Bolivia</option>
                                                                                <option value="Bosnia y Herzegovina">Bosnia y Herzegovina</option>
                                                                                <option value="Botswana">Botswana</option>
                                                                                <option value="Brasil">Brasil</option>
                                                                                <option value="Brunei">Brunei</option>
                                                                                <option value="Bulgaria">Bulgaria</option>
                                                                                <option value="Burkina Faso">Burkina Faso</option>
                                                                                <option value="Burundi">Burundi</option>
                                                                                <option value="Bután">Bután</option>
                                                                                <option value="Cabo Verde">Cabo Verde</option>
                                                                                <option value="Camboya">Camboya</option>
                                                                                <option value="Camerún">Camerún</option>
                                                                                <option value="Canadá">Canadá</option>
                                                                                <option value="Chad">Chad</option>
                                                                                <option value="Chile">Chile</option>
                                                                                <option value="China">China</option>
                                                                                <option value="Chipre">Chipre</option>
                                                                                <option value="Ciudad del Vaticano (Santa Sede)">Ciudad del Vaticano (Santa Sede)</option>
                                                                                <option value="Colombia">Colombia</option>
                                                                                <option value="Comores">Comores</option>
                                                                                <option value="Congo">Congo</option>
                                                                                <option value="Congo, República Democrática del">Congo, República Democrática del</option>
                                                                                <option value="Corea">Corea</option>
                                                                                <option value="Corea del Norte">Corea del Norte</option>
                                                                                <option value="Costa de Marfíl">Costa de Marfíl</option>
                                                                                <option value="Costa Rica">Costa Rica</option>
                                                                                <option value="Croacia (Hrvatska)">Croacia (Hrvatska)</option>
                                                                                <option value="Cuba">Cuba</option>
                                                                                <option value="DinamarcaDK">Dinamarca</option>
                                                                                <option value="Djibouti">Djibouti</option>
                                                                                <option value="Dominica">Dominica</option>
                                                                                <option value="Ecuador">Ecuador</option>
                                                                                <option value="Egipto">Egipto</option>
                                                                                <option value="El Salvador">El Salvador</option>
                                                                                <option value="Emiratos Árabes Unidos">Emiratos Árabes Unidos</option>
                                                                                <option value="Eritrea">Eritrea</option>
                                                                                <option value="Eslovenia">Eslovenia</option>
                                                                                <option value="España" >España</option>
                                                                                <option value="Estados Unidos">Estados Unidos</option>
                                                                                <option value="Estonia">Estonia</option>
                                                                                <option value="Etiopía">Etiopía</option>
                                                                                <option value="Fiji">Fiji</option>
                                                                                <option value="Filipinas">Filipinas</option>
                                                                                <option value="Finlandia">Finlandia</option>
                                                                                <option value="FR">Francia</option>
                                                                                <option value="Francia">Gabón</option>
                                                                                <option value="Gambia">Gambia</option>
                                                                                <option value="Georgia">Georgia</option>
                                                                                <option value="Ghana">Ghana</option>
                                                                                <option value="Gibraltar">Gibraltar</option>
                                                                                <option value="Granada">Granada</option>
                                                                                <option value="Grecia">Grecia</option>
                                                                                <option value="Groenlandia">Groenlandia</option>
                                                                                <option value="Guadalupe">Guadalupe</option>
                                                                                <option value="Guam">Guam</option>
                                                                                <option value="Guatemal">Guatemala</option>
                                                                                <option value="Guayana">Guayana</option>
                                                                                <option value="Guayana Francesa">Guayana Francesa</option>
                                                                                <option value="Guinea">Guinea</option>
                                                                                <option value="Guinea Ecuatorial">Guinea Ecuatorial</option>
                                                                                <option value="Guinea-Bissau">Guinea-Bissau</option>
                                                                                <option value="Haití">Haití</option>
                                                                                <option value="Honduras">Honduras</option>
                                                                                <option value="Hungría">Hungría</option>
                                                                                <option value="India">India</option>
                                                                                <option value="Indonesia">Indonesia</option>
                                                                                <option value="Irak">Irak</option>
                                                                                <option value="Irán">Irán</option>
                                                                                <option value="Irlanda">Irlanda</option>
                                                                                <option value="Isla Bouvet">Isla Bouvet</option>
                                                                                <option value="Isla de Christmas">Isla de Christmas</option>
                                                                                <option value="Islandia">Islandia</option>
                                                                                <option value="Islas Caimán">Islas Caimán</option>
                                                                                <option value="Islas Cook">Islas Cook</option>
                                                                                <option value="Islas de Cocos o Keeling">Islas de Cocos o Keeling</option>
                                                                                <option value="Islas Faroe">Islas Faroe</option>
                                                                                <option value="Islas Heard y McDonald">Islas Heard y McDonald</option>
                                                                                <option value="Islas Malvinas">Islas Malvinas</option>
                                                                                <option value="Islas Marianas del Nort">Islas Marianas del Norte</option>
                                                                                <option value="Islas Marshall">Islas Marshall</option>
                                                                                <option value="Islas menores de Estados Unidos">Islas menores de Estados Unidos</option>
                                                                                <option value="Islas Palau">Islas Palau</option>
                                                                                <option value="Islas Salomón">Islas Salomón</option>
                                                                                <option value="Islas Svalbard y Jan Mayen">Islas Svalbard y Jan Mayen</option>
                                                                                <option value="Islas Tokelau">Islas Tokelau</option>
                                                                                <option value="Islas Turks y Caicos">Islas Turks y Caicos</option>
                                                                                <option value="Islas Vírgenes (EEUU)">Islas Vírgenes (EEUU)</option>
                                                                                <option value="Islas Vírgenes (Reino Unido)">Islas Vírgenes (Reino Unido)</option>
                                                                                <option value="Islas Wallis y Futuna">Islas Wallis y Futuna</option>
                                                                                <option value="Israel">Israel</option>
                                                                                <option value="ItaliaT">Italia</option>
                                                                                <option value="Jamaica">Jamaica</option>
                                                                                <option value="Japón">Japón</option>
                                                                                <option value="Jordania">Jordania</option>
                                                                                <option value="Kazajistán">Kazajistán</option>
                                                                                <option value="Kenia">Kenia</option>
                                                                                <option value="Kirguizistán">Kirguizistán</option>
                                                                                <option value="Kiribati">Kiribati</option>
                                                                                <option value="Kuwait">Kuwait</option>
                                                                                <option value="Laos">Laos</option>
                                                                                <option value="Lesotho">Lesotho</option>
                                                                                <option value="Letonia">Letonia</option>
                                                                                <option value="Líbano">Líbano</option>
                                                                                <option value="Liberia">Liberia</option>
                                                                                <option value="Libia">Libia</option>
                                                                                <option value="Liechtenstein">Liechtenstein</option>
                                                                                <option value="Lituania">Lituania</option>
                                                                                <option value="Luxemburgo">Luxemburgo</option>
                                                                                <option value="Macedonia, Ex-República Yugoslava de">Macedonia, Ex-República Yugoslava de</option>
                                                                                <option value="Madagascar">Madagascar</option>
                                                                                <option value="Malasia">Malasia</option>
                                                                                <option value="Malawi">Malawi</option>
                                                                                <option value="Maldivas">Maldivas</option>
                                                                                <option value="Malí">Malí</option>
                                                                                <option value="Malta">Malta</option>
                                                                                <option value="Marruecos">Marruecos</option>
                                                                                <option value="Martinica">Martinica</option>
                                                                                <option value=Mauricio">Mauricio</option>
                                                                                <option value="Mauritania">Mauritania</option>
                                                                                <option value="Mayotte">Mayotte</option>
                                                                                <option value="México">México</option>
                                                                                <option value="Mongolia">Micronesia</option>
                                                                                <option value="Moldavia">Moldavia</option>
                                                                                <option value="Mónaco">Mónaco</option>
                                                                                <option value="Mongolia">Mongolia</option>
                                                                                <option value="Montserrat">Montserrat</option>
                                                                                <option value="Mozambique">Mozambique</option>
                                                                                <option value="Namibia">Namibia</option>
                                                                                <option value="Nauru">Nauru</option>
                                                                                <option value="Nepal">Nepal</option>
                                                                                <option value="Nicaragua">Nicaragua</option>
                                                                                <option value="Níger">Níger</option>
                                                                                <option value="Nigeria">Nigeria</option>
                                                                                <option value="Niue">Niue</option>
                                                                                <option value="Norfolk">Norfolk</option>
                                                                                <option value="Noruega">Noruega</option>
                                                                                <option value="Nueva Caledonia">Nueva Caledonia</option>
                                                                                <option value="Nueva Zelanda">Nueva Zelanda</option>
                                                                                <option value="Omán">Omán</option>
                                                                                <option value="Países Bajos">Países Bajos</option>
                                                                                <option value="Panamá">Panamá</option>
                                                                                <option value="Papúa Nueva Guinea">Papúa Nueva Guinea</option>
                                                                                <option value="Paquistán">Paquistán</option>
                                                                                <option value="Paraguay">Paraguay</option>
                                                                                <option value="Perú">Perú</option>
                                                                                <option value="Pitcairn">Pitcairn</option>
                                                                                <option value="Polinesia Francesa">Polinesia Francesa</option>
                                                                                <option value="Polonia">Polonia</option>
                                                                                <option value="Portugal">Portugal</option>
                                                                                <option value="Puerto Rico">Puerto Rico</option>
                                                                                <option value="Qatar">Qatar</option>
                                                                                <option value="Reino Unido">Reino Unido</option>
                                                                                <option value="República Centroafricana">República Centroafricana</option>
                                                                                <option value="República Checa">República Checa</option>
                                                                                <option value="República de Sudáfrica">República de Sudáfrica</option>
                                                                                <option value="República Dominicana">República Dominicana</option>
                                                                                <option value="República Eslovaca">República Eslovaca</option>
                                                                                <option value="Reunión">Reunión</option>
                                                                                <option value="Ruanda">Ruanda</option>
                                                                                <option value="Rumania">Rumania</option>
                                                                                <option value="Rusia">Rusia</option>
                                                                                <option value="Sahara Occidental">Sahara Occidental</option>
                                                                                <option value="Saint Kitts y Nevis">Saint Kitts y Nevis</option>
                                                                                <option value="Samoa">Samoa</option>
                                                                                <option value="Samoa Americana">Samoa Americana</option>
                                                                                <option value="San Marino">San Marino</option>
                                                                                <option value="San Vicente y Granadinas">San Vicente y Granadinas</option>
                                                                                <option value="Santa Helena">Santa Helena</option>
                                                                                <option value="Santa Lucía">Santa Lucía</option>
                                                                                <option value="Santo Tomé y Príncipe">Santo Tomé y Príncipe</option>
                                                                                <option value="Senegal">Senegal</option>
                                                                                <option value="Seychelles">Seychelles</option>
                                                                                <option value="Sierra Leona">Sierra Leona</option>
                                                                                <option value="Singapur">Singapur</option>
                                                                                <option value="Siria">Siria</option>
                                                                                <option value="Somalia">Somalia</option>
                                                                                <option value="Sri Lanka">Sri Lanka</option>
                                                                                <option value="St Pierre y Miquelon">St Pierre y Miquelon</option>
                                                                                <option value="Suazilandia">Suazilandia</option>
                                                                                <option value="Sudán">Sudán</option>
                                                                                <option value="Suecia">Suecia</option>
                                                                                <option value="Suiza">Suiza</option>
                                                                                <option value="Surinam">Surinam</option>
                                                                                <option value="Tailandia">Tailandia</option>
                                                                                <option value="Taiwán">Taiwán</option>
                                                                                <option value="Tanzania">Tanzania</option>
                                                                                <option value="Tayikistán">Tayikistán</option>
                                                                                <option value="Territorios franceses del Sur">Territorios franceses del Sur</option>
                                                                                <option value="Timor Oriental">Timor Oriental</option>
                                                                                <option value="Togo">Togo</option>
                                                                                <option value="Tonga">Tonga</option>
                                                                                <option value="Trinidad y Tobago">Trinidad y Tobago</option>
                                                                                <option value="Túnez">Túnez</option>
                                                                                <option value="Turkmenistán">Turkmenistán</option>
                                                                                <option value="Turquía">Turquía</option>
                                                                                <option value="Tuvalu">Tuvalu</option>
                                                                                <option value="Ucrania">Ucrania</option>
                                                                                <option value="Uganda">Uganda</option>
                                                                                <option value="Uruguay">Uruguay</option>
                                                                                <option value="Uzbekistán">Uzbekistán</option>
                                                                                <option value="Vanuatu">Vanuatu</option>
                                                                                <option value="Venezuela">Venezuela</option>
                                                                                <option value="Vietnam">Vietnam</option>
                                                                                <option value="Yemen">Yemen</option>
                                                                                <option value="Yugoslavia">Yugoslavia</option>
                                                                                <option value="Zambia">Zambia</option>
                                                                                <option value="Zimbabue">Zimbabue</option>
                        </select>
                    </div>


                </div>  
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">Financiamiento</label>
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <select name="financiamiento" id="financiamiento" class="select2_single form-control" tabindex="-1">
                            <option value="<%=estudios.getFinanciamiento()%>"><%=estudios.getFinanciamiento()%></option>
                            <option value="personal">personal</option>
                            <option value="beca_18">beca 18</option>
                            <option value="DONG">ONG</option>
                            <option value="INT. PRIVADA">INT. PRIVADA</option>

                        </select>
                    </div>


                </div>  
            </form>
            <div class="modal-footer">

                <div class="form-group">
                    <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">

                        <button type="button" id="btnguardar5" class="btn btn-success">Modificar</button>
                    </div>
                </div>

            </div>


        </div>



        <script type="text/javascript">
            $(document).ready(function () {

                $('#idEgresado5').hide();
                /*------------------------------*/
                $('#input_fechaini5').daterangepicker({
                    format: 'YYYY-MM-DD',
                    singleDatePicker: true,
                    calender_style: "picker_4"

                },
                        function (start, end, label) {
                            console.log(start.toISOString(), end.toISOString(), label);
                        });
                $('#input_fechafin5').daterangepicker({
                    format: 'YYYY-MM-DD',
                    singleDatePicker: true,
                    calender_style: "picker_4"

                },
                        function (start, end, label) {
                            console.log(start.toISOString(), end.toISOString(), label);
                        });
            });
            $('#btnguardar5').click(function () {
                var formdata = new FormData($("#crearform5")[0]);
                $.ajax({
                    url: "../EstudiosController?accion=modififcar",
                    type: "post",
                    contentType: false,
                    data: formdata,
                    processData: false,
                    cache: false})
                        .done(function (id) {

                            //      alert(json.id);
                            //       alert(json.nombre);

                            if (id == 0) {
                                alert('Estudio no se puede modificar');

                                alerta("Estudio no modificado", false);
                            } else
                            {
                               actualizartabla(table4);
                               ocultarmodal();
                                alerta("Estudio modificado", true);
                                
                            }
                        })
            });
        </script>
    </body>
</html>
