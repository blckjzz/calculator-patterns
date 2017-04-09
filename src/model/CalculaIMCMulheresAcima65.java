package model;

public class CalculaIMCMulheresAcima65 implements InterfaceCalculo {

	@Override
	public String calcula(double peso, double altura) {
		double imc = peso / (altura * altura);
//		System.out.println("imc da tia" + imc);
		if (imc < 22) {
			return "Baixo peso";
		} else if ((imc >= 22) && (imc <= 27)) {
			return "Peso normal";
		} else if ((imc >= 27.1) && (imc <= 32)) {
			return "Sobrepeso";
		} else if ((imc >= 32.1) && (imc <= 37)) {
			return "Obesidade grau I";
		} else if ((imc >= 37.1) && (imc < 42)) {
			return "Obesidade grau II";
		} else if (imc >= 42) {
			return "Obesidade grau III";
		}
		throw new NumberFormatException("Valor não coberto");
	}

}
