package novoTeste.exercicios.EstruturasdeRepetiçãoeArraysemJava;

public class Teste {

	public static void main(String[] args) {
		
        int num = 5, count = 1;
        while(count <= 3) {
        	System.out.println("count inicio: " + count);
            ++count;
            System.out.println("count final: " + count);
            System.out.println("Num inicio: "+ num);
            num += count;
            System.out.println("Num final: " + num);
            System.out.println(" ");
            
        }
        

	}

}
