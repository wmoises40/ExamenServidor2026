package transporte.restcontroller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transporte.modelo.service.IncidenciaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/incidencias")
public class IncidenciaRestController {
	
	@Autowired
	private IncidenciaService incidenciaService;
	
	@GetMapping("/")
	public ResponseEntity<?> todos(){
		return ResponseEntity.ok(incidenciaService.findAll());
	}
	
	
	@GetMapping("/camion/{camionId}")
	public ResponseEntity<?> todos(@PathVariable  ObjectId camionId){
		return ResponseEntity.ok(incidenciaService.incidenciasActivasUnCamionUltimoMes(camionId));
	}

}
