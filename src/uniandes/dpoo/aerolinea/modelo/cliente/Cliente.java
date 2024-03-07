package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Collection;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public abstract class Cliente {
	
	public List<Tiquete> tiquetesUsados;
	public List<Tiquete> tiquetesSinUsar;
	
	public Cliente() {}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		int precio = 0;
		for(Tiquete tiquete: tiquetesSinUsar) {
			precio += tiquete.getTarifa();
		}
		for(Tiquete tiquete: tiquetesUsados) {
			precio += tiquete.getTarifa();
		}
		return precio;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		Collection<Tiquete> tiquetes = vuelo.getTiquetes();
		for(Tiquete tiquete: tiquetes) {
			if(tiquetesSinUsar.contains(tiquete)) {
				tiquetesSinUsar.remove(tiquete);
				tiquetesUsados.add(tiquete);
			}
		}
	}

}
