package labs.collection.exercicio;

import java.util.LinkedList;

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
System.out.println("Crie uma lista chamada notas2 " +
"e coloque todos os elementos da list Arraylist nessa nova lista: ");
System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/


public class Linky {

	public static void main(String[] args) {
		
		LinkedList <Double> Notas2 = new LinkedList<>();
		Notas2.add(10.0);
		Notas2.add(9.0);
		Notas2.add(8.0);
		Notas2.add(10.0);
		Notas2.add(4.0);
		System.out.println(Notas2);
		System.out.println();
		System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + Notas2.get(0));
		System.out.println();
		System.out.println("Mostre a primeira nota da nova lista removendo-o: " + Notas2.remove(0));
		System.out.println(Notas2);
	}

}
