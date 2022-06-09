package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "seg_usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 10L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_usuario")
    private Integer codUsuario;

    @Column(name="username", nullable = false, length = 32)
    private String username;

    @Column(name="nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name="estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "clave", nullable = false, length = 64)
    private String clave;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<UsuarioEspacio> usuarioEspacios;

    public Usuario() {
    }

    public Usuario(Integer codUsuario, String username, String nombre, String estado, String clave) {
        this.codUsuario = codUsuario;
        this.username = username;
        this.nombre = nombre;
        this.estado = estado;
        this.clave = clave;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return codUsuario.equals(usuario.codUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario=" + codUsuario +
                '}';
    }
}
