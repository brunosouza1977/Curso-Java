package curso;

import java.util.Scanner;

public class TrabalhandoSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto: ");
		int cod = sc.nextInt();

		switch (cod) {
		case 1:
			System.out.println("Lanche: Cachorro quente");
			System.out.println("Informe a quantidade: ");
			int quant = sc.nextInt();
			double preco1 = 4.00;
			double total1 = quant * preco1;
			System.out.println("Total a pagar: ");
			System.out.printf("%.2f%n", total1);
			break;
		case 2:
			System.out.println("Lanche: X-salada");
			System.out.println("Informe a quantidade: ");
			int quant2 = sc.nextInt();
			double preco2 = 4.50;
			double total2 = quant2 * preco2;
			System.out.println("Total a pagar: ");
			System.out.printf("%.2f%n", total2);
			break;
		case 3:
			System.out.println("Lanche: X-bacon");
			System.out.println("Informe a quantidade: ");
			int quant3 = sc.nextInt();
			double preco3 = 5.00;
			double total3 = quant3 * preco3;
			System.out.println("Total a pagar: ");
			System.out.printf("%.2f%n", total3);
			break;
		case 4:
			System.out.println("Lanche: Torrada simples");
			System.out.println("Informe a quantidade: ");
			int quant4 = sc.nextInt();
			double preco4 = 2.00;
			double total4 = quant4 * preco4;
			System.out.println("Total a pagar: ");
			System.out.printf("%.2f%n", total4);
			break;
		case 5:
			System.out.println("Lanche: Refrigerante");
			System.out.println("Informe a quantidade: ");
			int quant5 = sc.nextInt();
			double preco5 = 1.50;
			double total5 = quant5 * preco5;
			System.out.println("Total a pagar: ");
			System.out.printf("%.2f%n", total5);
			break;

		default:
			System.out.println("Opção inválida");

		}

	}

}
