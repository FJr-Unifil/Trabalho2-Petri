package contaPetri;

public class Pessoa {

	private String nome;
	private String endereco;
	private int cpf;
	private int idade;
	private int numeroCelular;
	private double salario;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, int cpf, int idade, int numeroCelular, double salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.numeroCelular = numeroCelular;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroCelular() {
		return this.numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
