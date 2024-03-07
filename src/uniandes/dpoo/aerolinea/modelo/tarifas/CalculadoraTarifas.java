package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {

	public double IMPUESTO = 0.28;
	
	public CalculadoraTarifas() {
		
	}
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase(vuelo, cliente);
		int descuento = (int)calcularPorcentajeDescuento(cliente);
		int impuesto = calcularValorImpuestos(costoBase);
		return costoBase - descuento + impuesto;
		
	}
		
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected  int calcularDistanciaVuelo(Ruta ruta) {
		Aeropuerto aeropuerto1 = ruta.getOrigen();
		Aeropuerto aeropuerto2 = ruta.getDestino();
		return Aeropuerto.calcularDistancia(aeropuerto1, aeropuerto2);
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return (int)(costoBase * IMPUESTO);
	}
	
}
