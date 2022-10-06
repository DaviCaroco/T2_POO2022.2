package Main;

import javax.Swing.JOptionPane;

public class Questao10 {

	public static void main(String[] args) {
		int num,a;
		
		do {
			JOptionPane.showInputDialog("Bem vindo ao Progama onde Você vai descobrir se o Numero é par ou impar: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero que será Usado: "));
	
	        if (num % 2 == 0) {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + " é Par");
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + " é Ímpar");
	        }
	        a = Integer.parseInt(JOptionPane.showInputDialog("Você quer refazer o codigo?: [1] para Sim e [2] para Não:"));
		}
		while(a == 1);
	}
}
