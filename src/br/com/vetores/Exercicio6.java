package br.com.vetores;

public class Exercicio6 {
	//Crie um vetor capaz de armazenar 50 n�meros inteiros. Em seguida fa�a o seu preenchimento autom�tico com os n�meros de 101 a 150,
		// ou seja, na posi��o n�mero 0 ponha 101, na posi��o 1 ponha o n�mero 102, e assim sucessivamente.
		// Em seguida exiba os valores deste vetor.
		
	public static void main(String[] args) {
		
		int inteiros [] = new int[50];
		
		for(int x = 0; x < 50; x++) {
			inteiros [x] = 101 + x;
		}
		for(int x = 0; x < 50; x++ ) {
			System.out.println(inteiros[x]);
		}
	
	}
	
	

}
