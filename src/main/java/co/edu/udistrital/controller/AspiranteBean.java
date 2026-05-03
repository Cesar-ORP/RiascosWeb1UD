package co.edu.udistrital.controller;

import java.io.Serializable;

import co.edu.udistrital.model.AspiranteDAO;
import co.edu.udistrital.model.AspiranteDTO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//Cesar Osneider Riascos Perea

@Named("Asp")
@SessionScoped
public class AspiranteBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private AspiranteDTO dto;

	public AspiranteDTO getDto() {
		return dto;
	}

	public void setDto(AspiranteDTO dto) {
		this.dto = dto;
	}
	
	public String registrarAspirante() {
		AspiranteDTO nuevo = new AspiranteDTO(
				 	dto.getNumeroIde(),
			        dto.getNombre(),
			        dto.getApellidos(),
			        dto.getCorreo(),
			        dto.getCarrera());
		
		System.out.println("Aspirante: "+nuevo.getNombre());
		AspiranteDAO.aspirantes.add(nuevo);
		return "salida.xhtml?faces-redirect=true";
	}
}
