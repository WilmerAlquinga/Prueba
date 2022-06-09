package ec.edu.espe.arquitectura.prueba.dao;

import ec.edu.espe.arquitectura.prueba.model.UsuarioEspacioPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {
}
