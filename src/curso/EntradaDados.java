package curso;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int x = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		int y = sc.nextInt();

		int soma = x + y;

		System.out.println("A soma dos valores é: " + soma);

	}

}
