package aplication;

import java.util.Scanner;

import entities.Funcionario;

public class Contabilidade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		
		System.out.println("Nome do funcion�rio: ");
		f1.nome = sc.nextLine();
		System.out.println("Sal�rio Bruto: ");
		f1.salariobruto = sc.nextDouble();
		System.out.println("Impostos: ");
		f1.impostos = sc.nextDouble();
		
		f1.salarioLiquido();
		System.out.printf("Sal�rio L�quido: %.2f%n", f1.salarioLiquido());
		
		
		double novosalario = f1.aumentoSalario(15);
		System.out.printf("Novo sal�rio bruto ap�s reajuste: %.2f%n", novosalario);
		
		

	}

}
