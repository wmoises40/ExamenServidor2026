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
import transporte.modelo.entities.Mercancia;
import transporte.modelo.service.CamionService;
import transporte.modelo.service.MercanciaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mercancias")
public class MercanciaRestController {
	
	@Autowired
	private MercanciaService mercanciaService;
	
	@GetMapping("/origen/{origen}")
	
	public List<Mercancia> porOrigen(@PathVariable String origen){
		
		return mercanciaService.porOrigen(origen);
	}
	
	@GetMapping("/destino/{destino}")
	
	public List<Mercancia> porDestino(@PathVariable String destino){
		
		return mercanciaService.porDestino(destino);
	}
	
	@GetMapping("/pesoMaximo/{peso}")
	
	public List<Mercancia> porPeso(@PathVariable double peso){
		
		return mercanciaService.porPesoMaximo(peso);
	}
	
}
