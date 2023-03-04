package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	
	public  double noteEnd() {
		return (this.note1* 30 + this.note2 * 35 + this.note3 * 35) / 100;
		
	}
	public String passFailed() {
		if(noteEnd() > 60.00) {
			return noteEnd() + "\n"+ "PASS";
		}
		else {
			return noteEnd() + "\n" + "FAILED" + "\n" + "MISSING " + (60.00 - noteEnd() + " POINTS");
		}
		
		
	}
}
