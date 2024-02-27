package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.*;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

public class Vuelo {
	private String fecha;
	public Avion avion;
	public Ruta ruta;
	public Map<Tiquete, Tiquete> tiquetes; 
	
	public Vuelo(Ruta ruta, String fecha, Avion avion){
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	
	
	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Ruta getRuta() {
		return ruta;
	}
	
	public Collection<Tiquete> getTiquetes(){
		return null;
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadoras, int cantidad) {
		return 0;
	}

	public boolean equals(Object obj) {
		return false;
	}
	


}
