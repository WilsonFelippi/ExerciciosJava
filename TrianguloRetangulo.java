package Exercicios;

public class TrianguloRetangulo extends Formas {
	private double catetoMenor;
	private double catetoMaior;
	private double hipotenusa;

	public TrianguloRetangulo (String nome, double catetoMenor, double catetoMaior, double hipotenusa) {
		super(nome);
		this.catetoMaior = catetoMaior;
		this.catetoMenor = catetoMenor;
		this.hipotenusa = hipotenusa;
		
	}

	public double getCatetoMenor() {
		return catetoMenor;
	}

	public void setCatetoMenor(double catetoMenor) {
		this.catetoMenor = catetoMenor;
	}

	public double getCatetoMaior() {
		return catetoMaior;
	}

	public void setCatetoMaior(double catetoMaior) {
		this.catetoMaior = catetoMaior;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	
	public double calcularAreaTriangulo() {
		double area;
		area = (catetoMenor * catetoMaior)/2;
		return area;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nArea: %s ", super.toString(), this.calcularAreaTriangulo());
	}

}
