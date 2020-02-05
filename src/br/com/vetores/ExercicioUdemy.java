package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUdemy {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número desejado:");
		
		int N = sc.nextInt();
		double [] vet = new double [N];
		
		//vector reading
		for(int x = 0; x < N; x++) {
			vet [x] = sc.nextDouble();
		}
		//print vector on screen	
		for(int x = 0; x < N; x++) {
			System.out.print(vet[x] + " ");
		}
			
		System.out.println();
		
		double soma = 0;
		
		//add the vector elements
		for(int x = 0; x < N; x++) {
			soma = soma + vet[x];
		}
		
		System.out.printf("%.2f%n", soma);
		
		//average vector elements
		double media = soma / N;
		System.out.printf("%.2f%n", media);
		
		
		sc.close();
		
	}

}
