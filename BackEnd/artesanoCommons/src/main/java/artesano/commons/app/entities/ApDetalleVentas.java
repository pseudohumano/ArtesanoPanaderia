package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_Detalle_Ventas")
@IdClass(value =  ApDetalleVentasPk.class)
public class ApDetalleVentas {
	@Id
	@Column(name="id_registro")
	private Integer idRegistro;
	
	@Id
	@Column(name="id_producto")
	private Integer idProducto;
	
	@Id
	@Column(name="id_punto_venta")
	private Integer idPuntoVenta;
	
	@Column(name="numero_unidades")
	private Integer numeroUnidades;
	
	@Column(name="importe_venta_producto")
	private Double importeVentaProducto;
	
	@Column(name="fecha_venta")
	private Date fechaVenta;
	
	@Id
	@Column(name="id_venta")
	private Integer idVenta;

}
