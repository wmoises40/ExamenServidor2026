package transporte.modelo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.ser.std.ToStringSerializer;
import transporte.modelo.enumerados.EstadoCamion;
import transporte.modelo.enumerados.EstadoIncidencia;
import transporte.modelo.enumerados.TipoIncidencia;

@Document(collection = "incidencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Incidencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId id;
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId camionId;
	private String descripcion;
	private LocalDate fecha;
	private TipoIncidencia tipo;
	private EstadoIncidencia estado;
}
