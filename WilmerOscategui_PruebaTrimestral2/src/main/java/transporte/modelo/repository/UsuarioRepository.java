package transporte.modelo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import transporte.modelo.entities.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId>{

}
