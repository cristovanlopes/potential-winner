
public class TestaConvesao {

		public static void main(String[] args) {
			double salario = 1270.50;
			int valor = (int) salario;
			
			System.out.println(valor);
			long numeroGrande = 32432423523L;
			System.out.println(numeroGrande);
			
			
			
			//E se o número for maior do que 64bits, 
			//um número gigantesco? Daí, não serão usados 
			//tipos primitivos, ou estas variáveis.
			//Podem ser objetos, e então usaremos bibliotecas.
			double valor1 = 0.2;
			double valor2 = 0.1;
			double total = valor1+valor2;
			System.out.println(total);
			
			/*Para o Java, 3.14 é um double com 64bits. 
			 * É um valor que cabe em um tipo flutuante com 32bits? 
			 * Não, e informações podem ser perdidas. Neste caso, 
			 * usa-se o casting, o que seria estranho, ou se indica 
			 * que este literal, o valor 3.14, é um float, colocando-se
			 *  "f" no fim:*/
			float pontoFlutuante = 3.14f;
			System.out.println(pontoFlutuante);
		}
}
