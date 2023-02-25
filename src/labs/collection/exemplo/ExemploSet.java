package labs.collection.exemplo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	
	// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
				
		System.out.println("Confirta se anota 5 esta no conjunto: " + notas.contains(5d));
			
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Os valores da soma são: " + soma);
		
		System.out.println("Exiba a média das notas: " + (soma / notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator.hasNext()) {
			 Double next = iterator1.next();
			 if (next <7) iterator1.remove();		
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		
		System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty());
	}

}
