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
		} else if (idade >= 10 && idade < 12) {
			if (imc <= 14.4) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14.4 && imc < 19.1) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 19.1 && imc < 22.1) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 22.1) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		} else if (idade >= 12 && idade < 14) {
			if (imc <= 15.2) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 15.2 && imc < 21.3) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 21.3 && imc < 25.2) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 25.2) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		} else if (idade >= 14 && idade < 16) {
			if (imc <= 16.5) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 16.5 && imc < 22.5) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 22.5 && imc < 26.1) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 26.1) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}
		} else if (idade >= 16 && idade < 18) {
			if (imc <= 18) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 18 && imc < 24.2) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 24.2 && imc < 27.4) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 27.4) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		} else if (idade >= 18 && idade < 20) {
			if (imc < 19) {
				// Baixo peso = abaixo do percentil 10.
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc >19 & imc < 26) {
				// Peso normal = entre o percentil 15 e 85
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 26 && imc < 29.3) {
				// Sobrepeso = entre o percentil 85 e 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(86);
			} else if (imc > 29.3) {
				// Obesidade = acima do percentil 95
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		throw new IllegalAccessError("");
	}
}
