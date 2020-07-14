package curso;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código do combustível, sendo 1-Gasolina / 2- Alcool / 3-Diesel: ");
		int cod = sc.nextInt();
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;

		while (cod <= 3 || cod != 4) {
			if (cod == 1) {
				soma1 = soma1 + 1;
				System.out.println("Gasolina: " + soma1);
				System.out.println("Informe o código do combustível, sendo 1-Gasolina / 2- Alcool / 3-Diesel: ");
				cod = sc.nextInt();

			} else if (cod == 2) {
				soma2 = soma2 + 1;
				System.out.println("Alcool: " + soma2);
				System.out.println("Informe o código do combustível, sendo 1-Gasolina / 2- Alcool / 3-Diesel: ");
				cod = sc.nextInt();
			} else if (cod == 3) {
				soma3 = soma3 + 1;
				System.out.println("Diesel: " + soma3);
				System.out.println("Informe o código do combustível, sendo 1-Gasolina / 2- Alcool / 3-Diesel: ");
				cod = sc.nextInt();

			} else{
				System.out.println("Opção inválida, tecle: 1, 2, 3 ou 4 para sair!!!");
				break;
			
			}

		}
		System.out.println("Muito Obrigado!!!");
	}

}
