package model;

public class CalculadoraIMC implements InterfaceCalculadora {

	public String calcularIMC(double altura, double peso, String sexo, int idade) {
		if (idade <= 0) {
			return "Valor Inv�lido";
			//throw new NumberFormatException("Valor inv�lido");
		} else {

			CalculadoraCreator calc = new CalculadoraCreator();
			InterfaceCalculo calculadora = calc.creator(sexo, idade);
			return calculadora.calcula(peso, altura);
		}
	}
}