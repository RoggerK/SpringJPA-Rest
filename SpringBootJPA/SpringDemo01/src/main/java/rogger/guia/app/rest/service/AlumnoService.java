package rogger.guia.app.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.rest.model.Alumno;
import rogger.guia.app.rest.repository.AlumnoRepository;

//indicamos que es un servicio para usar el @Autowired
@Service
@Transactional
public class AlumnoService {
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public List<Alumno> listarAlumno() {
		//.findAll() : de vuelve todo un listado de la tabla referenciada
		return alumnoRepository.findAll();
	}

	public Alumno idAlumno(Integer id) {
		//.findById(Integer).get() : devuelve una entidad con la id 
		return alumnoRepository.findById(id).get();
	}
	
	public Alumno registrarAlumno(Alumno a) {
		/*
		 * .save(Entity) : crear una entidad con el cuerpo que le
		 * 				   hayas lanzado. Observacion, en caso tu
	     * 				   le lances un cuerpo con id, lo que hara sera
	     * 				   actualizar esa entidad con la id especifica.
	     * 				   Recuerda sin id se crea y con id se actualiza.
		*/
		return alumnoRepository.save(a);
	}
	
	public void eliminarAlumno(Integer id) {
		//.deleteById(Integer): elimina la entidad, con la id especificada.
		//						Observacion no es una buena practica eliminarlo
		//						lo recomendable es pasa a un estado inactivo
		alumnoRepository.deleteById(id);
	}
	
}
