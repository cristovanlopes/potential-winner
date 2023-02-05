import java.util.Scanner;

public class ex2374 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Bomba = sc.nextInt();
		int diferenca = N - Bomba;
		System.out.println(diferenca);
		sc.close();
	}
}
