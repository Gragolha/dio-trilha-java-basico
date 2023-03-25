package novoTeste.exercicio;

public class Comentarios {

	public static void main(String[] args) {

	}
	
	/**
	 * 
	 * @param n
	 * @param x
	 * @param m
	 * @return
	 */

	public int somaMultplica(int n, int x, String m) {
		int r = 0;
		if (m == "M") {
			r= n * x;
		}else {
			r = n + x;
		}
		
		return r;
	}
}
