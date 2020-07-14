package entities;

public class Funcionario {

	public String nome;
	public double salariobruto;
	public double impostos;

	public double salarioLiquido() {
		double salarioliquido = salariobruto - impostos;
		return salarioliquido;
	}

	public double aumentoSalario(double percentual) {
		double percent = (salariobruto * percentual) / 100;
		double salarionovo = salariobruto + percent;
		return salarionovo;
	}

}
