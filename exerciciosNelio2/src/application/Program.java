package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.print("Name: ");
		product.Name= sc.nextLine();

		System.out.print("Gross salary: ");
		product.GrossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		product.Tax = sc.nextDouble();
		
		System.out.println(String.format("Employee: " + product.Name + ", $  %.2f", product.NetSalary()));
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		product.Percentage = sc.nextDouble();
		
		System.out.println("Update data: " + product);
		
		
		
		
		
		//(String.format  %.2f )
		
		
		
		sc.close();
	}

}
