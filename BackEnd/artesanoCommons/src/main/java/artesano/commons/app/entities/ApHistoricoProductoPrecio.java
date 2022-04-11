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
@Table(name = "AP_Historico_Producto_Precio")
public class ApHistoricoProductoPrecio {
	
	@Id
	@Column(name="id_historico")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idHistorico;
	
	@Column(name="id_producto")
	private Integer idProducto;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="fecha_alta")
	private Date fechaAlta;
	
	@Column(name="fecha_baja")
	private Date fechaBaja;
	

}
