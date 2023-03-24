package novoTeste.exercicio;


public class Resultado {

	public static void main(String[] args) throws Exception{
			
		Calculadora calculadora = new Calculadora();	
		
		calculadora.somar(3, 3);
		
		System.out.println(calculadora.resultado);
	}
}
