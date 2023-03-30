package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

import java.util.Scanner;

public class PasrEImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int quantNumeros;
		int numero;
		int quantPar = 0, quantImpar = 0;

		System.out.println("Quantidade de numeros: ");
		quantNumeros = scan.nextInt();
		System.out.println("Numeros: " + quantNumeros);

		int count = 0;

		do {

			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0 ) quantImpar++;
			else quantPar++;
				
			count++;
			System.out.println(count + "° vez");

		} while (count < quantNumeros);

		System.out.println("quantidade par: " + quantPar);
		System.out.println("quantidade impar: " + quantImpar);

	}

}
