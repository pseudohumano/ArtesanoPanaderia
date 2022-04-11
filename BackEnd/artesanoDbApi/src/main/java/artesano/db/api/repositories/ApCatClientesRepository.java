package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artesano.commons.app.entities.ApCatClientes;

@Repository
public interface ApCatClientesRepository  extends JpaRepository<ApCatClientes, Integer>{

}
