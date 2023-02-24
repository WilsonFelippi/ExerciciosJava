package Exercicios;

public class Retangulo extends Formas {
	private double base;
	private double altura;

	public Retangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularAreaRetangulo() {
		double area;
		area = base * altura;
		return area;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nArea: %s ", super.toString(), this.calcularAreaRetangulo());
	}

}
