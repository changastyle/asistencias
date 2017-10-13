<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asitencias</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
        <style>
            *
            {
                font-family: 'Lato', sans-serif;
            }
            .sin-padding
            {
                padding-left:0px;
                padding-right: 0px;
            }
        </style>
    </head>
    <body ng-app="app" ng-controller="asistencias" ng-init="init()" ng-clock>
        <h1 class="h-asistencia">Asistencias!</h1>
        
        <!-- CONTAINER:-->
        <div class="col-xs-8 col-xs-offset-2">
            
            <!-- LISTADO DE ASISTENCIAS:-->
            <%@include file="partes/listado-asistencias.jsp" %>
            
            <!-- BOTON CARGAR EXCURSION: -->
            <%@include file="partes/boton-cargar-asistencia.jsp" %>

            <!-- MODAL CREAR ASISTENCIA : -->
            <%@include file="partes/modal-add-excursion.jsp" %>
            
        </div>
        <!--aSIS
        {{asistencia}}-->
    </body>
    <script>
    app = angular.module('app', []);
    
    app.controller('asistencias', function($scope)
    {
        $scope.tiposAsistenciaList = [];
        $scope.asistenciasList = [];
        $scope.duracionList = [];
        $scope.asistencia = null;
        $scope.init = function()
        {
            $scope.findAsistenciaEmpty();
            $scope.findAsistencias();
            $scope.findTiposAsistencias(); 
            $scope.findDuracionList(); 
            
        }
        $scope.findAsistencias = function()
        {
            $.ajax(
            {
                url:"../../findAsistencias",
                success: function (resultado, textStatus, jqXHR) 
                {
                    $scope.asistenciasList = resultado;
                    $scope.$evalAsync();
                    console.log("res find asistencias: " + JSON.stringify(resultado))
                }
            });
        }
        $scope.addAsitencia = function()
        {
            $.ajax(
            {
                url:"../../addAsistencia",
                data:
                {
                    "tipoAsistencia":$scope.asistencia.tipoAsistencia.id,
                    "descripcion":$scope.asistencia.descripcion,
                    "duracion":$scope.asistencia.duracion
                },success: function (resultado, textStatus, jqXHR) 
                {
                    console.log(resultado);
                    if(resultado)
                    {
                        window.location.reload();
                    }
                    else
                    {
                        alert("No se pudo cargar la asistencia..");
                    }
                }  
            });    
        }
        $scope.findTiposAsistencias = function()
        {
            $.ajax(
            {
                url:"../../findTiposDeAsistencias",
                success: function (resultado, textStatus, jqXHR) 
                {
                    console.log("tipos de asistencia: " + JSON.stringify(resultado));
                    $scope.tiposAsistenciaList =  resultado;
                    $scope.asistencia.tipoAsistencia = $scope.tiposAsistenciaList[0];
                    $scope.$evalAsync();
                }
            });
        }
        $scope.findDuracionList = function()
        {
            $.ajax(
            {
                url:"../../findDuracionList",
                success: function (resultado, textStatus, jqXHR) 
                {
                    console.log("DuracionList " + JSON.stringify(resultado))
                    $scope.duracionList =  resultado;
                    $scope.asistencia.duracion = $scope.duracionList[0];
                    $scope.$evalAsync();
                }
            });
        }
        $scope.findAsistenciaEmpty = function()
        {
            $.ajax(
            {
                url:"../../findAsistenciaEmpty",
                async: false,
                success: function (resultado, textStatus, jqXHR) 
                {
                    console.log("empty= " + resultado);
                    $scope.asistencia =  resultado;
                    $scope.$evalAsync();
                }
            });
        }
    });
    </script>
    <style>
        .h-asistencia
        {
            margin-top: 0px;
            margin-bottom: 25px;
            text-align: center;
            background-color: #1abc9c;
            padding-top:12px;
            padding-bottom:12px;
            color:white;
        }
    </style>
</html>
