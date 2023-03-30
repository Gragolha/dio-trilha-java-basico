package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

import java.util.Random;

public class Randoms {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numeroAleatorios = new int[20];

		for (int i = 0; i < numeroAleatorios.length; i++) {

			int numero = random.nextInt(100);
			numeroAleatorios[i] = numero;
		}
		System.out.println("Numeros aleatorios: ");
		for (int numero : numeroAleatorios) {

			System.out.println(numero);

		}
		System.out.println("sucessores: ");
		for (int numero : numeroAleatorios) {

			System.out.println(numero + 1);

		}

	}

}
