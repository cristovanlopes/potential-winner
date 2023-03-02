package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double Percentage;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	public double IncreaseSalary(){
		return GrossSalary * Percentage + NetSalary();
	}
	public String toString() {
		
		return Name +", $ "+ IncreaseSalary();
	}
}
