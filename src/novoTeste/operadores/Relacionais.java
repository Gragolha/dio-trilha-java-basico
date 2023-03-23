package novoTeste.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		
		
		String nomeUm = "greyson";
		String nomeDois = new String ("greyson");

		System.out.println(nomeUm.equals(nomeDois));
		
		
		/* 
		 * == Quando desejamos verificar se uma variável é IGUAL A outra.
		 * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
		 * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
		 * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
		 * < Quando desejamos verificar se uma variável é MENOR QUE outra.
		 * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
		 * */

		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
				
		String resultado = numero1 < numero2 ?"a nossa condição é verdadeira" : "fui tapeado";

		System.out.println(resultado);

		if(numero1 > numero2) {
			System.out.println("a nossa condição é verdadeira");
		} else {
			System.out.println("fui tapeado");
		}
		
		System.out.println("numero 1 é igual a numero 2?: " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numero 1 é diferente a numero 2?: " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numero 1 é maior a numero 2?: " + simNao);
		
		simNao = numero1 >= numero2;
		
		System.out.println("numero 1 é maior ou igual a numero 2?: " + simNao);
		
		simNao = numero1 < numero2;
		
		System.out.println("numero 1 é menor a numero 2?: " + simNao);
		
		simNao = numero1 <= numero2;
		
		System.out.println("numero 1 é menor ou igual a numero 2?: " + simNao);
		
		
	}

}
