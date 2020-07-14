package entities;

public class Retangulo {

	public double altura;
	public double base;

	public double area() {

		double area = base * altura;
		return area;
	}

	public double perimetro() {

		double perimetro = 2 * (base + altura);
		return perimetro;
	}

	public double diagonal() {

		double diagonal = Math.pow(base, 2)+ Math.pow(altura, 2);
		return diagonal;

	}

}
