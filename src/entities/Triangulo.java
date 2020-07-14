package entities;

public class Triangulo {

	public double ladoa;
	public double ladob;
	public double ladoc;

	public double area() {

		double p = (ladoa + ladob + ladoc) / 2;
		double result = Math.sqrt(p * (p - ladoa) * (p - ladob) * (p - ladoc));
		return result;
	}
	
	

}
