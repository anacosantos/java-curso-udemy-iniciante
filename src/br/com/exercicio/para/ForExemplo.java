package br.com.exercicio.para;

public class ForExemplo {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 50;
		int total = 0; // essa variavel vai totalizar os valores de z
		
		for(int z = x; z < y; z++) { 
			//Nese for eu recebo o ponto de partida, x ate o potno de chegada que eh y
			//z<y pq ele esta verificando o valor final 
			total = total +z; //total vai receber o anterior + o novo valor de z
		}
		System.out.println(total);
	}

}
