package locadora;

public class Teste {

	public static void main(String[] args) {
		Carro C1 = new Carro("Chevrolet", "Corsa", 2012, "Cinza", "ABC-1234", 30000);
		
		System.out.println("Modelo: " + C1.getModelo() + "\nMarca: " + C1.getMarca() + "\nCor: " + C1.getCor() + "\nAno: " + C1.getAno() + "\nPreço: " + C1.getPreco());
	}

}
