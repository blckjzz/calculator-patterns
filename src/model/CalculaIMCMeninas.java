package model;

public class CalculaIMCMeninas implements InterfaceCalculo {
	
	private int idade;
	
	public CalculaIMCMeninas(int idade) {
		this.idade = idade;
	}

	public String calcula(double peso, double altura) {
		double imc = peso / (altura * altura);
		PercentilMeninas percentil = new PercentilMeninas();
		return percentil.verificaPercentil(imc, idade);

	}
}
