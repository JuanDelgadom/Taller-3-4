package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;

public class Vuelo {
	private String fecha;
	public Avion avion;
	public Ruta ruta;
	public Map<String, Tiquete> tiquetes; 
	
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
		
		return tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadoras, int cantidad) throws VueloSobrevendidoException {
		int tarifa = calculadoras.calcularTarifa(this, cliente);
		int valor = 0;
		if ((cantidad + tiquetes.size()) <= avion.getCapacidad()) {
			for(int i = 0; i<= cantidad; i++) {
				Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifa);
				tiquetes.put(tiquete.getCodigo(), tiquete);
				valor = i*tarifa;
			}
		} else {
			throw new VueloSobrevendidoException(this);
		}
		
		return valor;
	}

	public boolean equals(Object obj) {
		return false;
	}
	


}
