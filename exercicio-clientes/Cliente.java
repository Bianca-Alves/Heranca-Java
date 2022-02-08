import java.text.DecimalFormat;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double desconto;

	DecimalFormat df = new DecimalFormat("0.00");

	public Cliente() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double calculaDesconto() {
		return 0.10 * desconto;
	}

	public void imprimirDados() {
		System.out.println("---------- DADOS DO CLIENTE (" + this.getNome() + ") ----------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Desconto: R$ " + df.format(this.calculaDesconto()));
		System.out.println("Obs.: Cliente comum tem desconto de 10%.");
		System.out.println("");
	}
}