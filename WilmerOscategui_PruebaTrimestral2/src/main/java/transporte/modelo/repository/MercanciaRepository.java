package transporte.modelo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.Mercancia;
import transporte.modelo.enumerados.EstadoMercancia;


public interface MercanciaRepository extends MongoRepository<Mercancia, ObjectId>{
	
	
	public List<Mercancia> findByEstado(EstadoMercancia estado);
	public List<Mercancia> findByOrigen(String origen);
	public List<Mercancia> findByDestino(String destino);
	public List<Mercancia> findByPesoKgLessThan(double pesoKgMaximo);
	
	
}
