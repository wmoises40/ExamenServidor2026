package transporte.modelo.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import transporte.modelo.entities.Camion;
import transporte.modelo.enumerados.EstadoCamion;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CamionDto {
	
		private String id;
		private String conductorId;
		private String matricula;
		private String modelo;
		private double capacidadKg;
		private EstadoCamion estado;
		
		
	public static CamionDto converToCamionDto(Camion camion) {
		   return CamionDto.builder().capacidadKg(camion.getCapacidadKg())
				   				.estado(camion.getEstado())
				   				.id(camion.getId().toString())
				   				.matricula(camion.getMatricula())
				   				.modelo(camion.getModelo())
				   				.conductorId(camion.getId().toString())
				   				.build();
							
	}

}
