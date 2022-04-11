package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artesano.commons.app.entities.ApCatMateriaPrima;

@Repository
public interface ApCatMateriaPrimaRepository extends JpaRepository<ApCatMateriaPrima, Integer>{

}
