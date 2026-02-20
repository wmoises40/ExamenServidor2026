package transporte.restcontroller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transporte.modelo.dto.CamionDto;
import transporte.modelo.entities.Camion;
import transporte.modelo.service.CamionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/camiones")
public class CamionRestController {
	
	@Autowired
	private CamionService camionService;
	
	@GetMapping("/disponible/{conductorId}")
	
	public List<CamionDto> camiones(@PathVariable ObjectId conductorId){
		
		return camionService.conductorEstadoDisponible(conductorId).stream()
				.map(c -> CamionDto.converToCamionDto(c))
				.toList();
	}
	
	@GetMapping("/")
	
	public List<CamionDto> camionesTodos(){
		
		return camionService.findAll().stream()
				.map(c -> CamionDto.converToCamionDto(c))
				.toList();
				
				
				
	}

}
