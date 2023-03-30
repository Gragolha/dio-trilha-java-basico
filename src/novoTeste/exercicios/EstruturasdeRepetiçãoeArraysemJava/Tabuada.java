package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0;

		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		System.out.println("Numero setado: " + numero);

		for (int numeroInicial = 1; numeroInicial <= 10; numeroInicial++) {
			System.out.println(numero + " x " + numeroInicial + " = " + (numeroInicial * numero));
		}
		;

		/*
		 * do {
		 * 
		 * System.out.println(numero + " x " + numeroInicial + " = " + (numeroInicial *
		 * numero)); numeroInicial++;
		 * 
		 * } while (numeroInicial <= 10);
		 */

	}

}
