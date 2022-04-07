package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Clientes")
public class ApCatClientes {
	
	@Id
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	
	@Column(name="fecha_alta_cliente")
	private Date fechaAltaCliente = null;

}
