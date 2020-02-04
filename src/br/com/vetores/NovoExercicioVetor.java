package br.com.vetores;

import java.util.Scanner;

public class NovoExercicioVetor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] vet = new int [N];
		
		for(int x = 0; x < N; x++) {
			vet[x] = sc.nextInt(); 
			
		}
		
		for(int x = 0; x < N; x++) {
			if(vet[x] < 0) {
				System.out.println(vet[x]);
			}
		}
			
		
		
		
		sc.close();
		
	}
	
	
	

}
