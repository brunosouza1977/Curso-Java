package aplication;

import java.util.Scanner;

import entities.Mercadorias;

public class TesteVetorProduto {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do vetor: ");
		int n = sc.nextInt();
		
		Mercadorias [] lista = new Mercadorias[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			
			lista[i] = new Mercadorias(nome, preco);
			
			
		}
		
		

	}

}
