package entities;

public class Conta {

	private String nome;
	private int numero;
	private double saldo;

	public Conta(String nome, int numero, double depositoinicial) {
		
		this.nome = nome;
		this.numero = numero;
		creditar(depositoinicial);
	}

	public Conta(String nome, int numero) {

		this.nome = nome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {//N�MERO DA CONTA � FIXO, N�O ALTERA, POR ISSO S� PRECISAMOS DO M�TODO GET
		return numero;
	}


	public double getSaldo() {//SALDO DA CONTA S� PODER� SER ALTERADO COM OS M�TODOS DEBITAR E CREDITAR
		return saldo;
	}


	public double debitar(double valor) {

		saldo = saldo - valor+ 5.00;
		return saldo;

	}

	public double creditar(double valor) {

		saldo = saldo + valor;
		return saldo;

	}
	
	public String toString() {
		return "Cliente da conta: "
				+ nome
				+ " N�mero da conta: "
				+ numero
				+ " Saldo: "
				+ String.format("%.2f", saldo);
	}
}
