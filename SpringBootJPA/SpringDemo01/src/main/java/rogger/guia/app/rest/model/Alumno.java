package rogger.guia.app.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

//genera get, set, tostring, equals...
@Data
//creamos constructor vacio
@NoArgsConstructor
//indicamos que es una entidad
@Entity
//nombremos la tabla a la cual deseamos señalar
@Table(name = "alumnos")
public class Alumno {
	// indicamos id de la tabla
	@Id
	// indicamos que es autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idalumnos;
	// name: nombre de la columna, nullable: en false no permite nulos, length: das
	// limite de entrada
	@Column(name = "cedula", nullable = false, length = 8)
	private String cedula;
	@Column(name = "nombres", nullable = false)
	private String nombres;
	@Column(name = "apellidos", nullable = false)
	private String apellidos;
	@Column(name = "curso", nullable = false)
	private String curso;
}
