package transporte.modelo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.Camion;
import transporte.modelo.enumerados.EstadoCamion;

public interface CamionRepository extends MongoRepository<Camion, ObjectId>{
	
	/*
	 * 
	 * 
	 * Consultar los camiones de un conductor que estan disponibles
	 * List<Camion> conductorEstadoDisponible(ObjectId idUsuario);
	 */
	
	public List<Camion> findByConductorIdAndEstado(ObjectId conductorId, EstadoCamion estadoCamion);
	
	

}
