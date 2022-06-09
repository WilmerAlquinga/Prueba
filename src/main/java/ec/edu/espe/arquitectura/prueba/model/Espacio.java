package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {

    private static final long serialVersionUID = 30L;
    @Id
    @Column(name = "cod_espacio")
    private Integer codEspacio;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public Espacio() {
    }

    public Espacio(Integer codEspacio, String nombre, Date fechaCreacion) {
        this.codEspacio = codEspacio;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espacio espacio = (Espacio) o;
        return codEspacio.equals(espacio.codEspacio) && nombre.equals(espacio.nombre) && fechaCreacion.equals(espacio.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEspacio, nombre, fechaCreacion);
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "codEspacio=" + codEspacio +
                '}';
    }
}
