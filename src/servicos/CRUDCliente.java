package servicos;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;


public class CRUDCliente {
	
	private List<Cliente> clientes = new ArrayList<>();
	
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public void listarClientes() {
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}

}
