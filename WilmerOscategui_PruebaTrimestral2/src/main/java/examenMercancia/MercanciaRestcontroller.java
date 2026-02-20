package examenMercancia;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transporte.modelo.entities.Mercancia;
import examenMercancia.MercanciaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mercancias")
public class MercanciaRestcontroller {
	
	@Autowired
	private MercanciaService mercanciaService;
	
	@GetMapping("/ruta-larga")
	public ResponseEntity<List<Mercancia>> getMercanciasRutaLarga(){
		return ResponseEntity.ok(mercanciaService.obtenerMercanciasConRutaMayorA500());
	}
	
	@GetMapping("/estadisticas/estado")
    public ResponseEntity<Map<String, Long>> getConteoPorEstado() {
        return ResponseEntity.ok(mercanciaService.obtenerConteoPorEstado());
    }
}
