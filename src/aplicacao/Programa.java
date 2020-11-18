package aplicacao;

import java.util.Date;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;
import servicos.CRUDCliente;
import servicos.CRUDProduto;

public class Programa {

	public static void main(String[] args) {
		
		
		CRUDProduto crudProduto = new CRUDProduto();
		CRUDCliente crudCliente = new CRUDCliente();
		
		Produto cama = new Produto("Cama de casal", 3000.00, 300);
		Produto travesseiro = new Produto("Travesseiro", 100.00, 300);
		Produto lencol = new Produto("Lençol", 60.00, 300);
		Produto edredon = new Produto("Edredon", 200.00, 300);
		
		crudProduto.cadastrarProduto(cama);
		crudProduto.cadastrarProduto(travesseiro);
		crudProduto.cadastrarProduto(lencol);
		crudProduto.cadastrarProduto(edredon);
		
		crudProduto.listarProdutos();
		
		System.out.println();
		
		Cliente julian = new Cliente("Julian Pierini", "julian@gmail.com", "senha123", "15642793756");
		Cliente rafaela = new Cliente("Rafaela", "rafaela@gmail.com", "senha9090", "17020568726");
		
		Pedido pedido1 = new Pedido(00001, new Date());
	
		
		pedido1.addProduto(cama);
		pedido1.addProduto(edredon);
		
		Pedido pedido2 = new Pedido(00002, new Date());
		
		pedido2.addProduto(cama);
		pedido2.addProduto(lencol);
		
		
		julian.addPedido(pedido1);
		julian.addPedido(pedido2);
		rafaela.addPedido(pedido2);
		
		crudCliente.cadastrarCliente(julian);
		crudCliente.listarClientes();
		
		

	}

}
