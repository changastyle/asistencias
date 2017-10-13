package modelo;

import com.sun.javafx.collections.SortableList;
import java.util.Comparator;
import javax.persistence.*;

@Entity @Table(name = "tipoAsistencia")
public class TipoAsistencia implements Comparable<TipoAsistencia>
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public TipoAsistencia() {
    }

    public TipoAsistencia(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoAsistencia{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(TipoAsistencia tipo2) 
    {
        int compare = this.getNombre().compareTo(tipo2.getNombre());
        
        if(compare < 0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    
    
    
}
