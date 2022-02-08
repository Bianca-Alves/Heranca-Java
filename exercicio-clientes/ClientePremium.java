public class ClientePremium extends Cliente {

	@Override
	public double calculaDesconto() {
		return 0.15 * super.getDesconto();
	}

	@Override
	public void imprimirDados() {
		System.out.println("---------- DADOS DO CLIENTE PREMIUM (" + this.getNome() + ") ----------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Desconto: R$ " + df.format(this.calculaDesconto()));
		System.out.println("Obs.: Cliente premium tem desconto de 15%.");
		System.out.println("");
	}
}