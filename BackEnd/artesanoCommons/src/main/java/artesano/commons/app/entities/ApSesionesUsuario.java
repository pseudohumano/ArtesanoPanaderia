package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_Sesiones_Usuario")
public class ApSesionesUsuario {

	@Id
	@Column(name = "id_sesion")
	private Integer idSesion;
	
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "fecha_inicio_sesion")
	private Date fechaInicioSesion;
	
	@Column(name = "fecha_fin_sesion")
	private Date fechaFinSesion;

}
