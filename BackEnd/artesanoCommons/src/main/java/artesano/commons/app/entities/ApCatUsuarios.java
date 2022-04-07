package artesano.commons.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_CAT_Usuarios")
public class ApCatUsuarios {
	
	@Id
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="rol")
	private String rol;
	
	@Column(name="id_cliente")
	private Integer idCliente;

}
