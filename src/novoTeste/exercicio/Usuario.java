package novoTeste.exercicio;

public class Usuario {

	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(12);

		System.out.println("TV Ligada: " + smartTv.ligada);
		System.out.println("Volume atual: " + smartTv.volume);
		System.out.println("Canal atual: " + smartTv.canal);

		smartTv.ligar();

		System.out.println("Novo Status -> TV ligada?: " + smartTv.ligada);

		smartTv.desligar();

		System.out.println("Novo Status -> TV ligada?: " + smartTv.ligada);
		
		
		System.out.println("novo volume: " + smartTv.volume);

	}

}
