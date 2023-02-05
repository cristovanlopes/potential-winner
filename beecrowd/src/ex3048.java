import java.util.Scanner;

public class ex3048 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int vi = 0;
		int v2=0;
		int v1=0;
		contador = sc.nextInt();
		
		vi = sc.nextInt();
		if(vi==2) {
			v2++;
		}else
		v1++;
		for (int i = 0; i < contador; i++) {
			vi = sc.nextInt();
			if(vi==2) {
				v2++;
			}else
			v1++;
			
			
		}
		System.out.println(Math.max(v1, v2));
		sc.close();
	}
}
