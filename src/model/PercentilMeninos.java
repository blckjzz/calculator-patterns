package model;

public class PercentilMeninos {

	public String verificaPercentil(double imc, int idade) {

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
			return null;
	}

}
