package model;

public class PercentilMeninos {

	public String verificaPercentil(double imc, int idade) {

		// Baixo peso = abaixo do percentil 10.
		// Peso normal = entre o percentil 15 e 85
		// Sobrepeso = entre o percentil 85 e 95
		// Obesidade = acima do percentil 95

		System.out.println("Idade:" + idade + " imc = " + imc);

		if (idade >= 2 && idade < 4) {
			if (imc <= 15) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 15 && imc < 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 18 && imc < 19.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 19) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		} else if (idade >= 4 && idade < 6) {
			if (imc <= 14.6) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14.6 && imc < 17) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 17 && imc < 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		} else if (idade >= 6 && idade < 8) {
			if (imc <= 14) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14 && imc < 17.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 17.2 && imc < 18.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 18.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}
		} else if (idade >= 8 && idade < 10) {
			if (imc <= 14.1) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14.1 && imc < 18) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 18 && imc < 20) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 20) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}
		} else if (idade >= 19 && idade < 20) {
			if (imc <= 19) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 19 && imc < 20) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 20 && imc < 21) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 21 && imc < 23) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 23 && imc < 25.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 25.2 && imc < 27) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(90);
			} else if (imc > 27 && imc < 28.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 28.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		return null;
	}
}
