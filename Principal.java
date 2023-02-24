package Exercicios;

public class Principal {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado("Quadrado", 5.5);
		System.out.println("\n|------------ Quadrado ------------|");
		System.out.println(q1);
		
		TrianguloRetangulo tr1 = new TrianguloRetangulo("Triangulo", 10, 12, 20);
		System.out.println("\n|------------ Triangulo ------------|");
		System.out.println(tr1);
		
		Retangulo r1 = new Retangulo("Retangulo", 12, 8);
		System.out.println("\n|------------ Retangulo ------------|");
		System.out.println(r1);

	}

}
