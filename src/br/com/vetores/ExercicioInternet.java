package br.com.vetores;

import java.util.Scanner;

public class ExercicioInternet {
	
	/*
	Lê 5 nomes e notas de uma turma, 
	calcula e exibe a média das notas da turma e em seguida
	exibe a relação de nomes cuja nota é superior a esta média
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] nomes = new String [N];
		double notas [] = new double [N];
		double soma = 0;
		
		for(int x = 0; x < N; x++) {
			nomes [x] = sc.next();
			notas [x] = sc.nextDouble();
			System.out.println(nomes [x] + notas [x]);
		}
 //		double media = notas[x] / 2;
	//	for()
		
		
		sc.close();
		
	}
	
}
