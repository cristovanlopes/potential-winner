import java.io.IOException;

public class ex1097 {
	public static void main(String[] args) 
	{
		int i = 1, j = 7, contador=0, cont1 = 0;		
		while(cont1 < 15) 
		{
			
			while(contador < 3) {
				contador++;
				System.out.print("I="+i);
				System.out.println(" J="+j--);
				cont1++;
			}
			if(contador == 3) {
				
				j = 7;
				i= i+2;
				contador=0;
			}
			
		}
	}
}
