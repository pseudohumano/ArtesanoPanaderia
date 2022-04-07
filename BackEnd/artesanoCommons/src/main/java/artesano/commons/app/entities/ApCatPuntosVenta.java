package artesano.commons.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Puntos_Venta")
public class ApCatPuntosVenta {

	@Id
	@Column(name="id_punto_venta")
	private Integer idPuntoVenta;
	
	@Column(name="nombre_punto_venta")
	private String nombrePuntoVenta;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="codigo_postal")
	private String codigoPostal;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="numero")
	private Integer numero;
	
	@Column(name="id_cliente")
	private Integer idCliente;
}