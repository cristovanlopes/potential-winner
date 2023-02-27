package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		double area = product.calculateArea();
		
		DecimalFormat df = new DecimalFormat("#.00");
		String formattedArea = df.format(area);
		
		System.out.printf("AREA = %s\n", formattedArea);
		
		
		
		
		
		
		sc.close();
	}
}
