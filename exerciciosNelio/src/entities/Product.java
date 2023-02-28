//exercicio 1 nelio alves
package entities;

public class Product {
	
	public double width;
	public double height;
	
	
	public double calculateArea() {
		return (width * height);
	}
	public double calculatePerimeter() {
		return 2*width + 2*height;
	}
	
	public double calculateDiagonal() {
		return  Math.sqrt(width*width + height*height);
	}
	

	public String toString() {		
		return String.format("%.2f", calculateArea()) + "\n"
				+ "PERIMETER = " 
				+ String.format("%.2f", calculatePerimeter()) + "\n"
				+ "DIAGONAL = " + String.format("%.2f", calculateDiagonal());
	}
	
}
