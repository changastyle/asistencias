package modelo;

import java.util.Date;
import javax.persistence.*;

@Entity @Table(name = "asistencias")
public class Asistencia 
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER) @JoinColumn(name = "fkuUsuario")
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER) @JoinColumn(name = "fkTipoAsistencia")
    private TipoAsistencia tipoAsistencia;
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    private String duracion;

    public Asistencia() {
    }

    public Asistencia(Usuario usuario, TipoAsistencia tipoAsistencia, String descripcion, Date timestamp, String duracion) {
        this.usuario = usuario;
        this.tipoAsistencia = tipoAsistencia;
        this.descripcion = descripcion;
        this.timestamp = timestamp;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoAsistencia getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(TipoAsistencia tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "id=" + id + ", usuario=" + usuario + ", tipoAsistencia=" + tipoAsistencia + ", descripcion=" + descripcion + ", timestamp=" + timestamp + ", duracion=" + duracion + '}';
    }
    
    
    
}
