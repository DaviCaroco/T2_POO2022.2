package br.edu.principal;
import br.edu.poligonos.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); int contro = 1;
		
		do {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Bem vindo ao Progama: Escolha o tipo de progama:");
			System.out.println("\t1-Figuras planas");
			System.out.println("\t2-Figuras Espaciais");
			System.out.println("Digite a Opçao desejada:");
			int escolha = sc.nextInt();
			
			if(escolha == 1) {
				System.out.println("Escolha essas Opçoes de Figuras:");
				System.out.println("\t1-Quadrado");
				System.out.println("\t2-Retangulo ou Paralelograma");
				System.out.println("\t3-Circulo");
				System.out.println("\t4-Losangulo");
				System.out.println("\t5-Trapézio");
				System.out.println("\t6-Pentágono");
				System.out.println("\t7-hexágono");
				System.out.println("Digite a Operação Desejada:");
				int opcao = sc.nextInt();
			
			    switch(opcao) 
			    {
			
			     case 1: 
			    	 
				     System.out.println("Digite o lado do Quadrado:");
				     double ladoq = sc.nextDouble();
				     quadrado objq = new quadrado();
				     objq.lado = ladoq;
				     objq.calcAreaq();
				     
			     case 2:
			    	 
			    	 System.out.println("Digite a base do objeto:");
				     double baser = sc.nextDouble();
				     System.out.println("Digite a Altura do objeto:");
				     double alturar = sc.nextDouble();
				     retangulo objr = new retangulo();
				     objr.altura = alturar;
				     objr.base = baser; 
				     objr.calcArear();
				     
			     case 3:
			    	 
			    	 
				     
			    }
		    }
			if(escolha == 2) {
				System.out.println("Escolha essas Opçoes de Figuras:");
				System.out.println("\t1-Paralelepipedo");
				System.out.println("\t2-Esfera");
				System.out.println("\t3-Cone");
				System.out.println("\t4-Cilindro");
				System.out.println("\t5-Pirâmide");
				System.out.println("\t6-Prisma");
				System.out.println("\t7-Cubo");
				System.out.println("Digite a Operação Desejada:");
				int op = sc.nextInt();
				
				switch(op) 
				{
				
				 case 1:
					 
				
				}
			}
			if(escolha == 3) {
				System.out.println("Opçao invalida");
			}
			
		}while(contro == 0);
	}	
}
