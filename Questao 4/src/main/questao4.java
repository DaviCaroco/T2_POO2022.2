package main;
import java.util.Calendar;
import java.util.Date;

public class questao4 {

	public static void main(String[] args) {
		int dia,hora,ano,mes,min;
	    Calendar cal = Calendar.getInstance();
	    Date d = new Date();
	    cal.setTime(d);
	    dia = cal.get(Calendar.DAY_OF_MONTH);
	    mes = cal.get(Calendar.MONTH) + 1;
	    ano = cal.get(Calendar.YEAR);
	    hora = cal.get(Calendar.HOUR_OF_DAY);
	    min = cal.get(Calendar.MINUTE);
	    System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);

	    if (mes == 1){
	      System.out.println("\nO mes atual é Janeiro");
	    }
	    if (mes == 2){
	      System.out.println("\nO mes atual é Fevereiro");
	    }
	    if (mes == 3){
	      System.out.println("\nO mes atual é Março");
	    }
	    if (mes == 4){
	      System.out.println("\nO mes atual é Abril");
	    }
	    if (mes == 5){
	      System.out.println("\nO mes atual é Maio");
	    }
	    if (mes == 6){
	      System.out.println("\nO mes atual é Junho");
	    }
	    if (mes == 7){
	      System.out.println("\nO mes atual é Julho");
	    }
	    if (mes == 8){
	      System.out.println("\nO mes atual é Agosto");
	    }
	    if (mes == 9){
	      System.out.println("\n O mes atual é Setembro");
	    }
	    if (mes == 10){
	      System.out.println("\nO mes atual é Outubro");
	    }
	    if (mes == 11){
	      System.out.println("\nO mes atual é Novembro");
	    }
	    if (mes == 12){
	      System.out.println("\nO mes atual é Dezembro");
	    }

	    if (hora < 6){
	      System.out.println("\nHora atual: " + hora + ":" + min + " da Madrugada");
	    }
	    if (hora < 12 && hora >= 6){
	      System.out.println("\nHora atual: " + hora + ":" + min + " da Manhã");
	    }
	    if (hora >= 12 && hora < 18){
	      System.out.println("\nHora atual: " + hora + ":" + min + " da Tarde");
	    }
	    if (hora >= 18){
	      System.out.println("\nHora atual: " + hora + ":" + min + " da Noite");
	    }

	}

}
