package aplication;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta c1;

		System.out.println("CADASTRO DE CONTAS SANTANDER");
		System.out.println("Informe o nome do cliente da conta: ");
		String nome = sc.nextLine();
		System.out.println("Informe o n�mero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Existe saldo inicial de dep�sito? tecle(s)sim ou (n)n�o.");
		char resposta = sc.next().charAt(0);// SCANNER PARA VALORES TIPO CHAR

		if (resposta == 's') {

			System.out.println("Informe o valor do saldo inicial: ");
			double depositoinicial = sc.nextDouble();
			c1 = new Conta(nome, numero, depositoinicial);

		} else {
			c1 = new Conta(nome, numero);
		}

		System.out.println(c1);
		
		System.out.println("Informe valor a creditar: ");
		double depositoinicial = sc.nextDouble();
		
		c1.creditar(depositoinicial);
		System.out.println(c1);

	}

}
