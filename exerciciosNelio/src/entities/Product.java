package entities;

public class Product {
	
	public double area;
	public double perimeter;
	public double diagonal;
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
	
	/*
	public String toString() {
		return name
	+ ", $ " 
	+ String.format("%.2f", price)
	+ ", " + quantity 
	+ " units, Total: $ "
	+  String.format("%.2f", totalValueInStock());
	}*/
}
