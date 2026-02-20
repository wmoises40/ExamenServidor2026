package transporte.modelo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import transporte.modelo.entities.Mercancia;
import transporte.modelo.enumerados.EstadoMercancia;
import transporte.modelo.repository.MercanciaRepository;

@Service
public class MercanciaServiceImplMongo implements MercanciaService{
	
	@Autowired
	private MercanciaRepository mercanciaRepository;

	@Override
	public List<Mercancia> estadoPendiente() {
		// TODO Auto-generated method stub
		return mercanciaRepository.findByEstado(EstadoMercancia.PENDIENTE);
	}

	

	@Override
	public List<Mercancia> porOrigen(String origen) {
		// TODO Auto-generated method stub
		return mercanciaRepository.findByOrigen(origen);
	}

	@Override
	public List<Mercancia> porDestino(String destino) {
		// TODO Auto-generated method stub
		return mercanciaRepository.findByDestino(destino);
	}

	@Override
	public List<Mercancia> porPesoMaximo(double peso) {
		// TODO Auto-generated method stub
		return mercanciaRepository.findByPesoKgLessThan(peso);
	}

	
	

}
