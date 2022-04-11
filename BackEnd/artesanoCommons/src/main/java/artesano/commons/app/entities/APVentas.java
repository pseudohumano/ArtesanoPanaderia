package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_Ventas")
public class APVentas {

	@Id
	@Column(name = "id_venta")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idVenta;
	
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "importe_venta_total")
	private Double importeVentaTotal;
	
	@Column(name = "numero_piezas")
	private Integer numeroPiezas;
	
	@Column(name = "fecha_venta_total")
	private Date fechaVentaTotal;
	
}
