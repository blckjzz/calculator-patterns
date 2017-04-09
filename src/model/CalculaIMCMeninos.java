package model;

public class CalculaIMCMeninos implements InterfaceCalculo {
	
	private int idade;
	public CalculaIMCMeninos(int idade){
		this.idade = idade;
	}
	
	public String calcula(double peso, double altura) {
		double imc = peso / (altura * altura);
		PercentilMeninos percentil = new PercentilMeninos();
		return percentil.verificaPercentil(imc, idade);
		
	}

}
