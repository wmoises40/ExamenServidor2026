package examenCamion;

import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transporte.modelo.entities.Camion;
import examenCamion.CamionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/camiones")
public class CamionRestController {
	
	@Autowired
	private CamionService camionService;
	
	@PutMapping("/{camionId}/asignar-conductor/{conductorId}")
    public ResponseEntity<Camion> asignarConductor(@PathVariable ObjectId camionId, @PathVariable ObjectId conductorId) {
		Camion camionActualizado = camionService.asignarConductor(camionId, conductorId);
        return ResponseEntity.ok(camionActualizado);
    }
	
	@GetMapping("/capacidad-por-conductor")
    public ResponseEntity<Map<String, Double>> getCapacidadPorConductor() {
        return ResponseEntity.ok(camionService.calcularCapacidadTotalPorConductor());
    }
}
