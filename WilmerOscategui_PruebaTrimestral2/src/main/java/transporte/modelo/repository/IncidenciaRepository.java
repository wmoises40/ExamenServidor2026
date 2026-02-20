package transporte.modelo.repository;

import java.time.LocalDate;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.Incidencia;
import transporte.modelo.enumerados.EstadoIncidencia;



public interface IncidenciaRepository extends MongoRepository<Incidencia, ObjectId>{
	/*
	 *  * Obtener incidencias activas registradas por un conductor en el ultimo mes
	 */
	
	public List<Incidencia> 
		findByEstadoAndCamionIdAndFechaAfter
		(EstadoIncidencia estado,ObjectId camionId,LocalDate fecha);
}
