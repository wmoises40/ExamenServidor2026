package transporte.modelo.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transporte.modelo.entities.Camion;
import transporte.modelo.enumerados.EstadoCamion;
import transporte.modelo.repository.CamionRepository;

@Service
public class CamionServiceImplMongo implements CamionService{
	@Autowired
	private CamionRepository camionRepository;

	@Override
	public List<Camion> conductorEstadoDisponible(ObjectId conductorId) {
		// TODO Auto-generated method stub
		return camionRepository.findByConductorIdAndEstado(conductorId, EstadoCamion.ACTIVO);
	}

	@Override
	public List<Camion> findAll() {
		// TODO Auto-generated method stub
		return camionRepository.findAll();
	}

}
