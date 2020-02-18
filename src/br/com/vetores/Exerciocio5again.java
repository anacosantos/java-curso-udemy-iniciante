package br.com.vetores;

import java.util.Scanner;

public class Exerciocio5again {

	//Leia um conjunto de valores inteiros e em seguida exiba-os na ordem inversa do que foram digitados.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] valoresInteiros = new int [n];
		
		for(int x = 0; x < n; x++) {
			valoresInteiros[x]= sc.nextInt();
		}
		for(int x = valoresInteiros.length -1; x >= 0; x--) {
			System.out.println(valoresInteiros[x]);
		}
		
		
		
		
		
		sc.close();
		
	}
}
