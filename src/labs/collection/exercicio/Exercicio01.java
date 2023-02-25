package labs.collection.exercicio;

import java.util.ArrayList;
import java.util.List;


/*
	Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
	e armazene-as em uma lista. Após isto, calcule a média semestral das temperaturas
	e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram
	(mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/
public class Exercicio01 {

	public static void main(String[] args) {
		
		List<Temperatura> temperaturas = new ArrayList<>() {{
			add(new Temperatura( "Janeiro", 33.0));
			add(new Temperatura( "Fevereiro", 27.5));
			add(new Temperatura( "Março", 25.0));
			add(new Temperatura( "Abril", 31.5));
			add(new Temperatura( "Maio", 22.0));
			add(new Temperatura( "Junho", 18.0));
		}};
		
		double totalTemp = 0.0;
		int countMeses = 0;
		
		for(Temperatura temp : temperaturas) {
			totalTemp += temp.getTemperatura();
			countMeses++;
		}
		double media = (totalTemp / countMeses) ;
		System.out.printf("A média é: %.2f %n", media );
			
		int count = 1;
		for(Temperatura temp : temperaturas) {
			if (temp.getTemperatura() > media ) {
				System.out.println(count + " - " + temp.getMes());
				count++;
			}
			
		}
		
	}

}

class Temperatura {
	private String mes;
	private Double temperatura;
	
	public Temperatura (String mes,Double temperatura) {
		this.mes = mes;
		this.temperatura = temperatura;
	}
	
	public String getMes () {
		return mes;
	}
	
	public Double getTemperatura () {
		return temperatura;
	}
	

	public String toString() {
		return ( "Mês: " + mes  + ", Temperatura: " + temperatura);
	}
}