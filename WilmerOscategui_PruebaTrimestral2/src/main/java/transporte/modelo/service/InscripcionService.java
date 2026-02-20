package transporte.modelo.service;

import java.util.List;

import org.bson.types.ObjectId;

import transporte.modelo.entities.InscripcionTransporte;
import transporte.modelo.entities.Mercancia;
import transporte.modelo.enumerados.EstadoMercancia;

public interface InscripcionService {
	
	List<InscripcionTransporte> unaMercanciaConSuEstado(ObjectId idMercancia, EstadoMercancia estado);
	List<Mercancia> mercanciasPorConductor(ObjectId idConductor);
}
