package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.*;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected double DESCUENTO_PEQ = 0.2;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		Ruta ruta = vuelo.getRuta();
		int distancia = calcularDistanciaVuelo(ruta);
		String tipoCliente = cliente.getTipoCliente();
		if(tipoCliente.compareTo("Corporativo") == 0)
			return distancia * COSTO_POR_KM_CORPORATIVO;
		else if(tipoCliente.compareTo("Natural") == 0)
			return distancia * COSTO_POR_KM_NATURAL;
		return 0;
	}
	
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		String tipoCliente = cliente.getTipoCliente();
		if(tipoCliente.compareTo("Corporativo") == 0) 
			return 1;
		else
			return 0;
	}

}
