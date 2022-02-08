public class Principal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();

		c1.setNome("Bianca");
		c1.setIdade(17);
		c1.setEndereco("Rua Poxim, Guaianases");
		c1.setDesconto(50.00);
		c1.imprimirDados();

		ClientePremium c2 = new ClientePremium();

		c2.setNome("Felipe");
		c2.setIdade(20);
		c2.setEndereco("Rua Mario Sobral, Tiradentes");
		c2.setDesconto(50.00);
		c2.imprimirDados();
	}
}