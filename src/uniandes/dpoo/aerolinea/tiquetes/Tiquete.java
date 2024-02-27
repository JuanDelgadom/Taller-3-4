package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;


public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	public Cliente clienteComprador;
	public Vuelo vuelo;
	
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
		this.vuelo = vuelo;
		
		
	}



	public String getCodigo() {
		return codigo;
	}



	public int getTarifa() {
		return tarifa;
	}



	public boolean isUsado() {
		return usado;
	}



	public Cliente getClienteComprador() {
		return clienteComprador;
	}



	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void marcarComoUsado() {
		
	}
	

}