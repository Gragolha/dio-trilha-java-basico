package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Numero fatorial: ");

		int fatorial = scan.nextInt();

		int multiplicacao = 1;

		for (int i = fatorial; i >= 1; i--) {

			multiplicacao *= i;
			/*
			 * int resultado = (multiplicacao * i); System.out.println(multiplicacao + " X "
			 * + i + " = " + resultado); multiplicacao = resultado;
			 */
			System.out.println(multiplicacao);
		}

	}

}
