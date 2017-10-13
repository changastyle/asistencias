package ws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import modelo.Asistencia;
import modelo.TipoAsistencia;
import modelo.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class wsTipoAsistencia 
{
    @RequestMapping(value = "findTiposDeAsistencias")
    public static List<TipoAsistencia> findAsistencias()
    {
        List<TipoAsistencia> tipoDeAsistenciasList = new ArrayList<TipoAsistencia>();
        
        String jpql = "SELECT t FROM TipoAsistencia t";
        
        tipoDeAsistenciasList = dao.DAOEclipse.findAllByJPQL(jpql);
        Collections.sort(tipoDeAsistenciasList);
        
        return tipoDeAsistenciasList;
    }
    @RequestMapping(value = "findDuracionList")
    public static List<String> findDuracionList()
    {
        List<String> listadoDuraciones = new ArrayList<String>();
        
        listadoDuraciones.add("5 min");
        listadoDuraciones.add("10 min");
        listadoDuraciones.add("15 min");
        listadoDuraciones.add("20 min");
        listadoDuraciones.add("25 min");
        listadoDuraciones.add("30 min");
        listadoDuraciones.add("45 min");
        listadoDuraciones.add("1 hora");
        listadoDuraciones.add("1:30 horas");
        listadoDuraciones.add("2 horas");
        listadoDuraciones.add("2:30 horas");
        listadoDuraciones.add("3 horas");
        listadoDuraciones.add("4 horas");
        listadoDuraciones.add("+4 horas");
        
        return listadoDuraciones;
    }

}
