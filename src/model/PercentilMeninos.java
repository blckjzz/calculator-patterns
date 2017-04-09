package model;

public class PercentilMeninos {

	public String verificaPercentil(double imc, int idade) {

		switch (idade) {
		case 2:
		case 3:
			// Menor ou igual a 14.2 percentil = 3
			// maior que 14.2 a 14.4 percentil = 5
			// maior que 14.4 e menor que 14.8 percentil = 10
			// maior que 14.8 e menor que 15.4 percentil = 25
			// maior que 15.4 e menor que 16 percentil = 50
			// maior que 16 e menor que 16.8 = percentil = 75
			// maior que 16.8 menor que 17.4 = percentil = 85
			// maior que 17.4 menor que 17.8 = 90
			// maior que 17.8 menor que 18.4 = 95
			// maior que 18.4 = 97

			if (imc <= 14.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14.2 && imc < 14.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 14.4 && imc < 14.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(10);
			} else if (imc > 14.8 && imc < 15.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 15.4 && imc < 16) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 16 && imc < 16.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			} else if (imc > 16.8 && imc < 17.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 17.4 && imc < 17.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(90);
			} else if (imc > 17.8 && imc < 18.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 18.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

			break;
		case 4:

			break;
		case 5:

			break;

		case 6:

			break;

		case 7:

			break;

		case 8:

			break;

		case 9:

			break;

		case 10:

			break;

		case 11:

			break;

		case 12:

			break;

		case 13:

			break;

		case 14:

			break;

		case 15:

			break;

		case 16:

			break;

		case 17:

			break;

		case 18:

			break;

		case 19:

			break;
		case 20:

			break;
		}

		throw new IllegalAccessError("");

	}
}
