package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	public List<Tiquete> tiquetesUsados;
	public List<Tiquete> tiquetesSinUsar;
	
	public Cliente() {}
	
	public String getTipoCliente() {
		return null;
	}
	public String getIdentificador() {
		return null;
	}
	
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	
	public int calcularValorTotalTiquetes() {
		return 0;
	}
	
	public void usarTiquetes() {
		
	}

}
