package aplication;

import java.util.Scanner;

import entities.Retangulo;

public class Calculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Retangulo r1 = new Retangulo();

		System.out.println("Informe a base do retângulo: ");
		r1.base = sc.nextDouble();

		System.out.println("Informe a base do retângulo: ");
		r1.altura = sc.nextDouble();

		r1.area();
		r1.perimetro();
		r1.diagonal();

		System.out.printf("O valor da área é: %.2f%n ", r1.area());
		System.out.printf("O valor do perímetro é: %.2f%n ", r1.perimetro());
		System.out.printf("O valor da diagonal é: %.2f%n ", r1.diagonal());

	}

}
