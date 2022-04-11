package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import artesano.commons.app.entities.APVentas;

public interface APVentasRepository extends JpaRepository<APVentas, Integer> {

}
