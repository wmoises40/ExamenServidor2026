package transporte.modelo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.ser.std.ToStringSerializer;
import transporte.modelo.enumerados.EstadoInscripcion;
import transporte.modelo.enumerados.EstadoMercancia;

@Document(collection = "mercancias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mercancia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;
	private String descripcion;
	private String origen;
	private String destino;
	private double pesoKg;
	private LocalDate fechaEntregaEstimada;
	private EstadoMercancia estado;
	
	
	
}
