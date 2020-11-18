package entidades;

public class Colaborador extends Usuario {
	
	private String cargo;
	
	public Colaborador() {
		
	}

	public Colaborador(String nome, String email, String senha, String cpf, String cargo) {
		super(nome, email, senha, cpf);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
	
	

}
