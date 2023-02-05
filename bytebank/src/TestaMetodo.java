
public class TestaMetodo { 
	 public static void main (String[] args) {
	        Conta contaDoPaulo = new Conta();
	        contaDoPaulo.saldo =100; 
	        contaDoPaulo.deposita(50);
	        System.out.println("Saldo da conta do Paulo: " + contaDoPaulo.saldo);
	        System.out.println(" ");

	        boolean conseguiuRetirar = contaDoPaulo.saca(20);
	        System.out.println("Saldo da conta do Paulo após saque: " + contaDoPaulo.saldo);
	        System.out.println("Conseguiu retirar? " + conseguiuRetirar);
	        System.out.println(" ");
	        
	        Conta contaDaMarcela = new Conta();
	        contaDaMarcela.deposita(1000);
	        
	        if(contaDaMarcela.transfere(3000, contaDoPaulo)) {
	        	System.out.println("transferencia com sucesso");
	        } else {
	        	System.out.println("faltou dinheiro");
	        }       
	        
	        contaDaMarcela.transfere(300, contaDoPaulo);
	        System.out.println("Saldo da conta da Marcela após transferência: " + contaDaMarcela.saldo);
	        System.out.println("Conta do Paulo Saldo " + contaDoPaulo.saldo); 
	        
	        
	        contaDoPaulo.titular = "paulo.silveira";
	        System.out.println(contaDoPaulo.titular);
	    }
}