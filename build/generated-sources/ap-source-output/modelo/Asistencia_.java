package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TipoAsistencia;
import modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-12T17:44:39")
@StaticMetamodel(Asistencia.class)
public class Asistencia_ { 

    public static volatile SingularAttribute<Asistencia, String> descripcion;
    public static volatile SingularAttribute<Asistencia, TipoAsistencia> tipoAsistencia;
    public static volatile SingularAttribute<Asistencia, String> duracion;
    public static volatile SingularAttribute<Asistencia, Usuario> usuario;
    public static volatile SingularAttribute<Asistencia, Integer> id;
    public static volatile SingularAttribute<Asistencia, Date> timestamp;

}