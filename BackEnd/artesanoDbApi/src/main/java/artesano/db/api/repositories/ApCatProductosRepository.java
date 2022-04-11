package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artesano.commons.app.entities.ApCatProductos;

@Repository
public interface ApCatProductosRepository extends JpaRepository<ApCatProductos, Integer> {

}
