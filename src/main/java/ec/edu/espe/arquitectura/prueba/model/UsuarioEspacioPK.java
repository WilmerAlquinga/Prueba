package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioEspacioPK implements Serializable {

    @Column(name="cod_usuario", nullable = false)
    private Integer codUsuario;

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codUsuario, Integer codEspacio) {
        this.codUsuario = codUsuario;
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEspacioPK that = (UsuarioEspacioPK) o;
        return codUsuario.equals(that.codUsuario) && codEspacio.equals(that.codEspacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, codEspacio);
    }

    @Override
    public String toString() {
        return "UsuarioEspacioPK{" +
                "codUsuario=" + codUsuario +
                ", codEspacio=" + codEspacio +
                '}';
    }
}
