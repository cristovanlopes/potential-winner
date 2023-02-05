import java.util.Scanner;

public class testeBee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    int n = scanner.nextInt();
	    int[] v = new int[n];
	    for (int i = 0; i < n; i++) {
	      v[i] = scanner.nextInt();
	    }

	    int max = 0;
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	      if (i == 0 || v[i] != v[i - 1]) {
	        count++;
	        max = Math.max(max, count);
	      } else {
	        count = 1;
	      }
	    }

	    System.out.println(max);
	    scanner.close();
	  }


}
