package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int soma = 0;
		int maior = 0;
		int count = 0;

		do {
			

			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			soma += numero;
			if(numero > maior) maior = numero;
			count += 1;
			
			System.out.println("soma: " + soma);
			
		} while (count < 5);
		
		soma /= 5;
		System.out.println("Meu numero maior: " + maior);
		System.out.println("media: " + soma);
		
	}

}
