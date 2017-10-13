
<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content col-xs-12">
            <div class="modal-header row">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">CREANDO ASISTENCIA</h4>
            </div>
            <div class="modal-body row">
                <div class="formulario-creando-asistencia form-horizontal"> 
                    
                    <!-- TIPO DE ASISTENCIA:-->
                    <div class="form-group">
                        <label class="control-label col-sm-2" style="text-align: center">Tipo de Asistencia</label>
                        <div class="col-sm-10">
                            <select ng-model="asistencia.tipoAsistencia" ng-options="tipoAsistencia as tipoAsistencia.nombre for tipoAsistencia in tiposAsistenciaList" class="form-control">
                            </select>
                        </div>
                    </div>
                    
                    <!-- DURACION:-->
                    <div class="form-group">
                        <label class="control-label col-sm-2" style="text-align: center">Duracion</label>
                        <div class="col-sm-10">
                            <select ng-model="asistencia.duracion" ng-options="duracion as duracion for duracion in duracionList" class="form-control">
                            </select>
                        </div>
                    </div>
                    
                    <!-- DESCRIPCION:-->
                    <div class="form-group">
                        <label class="control-label col-sm-2" style="text-align: center">Descripcion</label>
                        <div class="col-sm-10">
                            <textarea class="form-control"  style="resize: vertical;" rows="6" ng-model="asistencia.descripcion" placeholder="Describir que sucedio..">
                            </textarea>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer row">
                <button type="button" class="btn btn-success col-xs-12" ng-click="addAsitencia()">
                    <span class="glyphicon glyphicon-ok"></span>
                    ACEPTAR
                </button>
            </div>
        </div>
    </div>
</div>