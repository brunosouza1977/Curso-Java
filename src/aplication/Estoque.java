package aplication;

import java.util.Scanner;

import entities.Produto;

public class Estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto p1 = new Produto();

		System.out.println("Digite o nome do produto: ");
		p1.nome = sc.nextLine();
		System.out.println("Digite o preço: ");
		p1.preco = sc.nextDouble();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		p1.quantidade = quantidade;
		
		

		p1.valorTotal();
		System.out.println("Nome do produto: " + p1.nome);
		System.out.println("Quantidade: " + p1.quantidade + " Unidades");
		System.out.printf("Preço unitário: %.2f%n ", p1.preco);
		System.out.printf("Valor total: %.2f%n ", p1.valorTotal());

		
		p1.acrescentar(quantidade);
		System.out.println("Quantidade em estoque: " + quantidade);
		
		System.out.println("Digite a remover: ");
		int quantidaderemovida = sc.nextInt();
		p1.quantidade = quantidaderemovida;
		p1.remover(quantidade);
		System.out.printf("Quantidade em estoque: " + quantidaderemovida);

	}

}
