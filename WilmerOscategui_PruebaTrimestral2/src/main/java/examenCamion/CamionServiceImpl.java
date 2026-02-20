package examenCamion;

import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transporte.modelo.entities.Camion;
import transporte.modelo.repository.CamionRepository;

@Service
public class CamionServiceImpl implements CamionService{

	@Autowired
		private CamionRepository camionRepository;
	
	@Override
	public Camion asignarConductor(ObjectId camionId, ObjectId conductorId) {
		// TODO Auto-generated method stub
		Camion camion = camionRepository.findById(camionId).orElse(null);
				
		camion.setConductorId(conductorId);
		
		return camionRepository.save(camion);
	}

	@Override
	public Map<String, Double> calcularCapacidadTotalPorConductor() {
		// TODO Auto-generated method stub
		return null;
	}

}
