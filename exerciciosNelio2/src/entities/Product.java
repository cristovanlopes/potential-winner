package entities;

public class Product {
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double Percentage;
	public double SalaryTax;
	
	public  double NetSalary() {
		return this.GrossSalary - this.Tax;
	}
	
	public double IncreaseSalary() {
	    return NetSalary() + (this.Percentage / 100 * this.GrossSalary);
	}

	
	public String toString() {
		
		return (String.format( Name+", $ %.2f", IncreaseSalary()));
	}
	
	
}