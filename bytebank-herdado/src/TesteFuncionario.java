
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario cris = new Funcionario();
		cris.setNome("Cris Steppat");
		cris.setCpf("2223355646-9");
		cris.setSalario(2600.00);
		
		System.out.println(cris.getNome());
		System.out.println(cris.getBonificacao());
	}

}
