package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pedido {
	
	private int nPedido;
	private double precio;
	@Autowired
	private Cliente cliente;
	public int getnPedido() {
		return nPedido;
	}
	public void setnPedido(int nPedido) {
		this.nPedido = nPedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [nPedido=" + nPedido + ", precio=" + precio + ", cliente=" + cliente + "]";
	}
	
}
