
public class CriarConta {
	
	public static void main(String[] args) {
		//conta 1
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		//conta 2
		primeiraConta.saldo +=100;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Primeira conta tem " + segundaConta.saldo);
	}
} 