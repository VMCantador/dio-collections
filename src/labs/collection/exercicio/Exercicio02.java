package labs.collection.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	Utilizando listas, faça um programa que faça 5 perguntas 
	para uma pessoa sobre um crime. AS perguntas são:
	
	1- "Telefonou para a vítima?"
	2- "Esteve no local do crime?"
	3- "Mora perto da vítima?"
	4- "Devia para a vítima?"
	5- "Ja trabalhou com a vítima?"
	
	Se a pessoa responder positivamente a 2 questões ela eve ser 
	classificada como "Suspeita", entre 3 e 4 como "Cumplice" e
	5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
*/
public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Pergunta> perguntas = new ArrayList<>();
		System.out.println("Telefonou para a vítima?");
		String resposta = scan.nextLine();
		perguntas.add(new Pergunta(resposta));
		System.out.println("Esteve no local do crime?");
		resposta = scan.nextLine();
		perguntas.add(new Pergunta(resposta));
		System.out.println("Mora perto da vítima?");
		resposta = scan.nextLine();
		perguntas.add(new Pergunta(resposta));
		System.out.println("Devia para a vítima?");
		resposta = scan.nextLine();
		perguntas.add(new Pergunta(resposta));
		System.out.println("Ja trabalhou com a vítima?");
		resposta = scan.nextLine();
		perguntas.add(new Pergunta(resposta));

		int countSim = 0;

		for (Pergunta resp : perguntas) {
			if (resp.getResposta().toUpperCase().equals("SIM")) {
				countSim++;
			}
		}

		switch (countSim) {
		case 0:
		case 1:{
			System.out.println("Inocente");
			break;
		}
		case 2:{
			System.out.println("Suspeito");
			break;
		}
		case 3:
		case 4:{
			System.out.println("Cumplice");
			break;
		}
		case 5:{
			System.out.println("Assassino");
			break;
		}

		}
	}

}

class Pergunta {

	private String resposta;

	public Pergunta(String resposta) {
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}
}