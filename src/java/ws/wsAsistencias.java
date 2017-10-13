package ws;

import controllers.MasterController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Asistencia;
import modelo.TipoAsistencia;
import modelo.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class wsAsistencias 
{
    @RequestMapping(value = "findAsistencias")
    public static List<Asistencia> findAsistencias()
    {
        List<Asistencia> listadoAsistenciasDelUsuario = new ArrayList<Asistencia>();
        
        String jpql = "SELECT a FROM Asistencia a";
        
        listadoAsistenciasDelUsuario = dao.DAOEclipse.findAllByJPQL(jpql);
        
        return listadoAsistenciasDelUsuario;
    }
    @RequestMapping(value = "addAsistencia")
    public static boolean addAsistencia
    (
        @RequestParam(value = "tipoAsistencia") int fkTipoAsistencia,
        @RequestParam(value = "descripcion") String descripcion,
        @RequestParam(value = "duracion") String duracion
    )
    {
        boolean add = false;
        Date timestamp = new Date();
        TipoAsistencia tipoAsistenciaDB = (TipoAsistencia) dao.DAOEclipse.get(TipoAsistencia.class, fkTipoAsistencia);
        Usuario usuarioDB = (Usuario) dao.DAOEclipse.get(Usuario.class, 1);
        if(tipoAsistenciaDB != null)
        {
            Asistencia asistenciaNueva = new Asistencia(usuarioDB, tipoAsistenciaDB, descripcion, timestamp, duracion);
            add = dao.DAOEclipse.update(asistenciaNueva);
        }
        return add;
    }
    
    @RequestMapping(value = "findAsistenciaEmpty")
    public static Asistencia findAsistenciaEmpty()
    {
        Asistencia asistenciaEmpty = new Asistencia();
        
        asistenciaEmpty.setUsuario(MasterController.usuarioDefault);
        asistenciaEmpty.setDuracion("15 min");
        asistenciaEmpty.setDescripcion("");
        
        
        return asistenciaEmpty;
    }
}
