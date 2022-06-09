package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {

    private static final long serialVersionUID = 40L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version")
    private Integer codContenidoVersion;

    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;

    @Column(name = "hash_archivo", nullable = false, length = 64)
    private String hashArchivo;

    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;

    @Column(name = "tamanio", nullable = false, precision = 9, scale = 0)
    private BigDecimal tamanio;

    @Column(name = "version", nullable = false, precision = 4, scale = 2)
    private BigDecimal version;

    @Column(name = "comentario", nullable = false, length = 500)
    private String comentario;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public ContenidoVersion() {
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public BigDecimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(BigDecimal tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenidoVersion that = (ContenidoVersion) o;
        return codContenidoVersion.equals(that.codContenidoVersion) && Objects.equals(codContenido, that.codContenido) && Objects.equals(hashArchivo, that.hashArchivo) && Objects.equals(nombreArchivo, that.nombreArchivo) && Objects.equals(tamanio, that.tamanio) && Objects.equals(version, that.version) && Objects.equals(comentario, that.comentario) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(codUsuarioCreacion, that.codUsuarioCreacion) && Objects.equals(contenido, that.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codContenidoVersion, codContenido, hashArchivo, nombreArchivo, tamanio, version, comentario, fechaCreacion, codUsuarioCreacion, contenido);
    }

    @Override
    public String toString() {
        return "ContenidoVersion{" +
                "codContenidoVersion=" + codContenidoVersion +
                '}';
    }
}
