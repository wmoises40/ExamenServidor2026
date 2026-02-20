package examenMercancia;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transporte.modelo.entities.Mercancia;

@Service
public class MercanciaServiceImpl implements MercanciaService{
	
	@Autowired
	private MercanciaRepository mercanciaRepository;
	
	@Override
	public List<Mercancia> obtenerMercanciasConRutaMayorA500() {
		// TODO Auto-generated method stub
		return mercanciaRepository.findByDistanciaTotalGreaterThan(500.0);
	}

	@Override
	public Map<String, Long> obtenerConteoPorEstado() {
		// TODO Auto-generated method stub
		return null;
	}

}
