package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Triangulo x = new Triangulo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a medida do lado A: ");
		x.ladoa = sc.nextDouble();

		System.out.println("Digite a medida do lado B: ");
		x.ladob = sc.nextDouble();

		System.out.println("Digite a medida do lado C: ");
		x.ladoc = sc.nextDouble();

		x.area();
		System.out.printf("A área do triângulo é: %.2f%n ", x.area());

	}

}
