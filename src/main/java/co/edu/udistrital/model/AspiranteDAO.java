package co.edu.udistrital.model;


import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

//Cesar Osneider Riascos Perea

@Named("AspDao")
@RequestScoped
public class AspiranteDAO {
	public static ArrayList<AspiranteDTO> aspirantes = new ArrayList<AspiranteDTO>();
	public static ArrayList<String> carreras = new ArrayList<String>();
	
	public void llenar_carreras() {
		carreras.clear();
		carreras.add("Ingenieria en sistemas");
		carreras.add("Ingenieria electronica");
		carreras.add("Ingenieria industrial");
		carreras.add("Ingenieria Electrica");
		
		
	}

	public ArrayList<AspiranteDTO> getAspirantes() {
		return aspirantes;
	}

	public ArrayList<String> getCarreras() {
		return carreras;
	}
	
	
}
