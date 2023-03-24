package novoTeste.jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		
		String jogador1, jogador2;

		System.out.print("jogador 1: ");
		Scanner scan = new Scanner(System.in);

		jogador1 = scan.nextLine();

		System.out.print("jogador 2: ");

		jogador2 = scan.nextLine();
		
		if (jogador1.equals(jogador2)) {
			System.out.println("empate");

		} else if (jogador1.equals("pedra") && jogador2.equals("tesoura")) {
			System.out.println("jogador 1 ganhou");

		} else if (jogador1.equals("tesoura") && jogador2.equals("pedra")) {
			System.out.println("jogador 2 ganhou");

		} else if (jogador1.equals("pedra") && jogador2.equals("papel")) {
			System.out.println("jogador 2 ganhou");

		} else if (jogador1.equals("papel") && jogador2.equals("pedra")) {
			System.out.println("jogador 1 ganhou");

		} else if (jogador1.equals("papel") && jogador2.equals("tesoura")) {
			System.out.println("jogador 2 ganhou");

		} else if (jogador1.equals("tesoura") && jogador2.equals("papel")) {
			System.out.println("jogador 1 ganhou");
		}
	
	}

}
