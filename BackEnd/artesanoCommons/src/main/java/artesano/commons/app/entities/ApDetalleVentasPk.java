package artesano.commons.app.entities;

import lombok.Data;

@Data
public class ApDetalleVentasPk {
	private Integer idRegistro;
	private Integer idProducto;
	private Integer idPuntoVenta;
	private Integer idVenta;
}
