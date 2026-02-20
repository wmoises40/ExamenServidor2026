package transporte.modelo.service;

import java.time.LocalDate;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transporte.modelo.entities.Incidencia;
import transporte.modelo.enumerados.EstadoIncidencia;
import transporte.modelo.repository.IncidenciaRepository;

@Service
public class IncidenciaServiceImplMongo implements IncidenciaService{
	
	@Autowired
	private IncidenciaRepository incidenciaRepository;

	@Override
	public List<Incidencia> findAll() {
		// TODO Auto-generated method stub
		return incidenciaRepository.findAll();
	}

	@Override
	public List<Incidencia> incidenciasActivasUnCamionUltimoMes(ObjectId camionId) {
		LocalDate ultimoMes = LocalDate.now().minusMonths(1);
		// TODO Auto-generated method stub
		return incidenciaRepository.findByEstadoAndCamionIdAndFechaAfter(EstadoIncidencia.ABIERTA, camionId, ultimoMes);
	}
	
	

}
