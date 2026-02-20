package examenMercancia;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.Mercancia;

public interface MercanciaRepository extends MongoRepository<Mercancia, ObjectId>{
	
	List<Mercancia> findByDistanciaTotalGreaterThan(double distancia);
}
