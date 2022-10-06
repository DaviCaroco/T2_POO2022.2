package main;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		  Scanner sc= new Scanner(System.in);
		  int a,b,c,e; float i,j;
	    
		    do{
		    	System.out.println("-------------------------------------------------");
			    System.out.println("CALCULADORA");
			    System.out.print("Digite um numero:"); 
			    a = sc.nextInt();
			    System.out.print("Digite outro numero:"); 
			    b = sc.nextInt();
			    i = (float) Math.sqrt(a);
			    j = (float) Math.sqrt(b);
			    System.out.println("\t 1: Somar");
			    System.out.println("\t 2: Raiz de "+ a);
			    System.out.println("\t 3: Raiz de "+ b);
			    System.out.print("Digite a Operaçao:"); 
			    c = sc.nextInt();
			    switch(c)
			      {
			        case 1:
			          System.out.printf("%d + %d = %d",a,b,a+b);
			          break;
			        case 2:
			          System.out.print("A raiz de "+a+ " é = " + df.format(i));
			          break;
			        case 3:
			          System.out.print("A raiz de "+b+ " é = " + df.format(j));
			          break;
			      }
			    System.out.print("\nVocê quer refazer o progama?: [1] para Sim e [2] para Não:");
			    e = sc.nextInt();
		    } while (e == 1);
	}

}
