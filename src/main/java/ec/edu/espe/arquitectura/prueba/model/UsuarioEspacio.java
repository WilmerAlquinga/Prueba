package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {

    private static final long serialVersionUID = 20L;
    @EmbeddedId
    private UsuarioEspacioPK pk;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public UsuarioEspacio(Integer codUsuario, Integer codEspacio) {
        this.pk = new UsuarioEspacioPK(codUsuario, codEspacio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEspacio that = (UsuarioEspacio) o;
        return pk.equals(that.pk) && estado.equals(that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, estado);
    }

    @Override
    public String toString() {
        return "UsuarioEspacio{" +
                "pk=" + pk +
                '}';
    }

}
