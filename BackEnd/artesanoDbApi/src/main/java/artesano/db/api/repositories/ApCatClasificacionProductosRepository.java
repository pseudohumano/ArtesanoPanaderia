package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artesano.commons.app.entities.ApCatClasificacionProductos;

@Repository
public interface ApCatClasificacionProductosRepository extends JpaRepository<ApCatClasificacionProductos, Integer> {

}
