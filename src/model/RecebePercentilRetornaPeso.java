package model;

public class RecebePercentilRetornaPeso {
	/*
	 * Baixo peso = IMC abaixo do percentil 10. Peso normal = IMC entre o
	 * percentil 15 e 85 Sobrepeso = IMC entre o percentil 85 e 95 Obesidade =
	 * IMC acima do percentil 95
	 */

	public static String recebePercentilRetornaPeso(int percentil) {
		System.out.println("Percentil:" + percentil);
		if (percentil <= 10) {
			return "Baixo Peso";
		} else if (percentil >= 15 && percentil <= 85) {
			return "Peso Normal";
		} else if (percentil > 85 && percentil <= 95) {
			return "Sobrepeso";
		} else if (percentil > 95) {
			return "Obesidade";
		}
		return null;
	}
}
