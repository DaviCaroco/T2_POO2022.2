package br.edu.poligonos;

public class circulo {
	public double raio;
	public double pi;
	public double areac;
	public double peri;
	
	public circulo() {
		raio = 0;
		pi = 3.14;
		areac = 0;
	}
	public void calcAreac() {
		areac = pi * (raio * raio);
		System.out.println("A �rea do circulo � " + areac);
		peri = 2 * raio * pi;
		System.out.println("O perimetro do Losangulo � " + peri);
	}
}
