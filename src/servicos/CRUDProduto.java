package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class CRUDProduto {

	private List<Produto> produtos = new ArrayList<>();

	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}

	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}

	public void listarProdutos() {
		for (Produto p : produtos) {
			System.out.println(p);
		}
	}

}
