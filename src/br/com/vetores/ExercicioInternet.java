package br.com.vetores;

import java.util.Scanner;

public class ExercicioInternet {
	
	/*
	L� 5 nomes e notas de uma turma, 
	calcula e exibe a m�dia das notas da turma e em seguida
	exibe a rela��o de nomes cuja nota � superior a esta m�dia
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		String [] nomes = new String [n];
		double notas [] = new double [n];
		double soma = 0;
		double media = 0; 
		
		
		for(int x = 0; x < n; x++) {
			nomes [x] = sc.next();
			notas [x] = sc.nextDouble();
			soma = soma + notas[x];
		}
		for(int x = 0; x < n; x++) {
			System.out.println(nomes[x] + " " + notas[x]);
		}
		
		media = soma / n;
		
		System.out.println(media);
		
		
		for(int x = 0; x < n; x++) {
			if(notas[x] > media) {
				System.out.println(nomes[x]);
			}
		}
		
		sc.close();
		
	}
	
}
