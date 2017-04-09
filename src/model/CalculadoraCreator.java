package model;

public class CalculadoraCreator {

	public InterfaceCalculo creator(String sexo, int idade) {
		switch (sexo) {
		case "Masculino":
			if(idade < 20){
				return new CalculaIMCMeninos(idade);
			}else if(idade > 65){
				return new CalculaIMCHomensAcima65();
			}
		case "Feminino":
			if(idade < 20){
				return new CalculaIMCMeninas(idade);
			}else if(idade > 65){
				return new CalculaIMCMulheresAcima65();
			}
		default:
			return new CalculaIMCAdultoMenor65Anos();
		}

	}

}
