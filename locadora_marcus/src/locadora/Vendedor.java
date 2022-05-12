package locadora;

public class Vendedor {
	private String nome;
	private int cpf;
	
	public Vendedor (String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}
	
}
