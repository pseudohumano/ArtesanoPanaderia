package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Productos")
public class ApCatProductos {
	
	@Id
	@Column(name="id_producto")
	private Integer idProducto;
	
	@Column(name="nombre_producto")
	private String nombreProducto;
	
	@Column(name="id_clasificacion")
	private Integer idClasificacion;
	
	@Column(name="descripcion_producto")
	private String descripcionProducto;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="habilitado")
	private Integer habilitado;
	
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="foto")
	private byte[] foto;
	
	@Column(name="fecha_registro_producto")
	private Date fechaRegistroProducto;

}