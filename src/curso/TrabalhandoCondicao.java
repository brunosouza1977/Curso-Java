package curso;

import java.util.Scanner;

public class TrabalhandoCondicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int x = sc.nextInt();
		
		if (x%2 ==0) {
			System.out.println("N�mero par");
			int soma = x + 1000;
			System.out.println("Soma: " + soma);
		}else {
			System.out.println("N�mero �mpar");
		}
		

	}

}
