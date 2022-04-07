package artesano.commons.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Clasificacion_Productos")
public class ApCatClasificacionProductos {
	
	@Id
	@Column(name="id_clasificacion")
	private Integer idClasificacion;
	
	@Column(name="nombre_clasificacion")
	private String nombreClasificacion;
	
	@Column(name="descripcion_clasificacion")
	private String descripcionClasificacion;

}