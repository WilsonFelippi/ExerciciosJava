package Exercicios;

public class Formas {
	protected String nome;

	public Formas(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Forma: %s", this.nome);
	}
	
}
