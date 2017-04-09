package model;

public class PercentilMeninas {

	public String verificaPercentil(double imc, int idade) {

		System.out.println("Idade:" + idade + "  // imc = " + imc);
		if (idade >= 2 && idade < 4) {
			if (imc <= 14.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 14.1 && imc < 15) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);

			} else if (imc > 14.8 && imc < 15.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 15.1 && imc < 17.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);

			} else if (imc > 17.9 && imc < 18.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);

			} else if (imc > 18.1 && imc < 18.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(90);
			} else if (imc > 18.2 && imc < 19.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc >= 19.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		if (idade >= 4 && idade < 6) {
			if (imc <= 13.7) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 13.7 && imc < 14.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 14.1 && imc < 15) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 15 && imc < 15.7) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 15.7 && imc < 16.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);

			} else if (imc > 16.1 && imc < 17) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 17 && imc < 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		if (idade >= 6 && idade < 8) {
			if (imc <= 13.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			} else if (imc > 13.2 && imc < 13.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);

			} else if (imc > 13.9 && imc < 14.5) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);

			} else if (imc > 14.5 && imc < 14.7) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 14.7 && imc < 15.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			} else if (imc > 15.9 && imc < 17.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 17.1 && imc < 17.3) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(90);
			} else if (imc > 17.3 && imc < 18.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 18.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}

		if (idade >= 8 && idade < 10) {

			if (imc <= 13.3) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);

			}
			if (imc > 13.3 && imc < 13.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 13.8 && imc < 14.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(10);
			} else if (imc > 14.1 && imc < 14.6) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);

			} else if (imc > 14.6 && imc < 15) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 15 && imc < 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);

			} else if (imc > 18 && imc < 18.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 18.2 && imc < 19.6) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 19.6) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		if (idade >= 10 && idade < 12) {
			if (imc <= 14) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);

			}
			if (imc > 14 && imc < 14.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 14.4 && imc < 14.5) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(10);
			} else if (imc > 14.5 && imc < 15.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);

			} else if (imc > 15.8 && imc < 16.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 16.2 && imc < 19.9) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);

			} else if (imc > 19.9 && imc < 20) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);

			} else if (imc > 20 && imc < 23.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);

			} else if (imc > 23.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);

			}

		}

		if (idade >= 12 && idade < 14) {
			if (imc <= 15.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);

			}
			if (imc > 15.2 && imc < 15.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(10);
			}
			if (imc > 15.2 && imc < 16) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			}
			if (imc > 16 && imc < 21.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			}
			if (imc > 21.1 && imc < 21.3) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			}
			if (imc > 21.3 && imc < 25.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);

			}
			if (imc > 25.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		if (idade >= 14 && idade < 16) {

			if (imc <= 15.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);

			}

			else if (imc > 15.1 && imc < 16.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 16.1 && imc < 16.5) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 16.5 && imc < 17.5) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 17.5 && imc < 23) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			} else if (imc > 23 && imc < 23.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 23.2 && imc < 27) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 27) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}
		}

		if (idade >= 16 && idade < 18) {
			if (imc <= 17.5) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 17.5 && imc < 17.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 17.8 && imc < 19.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 19.8 && imc < 20.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			} else if (imc > 20.1 && imc < 24.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 24.4 && imc < 30) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 30) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}

		if (idade >= 18 && idade < 19) {

			if (imc <= 18) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(5);
			} else if (imc > 18 && imc < 18.1) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(10);
			} else if (imc > 18.1 && imc < 18.8) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			} else if (imc > 18.8 && imc < 19.6) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
			} else if (imc > 19.6 && imc < 23.4) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			} else if (imc > 23.4 && imc < 25.3) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			} else if (imc > 25.3 && imc < 30.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			} else if (imc > 30.2) {
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}

		}
		if(idade >= 19 && idade < 20){
			
			if(imc <=18.5){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(3);
			}
			else if(imc > 18.5 && imc <18.6){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(25);
			}
			
			else if(imc > 18.6 && imc <19.3){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(50);
				
			}
			
			else if(imc > 19.3 && imc < 20){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(75);
			}
			else if(imc > 20 && imc < 26.2){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(85);
			}
			else if(imc > 26.2 && imc < 31.3 ){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(95);
			}
			else if(imc > 31.3){
				return RecebePercentilRetornaPeso.recebePercentilRetornaPeso(97);
			}
		}

		return "valor inválido";
	}

}
