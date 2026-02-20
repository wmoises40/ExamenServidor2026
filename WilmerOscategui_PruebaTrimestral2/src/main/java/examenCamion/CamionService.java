package examenCamion;

import java.util.Map;

import org.bson.types.ObjectId;

import transporte.modelo.entities.Camion;

public interface CamionService {

	public Camion asignarConductor(ObjectId camionId, ObjectId conductorId);
	
	Map<String, Double> calcularCapacidadTotalPorConductor();
}
