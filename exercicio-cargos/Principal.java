
public class Principal {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		f1.setNome("Bianca");
		f1.setCpf("000.000.000-00");
		f1.setSalario(2500);

		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());

		System.out.println("");

		Gerente g1 = new Gerente();

		g1.setNome("Pedro");
		g1.setCpf("111.111.111-11");
		g1.setSalario(3000);
		g1.setSenha(1234);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(1234));
	}
}