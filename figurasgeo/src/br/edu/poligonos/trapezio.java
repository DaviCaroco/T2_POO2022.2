package br.edu.poligonos;

public class trapezio {
	public double lado;
	public double baseM;
	public double basem;
	public double areaT;
	public double altura;
	public double peri;
	
	public trapezio() {
		baseM = 0;
		basem = 0;
		areaT = 0;
		peri = 0;
	}
	public void calcAreaT() {
		areaT = (basem + baseM) * altura;
		System.out.println("A area do trap�zio � " + areaT);
		peri = lado*4;
		System.out.println("O Perimetro do losangulo � " + peri);
	}
}
