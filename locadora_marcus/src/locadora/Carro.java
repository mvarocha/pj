package locadora;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String placa;
	private float preco;
	
	public Carro (String marca, String modelo, int ano, String cor, String placa, float preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getCor() {
		return cor;
	}

	public String getPlaca() {
		return placa;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

	
	
}
