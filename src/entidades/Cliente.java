package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
	
	private List<Pedido> pedidos = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, String senha, String cpf) {
		super(nome, email, senha, cpf);
	}
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removePedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

	@Override
	public String toString() {
		return "Cliente: Nome = " + getNome() + ", Email = " + getEmail() + ", Cpf = " + getCpf() + ", Pedidos: " + pedidos ;
	}


}