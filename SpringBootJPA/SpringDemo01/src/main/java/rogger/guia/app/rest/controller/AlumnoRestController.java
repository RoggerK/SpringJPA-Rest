package rogger.guia.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rogger.guia.app.rest.model.Alumno;
import rogger.guia.app.rest.service.AlumnoService;

//decimos que sera de tipo rest
@RestController
//hacemos un nombre especifico del rest(/rest/alumno)
@RequestMapping("/alumno")
public class AlumnoRestController {

	// metodos HTTP -> GET, POST, DELETE

	// inyectamos el servicio(AlumnoService aluservice = new AlumnoService())
	@Autowired
	private AlumnoService alumnoService;

	// GET: de tipo consulta, "" porque vamos a usar el enlace /rest/alumno
	@GetMapping("")
	public List<Alumno> listarAlumno() {
		return alumnoService.listarAlumno();
	}

	// GET con /{id}, @PathVariable("id"): indica que captura el valor ultimo del
	// enlace(/rest/alumno/2), el 2 se captura
	@GetMapping("/{id}")
	public Alumno idAlumno(@PathVariable("id") Integer id) {
		return alumnoService.idAlumno(id);
	}

	// POST: ingreso de datos
	@PostMapping("")
	// la respuesta que lanza sera de tipo JSON
	@ResponseBody
	// @RequestBody indica que debe recibir un cuerpo o objeto
	public Alumno registrarAlumno(@RequestBody Alumno a) {
		return alumnoService.registrarAlumno(a);
	}

	// DELETE: elimina la entidad de la base de datos, en este caso
	// se le esta pidiendo una id para hacer dicha eliminacion
	// por medio de la ultimo enlace
	@DeleteMapping("/{id}")
	public void eliminarAlumno(@PathVariable("id") Integer id) {
		alumnoService.eliminarAlumno(id);
	}

}
