
<ul class="list-group">
    <li class="asistencia-item list-group-item" ng-repeat="asistencia in asistenciasList">
        <div class="duracion-asistencia">
            {{asistencia.duracion}}
        </div>
        <span class="nombre-usuario">{{asistencia.usuario.nombre}} {{asistencia.usuario.apellido}} </span> - 
        <span class="fecha-asistencia">{{asistencia.timestamp | date :  "HH:mm (dd/MM/yyyy)"}}</span>
        <br>
        <span class="nombre-tipo-asistencia">{{asistencia.tipoAsistencia.nombre}}</span> - 
        <span class="descripcion-asistencia">{{asistencia.descripcion}}</span>


        <!--{{asistencia}}-->
    </li>
</ul>

<style>
    .asistencia-item
    {
        border: solid 1px grey;
    }
    .duracion-asistencia
    {
        background-color: #1abc9c;
        color:white;
        border-radius: 6px;
        float: right;
        padding: 12px;
        font-weight: bold;
    }
    .nombre-usuario
    {
        font-weight: bold;
        font-size: 24px;
    }
    .fecha-asistencia
    {
        color: grey;
        //background-color: black;
       // padding: 8px;
        border-radius: 6px;
    }
    .nombre-tipo-asistencia
    {
        font-weight: bold;
        font-size: 16px;
        color: #e74c3c;
    }
    .descripcion-asistencia
    {
        font-size: 16px;
    }
</style>