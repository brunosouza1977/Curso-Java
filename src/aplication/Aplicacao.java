package aplication;

import java.util.Scanner;

import entities.Product;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		System.out.println("DADOS DO PRODUTO:");
		
		product.setName("XBOX ONE X");
		System.out.println("Nome do produto: " + product.getName());
		
		product.setPrice(2000);
		System.out.println("Nome do produto: " + product.getPrice());
		
		
		
		
		

	}

}
