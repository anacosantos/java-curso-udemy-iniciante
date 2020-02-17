package br.com.vetores;

import java.util.Scanner;

public class Exercicio3 {
	 //Leia um conjunto de alunos, cada uma com o nome e a nota.Em seguida exiba o nome dos alunos que possuem a nota maior do que a média da turma.

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		String [] alunos  = new String [n];
		int [] notas = new int [n];
		int soma = 0;
		
		for(int x = 0; x < n; x++) {
			System.out.println("Digite sua nota: ");
			notas[x]= sc.nextInt();
			System.out.println("Digite o nome: ");
			alunos[x]=sc.next();
			soma = soma + notas[x];
		}
		int media = soma / n;
		
		for(int x = 0; x < n; x++) {
			if(notas[x] > media) {
				System.out.println(alunos[x]);
			}
		}
	
		
		
		sc.close();
	}
}
