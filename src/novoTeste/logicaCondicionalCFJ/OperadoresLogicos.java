package novoTeste.logicaCondicionalCFJ;

public class OperadoresLogicos {

	public static void main(String[] args) {

		/*
		 * "São símbolos especiais quais são capazes de realizar comparações lógicas
		 * entre operandos lógicos ou expressões e, em seguida, retornar um resultado"
		 */

		/*
		 * disjunção: quando ambos são verdadeiros ou falso = && (and) = e
		 */
		/*
		 * disjunção exclusivo: quando só é verdade se ambos forem opostos = ^ (xor)
		 */
		/*
		 * negação: quando inverte o valor logico de um operando ou expressão = ! =
		 * inversão
		 * 
		 */

		double salarioMensal = 10000d;
		double mediaSalario = 23000d;

		short quantidadeDependentes = 8;
		short mediaDependentes = 4;

		boolean recebeAuxilio = (salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes);

		System.out.println(recebeAuxilio);

	}

}
