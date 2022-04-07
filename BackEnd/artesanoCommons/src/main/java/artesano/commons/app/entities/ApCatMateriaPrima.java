package artesano.commons.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Materia_Prima")
public class ApCatMateriaPrima {
	
	@Id
	@Column(name="id_materia_prima")
	private Integer idMateriaPrima;
	
	@Column(name="nombre_materia_prima")
	private String nombreMateriaPrima;
	
	@Column(name="habilitado")
	private Integer habilitado;
	
	@Column(name="id_cliente")
	private Integer idCliente;

}
