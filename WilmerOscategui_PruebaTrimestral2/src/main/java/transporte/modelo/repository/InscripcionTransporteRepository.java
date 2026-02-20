package transporte.modelo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.InscripcionTransporte;
/*
 * List<Mercancia> mercanciasPorConductor(ObjectId idConductor);
 */

public interface InscripcionTransporteRepository extends MongoRepository<InscripcionTransporte, ObjectId>{

}
