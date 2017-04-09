package model;

public class CalculaIMCHomensAcima65 implements InterfaceCalculo {

	public String calcula(double peso, double altura) {

		double imc = peso / (altura * altura);
//		System.out.println("Imc do tio" + imc);
		if (imc < 22) {
			return "Baixo peso";
		} else if ((imc >= 22) && (imc <= 27)) {
			return "Peso normal";
		} else if ((imc >= 27.1) && (imc <= 30)) {
			return "Sobrepeso";
		} else if ((imc >= 30.1) && (imc <= 35)) {
			return "Obesidade grau I";
		} else if ((imc >= 35.1) && (imc < 40)) {
			return "Obesidade grau II";
		} else if (imc >= 40) {
			return "Obesidade grau III";
		}
		throw new NumberFormatException("Valor não coberto");
	}

}
