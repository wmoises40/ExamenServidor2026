package examenMercancia;

import java.util.List;
import java.util.Map;

import transporte.modelo.entities.Mercancia;

public interface MercanciaService {
	
	List<Mercancia> obtenerMercanciasConRutaMayorA500();
	
	Map<String, Long> obtenerConteoPorEstado();
}
