//exercicio 1 nelio alves
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter rectangle width and height:");
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		
		System.out.println("AREA = " + product);
		
		sc.close();
	}
}
