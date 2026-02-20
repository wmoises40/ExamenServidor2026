package transporte.modelo.service;

import java.util.List;

import org.bson.types.ObjectId;

import transporte.modelo.entities.Camion;

public interface CamionService {
	/*
	 * Obtener todas las mercancias disponibles pra transporte(estado pendiente)
	 * Listar las inscripciones a una mercancia con su estado
	 * Mostrar mercancias transportadas por un conductor especifico
	 * Obtener incidencias activas registradas por un conductor en el ultimo mes
	 * Buscar mercancias por origen , destino o peso máximo
	 * 
	 */
	
	List<Camion> conductorEstadoDisponible(ObjectId conductorid);
	List<Camion> findAll();
	

}
