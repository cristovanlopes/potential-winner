
public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10; multiplicador++){
			for(int contador = 1; contador <=10; contador++) {
				System.out.print(multiplicador*contador);
				System.out.print(" ");
			}
			System.out.println();
		}
		int[][] tabuada = new int[10][10];
		for(int i = 1; i <=10; i++){
		    for(int j = 1; j <=10; j++) {
		       tabuada[i-1][j-1] = i*j;}}
	}
	
	
}
