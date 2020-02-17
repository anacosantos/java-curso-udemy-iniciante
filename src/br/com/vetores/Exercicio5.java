package br.com.vetores;

import java.util.Scanner;

public class Exercicio5 {
	//Leia um conjunto de valores inteiros e em seguida exiba-os na ordem inversa do que foram digitados.
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int valoresInteiros = sc.nextInt();
		int conjuntoValores [] = new int[valoresInteiros];
		
		for(int x = 0; x < valoresInteiros; x++) {
			conjuntoValores [x] = sc.nextInt(); 
		}
		
		for(int x = valoresInteiros - 1; x >= 0; x--) {
			System.out.println(conjuntoValores[x]);
		}
		
		
	
				
		sc.close();
		
	}
}
