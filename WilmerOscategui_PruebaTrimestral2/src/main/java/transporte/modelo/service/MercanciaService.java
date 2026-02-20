package transporte.modelo.service;

import java.util.List;

import org.bson.types.ObjectId;

import transporte.modelo.entities.Mercancia;

public interface MercanciaService {
	
	
	
	List<Mercancia> estadoPendiente();
	
	List<Mercancia> porOrigen(String origen);
	List<Mercancia> porDestino(String destino);
	List<Mercancia> porPesoMaximo(double peso);
	
	
	
	
}
