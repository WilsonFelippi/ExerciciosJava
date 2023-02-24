package Exercicios;

public class Quadrado extends Formas {
	private double lados;
	
	public Quadrado(String nome, double lados) {
		super(nome);
		this.lados = lados;
	}

	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}
	
	public double calcularArea() {
		return this.lados * 2;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nArea: %s ", super.toString(), this.calcularArea());
	}

}
