package artesano.commons.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AP_Registro_Materia_Prima")
public class ApRegistroMateriaPrima {

	@Id
	@Column(name = "id_registro_materia_prima")
	private Integer idRegistroMateriaPrima;
	
	@Column(name = "id_materia_prima")
	private Integer idMateriaPrima;
	
	@Column(name = "unidades_materia_prima")
	private Integer unidadesMateriaPrima;
	
	@Column(name = "importe_materia_prima")
	private Double importeMateriaPrima;
	
	@Column(name = "fecha_registro_materia_prima")
	private Date fechaRegistroMateriaPrima;
	
}
