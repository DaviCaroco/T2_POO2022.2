package br.edu.poligonos;

public class quadrado {
	public double lado;
	public double areaq;
	public double peri;
	
	public quadrado() {
		
		lado = 0;
		areaq = 0;
		
	}
	public void calcAreaq() {
		areaq = lado * lado;
		System.out.println("A �rea do quadrado � " + areaq);
		peri = lado*4;
		System.out.println("O Perimetro do Quadrado � " + peri);
	}
}
