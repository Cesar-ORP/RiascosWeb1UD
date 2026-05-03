package co.edu.udistrital.model;

import java.io.Serializable;

//Cesar Osneider Riascos Perea

public class AspiranteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroIde;
	private String nombre;
	private String apellidos;
	private String  correo;
	private String carrera;
	
	
	public AspiranteDTO() {
		
	}


	


	public AspiranteDTO(String numeroIde, String nombre, String apellidos, String correo, String carrera) {
		super();
		this.numeroIde = numeroIde;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.carrera = carrera;
	}





	public String getNumeroIde() {
		return numeroIde;
	}


	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}





	public String getCarrera() {
		return carrera;
	}

	
	


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	
	
	
	
}
