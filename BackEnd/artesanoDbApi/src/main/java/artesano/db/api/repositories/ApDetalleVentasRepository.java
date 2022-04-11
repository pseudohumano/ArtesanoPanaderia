package artesano.db.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import artesano.commons.app.entities.ApDetalleVentas;
import artesano.commons.app.entities.ApDetalleVentasPk;

public interface ApDetalleVentasRepository extends JpaRepository<ApDetalleVentas, ApDetalleVentasPk>{

}
