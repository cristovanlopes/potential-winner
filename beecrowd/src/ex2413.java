import java.util.Scanner;

public class ex2413 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = 0;
		int t2 = 0;
		int primeiroLink = 0;
		
		t = sc.nextInt();
		t2=t*2;
		primeiroLink = t2 * 2;
		System.out.println(primeiroLink);
		sc.close();
	}
}
