package ec.edu.espe.arquitectura.prueba.dao;

import ec.edu.espe.arquitectura.prueba.model.ContenidoVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContenidoVersionRepository extends JpaRepository<ContenidoVersion, Integer> {
}
