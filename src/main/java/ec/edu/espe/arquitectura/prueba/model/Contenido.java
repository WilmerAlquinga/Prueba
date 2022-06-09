package ec.edu.espe.arquitectura.prueba.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable {

    private static final long serialVersionUID = 50L;

    @Id
    @Column(name = "cod_contenido")
    private Integer codContenido;

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer codContenidoPadre;

    @Column(name = "tipo_contenido", precision = 2)
    private BigDecimal tipoContenido;

    @Column(name = "nombre", length = 256)
    private String nombre;

    @Column(name = "nombre_archivo", length = 256)
    private String nombreArchivo;

    @Column(name = "version", precision = 4, scale = 2)
    private BigDecimal version;

    @Column(name = "estado")
    private Integer estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contenido")
    private List<ContenidoVersion> versiones;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido_padre", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenidoPadre;
}
