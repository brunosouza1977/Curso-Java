package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotal() {

		double valor = quantidade * preco;
		return valor;
	}

	public void acrescentar(int quantidade) {

		this.quantidade = this.quantidade + quantidade;

	}

	public void remover(int quantidade) {

		this.quantidade = this.quantidade - quantidade;

	}
}
