package curso;

import java.util.Scanner;

public class TestandoVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int n = sc.nextInt();
		
		double [] vetor = new double[n];
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Insira o valor: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
			
			
		}
		System.out.println("A soma dos valores do vetor é: " + soma);
		double media = soma/n;
		System.out.println("A média dos valores do vetor é: " + media);
	}

}
