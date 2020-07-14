package curso;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a senha de acesso: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida!!!");
			System.out.println("Informe a senha de acesso: ");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta!!!");

	}

}
