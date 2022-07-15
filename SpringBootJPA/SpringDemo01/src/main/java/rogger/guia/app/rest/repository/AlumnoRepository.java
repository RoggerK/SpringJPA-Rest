package rogger.guia.app.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.rest.model.Alumno;

//indicamos que es de tipo Repositorio
@Repository
//la clase es una interfaz para que here las propiedades de JpaRepository
//por otra parte <Alumno(Es la entidad), Integer(el tipo de la id)>
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
	/*
	 * Campo donde puedes llamar a tus procedimientos almacenados personalizados
	 *
	 * @Query(value = "{Call sp_MantListarAlumno()}", nativeQuery = true)
	 * List<Alumno> listarAlumno();
	 * 
	 */

}
