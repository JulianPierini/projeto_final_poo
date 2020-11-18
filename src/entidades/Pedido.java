package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Integer id;
	private Date data;
	
	private List<Produto> produtos = new ArrayList<>();
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date data) {
		this.id = id;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

	@Override
	public String toString() {
		return "Pedido - id:" + id + ", data:" + sdf1.format(data) + ", produtos:" + produtos;
	}
	
	
}
