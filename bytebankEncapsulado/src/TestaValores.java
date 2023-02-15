
public class TestaValores {

	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
	}
}
