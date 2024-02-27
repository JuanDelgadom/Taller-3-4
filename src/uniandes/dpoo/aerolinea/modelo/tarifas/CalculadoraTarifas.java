package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {

	public double IMPUESTO = 0.28;
	
	public void calcularTarifa(Vuelo vuelo, Cliente cliente) {}
		
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	protected  int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return 1;
	}
	
}
