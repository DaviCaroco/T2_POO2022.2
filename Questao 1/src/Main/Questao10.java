package Main;

import javax.Swing.JOptionPane;

public class Questao10 {

	public static void main(String[] args) {
		int num,a;
		
		do {
			JOptionPane.showInputDialog("Bem vindo ao Progama onde Voc� vai descobrir se o Numero � par ou impar: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero que ser� Usado: "));
	
	        if (num % 2 == 0) {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + " � Par");
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "O numero " + num + " � �mpar");
	        }
	        a = Integer.parseInt(JOptionPane.showInputDialog("Voc� quer refazer o codigo?: [1] para Sim e [2] para N�o:"));
		}
		while(a == 1);
	}
}
